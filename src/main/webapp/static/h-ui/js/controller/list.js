var appModule = angular.module("myApp",["http","addModule"]);
appModule.controller("myListCtr",function($scope,httpService,$rootScope){
	httpService.get("../../static/h-ui/js/json/hadjiesuan.js").then(function success(res){
		$scope.oper = res;
		$scope.branchList = res.msg2;
		$scope.invoke = function(){
			$('#myModal').modal("show");
		};
		
	},function error(){
		
	})
})
