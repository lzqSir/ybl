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
<style>
	.tdLabel {
		width:15%;
		background-color: #f5fafe;
		padding: 8px;
		line-height: 20px;
		word-break: break-all;
		font-weight: bold;
	}
	.tdValue {
		width:35%;
	}
</style>
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>停车场列表</title>
</head>
<body>
	<div class="container" style="width:96%;">
	   	<div class="HuiTab">
			<div class="tabBar clearfix">
				<span>基本信息</span>
				<span>收费信息</span>
			</div>
		</div>
	
	   	<div class="tabCon">
		   	<table class="text-overflow radius table table-border table-bordered table-bg table-hover table-condensed table-responsive">
		   		<tr>
		            <td class="tdLabel">停车场ID</td>  
		            <td class="tdValue">${carparkEdit.park_id}</td>
		            <td class="tdLabel">签名密钥</td>  
		            <td class="tdValue">${carparkEdit.secret_key}</td>  
				</tr>
				<tr>
		            <td class="tdLabel">贝壳商户编码</td>  
		            <td class="tdValue">${carparkEdit.beck_merchant_id}</td>  
		            <td class="tdLabel">访问密钥</td>  
		            <td class="tdValue">${carparkEdit.access_key}</td>  
				</tr>
				<tr>
		            <td class="tdLabel">车场名称</td>  
		            <td class="tdValue">${carparkEdit.carpark_name}</td>
		            <td class="tdLabel">车场类型</td>  
		            <td class="tdValue">${carparkEdit.park_type}</td>  
				</tr>
				<tr>
		            <td class="tdLabel">所属集团</td>  
		            <td class="tdValue">${requestScope.groupIdObjMap[carparkEdit.group_id].group_name}</td>
		            <td class="tdLabel">万科项目编码</td>  
		            <td class="tdValue">${carparkEdit.wanke_project_code}</td>  
				</tr>
				<tr>
		            <td class="tdLabel">万科车场项目编码</td>  
		            <td class="tdValue">${carparkEdit.wanke_parking_code}</td>
		            <td class="tdLabel">万科停车场ID</td>  
		            <td class="tdValue">${carparkEdit.wanke_parking_id}</td>  
				</tr>
				<tr>
		            <td class="tdLabel">状态</td>  
		            <td class="tdValue">
		            	<c:choose>
							<c:when test="${carparkEdit.state == 0}">启用</c:when>
							<c:when test="${carparkEdit.state == 1}">禁用</c:when>
						</c:choose>
		            </td>
		            <td class="tdLabel">总车位数</td>  
		            <td class="tdValue">${carparkEdit.total_space_count}</td>  
				</tr>
				<tr>
		            <td class="tdLabel">省市地区</td>  
		            <td class="tdValue">${carparkEdit.province} ${carparkEdit.city} ${carparkEdit.district}</td>
		            <td class="tdLabel">详细地址</td>  
		            <td class="tdValue">${carparkEdit.address}</td>  
				</tr>
				<tr>
		            <td class="tdLabel">经度</td>  
		            <td class="tdValue">${carparkEdit.longitude}</td>
		            <td class="tdLabel">纬度</td>  
		            <td class="tdValue">${carparkEdit.latitude}</td>  
				</tr>
				<tr>
		            <td class="tdLabel">联系电话</td>  
		            <td class="tdValue">${carparkEdit.contact_phone}</td>
		            <td class="tdLabel">备注信息</td>  
		            <td class="tdValue">${carparkEdit.park_des}</td>  
				</tr>
				<tr>
		            <td class="tdLabel">免费时长</td>  
		            <td class="tdValue">${carparkEdit.free_time_minute}</td>
		            <td class="tdLabel">周期最高收费</td>  
		            <td class="tdValue">${carparkEdit.max_fee}</td>  
				</tr>
				<tr>
		            <td class="tdLabel">首段时长</td>  
		            <td class="tdValue">${carparkEdit.first_charge_minute}</td>
		            <td class="tdLabel">首段金额</td>  
		            <td class="tdValue">${carparkEdit.first_charge_fee}</td>  
				</tr>
				<tr>
		            <td class="tdLabel">微信在线支付</td>  
		            <td class="tdValue">
						<c:choose>
							<c:when test="${carparkEdit.weixin_onlie_pay == 0}">关闭</c:when>
							<c:when test="${carparkEdit.weixin_onlie_pay == 1}">开启</c:when>
						</c:choose>
					</td>
		            <td class="tdLabel">微信子商户号</td>  
		            <td class="tdValue">${carparkEdit.sub_mch_id}</td>  
				</tr>
				<tr>
		            <td class="tdLabel">支付宝在线支付</td>  
		            <td class="tdValue">
						<c:choose>
							<c:when test="${carparkEdit.alipay_onlie_pay == 0}">关闭</c:when>
							<c:when test="${carparkEdit.alipay_onlie_pay == 1}">开启</c:when>
						</c:choose>
					</td>
		            <td class="tdLabel">支付宝免密支付</td>  
		            <td class="tdValue">
		            	<c:choose>
							<c:when test="${carparkEdit.alipay_free_secret == 0}">关闭</c:when>
							<c:when test="${carparkEdit.alipay_free_secret == 1}">开启</c:when>
						</c:choose>
		            </td>  
				</tr>
				<tr>
		            <td class="tdLabel">粤通卡ETC支付</td>  
		            <td class="tdValue">
						<c:choose>
							<c:when test="${carparkEdit.yuetong_etc_pay == 0}">关闭</c:when>
							<c:when test="${carparkEdit.yuetong_etc_pay == 1}">开启</c:when>
						</c:choose>
					</td>
		            <td class="tdLabel">粤通卡停车场名称</td>  
		            <td class="tdValue">${carparkEdit.yuetong_park_name}</td>  
				</tr>
				<tr>
		            <td class="tdLabel">粤通卡分配停车场编号</td>  
		            <td class="tdValue">${carparkEdit.yuetong_park_code}</td>
		            <td class="tdLabel">粤通卡分配物业编号</td>  
		            <td class="tdValue">${carparkEdit.yuetong_owner_code}</td>  
				</tr>
			</table>
	   	</div>
	   	
	   	
	   	
	   	<div class="tabCon charge_section">
	   		<div class="free_time">
	   			<span class="free_word">免费时间</span>
	   			<input type="text" class="input_free_time input-text radius" id="free_time_minute_cost" value="${carparkEdit.free_time_minute}" 
	   				readonly="readonly" placeholder=""/>
	   			<span class="mintue">分钟</span>
	   		</div>
	   		<div class="small_car_msg">
	   			<span class="small_car_word">小型车</span>
	   			<span class="most_money">封顶金额</span>
	   			<input type="text" name="max_cost_small" id="max_cost_small" value="${max_cost_small}" 
	   				class="input_most_money  input-text radius" style="width:60px;" readonly="readonly"/>
	   			<span class="yuan">元</span>
	   		</div>
	   		
	   		<table class="table table-border table-bordered">
				<thead>
					<tr class="text-c">
						<th></th>
						<th>车辆类型</th>
						<th>时间段</th>
						<th>计费类型</th>
						<th>费用(元)</th>
					</tr>
				</thead>
				<tbody id="smallTbody">
					<c:choose>
						<c:when test="${requestScope.smallCostList != null && fn:length(requestScope.smallCostList) > 0}">
							<c:forEach items="${requestScope.smallCostList}" var="smallCost" varStatus="status">
								<tr>
							        <td class="text-c">${status.index + 1}</td>
								   	<td class="text-c">小型车</td>
						            <td class="text-c">${smallCost.cost_time}</td>
						            <td>
						            	<c:choose>
											<c:when test="${smallCost.cost_type == 0}">
												首小时
											</c:when>
											<c:when test="${smallCost.cost_type == 1}">
												首小时后
											</c:when>
										</c:choose>
			      					</td>
						            <td class="text-r">${smallCost.cost_info}</td>
								</tr>  
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr class="text-c">
								<td colspan="5">无信息</td>
							</tr>
						</c:otherwise>
					</c:choose>
				</tbody>
			</table>
			<br>
	       	
	       	
	       	
	       	
	       	<div class="big_car_msg">
	   			<span class="big_car_word">大型车</span>
	   			<span class="most_money">封顶金额</span>
	   			<input type="text" name="max_cost_big" id="max_cost_big" value="${max_cost_big}" 
	   				class="input_most_money_bigCar input-text radius" style="width:60px;" readonly="readonly"/>
	   			<span class="yuan">元</span>
	   		</div>
	   		<table class="table table-border table-bordered">
				<thead>
					<tr class="text-c">
						<th></th>
						<th>车辆类型</th>
						<th>时间段</th>
						<th>计费类型</th>
						<th>费用(元)</th>
					</tr>
				</thead>
				<tbody id="bigTbody">
					<c:choose>
						<c:when test="${requestScope.bigCostList != null && fn:length(requestScope.bigCostList) > 0}">
							<c:forEach items="${requestScope.bigCostList}" var="bigCost" varStatus="status">
								<tr>
							    	<td class="text-c">${status.index + 1}</td>
								   	<td class="text-c">大型车</td>
						            <td class="text-c">${bigCost.cost_time}</td>
						            <td>
		      							<c:choose>
											<c:when test="${bigCost.cost_type == 0}">
												首小时
											</c:when>
											<c:when test="${bigCost.cost_type == 1}">
												首小时后
											</c:when>
										</c:choose>
			      					</td>
						            <td class="text-r">${bigCost.cost_info}</td>
								</tr>  
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr class="text-c">
								<td colspan="5">无信息</td>
							</tr>
						</c:otherwise>
					</c:choose>
				</tbody>
			</table>
	   	</div>
   	</div>
	<div class="mt-10 mb-10" style="display:table; margin-left:auto; margin-right:auto;">
		<button id="cancelBtn" type="button" class="close_btn btn btn-default size-S Hui-iconfont">&#xe6a6; 关闭</button>
	</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/lib/layer/2.1/layer.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/static/h-ui.admin/js/H-ui.admin.js"></script>
<script type="text/javascript">
$(function() {
	$.Huitab(".tabBar span",".tabCon","current","click","0");
	// 关闭
	$("#cancelBtn").click(function() {
		layer_close();
	});
	
	/**Table切换**/							
	/* $(".tip_msg").click(function() {
		var index = $(this).index();
		$(this).css("background","rgb(215,215,215)").siblings().css("background","#e8e8e8");
		if(index==0){
			$(".particular_msg").show();
			$(".charge_section").hide()
		}else if(index==1){
			$(".charge_section").show();
			$(".particular_msg").hide()
		}							
	}); */
});
</script>
</body>
</html>