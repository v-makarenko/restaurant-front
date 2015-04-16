/**
 * Created by VMakarenko on 4/8/2015.
 */


angular.module('app').controller('MenuEditController', ['$scope','$rootScope', 'MenuEditService',
    function ($scope, $rootScope, MenuEditService) {
        $rootScope.$broadcast('main.tabSelected', 'menu');

        $scope.openEditModal = function(id){
            if(id===undefined){
                $scope.currentPosition = {}
            }else{

            }
            $('menu-edit-modal').show();
        };

        $scope.saveItem = function(){
            if($scope.currentPosition.editing) {
                MenuEditService.create($scope.currentPosition);
            }else{
                MenuEditService.update($scope.currentPosition);
            }
        };

        $scope.deleteItem = function(id){
            MenuEditService.delete(id);
        };

        $scope.setNewPosition = function(id, afterId){
            MenuEditService.setAfter(id, afterId);
        };

        $scope.getAll = function(){
            var filter = {};
            //filter.companyId = window.userData.companyId;
            MenuEditService.getAll(filter).then(function(data){
                $scope.menuItems = data.data;
            });
        };

        $scope.getAll();



    }]);

