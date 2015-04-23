/**
 * Created by VMakarenko on 2/7/15.
 */

angular.module('app', [
    'ngRoute']).config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider.
            when('/orders', {
                templateUrl: 'html/orders.html',
                controller: 'OrdersController'
            }).
            when('/menuEdit', {
                templateUrl: 'html/menu-edit.html',
                controller: 'MenuEditController'
            }).
            when('/stats', {
                templateUrl: 'html/stats.html',
                controller: 'StatsController'
            }).
            when('/login', {
                templateUrl: 'html/login.html',
                controller: 'LoginController'
            }).
            when('/signUp', {
                templateUrl: 'html/signUp.html',
                controller: 'SignUpController'
            }).

            otherwise({
                redirectTo: '/login'
            });
    }]).run(function ($rootScope, $location) {

    var callback = function () {
        //if ($location.url() != 'login'
        //    && $location.url() != 'signUp'
        //    && !$rootScope.isAuthenticated) {
        //    $location.path('/login');
        //}
    };

    $rootScope.$on('$routeChangeStart', function (event, next, current) {
        callback();
    });

    callback();

});