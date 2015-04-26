/**
 * Created by VMakarenko on 4/12/2015.
 */
angular.module("app").service('AuthService',
    function ($http, $q) {
        var url = 'api/auth/';
        this.login = function (username, password) {
            return $http.post( url+ 'login',{username: username, password:password}  )
        };

        this.logout = function () {
            return $http.post(url + "logout", {});
        };
        this.isAuthorized = function () {
            return $http.post(url + "isAuthorized", {});
        };
        this.getRoles = function () {
        };

        this.signUp = function (newUser) {
            return $http.post(url + 'signUp', newUser);
        };

        this.getCurrentUser = function () {
            return $http.post(
                Consts.url + 'rest',
                {
                    action: 'action',
                    entityType: 'currentUser',
                    method: 'get'
                }
            );
        }
    }
)
;