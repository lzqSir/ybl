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
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/lib/Hui-iconfont/1.0.7/iconfont.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui.admin/css/style.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/h-ui/css/parking_list.css"/>
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>停车场列表</title>
</head>
<body>
<div class="container" style="width:96%;">
   <!-- 	<div class="function_btn" style="font-weight:bold;">
   		<span class="basic_msg tip_msg">基本信息</span>
   		<span class="charge_msg tip_msg" style="background:#e8e8e8;">收费信息</span>
   	</div> -->
   	
   	<div class="HuiTab">
		<div class="tabBar clearfix">
			<span>基本信息</span>
			<span class="charge_msg">收费信息</span>
		</div>
	</div>
   	<div class="tabCon particular_msg">
	   	<form id="carparkEditForm" class="form form-horizontal">
	   		<input type="hidden" name="chargeListStr" id="chargeListStr"/>
	   		<input type="hidden" name="id" id="id" value="${carparkEdit.id}"/>
			<input type="hidden" name="park_id" id="park_id" value="${carparkEdit.park_id}" />
   			<input type="hidden" name="secret_key" id="secret_key" value="${carparkEdit.secret_key}" />
   				
       		<div class="row cl">
       			<label class="form-label col-xs-2 col-sm-2 text-overflow">车场名称<span class="c-red"> *</span></label>
	       		<div class="formControls col-xs-4 col-sm-4">
	       			<input type="text" name="carpark_name" id="carpark_name" value="${carparkEdit.carpark_name}" 
	       				class="input-text radius size-S" placeholder="必填" required="true" maxlength="100"/>
	       		</div>
       			<label class="form-label col-xs-2 col-sm-2 text-overflow">车场类型<span class="c-red"> *</span></label>
	       		<div class="formControls col-xs-4 col-sm-4">
	       			<input type="text" name="park_type" id="park_type" value="${carparkEdit.park_type}" 
	       				class="input-text radius size-S" placeholder="必填：地上/地下/室内..." required="true" maxlength="60"/>
	       		</div>
	   		</div>
	   		<div class="row cl">
       			<label class="form-label col-xs-2 col-sm-2 text-overflow">所属集团<span class="c-red"> *</span></label>
	   			<div class="formControls col-xs-4 col-sm-4">
	       			<select class="select select-box input-text radius size-S" name="group_id" id="group_id" required="true">
	       				<option value="">请选择</option>
					</select>
	       		</div>
       			<label class="form-label col-xs-2 col-sm-2 text-overflow">状态<span class="c-red"> *</span></label>
	   			<div class="formControls col-xs-4 col-sm-4">
	       			<select name="state" id="state" class="select select-box input-text radius size-S" required="true">
						<option value="">请选择</option>
						<option value="0">启用</option>
						<option value="1">禁用</option>
					</select>
	       		</div>
	   		</div>
	   		<div class="row cl">
   				<label class="form-label col-xs-2 col-sm-2 text-overflow">贝壳商户编码&nbsp;&nbsp;&nbsp;</label>
	       		<div class="formControls col-xs-4 col-sm-4">
	   				<input name="beck_merchant_id" class="input-text radius size-S" value="${carparkEdit.beck_merchant_id}" />
	   			</div>
   				<label class="wankeInfoFlag form-label col-xs-2 col-sm-2 text-overflow">万科项目编码<span class="c-red"> *</span></label>
	       		<div class="wankeInfoFlag formControls col-xs-4 col-sm-4">
	   				<input name="wanke_project_code" class="input-text radius size-S" value="${carparkEdit.wanke_project_code}" required="true" />
	   			</div>
	   		</div>
	   		<div class="wankeInfoFlag row cl">
   				<label class="form-label col-xs-2 col-sm-2 text-overflow">万科车场项目编码名称<span class="c-red"> *</span></label>
	       		<div class="formControls col-xs-4 col-sm-4">
	   				<select name="wanke_parking_code" id="wanke_parking_code" class="select select-box input-text radius size-S" required="true">
	   					<option value="">请选择</option>
	   				</select>
	   			</div>
   				<label class="form-label col-xs-2 col-sm-2 text-overflow">万科停车场ID名称<span class="c-red"> *</span></label>
	       		<div class="formControls col-xs-4 col-sm-4">
	   				<select type="text" name="wanke_parking_id" id="wanke_parking_id" class="input-text radius size-S" required="true">
	   					<option value="">请选择</option>
	   				</select>
	   			</div>
	   		</div>
	   		<div class="row cl">
       			<label class="form-label col-xs-2 col-sm-2 text-overflow">省市地区<span class="c-red"> *</span></label>
	   			<div class="formControls col-xs-4 col-sm-4">
	       			<select name="province" id="s1" class="select select-box input-text radius size-S" style="width:32.5%;" required="true">
						<option></option>
					</select>
					<select name="city" id="s2" class="select select-box input-text radius size-S" style="width:32.5%;" required="true">
						<option></option>
					</select>
					<select name="district" id="s3" class="select select-box input-text radius size-S" style="width:32.5%;" required="true">
						<option></option>
					</select>
	       		</div>
       			<label class="form-label col-xs-2 col-sm-2 text-overflow">详细地址<span class="c-red"> *</span></label>
	       		<div class="formControls col-xs-4 col-sm-4">
	       			<input type="text" name="address" id="address" value="${carparkEdit.address}" 
	       				class="input-text radius size-S" placeholder="必填" required="true" maxlength="300"/>
	       		</div>
	   		</div>
	   		<div class="row cl">
       			<label class="form-label col-xs-2 col-sm-2 text-overflow">经度<span class="c-red"> *</span></label>
	   			<div class="formControls col-xs-4 col-sm-4">
	       			<input type="text" name="longitude" id="longitude" value="${carparkEdit.longitude}" style="width:32.5%;"
	       				class="input-text radius size-S" placeholder="必填Y：数字" required="true" number="true" min="-180" max="180"/>
       				<label class="text-overflow" style="margin-left:44px;">纬度<span class="c-red"> *</span></label>
	       			<input type="text" name="latitude" id="latitude" value="${carparkEdit.latitude}" style="width:32.5%;"
	       				class="input-text radius size-S ml-30" placeholder="必填X：数字" required="true" number="true" min="-90" max="90" />
	       		</div>
   				<label class="form-label col-xs-2 col-sm-2 text-overflow">联系电话&nbsp;&nbsp;&nbsp;</label>
	   			<div class="formControls col-xs-4 col-sm-4">
	   				<input type="text" name="contact_phone" id="contact_phone" value="${carparkEdit.contact_phone}" 
	   					class="input-text radius size-S" placeholder="" maxlength="20"/>
	   			</div>
	   		</div>
	   		<div class="row cl">
	       		<label class="form-label col-xs-2 col-sm-2 text-overflow">总车位数&nbsp;&nbsp;&nbsp;</label>
	       		<div class="formControls col-xs-4 col-sm-4">
	       			<input type="text" name="total_space_count" value="${carparkEdit.total_space_count}" style="width:32.5%;"
	   					class="input-text radius size-S" placeholder="整数" digits="true"/>
       				<label class="text-overflow" style="margin-left:44px;">月卡数&nbsp;&nbsp;&nbsp;</label>
	       			<input type="text" name="total_monthrent_count" value="${carparkEdit.total_monthrent_count}" style="width:32.5%; margin-left:14px;"
	       				class="input-text radius size-S ml-14" placeholder="整数，小于总车位数" digits="true" />
	   				
	   			</div>
   				<label class="form-label col-xs-2 col-sm-2 text-overflow">备注信息&nbsp;&nbsp;&nbsp;</label>
	   			<div class="formControls col-xs-4 col-sm-4">
	   				<input type="text" name="park_des" id="park_des" value="${carparkEdit.park_des}" 
	   					class="input-text radius size-S" placeholder="" maxlength="300"/>
	   			</div>
	   		</div>
	   		<div class="row cl">
   				<label class="form-label col-xs-2 col-sm-2 text-overflow">免费时长(分钟)&nbsp;&nbsp;&nbsp;</label>
	   			<div class="formControls col-xs-4 col-sm-4">
	   				<input type="text" name="free_time_minute" value="${carparkEdit.free_time_minute}" 
	   					class="input-text radius size-S" placeholder="整数" onchange="free_time_minute_change(this.value);"
	   					number="true" digits="true" max="1440"/>
	   			</div>
  				<label class="form-label col-xs-2 col-sm-2 text-overflow">周期最高收费(元)&nbsp;&nbsp;&nbsp;</label>
	   			<div class="formControls col-xs-4 col-sm-4">
	   				<input type="text" name="max_fee" id="max_fee" value="${carparkEdit.max_fee}" 
	   					class="input-text radius size-S" placeholder="数字" number="true" min="0"/>
	   			</div>
	   		</div>
	   		<div class="row cl">
   				<label class="form-label col-xs-2 col-sm-2 text-overflow">首段时长(分钟)&nbsp;&nbsp;&nbsp;</label>
	   			<div class="formControls col-xs-4 col-sm-4">
	   				<input type="text" name="first_charge_minute" id="first_charge_minute" value="${carparkEdit.first_charge_minute}" 
	   					class="input-text radius size-S" placeholder="整数" digits="true" max="1440"/>
	   			</div>
   				<label class="form-label col-xs-2 col-sm-2 text-overflow">首段金额(元)&nbsp;&nbsp;&nbsp;</label>
	   			<div class="formControls col-xs-4 col-sm-4">
	   				<input type="text" name="first_charge_fee" id="first_charge_fee" value="${carparkEdit.first_charge_fee}" 
	   					class="input-text radius size-S" placeholder="数字" number="true" min="0"/>
	   			</div>
	   		</div>
	   		<div class="row cl">
   				<label class="form-label col-xs-2 col-sm-2 text-overflow">微信在线支付<span class="c-red"> *</span></label>
	   			<div class="formControls col-xs-4 col-sm-4">
	   				<div class="check-box" style="padding-left: 0px;">
		   				<input type="checkbox" name="weixin_onlie_pay" id="weixin_onlie_pay_yes" value="1"
		   					onclick="weixin_onlie_pay_click(this);"/>
		   				<label>开启</label>
		   			</div>
		   			<div class="check-box">
		   				<input type="checkbox" name="weixin_onlie_pay" id="weixin_onlie_pay_no" value="0" checked="checked"
		   					onclick="weixin_onlie_pay_click(this);"/>
		   				<label>关闭</label>
	   				</div>
	   			</div>
   				<label class="form-label col-xs-2 col-sm-2 text-overflow">微信子商户号&nbsp;&nbsp;&nbsp;</label>
	   			<div class="formControls col-xs-4 col-sm-4">
	   				<input type="text" name="sub_mch_id" id="sub_mch_id" value="${carparkEdit.sub_mch_id}"
	   					class="input-text radius size-S" placeholder="" maxlength="64"/>
	   			</div>
	   		</div>
	   		<div class="row cl">
   				<label class="form-label col-xs-2 col-sm-2 text-overflow">支付宝在线支付<span class="c-red"> *</span></label>
	   			<div class="formControls col-xs-4 col-sm-4">
	   				<div class="check-box" style="padding-left: 0px;">
		   				<input type="checkbox" name="alipay_onlie_pay" id="alipay_onlie_pay_yes" value="1" 
		   					onclick="alipay_onlie_pay_click(this);"/>
		   				<label class="start">开启</label>
	   				</div>
	   				<div class="check-box">
		   				<input type="checkbox" name="alipay_onlie_pay" id="alipay_onlie_pay_no" value="0" checked="checked"
		   					onclick="alipay_onlie_pay_click(this);"/>
		   				<label>关闭</label>
		   			</div>
	   			</div>
   				<label class="form-label col-xs-2 col-sm-2 text-overflow" id="alipay_free_secret_span">支付宝免密支付&nbsp;&nbsp;&nbsp;</label>
	   			<div class="formControls col-xs-4 col-sm-4">
	   				<div class="check-box" style="padding-left: 0px;">
		   				<input type="checkbox" name="alipay_free_secret" id="alipay_free_secret_yes" value="1" disabled="disabled"
		   					onclick="alipay_free_secret_click(this);"/>
		   				<label>开启</label>
	   				</div>
	   				<div class="check-box">
		   				<input type="checkbox" name="alipay_free_secret" id="alipay_free_secret_no" value="0" disabled="disabled" checked="checked"
		   					onclick="alipay_free_secret_click(this);"/>
		   				<label>关闭</label>
	   				</div>
	   			</div>
	   		</div>
	   		<div class="row cl">
   				<label class="form-label col-xs-2 col-sm-2 text-overflow">粤通卡ETC支付<span class="c-red"> *</span></label>
	   			<div class="formControls col-xs-4 col-sm-4">
	   				<div class="check-box" style="padding-left: 0px;">
		   				<input type="checkbox" name="yuetong_etc_pay" id="yuetong_etc_pay_yes" value="1"
		   					onclick="yuetong_etc_pay_click(this);"/>
		   				<label>开启</label>
		   			</div>
		   			<div class="check-box">
		   				<input type="checkbox" name="yuetong_etc_pay" id="yuetong_etc_pay_no" value="0" checked="checked" 
		   					onclick="yuetong_etc_pay_click(this);"/>
	   					<label>关闭</label>
	   				</div>
	   			</div>
   				<label class="form-label col-xs-2 col-sm-2 text-overflow" id="yuetong_park_name_span">粤通卡停车场名称&nbsp;&nbsp;&nbsp;</label>
	   			<div class="formControls col-xs-4 col-sm-4">
	   				<input type="text" name="yuetong_park_name" id="yuetong_park_name" value="${carparkEdit.yuetong_park_name}" 
	   					class="input-text radius size-S" placeholder="开启ETC支付后填写：一般四个中文" readonly="readonly" maxlength="12"/>
	   			</div>
	   		</div>
	   		<div class="row cl">
   				<label class="form-label col-xs-2 col-sm-2 text-overflow" id="yuetong_park_code_span">粤通卡分配停车场编号&nbsp;&nbsp;&nbsp;</label>
	   			<div class="formControls col-xs-4 col-sm-4">
	   				<input type="text" name="yuetong_park_code" id="yuetong_park_code" value="${carparkEdit.yuetong_park_code}" 
	   					class="input-text radius size-S" placeholder="开启ETC支付后填写：四个数字与英文字母" readonly="readonly" maxlength="4"/>
	   			</div>
   				<label class="form-label col-xs-2 col-sm-2 text-overflow" id="yuetong_owner_code_span">粤通卡分配物业编号&nbsp;&nbsp;&nbsp;</label>
	   			<div class="formControls col-xs-4 col-sm-4">
	   				<input type="text" name="yuetong_owner_code" id="yuetong_owner_code" value="${carparkEdit.yuetong_owner_code}" 
	   					class="input-text radius size-S" placeholder="开启ETC支付后填写：四个数字与英文字母" readonly="readonly"  maxlength="4"/>
	   			</div>
	   		</div>
	   	</form>
   	</div>
   	
   	
   	<div class="tabCon charge_section" style="display: none;">
   		<div class="free_time">
   			<span class="free_word">免费时间</span>
   			<input type="text" class="input_free_time input-text radius" id="free_time_minute_cost" value="${carparkEdit.free_time_minute}" readonly="readonly" placeholder="基本信息中填写"/>
   			<span class="mintue">分钟</span>
   		</div>
   		<div class="small_car_msg">
   			<span class="small_car_word">小型车</span>
   			<span class="most_money">封顶金额</span>
   			<input type="text" name="max_cost_small" id="max_cost_small" value="${max_cost_small}" 
   				class="input_most_money input-text radius" style="width:60px;" min="0" number="true"/>
   			<span class="yuan">元</span>
   		</div>
   		<div class="cl mt-5 mb-5">
   			<button onclick="smallAddRow();" class="btn btn-default size-S Hui-iconfont">&#xe600; 新增</button>
   		</div>
   		<table class="table table-border table-bordered">
			<thead>
				<tr class="text-c">
					<th>操作</th>
					<th>ID</th>
					<th>车辆类型</th>
					<th>时间段</th>
					<th>计费类型</th>
					<th>费用(元)</th>
				</tr>
			</thead>
			<tbody id="smallTbody">
				<c:forEach items="${requestScope.smallCostList}" var="smallCost" varStatus="status">
					<tr>
				        <td class="text-c">
					   		<a style="color:#0EC6FF;" class="smallDelRow" href="#">删除</a>
					   	</td>
					   	<td>
					   		<input type="text" name="id" value="${smallCost.id}" class="input-text radius size-S" readonly="readonly"/>
					   	</td>
					   	<td class="text-c">小型车</td>
			            <td class="text-c">
			            	<input type="text" name="cost_time" value="${smallCost.cost_time}" class="input-text radius size-S"/>
			            </td>
			            <td>
			            	<select name="cost_type" class="select select-box input-text radius size-S">
				            	<c:choose>
									<c:when test="${smallCost.cost_type == 0}">
										<option value="0" selected="selected">首小时</option>
      									<option value="1">首小时后</option>
									</c:when>
									<c:when test="${smallCost.cost_type == 1}">
										<option value="0">首小时</option>
      									<option value="1" selected="selected">首小时后</option>
									</c:when>
								</c:choose>
      						</select>
      					</td>
			            <td class="text-r">
			            	<input type="text" name="cost_info" value="${smallCost.cost_info}"class="input-text radius size-S"/>
			            </td>
					</tr>  
				</c:forEach>
			</tbody>
		</table>
		<br>
       	
       	
       	
       	
       	<div class="big_car_msg">
   			<span class="big_car_word">大型车</span>
   			<span class="most_money">封顶金额</span>
   			<input type="text" name="max_cost_big" id="max_cost_big" value="${max_cost_big}" 
   				class="input_most_money_bigCar input-text radius" style="width:60px;" min="0" number="true"/>
   			<span class="yuan">元</span>
   		</div>
   		<div class="cl mt-5 mb-5">
   			<button onclick="bigAddRow();" class="btn btn-default size-S Hui-iconfont">&#xe600; 新增</button>
   		</div>
   		<table class="table table-border table-bordered">
			<thead>
				<tr class="text-c">
					<th>操作</th>
					<th>ID</th>
					<th>车辆类型</th>
					<th>时间段</th>
					<th>计费类型</th>
					<th>费用(元)</th>
				</tr>
			</thead>
			<tbody id="bigTbody">
				<c:forEach items="${requestScope.bigCostList}" var="bigCost" varStatus="status">
					<tr>
				        <td class="text-c">
					   		<a style="color:#0EC6FF;" class="bigDelRow" href="#">删除</a>
					   	</td>
					   	<td>
					   		<input type="text" name="id" value="${bigCost.id}" class="input-text radius size-S" readonly="readonly"/>
					   	</td>
					   	<td class="text-c">大型车</td>
			            <td class="text-c">
			            	<input type="text" name="cost_time" value="${bigCost.cost_time}" class="input-text radius size-S"/>
			            </td>
			            <td>
			            	<select name="cost_type" class="select select-box input-text radius size-S">
      							<c:choose>
									<c:when test="${bigCost.cost_type == 0}">
										<option value="0" selected="selected">首小时</option>
      									<option value="1">首小时后</option>
									</c:when>
									<c:when test="${bigCost.cost_type == 1}">
										<option value="0">首小时</option>
      									<option value="1" selected="selected">首小时后</option>
									</c:when>
								</c:choose>
      						</select>
      					</td>
			            <td class="text-r">
			            	<input type="text" name="cost_info" value="${bigCost.cost_info}"class="input-text radius size-S"/>
			            </td>
					</tr>  
				</c:forEach>
			</tbody>
		</table>
   	</div>
   	<div class="mt-10 mb-10" style="display:table; margin-left:auto; margin-right:auto;">
		<button id="saveBtn" type="button" class="save_btn btn btn-default size-S Hui-iconfont">&#xe632; 保存</button>
		<button id="cancelBtn" type="button" class="close_btn btn btn-default size-S Hui-iconfont" style="margin-left:10px;">&#xe6a6; 关闭</button>
	</div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui.admin/js/H-ui.admin.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/geo.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/jquery.validate.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/validate-methods.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery.validation/1.14.0/messages_zh.min.js"></script> 
