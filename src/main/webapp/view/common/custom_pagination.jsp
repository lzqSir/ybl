<div class="cl f-l">
	<span>第${requestScope.pageInfo.currentPage}/${requestScope.pageInfo.totalPages}页&nbsp;</span>
	<span class="">显示 ${(requestScope.pageInfo.currentPage - 1) * 10 + 1} 到
		<c:choose>
			<c:when test="${requestScope.pageInfo.currentPage * 10 > requestScope.pageInfo.recordsCount}">
				${requestScope.pageInfo.recordsCount}
			</c:when>
			<c:otherwise>
				${requestScope.pageInfo.currentPage * 10}
			</c:otherwise>
		</c:choose>,共${requestScope.pageInfo.recordsCount}条记录
	</span>
</div>
<div class="cl f-r">
	<ul style="list-style:none; text-align:center;">
		<li style="display:inline;">
			<c:choose>
				<c:when test="${requestScope.pageInfo.currentPage == 1}">
					<button type="button" class="btn btn-default size-MINI" style="opacity:.5;" disabled="disabled">首页</button>
				</c:when>
				<c:otherwise>
					<button type="button" class="btn btn-default size-MINI" onclick="jumpPage(1,'${requestScope.pageInfo.recordsCount}');">首页</button>
				</c:otherwise>
			</c:choose>
		</li>
		<li style="display:inline;">
			<c:choose>
				<c:when test="${requestScope.pageInfo.currentPage <= 1}">
					<button type="button" class="btn btn-default size-MINI" style="opacity:.5;" disabled="disabled">上一页</button>
				</c:when>
				<c:otherwise>
					<button type="button" class="btn btn-default size-MINI" 
						onclick="jumpPage('${requestScope.pageInfo.currentPage - 1}','${requestScope.pageInfo.recordsCount}');">上一页</button>
				</c:otherwise>
			</c:choose>
		</li>
		<li style="display:inline;">
			<c:choose>
				<c:when test="${requestScope.pageInfo.currentPage >= requestScope.pageInfo.totalPages}">
					<button type="button" class="btn btn-default size-MINI" style="opacity:.5;" disabled="disabled">下一页</button>
				</c:when>
				<c:otherwise>
					<button type="button" class="btn btn-default size-MINI" 
						onclick="jumpPage('${requestScope.pageInfo.currentPage + 1}','${requestScope.pageInfo.recordsCount}');">下一页</button>
				</c:otherwise>
			</c:choose>
		</li>
		<li style="display:inline;">
			<c:choose>
				<c:when test="${requestScope.pageInfo.currentPage == requestScope.pageInfo.totalPages}">
					<button type="button" class="btn btn-default size-MINI" style="opacity:.5;" disabled="disabled">末页</a>
				</c:when>
				<c:otherwise>
					<button type="button" class="btn btn-default size-MINI" 
						onclick="jumpPage('${requestScope.pageInfo.totalPages}','${requestScope.pageInfo.recordsCount}');">末页</button>
				</c:otherwise>
			</c:choose>
		</li>
		<li style="display:inline;">
			<input type="text" class="input-text" digits="true" min="1" max="${requestScope.pageInfo.totalPages}" 
				style="width:35px; height:23px; text-align:center;" id="gotoPageInt" value="${requestScope.pageInfo.currentPage}" />	
		</li>
		<li style="display:inline;">
			<button type="button" class="btn btn-default size-MINI" 
				onclick="jumpPage($('#gotoPageInt').val(),'${requestScope.pageInfo.recordsCount}');">跳转</button>
		</li>
	</ul>
</div>
<script type="text/javascript">
var flag = true;
$("#gotoPageInt").change(function() {
	var gotoPageInt = $("#gotoPageInt").val();
	var regexp = /^[0-9]*$/;
	flag = regexp.test(gotoPageInt);
	if (!flag) {
		$("#gotoPageInt").css("background-color", "#fbe2e2");
	} else {
		$("#gotoPageInt").css("background-color", "white");
	}
});

function jumpPage(gotoPageInt, recordsCount) {
	if (!flag) {
		return false;
	}
	var totalPages = parseInt('${requestScope.pageInfo.totalPages}', 10);
	if (parseInt(gotoPageInt, 10) > totalPages) {
		gotoPageInt = totalPages;
	} else if (parseInt(gotoPageInt, 10) <= 0) {
		gotoPageInt = 1;
	}
	doSearch(gotoPageInt, recordsCount);
}
</script>