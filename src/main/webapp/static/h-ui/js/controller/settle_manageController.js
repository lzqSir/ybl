var appModule = angular.module("myApp",["http","addModule"]);
appModule.controller("mySettleCtr",function($scope,httpService){
	httpService.get("../../static/h-ui/js/json/hadjiesuan.js").then(function success(res){
		$scope.branchList1 = res;
		$scope.branchList = res.msg1;
		$scope.addPage = function(){
			$('#myModal').modal("show")
		}
	},function error(){
		
	})
})
