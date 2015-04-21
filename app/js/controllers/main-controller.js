/**
 * Created by VMakarenko on 4/8/2015.
 */


angular.module('app').controller('MainController',
    function ($scope, $rootScope) {
        $scope.rootScope = $rootScope;
        if($rootScope.isAuthenticated === undefined){
            $rootScope.isAuthenticated = false;
        }
    });