<script type="text/javascript">
//判断是否新增
var isCreate = ($("#id").val() == null || $("#id").val() == "");
if (isCreate) {
	$(".charge_msg").hide();	
}
$(function() {
	$.Huitab(".tabBar span",".tabCon","current","click","0");
	// 字母数字验证
	jQuery.validator.addMethod("letterNumberValidator", function(value, element) {   
		var strExp = /^[A-Za-z0-9]+$/;
	    return strExp.test(value) || value == null || value == "";
	}, "请输入字母和数字");
	
	$("#carparkEditForm").validate({
	    rules: {  
	        yuetong_park_code:{
	            letterNumberValidator:true
	        },  
	        yuetong_owner_code:{  
	            letterNumberValidator:true
	        }
	    }
	});
	
	$("#group_id").change(function() {
		var value = $(this).val();
		if (value == 1) {
			$(".wankeInfoFlag").show();
		} else {
			$(".wankeInfoFlag").hide();
			$("#wanke_parking_code").val(null);
			$("#wanke_parking_id").val(null);
		}
	});
	
	$("#wanke_parking_code").change(function() {
		var wanke_parking_code = $("#wanke_parking_code").val();
		$("#wanke_parking_id").children(":gt(0)").remove();
		init_wanke_parking_id(wanke_parking_code);
	});
	
	$(".wankeInfoFlag").hide();
});

