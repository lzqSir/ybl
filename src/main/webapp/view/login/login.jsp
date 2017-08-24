<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="lib/html5.js"></script>
    <script type="text/javascript" src="lib/respond.min.js"></script>
    <script type="text/javascript" src="lib/PIE_IE678.js"></script>
    <![endif]-->
    <link href="static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
    <link href="static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
    <link href="static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
    <link href="lib/Hui-iconfont/1.0.7/iconfont.css" rel="stylesheet" type="text/css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <title>欢迎-登陆VA</title>
</head>
<body>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<div class="header">
	<span class="beike">
		<!-- <img src="" class="logo"/> -->
	</span>
    <div class="line"></div>
    <p class="heard_title">VA管理系统</p>
</div>
<div class="loginWraper">
    <div id="loginform" class="loginBox">
        <form class="form form-horizontal" action="index.html" method="post">
            <div class="row cl header_pic" style="margin-top:0;">
                <img src="img/ic_head.png"/>
            </div>
            <div class="row cl">
                <div class="container_box">
                    <div class="formControls col-xs-8">
                        <input id="" name="" type="text" placeholder="请输入用户名" class="input-text1">
                    </div>
                    <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
                </div>
            </div>
            <div class="row cl" style="margin-top:0;">
                <div class="container_box size-L">
                    <div class="formControls col-xs-8">
                        <input id="" name="" type="password" placeholder="请输入密码" class="input-text1">
                    </div>
                    <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
                </div>

            </div>
            <!--<div class="row cl">
              <div class="formControls col-xs-8 col-xs-offset-3" style="margin-left:41px;">
                <input class="input-text size-L" type="text"  placeholder="验证码" style="width:100px;float:left;font-size:14px;">
                <div class="pic_box">
                    <img src="img/yanzhenma.png">
                </div>
                <!--<a id="kanbuq" href="javascript:;">看不清，换一张</a>-->
            <!--</div>
          </div>-->
            <!--<div class="row cl">
              <div class="formControls col-xs-8 col-xs-offset-3">
                <label for="online">
                  <input type="checkbox" name="online" id="online" value="">
                  使我保持登录状态</label>
              </div>
            </div>-->
            <!--<div class="row cl">
              <div class="formControls col-xs-8 col-xs-offset-3">
                <input name="" type="submit" class="btn btn-success radius size-L" value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;">
                <input name="" type="reset" class="btn btn-default radius size-L" value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
                    <button class="login_btn">登录</button>
              </div>
            </div>-->
            <div class="login_box">
                <button class="login_btn">登录</button>
            </div>
        </form>
    </div>
</div>
<div class="footer">Copyright © 2016-2017, xxx.com, All Rights Reserved</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.js"></script>
</body>
</html>