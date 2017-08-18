var app = angular.module("http",[])
	.factory('httpService', function($http,$q){
//	var base_url = 'http://192.168.0.26:8080/amoeba';
	return{
		post:function(url,data){
			url = url
			var defer = $q.defer();
			var tempromise;
			if(data != null && data !=undefined &&data !=""){
				tempromise = $http.post(url,data)
			}else{
				tempromise = $http.post(url)
			}
			tempromise.success(function(data,header,config,status){
				defer.resolve(data)
			}).error(function(msg,code){
				defer.reject(msg)
			})
			return defer.promise;
		},
		get:function(url,data){
			url = url
			var defer = $q.defer();
			var tempromise;
			if(data != null && data != undefined && data != ""){
				tempromise = $http.get(url,{params:data});
			}else{
				tempromise = $http.get(url)
			}
			tempromise.success(function(data,header,config,status){
				defer.resolve(data);
			}).error(function(msg,code){
				defer.reject(msg);
			})
			return defer.promise;
		}
	}
})