//编辑时下拉框赋值
window.onload = function() {
	// 初始化省市区下拉框.
	// 默认值
	opt0 = ['${carparkEdit.province}', '${carparkEdit.city}', '${carparkEdit.district}'];
	setup();
	// 初始化group_id下拉框
	$.ajax({
		url:"${pageContext.request.contextPath}/managerGroup/dropdown.do" , 
		type:"POST" , 
		dataType:"json",
		success:function(data) {
			var group_id = '${carparkEdit.group_id}';
			//遍历 json为[{"id":1,"group_name":"万科集团","group_type":1,"created_time":"Feb 28, 2017 8:08:08 AM","last_update_time":"Feb 28, 2017 8:08:08 AM"},{"id":2,"group_name":"哈哈哈集团","group_type":1,"created_time":"Feb 28, 2017 8:14:49 PM","last_update_time":"Mar 1, 2017 10:42:19 AM"},{"id":3,"group_name":"呵呵呵集团","group_type":1,"created_time":"Feb 28, 2017 8:18:53 PM","last_update_time":"Mar 1, 2017 10:42:08 AM"},{"id":4,"group_name":"嘿嘿嘿集团","group_type":1,"created_time":"Feb 28, 2017 8:19:13 PM","last_update_time":"Mar 1, 2017 10:41:58 AM"},{"id":7,"group_name":"帕克斯","group_type":0,"created_time":"Mar 1, 2017 1:49:10 PM","last_update_time":"Mar 1, 2017 1:49:10 PM"},{"id":8,"group_name":"DDDD","group_type":1,"created_time":"Mar 2, 2017 11:58:47 AM","last_update_time":"Mar 2, 2017 11:58:47 AM"},{"id":9,"group_name":"wwww","group_type":0,"created_time":"Mar 2, 2017 12:00:05 PM","last_update_time":"Mar 2, 2017 12:00:05 PM"},{"id":10,"group_name":"SSS","group_type":0,"created_time":"Mar 2, 2017 12:02:03 PM","last_update_time":"Mar 2, 2017 12:02:03 PM"}]
			$.each(data, function (index, item) {  
				var id = data[index].id; 
				var text = data[index].group_name; 
				if (id == group_id) {
					$("#group_id").append("<option value='" + id + "' selected='selected'>" + text + "</option>");
					if (group_id == 1) {
						$(".wankeInfoFlag").show();
					}
				} else {
					$("#group_id").append("<option value='" + id + "'>" + text + "</option>");
				}
			}); 
		}, 
		error:function(XMLHttpRequest,textStatus, errorThrown) { 
		}
	});
	
	//初始化wanke_parking_code下拉框
	$.ajax({ 
		url:"${pageContext.request.contextPath}/wankeProjectCode/projectCode/dropdown.do" , 
		type:"POST" , 
		dataType:"json",
		success:function(data) {
			var wanke_parking_code = '${carparkEdit.wanke_parking_code}';
			$.each(data, function (index, item) {  
				var id = data[index].projectCode; 
				var text = data[index].projectName;
				if (id == wanke_parking_code) {
					$("#wanke_parking_code").append("<option value='" + id + "' selected='selected'>" + text + "</option>");
					init_wanke_parking_id(id);
				} else {
					$("#wanke_parking_code").append("<option value='" + id + "'>" + text + "</option>");
				}
			}); 
		}, 
		error:function(XMLHttpRequest,textStatus, errorThrown) { 
		}
	});
	
    $("#state").val('${carparkEdit.state}');

    
    var weixin_onlie_pay = '${carparkEdit.weixin_onlie_pay}';
    if (weixin_onlie_pay == "1") {
    	$("#weixin_onlie_pay_yes").attr("checked", true);
		$("#weixin_onlie_pay_no").attr("checked", false);
    }
    var alipay_onlie_pay = '${carparkEdit.alipay_onlie_pay}';
    if (alipay_onlie_pay == "1") {
    	$("#alipay_onlie_pay_yes").attr("checked", true);
		$("#alipay_onlie_pay_no").attr("checked", false);
		$("#alipay_free_secret_yes").attr("disabled", false);
		$("#alipay_free_secret_no").attr("disabled", false);
		$("#alipay_free_secret_span").html('支付宝免密支付<span class="c-red"> *</span>');
    }
    var alipay_free_secret = '${carparkEdit.alipay_free_secret}';
    if (alipay_free_secret == "1") {
    	$("#alipay_free_secret_yes").attr("checked", true);
		$("#alipay_free_secret_no").attr("checked", false);
    }
    var yuetong_etc_pay = '${carparkEdit.yuetong_etc_pay}';
    if (yuetong_etc_pay == "1") {
    	$("#yuetong_etc_pay_yes").attr("checked", true);
		$("#yuetong_etc_pay_no").attr("checked", false);
		$("#yuetong_park_name").attr("readonly", false);
		$("#yuetong_park_name").attr("required", true);
		$("#yuetong_park_code").attr("readonly", false);
		$("#yuetong_park_code").attr("required", true);
		$("#yuetong_owner_code").attr("readonly", false);
		$("#yuetong_owner_code").attr("required", true);
		$("#yuetong_park_name_span").html('粤通卡停车场名称<span class="c-red"> *</span>');
		$("#yuetong_park_code_span").html('粤通卡分配停车场编号<span class="c-red"> *</span>');
		$("#yuetong_owner_code_span").html('粤通卡分配物业编号<span class="c-red"> *</span>');
    }
};

