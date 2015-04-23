/**
 * Created by VMakarenko on 4/8/2015.
 */


angular.module('app').controller('MenuController', ['$scope', '$rootScope',
    function ($scope, $rootScope) {
        $rootScope.$on('main.tabSelected', function(event, data){
            $scope.menuItemSelected = data;
        });
        // consts for tabs
        var TAB_ORDERS_ID = 'orders';
        var TAB_MENU_ID = 'menu';
        var TAB_STATS_ID = 'stats';

        // default is orders page
        $scope.menuItemSelected = TAB_ORDERS_ID;
    }]);

