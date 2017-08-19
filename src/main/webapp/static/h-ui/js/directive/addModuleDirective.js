var appModule = angular.module("addModule",["http"]);
appModule.directive("addModule",function(httpService,$rootScope){
	return {
		restrict:"ECMA",
		scope :{
			branchList:"=",
		},
		transclude: true, 
		template:'<div class="modal fade" tabindex="-1" role="dialog" id="myModal" ng-repeat="item in branchList">'
					+'<div class="modal-dialog" role="document">'
					    +'<div class="modal-content">'
					        +'<div class="modal-header">'
					        	+'<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>'
					        	+'<h4 class="modal-title">{{item.title1}}</h4>'
					        +'</div>'
					      + ' <div class="modal-body" ng-transclude>'
					      	+'</div>'
					      	+'<div class="modal-footer">'
					        	+'<button type="button" class="btn btn-default radius" data-dismiss="modal">Close</button>'
					        	+'<button type="button" class="btn btn-primary radius" ng-click="save()">Save</button>'
					      	+'</div>'
					    +'</div>'
					+'</div>'
				+'</div>',
		controller:function($scope, $element,$timeout){
			$scope.save = function(){
				var data = {};
				httpService.get("../../static/h-ui/js/json/hadjiesuan.js",data).then(function success(res){
					layer.confirm('确定保存吗？', {
						  btn: ['保存','取消'],
						  title:"保存",
						  skin:"radius-box"
						}, function(){
						  layer.msg('已保存', {icon: 1});
						  layer.close($scope.indexChange);
						  $('#myModal').modal("hide")
						}, function(){
						 
					});	
				},function error(){
				
				})
			}
		},
		link:function(scope,ele,attr){
			
		}
			
	}
})
