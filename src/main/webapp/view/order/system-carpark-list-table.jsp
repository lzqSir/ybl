<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<div class="cl" id="refreshTableDiv" style="overflow-x:auto; overflow-y:hidden; margin:0 auto;">
	<table class="text-overflow radius table table-border table-bordered table-bg table-striped table-hover table-condensed table-responsive">
		<thead>
			<tr class="text-c">
				<th>操作</th>
				<th>ID</th>
				<th>车场名称</th>
				<th>所属集团</th>
				<th>省份</th>
				<th>城市</th>
				<th>区域</th>
				<th>车位数</th>
				<th>微信子商户号</th>
				<th>创建时间</th>
			</tr>
		</thead>
		<tbody id="tbodyId">
			<c:choose>
				<c:when test="${requestScope.systemCarparkList != null && fn:length(requestScope.systemCarparkList) > 0}">
					<c:forEach items="${requestScope.systemCarparkList}" var="carpark" varStatus="status">
						<tr class="text-c">
						    <td>
						    	<a style="color:#0EC6FF;" href="javascript:carpark_view('查看','/systemCarpark/find.do?id=${carpark.id}&modify=')">查看</a>
						    	<c:if test="${fn:contains(sessionScope.user.permissions,'CarparkMgt_SystemCarpark.Update')}">
						    		<a style="color:#0EC6FF;" href="javascript:carpark_edit('编辑','/systemCarpark/find.do?id=${carpark.id}&modify=Y')">编辑</a>
						    	</c:if>
						    	<c:if test="${fn:contains(sessionScope.user.permissions,'CarparkMgt_SystemCarpark.Delete')}"> 
						   			<a style="color:#0EC6FF;" href="javascript:carpark_del('/systemCarpark/delete.do?id=${carpark.id}')">删除</a>
						   		</c:if>
						   	</td>
				            <td>${carpark.id}</td>
				            <td>${carpark.carpark_name}</td>  
				            <td>${requestScope.groupIdObjMap[carpark.group_id].group_name}</td>
				            <td>${carpark.province}</td>
				            <td>${carpark.city}</td>
				            <td>${carpark.district}</td>
				            <td>${carpark.total_space_count}</td>
				            <td>${carpark.sub_mch_id}</td>
				            <td>
				            	<fmt:formatDate value="${carpark.created_time}" type="both" pattern="yyyy-MM-dd HH:mm:ss"/>
				            </td>
						</tr>  
					</c:forEach>
				</c:when>
				<c:otherwise>
					<tr class="text-c">
						<td colspan="10">无符合条件的记录</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>
</div>
<div class="mt-15" style="font-size:14px;">
	<c:if test="${requestScope.systemCarparkList != null && fn:length(requestScope.systemCarparkList) > 0}">
		<%@ include file="../common/custom_pagination.jsp" %>
	</c:if>
</div>