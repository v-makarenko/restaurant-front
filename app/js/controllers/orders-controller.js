/**
 * Created by VMakarenko on 4/8/2015.
 */


angular.module('app').controller('OrdersController',
    function ($scope, OrdersService) {
        $scope.loadOrders = function(){
            var i = 0;
            OrdersService.getOrders()
                .then(function(data){
                    $scope.orders = data.data;
                });
        };
        $scope.loadOrders();


    });

