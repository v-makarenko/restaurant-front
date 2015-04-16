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
                    userId: 1,
                    peopleCount: 4,
                    bookTime: 1428611546787,
                    orders: [{
                        id: 1,
                        name: 'Испанский бизнес-ланч',
                        count: 4
                    }],
                    comment: 'no',
                    paid: true,
                    sum: 1000
                },
                {
                    id: 2,
                    userId: 3,
                    peopleCount: 2,
                    bookTime: 1428611546787,
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
                    paid: true,
                    sum:500
                }
            ]

        });
        return deferred.promise;
    }
});