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

        $scope.openConfirmOrderModal = function (id){
            $scope.currentOrder = $scope.orders[id];
            $('#confirm-order-modal').modal('show');
        };

        $scope.confirmOrder = function(){
            OrdersService.confirmOrder();
        };

        $scope.closeOrder = function(id){
            OrdersService.closeOrder(id);
        };

    });

