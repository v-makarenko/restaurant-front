/**
 * Created by VMakarenko on 4/12/2015.
 */
angular.module("app").service('AuthService',
    function ($http, $q) {
        this.login = function (login, pass) {
            return $http({
                    method: 'POST',
                    url: Consts.url + "j_spring_security_check",
                    data: $.param(
                        {
                            j_username: login,
                            j_password: pass,
                            j_remember: false
                        }
                    ),
                    headers: {'Content-Type': 'application/x-www-form-urlencoded'}
                }
            );
        };

        this.logout = function () {
            return $http.post(Consts.url + "j_spring_security_logout", {});
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

        this.signUp = function (newUser) {
            var deferred = $q.defer();
            deferred.resolve({
                result: 'OK',
                msg: undefined
            });
            return deferred.promise;
        }
    }
)
;