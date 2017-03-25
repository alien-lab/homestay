/**
 * Created by 慧慧姐 on 2017/3/25.
 */
(function (){
    var user_model = angular.module("User",[]);
    user_model.controller("userRegistController",["$scope","userService","$rootScope",function ($scope,userService,$rootScope) {
        //注册
        $scope.regist = function () {
            userService.regist({
                account:$scope.account,
                password:$scope.password,
                nickName:$scope.nickName
            },function (result) {
                if(result.result>0){
                    alert("注册成功！");
                    $rootScope.user = result.data;
                }else {
                    alert("注册失败，请重新注册！");
                }
            })
        }
        //登录
        $scope.login = function () {
            userService.login({

            })
        }
    }]);
    user_model.controller("userLoginController",["$scope","userService",function ($scope,userService) {

    }]);
    user_model.service("userService",["$http",function ($http) {
        this.regist= function (user,callback) {
            $http({
                url:"/regCheck",
                method:"POST",
                data:user
            }).then(function (result) {
                callback(result.data);
            })
        }
        this.login=function(user,callback){
            $http({
                url:"/loginCheck",
                method:"POST",
                data:user
            }).then(function(result){
                callback(result.data);
            })
        }

    }])
});