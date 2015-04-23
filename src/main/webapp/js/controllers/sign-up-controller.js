/**
 * Created by VMakarenko on 4/8/2015.
 */


angular.module('app').controller('SignUpController',
    function ($scope, $location, AuthService) {
        $scope.newUser = {};
        $scope.signUp = function(){
            AuthService.signUp($scope.newUser).then(function(){
                $location.path('#/login/success')
            });
        }

    });

