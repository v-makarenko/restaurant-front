/**
 * Created by VMakarenko on 4/8/2015.
 */


angular.module('app').controller('LoginController',
    function ($scope, $rootScope, $routeParams, $location) {

        $scope.isSuccess = $routeParams['successFlag'] == 'success';

        $scope.loginF = function(){
            $rootScope.isAuthenticated = true;
            $location.$path('#/orders');
        };

    });

