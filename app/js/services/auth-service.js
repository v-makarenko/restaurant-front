/**
 * Created by VMakarenko on 4/12/2015.
 */
angular.module("app").service('AuthService',
    function ($http, $q) {
        this.login = function (login, pass) {
            var deferred = $q.defer();
            if (login == 'admin' && pass == 'admin') {
                deferred.resolve({
                    result: 'OK',
                    msg: undefined
                });
                window.authorized = true;
            } else {
                deferred.resolve({
                    result: 'ERROR',
                    msg: 'Неверный логин или пароль!'
                });
                window.authorized = false;
            }
            return deferred.promise;
        };

        this.logout = function () {
            window.authorized = false;
        };
        this.isAuthorized = function () {
            return window.authorized;
        };
        this.getRoles = function () {
            var deferred = $q.defer();
            deferred.resolve({
                result: 'OK',
                msg: undefined,
                data: [{
                    id: 1,
                    role: 'VIEW_ORDERS'
                }, {
                    id: 2,
                    role: 'VIEW_STATS'
                }, {
                    id: 3,
                    role: 'VIEW_MENU_EDIT'
                },]
            });
            return deferred.promise;
        };
    }
)
;