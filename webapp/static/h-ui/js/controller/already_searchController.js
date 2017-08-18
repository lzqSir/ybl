var appModule = angular.module("myApp",["http"]);
appModule.controller("mySettleCtr",function($scope,httpService){
	$scope.display = true;
	$scope.search = function(){
		if($(".bussvalue option:selected").text() == "" || $(".bussvalue option:selected").text() ==null || $(".bussvalue option:selected").text() == "undefined"){
			layer.tips("请选择商家",".bussvalue");
		} else if($(".firstTime").val() =="" || $(".firstTime").val() == null || $(".firstTime").val() == "undefined"){
			layer.tips("请选择开始时间",".firstTime");
		} else if($(".lastTime").val() =="" || $(".lastTime").val() == null || $(".lastTime").val() == "undefined"){
			layer.tips("请选择结束时间",".firstTime")
		}else{
			httpService.get("../../static/h-ui/js/json/hadjiesuan.js").then(function success(res){
				$scope.data = res;
				if(angular.isDefined(res)){
					$scope.display = false;
				}else{
					$scope.display = true;
				}
			},function erroe(){
				
			});
			$scope.displayList = function(){
				$scope.show = true;
			}
		}
		
	};
	
	
})
