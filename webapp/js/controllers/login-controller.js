/**
 * Created by VMakarenko on 4/8/2015.
 */


angular.module('app').controller('LoginController',
    function ($scope, $rootScope, $routeParams, $location, AuthService) {

        $scope.isSuccess = $routeParams['successFlag'] == 'success';
        $scope.credentials = {};

        $scope.loginF = function () {
            AuthService.login($scope.credentials.login, $scope.credentials.password).then(function (response) {
                var success = response.status == 200 || response.status == 302;
                if (success) {
                    $rootScope.isAuthenticated = true;
                    $location.path('/orders');
                } else {
                    $scope.error = 'Неверный логин или пароль';
                }
            });
        }

        $scope.$watch('credentials.login+credentials.password', function () {
            $scope.error = undefined;
        });

    }
)
;

