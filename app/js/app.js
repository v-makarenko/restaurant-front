/**
 * Created by VMakarenko on 2/7/15.
 */

angular.module('app', [
        'ngRoute' ]).config(['$routeProvider',
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

                otherwise({
                    redirectTo: '/orders'
                });
        }]);