/**
 * Created by VMakarenko on 4/8/2015.
 */


angular.module('app').controller('MainController',
    function ($scope, $rootScope, $location) {
        $scope.rootScope = $rootScope;
        $rootScope.isAuthenticated = true;
        //if($rootScope.isAuthenticated === undefined){
        //    $rootScope.isAuthenticated = false;
        //}
        $scope.location = $location;
    });

