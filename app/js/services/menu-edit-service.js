angular.module("app").service('MenuEditService',
    function ($http, $q) {
        this.getAll = function (filter) {
            var deferred = $q.defer();
            deferred.resolve({
                result: 'OK',
                msg: undefined,
                data: [
                    {
                        id: 1,
                        name: 'Испанский бизнес-ланч',
                        price: 1000
                    },
                    {
                        id: 1,
                        name: 'Китайский бизнес-ланч',
                        customs: [
                            {
                                name: 'Чай',
                                list: [
                                    {
                                        name: 'Зеленый чай',
                                        price: 50
                                    },
                                    {
                                        name: 'Черный чай',
                                        price: 50
                                    }
                                ]
                            }
                        ]
                    }
                ]

            });
            return deferred.promise;
        };
        this.create = function (position) {

        };
        this.update = function (position) {

        };
        this.delete = function (id) {

        };
        this.setNewPosition = function (id, afterId) {

        };
    }
);