//初始化wanke_parking_id下拉框
function init_wanke_parking_id(projectCode) {
	if (projectCode == "" || projectCode == null) {
		return false;
	}
	$.ajax({ 
		url:"${pageContext.request.contextPath}/wankeProjectCode/parkingId/dropdown.do?projectCode=" + projectCode, 
		type:"POST" , 
		dataType:"json",
		success:function(data) {
			var wanke_parking_id = '${carparkEdit.wanke_parking_id}';
			$.each(data, function (index, item) {  
				var id = data[index].parkingId; 
				var text = data[index].parkingName;
				if (id == wanke_parking_id) {
					$("#wanke_parking_id").append("<option value='" + id + "' selected='selected'>" + text + "</option>");
				} else {
					$("#wanke_parking_id").append("<option value='" + id + "'>" + text + "</option>");
				}
			}); 
		}, 
		error:function(XMLHttpRequest,textStatus, errorThrown) { 
		}
	});
}

$("#s1").change(function() {
	opt0 = [this.value, '', ''];
	preselect(this.value);
});

function free_time_minute_change(val) {
	$("#free_time_minute_cost").val(val);
};


function weixin_onlie_pay_click(self) {
	$("#weixin_onlie_pay_yes").attr("checked", false);
	$("#weixin_onlie_pay_no").attr("checked", false);
	self.checked = true;
};

