angular.module("app").service('OrdersService',
    function OrdersService($http, $q) {
        this.getOrders = function () {
            var deferred = $q.defer();
            deferred.resolve({
                result: 'OK',
                msg: undefined,
                data: [
                    {
                        id: 1,
                        user: {
                            id: 1,
                            surname: 'Иванов',
                            phone: '+7 999 999 99 99'
                        },
                        peopleCount: 4,
                        bookTime: 1428621546787,
                        orders: [{
                            id: 1,
                            name: 'Испанский бизнес-ланч',
                            count: 4
                        }],
                        comment: 'no',
                        status: 'paid',
                        sum: 1000
                    },
                    {
                        id: 2,
                        user: {
                            id: 2,
                            surname: 'Сидоров',
                            phone: '+7 999 999 99 99'
                        },
                        peopleCount: 2,
                        bookTime: 1421111111111,
                        orders: [
                            {
                                id: 2,
                                name: 'Китайский бизнес-ланч',
                                count: 1
                            },
                            {
                                id: 3,
                                name: 'Тайский бизнес-ланч',
                                count: 1
                            }],
                        comment: 'no',
                        status: 'new',
                        sum: 500
                    }
                ]

            });
            return deferred.promise;
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