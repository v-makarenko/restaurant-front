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
            when('/settings', {
                templateUrl: 'html/settings.html',
                controller: 'SettingsController'
            }).

            otherwise({
                redirectTo: '/login'
            });
    }]).run(function ($rootScope, AuthService) {
    AuthService.isAuthenticated().success(function (data) {
        $rootScope.isAuthenticated = data;
        callback();
    });


    var callback = function () {
        if ($location.url() != 'login'
            && $location.url() != 'signUp'
            && !$rootScope.isAuthenticated) {
            $location.path('/login');
        }
    };

    $rootScope.$on('$routeChangeStart', function (event, next, current) {
        callback();
    });


});