function alipay_onlie_pay_click(self) {
	$("#alipay_onlie_pay_yes").attr("checked", false);
	$("#alipay_onlie_pay_no").attr("checked", false);
	self.checked = true;
	$("#alipay_free_secret_span").html("支付宝免密支付&nbsp;&nbsp;&nbsp;");
	$("#alipay_free_secret_no").click();
	$("#alipay_free_secret_yes").attr("disabled", true);
	$("#alipay_free_secret_no").attr("disabled", true);
	if (self.name == "alipay_onlie_pay" && self.id == "alipay_onlie_pay_yes") {
		$("#alipay_free_secret_yes").attr("disabled", false);
		$("#alipay_free_secret_no").attr("disabled", false);
		$("#alipay_free_secret_span").html('支付宝免密支付<span class="c-red"> *</span>');
	}
};

function alipay_free_secret_click(self) {
	$("#alipay_free_secret_yes").attr("checked", false);
	$("#alipay_free_secret_no").attr("checked", false);
	self.checked = true;
};

function yuetong_etc_pay_click(self) {
	$("#yuetong_etc_pay_yes").attr("checked", false);
	$("#yuetong_etc_pay_no").attr("checked", false);
	self.checked = true;
	$("#yuetong_park_name").attr("readonly", true);
	$("#yuetong_park_name").attr("required", false);
	$("#yuetong_park_name_span").html("粤通卡停车场名称&nbsp;&nbsp;&nbsp;");
	
	$("#yuetong_park_code").attr("readonly", true);
	$("#yuetong_park_code").attr("required", false);
	$("#yuetong_park_code_span").html("粤通卡分配停车场编号&nbsp;&nbsp;&nbsp;");
	
	$("#yuetong_owner_code").attr("readonly", true);
	$("#yuetong_owner_code").attr("required", false);
	$("#yuetong_owner_code_span").html("粤通卡分配物业编号&nbsp;&nbsp;&nbsp;");
	
	if (self.name == "yuetong_etc_pay" && self.id == "yuetong_etc_pay_yes") {
		$("#yuetong_park_name").attr("readonly", false);
		$("#yuetong_park_name").attr("required", true);
		$("#yuetong_park_name_span").html('粤通卡停车场名称<span class="c-red"> *</span>');
		$("#yuetong_park_code").attr("readonly", false);
		$("#yuetong_park_code").attr("required", true);
		$("#yuetong_park_code_span").html('粤通卡分配停车场编号<span class="c-red"> *</span>');
		$("#yuetong_owner_code").attr("readonly", false);
		$("#yuetong_owner_code").attr("required", true);
		$("#yuetong_owner_code_span").html('粤通卡分配物业编号<span class="c-red"> *</span>');
	} else {
		$("#yuetong_park_name").val("");
		$("#yuetong_park_code").val("");
		$("#yuetong_owner_code").val("");
	}
};

