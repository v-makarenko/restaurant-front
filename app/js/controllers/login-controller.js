/**
 * Created by VMakarenko on 4/8/2015.
 */


angular.module('app').controller('LoginController',
    function ($scope, $routeParams) {

        $scope.isSuccess = $routeParams['successFlag'] == 'success';
    });

