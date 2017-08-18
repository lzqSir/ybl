var appModule = angular.module("myApp",["http"]);
appModule.controller("myWelcomeCtr",function($scope,httpService){
	httpService.get("static/h-ui/js/json/welcomeList.js").then(function success(data){
		$scope.code = data;
	},function error(){
		
	})
})