/**保存**/
$("#saveBtn").click(function() {
	if (!$("#carparkEditForm").valid()) {
		return false;
	}
	if (!isCreate) {
		var data = "[";// 定义数据变量
		// 小型车
		$("#smallTbody").find("tr").each(function(i, dom) {// 遍历表格中的input、select等标签
			data += "{";
			$(dom).find("input, select").each(function(i, ele) {
				data += "\"" + ele.name + "\":\"" + ele.value + "\",";
			});
			data += "\"car_type\":\"0\",\"max_cost_small\":\""+ $("#max_cost_small").val() +"\"},";
		});
		// 大型车
		$("#bigTbody").find("tr").each(function(i, dom) {// 遍历表格中的input、select等标签
			data += "{";
			$(dom).find("input, select").each(function(i, ele) {
				data += "\"" + ele.name + "\":\"" + ele.value + "\",";
			});
			data += "\"car_type\":\"1\",\"max_cost_big\":\""+ $("#max_cost_big").val() +"\"},";
		});
		if (data.length != 1) {// 如果取出了数据，删除多余的符号
			data = data.substring(0, data.length - 1);// 删除多余的符号','
		}
		data += "]";// 添加结束符
		//data = eval("(" + data + ")");// 将数据转换成json对象
		//alert(JSON.stringify(data))
		$("#chargeListStr").val(data);
	}
	
	$.ajax({
		url :  isCreate ? "${pageContext.request.contextPath}/systemCarpark/add.do" : "${pageContext.request.contextPath}/systemCarpark/edit.do",
		type : "POST",
		data : $("#carparkEditForm").serialize(),
		beforeSend : function(txt) {
			layer.load();
			$(".save_btn").attr("disabled", true);
		},
		success : function(txt) { // 回调方法 
			isCreate ? layer.msg('添加成功！',{icon:1, time:1500}) : layer.msg('修改成功！',{icon:1, time:1500});
			setTimeout(function() {
				window.parent.location.reload();
			}, 1500);
		},
		error : function(msg) {
			layer.msg('请求失败，请稍后再试！',{icon:2, time:1500});
		},
		complete : function (XMLHttpRequest, textStatus) {
			layer.closeAll('loading');
			setTimeout(function() {
				$(".save_btn").attr("disabled", false);
			},1600);
		}
	});
});

