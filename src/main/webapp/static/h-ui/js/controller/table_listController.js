var appModule = angular.module("myApp",["http"]);
appModule.controller("myTableCtr",function($scope,httpService){
	$scope.display = true;
	$scope.seek =function(){
		if($(".selectVal option:selected").text() == "" || $(".selectVal option:selected").text() == null ||$(".selectVal option:selected").text() == "undefined"){
			layer.tips("请选择商户",".selectVal");
		}else if($(".firstTime").val() == "" || $(".firstTime").val() == null || $(".firstTime").val() == "undefined"){
			layer.tips("请选择开始时间",".firstTime");
		}else if($(".lastTime").val() == "" || $(".lastTime").val() == null || $(".lastTime").val() == "undefined"){
			layer.tips("请选择结束时间",".lastTime");
		}else{
			httpService.get("../../static/h-ui/js/json/hadjiesuan.js").then(function success(res){
				$scope.moneyList = res;
				if(angular.isUndefined($scope.moneyList)){
					$scope.display = true;
				}else{
					$scope.display = false;
				}
			},function error(){
				
			})
		}
		
	};
	$scope.change = function(index){
		if(index = 1){
			if($(".allpay").is(":checked")){
				$scope.displayCar = false;
			};	
		};  
		if(index = 2){
			if($(".payment-list").is(":checked")){
				$scope.displayCar = true;
				$('.all-method').attr("checked","checked");
			};	
		}; 
		if(index = 3){
			if($(".returnMoney").is(":checked")){
				$scope.displayCar = false;
			};	
		}
				
	}
	
})
