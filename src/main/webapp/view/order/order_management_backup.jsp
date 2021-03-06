﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
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
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.reset.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/Hui-iconfont/1.0.7/iconfont.css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>系统停车场列表</title>
</head>
<body>
	<nav class="breadcrumb">系统停车场查询</nav>
	<div class="page-container">
		<form id="systemCarparkSearchFrom" class="form form-horizontal">
			<div class="row cl">
				<label class="form-label col-xs-2 col-sm-2 text-overflow">车场名称</label>
				<div class="formControls col-xs-3 col-sm-3">
					<input class="input-text radius size-S" name="carpark_name" />
				</div>
				<label class="form-label col-xs-3 col-sm-3 text-overflow">停车场模式</label>
				<div class="formControls col-xs-3 col-sm-3"> 
					<input type="hidden" name="park_mode" value="0"/>
					<input class="input-text radius size-S" placeholder="系统停车场" readonly="readonly"/>
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-2 col-sm-2 text-overflow">省市地区</label>
				<div class="formControls col-xs-1 col-sm-1" style="padding-right:0">
					<select class="select select-box input-text radius size-S" name="province" id="s1">
						<option></option>
					</select>
				</div>
				<div class="formControls col-xs-1 col-sm-1" style="padding:0 7.5px;">
					<select class="select select-box input-text radius size-S" name="city" id="s2">
						<option></option>
					</select>
				</div>
				<div class="formControls col-xs-1 col-sm-1" style="padding-left:0">
					<select class="select select-box input-text radius size-S" name="district" id="s3">
						<option></option>
					</select>
				</div>
				<label class="form-label col-xs-3 col-sm-3 text-overflow">车位数</label>
				<div class="formControls col-xs-3 col-sm-3">
					<select class="select select-box input-text radius size-S" name="total_space_count_str">
						<option value="">全部</option>
						<option value="0-300">0-300</option>
						<option value="301-600">301-600</option>
						<option value="601-1000">601-1000</option>
						<option value="1001-2000">1001-2000</option>
						<option value="2001-3000">2001-3000</option>
					</select>
				</div>
			</div>
			<div class="row cl">
				<label class="form-label col-xs-2 col-sm-2 text-overflow">创建时间</label>
				<div class="formControls col-xs-3 col-sm-3"> 
					<input type="text" class="input-text Wdate radius size-S" name="created_time_from"
						onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}'})" id="logmin">
				</div>
				<span class="form-label col-xs-1 col-sm-1 Hui-iconfont" style="text-align:center;">&#xe6d7;&#xe6d7;</span>
				<div class="formControls col-xs-3 col-sm-3">
					<input type="text" class="input-text Wdate radius size-S" name="created_time_to" 
						onfocus="WdatePicker({minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d'})" id="logmax">
				</div>
			</div>
		</form>
		<div class="cl mt-15 btn-group btn-group-justified" role="group">
			<div class="btn-group" style="display:table; margin-left:auto; margin-right:auto;" role="group">
				<button type="button" class="btn-search btn btn-default size-S Hui-iconfont" onclick="doSearch();">&#xe683; 查询</button>
				<button type="button" class="btn btn-default size-S Hui-iconfont" style="margin-left:10px;" onclick="doReset();">&#xe68f; 重置</button>
			</div>
		</div>
		<div class="cl mt-15 mb-5">
			<c:if test="${fn:contains(sessionScope.user.permissions,'CarparkMgt_SystemCarpark.Add')}">
				<div class="btn-group f-l">
					<button type="button" class="btn btn-default size-S Hui-iconfont" title="新增"
						onclick="carpark_edit('新增','/systemCarpark/find.do?id=&modify=')">&#xe600; 新增</button>
				</div>
			</c:if>
		</div>
		<%@ include file="system-carpark-list-table.jsp"%>
	</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui.admin/js/H-ui.admin.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/geo.js"></script>
<script type="text/javascript">
// 初始化省市区下拉控件
setup();
// 菜单链接到此页面后执行查询
doSearch();
function doSearch(gotoPageInt, recordsCount) {
	if (!gotoPageInt) {
		gotoPageInt = 1;
	}
	if (!recordsCount) {
		recordsCount = "";
	}
	$.ajax({
		url : "${pageContext.request.contextPath}/systemCarpark/search.do?gotoPageInt=" + gotoPageInt + "&recordsCount=" + recordsCount,
		type : "POST",
		data : $("#systemCarparkSearchFrom").serializeArray(),
		beforeSend:function(XMLHttpRequest){ 
			layer.load();
			$(".btn-search").attr("disabled", true);
		},
		success:function(txt) { //回调方法 
			$("#refreshTableDiv").html(txt);
		},
		error:function(XMLHttpRequest, textStatus, errorThrown) {
			if (XMLHttpRequest.status == 403) {
				window.location.href = "${pageContext.request.contextPath}/noprivilege.jsp"; 
			} else {
				$("#tbodyId tr:last td").html("请求失败，请稍后再试！");
			}
		},
		complete : function (XMLHttpRequest, textStatus) {
			layer.closeAll('loading');
			$(".btn-search").attr("disabled", false);
		}
	});
};

function doReset() {
	$('#systemCarparkSearchFrom')[0].reset();
	doSearch();
};

function carpark_view(title, url) {
	var path = "${pageContext.request.contextPath}" + url;
	parent.layer.open({
	    type: 2,// Number: 0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
	    title: title,//String/Array/Boolean "标题"，"['文本', '样式']"， trur/false
	    shade: 0.5,//默认：0.3  遮罩:String/Array/Boolean
	    area: ['70%', '88%'],// 宽高
	    //maxmin: true,//maxmin - 最大最小化 //Boolean 对type:1和type:2有效
	    content: path // String/DOM/Array 随着type的不同而不同
	});
};

function carpark_edit(title, url) {
	var path = "${pageContext.request.contextPath}" + url;
	//layer_show(title, path, "820", "500");
	var index = layer.open({
	    type: 2,// Number: 0（信息框，默认）1（页面层）2（iframe层）3（加载层）4（tips层）
	    title: title, //String// Array//Boolean "标题"，"['文本', '样式']"， trur/false
	    shade: 0.5,//默认：0.3  遮罩:String/Array/Boolean
	    area: ['80%', '90%'],// 宽高
	    content: path // String/DOM/Array 随着type的不同而不同
	});
	layer.full(index);
};

/*删除*/
function carpark_del(url) {
	layer.confirm('确认要删除吗？',function(flag) {
		$.ajax({
			url : "${pageContext.request.contextPath}" + url,
			type : "GET",
			success : function(txt) { //回调方法 
				layer.msg('已删除!',{icon:1,time:1500});
				doSearch();
			},
			error : function() {
				layer.msg('请求失败，请稍后再试！',{icon:2, time:1500});
			}
		});
	});
};
</script>
</body>
</html>