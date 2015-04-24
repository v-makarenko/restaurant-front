/**
 * Created by VMakarenko on 4/8/2015.
 */


angular.module('app').controller('MainController',
    function ($scope, $rootScope, $location, AuthService) {
        $scope.rootScope = $rootScope;
        if ($rootScope.isAuthenticated === undefined) {
            $rootScope.isAuthenticated = false;
        }
        $scope.location = $location;


        // reaction for global events
        $rootScope.$on('events.exit', function () {
            AuthService.logout().error(function () {
                    $rootScope.isAuthenticated = false;
                    $location.path('/login');
                }
            )
        });

        $rootScope.$on('events.sendReport');

        $rootScope.isAuthenticated = true;

    }
);

