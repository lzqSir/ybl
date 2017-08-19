var appModule = angular.module("myApp",["http"]);
appModule.controller("mySettleCtr",function($scope,httpService){
	httpService.get("../../static/h-ui/js/json/jiesuan.js").then(function success(data){
		$scope.list = data;
		if(angular.isDefined(data)){
			$scope.show = true;
		}
		$scope.comfirm = function(){
			layer.confirm('确认已结算到商户银行账户？', {
		   		 title:'温馨提示',
				  btn: ['确认','取消'],
				  skin:"yourclass"
				}, function(){
				  layer.msg('结算成功', {icon: 1});				 
//				  	angular.element(".shuju").eq(index).remove();				  
				}, function(){
				 
			});
    
		}
	  
	},function error(){
		
	})
})