// 关闭
$("#cancelBtn").click(function() {
	layer_close();
});

/**Table切换**/							
/* $(".tip_msg").click(function() {
	var index = $(this).index();
	$(this).css("background","rgb(215,215,215)").siblings().css("background","#e8e8e8")
	if(index==0){
		$(".particular_msg").show();
		$(".charge_section").hide()
	}else if(index==1){
		$(".charge_section").show();
		$(".particular_msg").hide()
	}							
});
 */
/**小型车增加时间段**/
function smallAddRow() {
	var newRow = '<tr>'
					+'<td class="text-c">'
						+'<a style="color:#0EC6FF;" class="smallDelRow" href="#">删除</a>'
					+'</td>'
					+'<td>'
						+'<input type="text" name="id" value="0" class="input-text radius size-S" readonly="readonly"/>'
					+'</td>'
					+'<td class="text-c">小型车</td>'
					+'<td class="text-c">'
						+'<input type="text" name="cost_time" class="input-text radius size-S"/>'
					+'</td>'
					+'<td>'
						+'<select name="cost_type" class="select select-box input-text radius size-S">'
								+'<option value="0">首小时</option>'
								+'<option value="1">首小时后</option>'
							+'</select>'
						+'</td>'
					+'<td class="text-r">'
						+'<input type="text" name="cost_info" class="input-text radius size-S"/>'
					+'</td>'
				+'</tr>';
	$("#smallTbody").append(newRow);
	/**小型车删除时间段 用于删除点击新增按钮添加的数据**/
	$(".smallDelRow").click(function() {
		$(this).parent().parent().remove();
	});
};
// 编辑时默认有数据，删除调用此方法
/**小型车删除时间段**/
$(".smallDelRow").click(function() {
	$(this).parent().parent().remove();
});

