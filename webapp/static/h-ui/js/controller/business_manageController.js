var appModule = angular.module("myApp",["http","myPage","addModule"]);
appModule.controller("myBusiCtr",function($scope,httpService,$timeout){
	httpService.get("../../static/h-ui/js/json/hadjiesuan.js").then(function success(res){
		$scope.busin = res.all;
		$scope.branchList = res.msg;
		$scope.newAdd = true;
		$scope.module = true;	
		angular.forEach($scope.busin,function(data,value,index){
			$scope.changeContent = function(index){
				$('#foo').modal("show");
				data = {
					id :index
				}
				httpService.get("../../static/h-ui/js/json/hadjiesuan.js",data).then(function success(res){
					$scope.branchData = res.msg;
				},function error(){
					
				})
			};

		})
		
		$scope.addPage = function(){
			$('#myModal').modal("show");
		};
		
		$scope.dele = function(index){
			layer.confirm('确定删除吗？', {
				  btn: ['确定','取消'],
				  skin: 'yourclass'
				}, function(){
				  layer.msg('已删除', {icon: 1});
				  
				}, function(){

				});
		}
		
},function error(){
		
	})
})
