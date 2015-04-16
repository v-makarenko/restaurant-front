/**
 * Created by VMakarenko on 4/8/2015.
 */


angular.module('app').controller('HeaderController',
    function ($scope) {
        $scope.notifTotal = 3;

        $scope.notifs = [
            {text:'Новый заказ 4 человека'},
            {text:'Новый заказ 2 человека'},
            {text:'Сообщение от системы'}
        ]

    });