/**大型车增加时间段**/
function bigAddRow() {
	var newRow = '<tr>'
					+'<td class="text-c">'
						+'<a style="color:#0EC6FF;" class="bigDelRow" href="#">删除</a>'
					+'</td>'
					+'<td>'
						+'<input type="text" name="id" value="0" class="input-text radius size-S" readonly="readonly"/>'
					+'</td>'
					+'<td class="text-c">大型车</td>'
					+'<td class="text-c">'
						+'<input type="text" name="cost_time" class="input-text radius size-S"/>'
					+'</td>'
					+'<td>'
						+'<select name="cost_type" class="select select-box input-text radius size-S">'
								+'<option value="0">首小时</option>'
								+'<option value="1">首小时后</option>'
							+'</select>'
						+'</td>'
					+'<td class="text-r">'
						+'<input type="text" name="cost_info" class="input-text radius size-S"/>'
					+'</td>'
				+'</tr>';
	$("#bigTbody").append(newRow);
	/**大型车删除时间段**/
	$(".bigDelRow").click(function() {
		$(this).parent().parent().remove();
	});
};
//编辑时默认有数据，删除调用此方法
/**大型车删除时间段**/
$(".bigDelRow").click(function() {
	$(this).parent().parent().remove();
});
</script>
</body>
</html>