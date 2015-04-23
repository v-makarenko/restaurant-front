angular.module("app").service('OrdersService',
    function OrdersService($http, $q) {
        this.getOrders = function () {
            return $http.post(Consts.restUrl, {})
        };
        this.confirmOrder = function () {
            var deferred = $q.defer();
            deferred.resolve({
                result: 'OK',
                msg: undefined
            });
        };
        this.closeOrder = function(id){
            var deferred = $q.defer();
            deferred.resolve({
                result: 'OK',
                msg: undefined
            });
        }


    });