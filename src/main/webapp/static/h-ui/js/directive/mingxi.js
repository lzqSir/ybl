var appModule = angular.module("myPage",[]);
appModule.directive("newPage",function(){
	return {
	
	restrict:"ECMA",
	scope :{
		
	},
	template:'<div>'
				+'<form action="" class="form-inline gap select-box1">'
				+'<div class="form-group con gap col-sm-2">'
						+'<label for="">商户：</label>'
						+'<select name="" class="radius inline input-text" style="width: 126px;">'
							+'<option value="">全部</option>'
						+'</select>'
					+'</div>'
					
					+'<div class="form-group col-offset-3 gap con col-sm-5">'
						+'<label for="">'
							+'结算类型'
						+'</label>'
						+'<label for="" class="radio-inline col-offset-1 allWay">'
							+'<input type="radio" name="way" id="" value="" />全部'
						+'</label>&nbsp;&nbsp;'
						+'<label for="" class="radio-inline">'
							+'<input type="radio" name="way" id="" value="" class="payment-list"/>支付'
							+'<ul style="position:absolute;left:145px;top:50px;display:none" class="wayList">'
								+'<li style="float: left;">'
									+'<label for="" class="radio-inline">'
										+'<input type="radio" name="way1" id="" value="" />全部'
									+'</label> &nbsp;'
								+'</li>'
								+'<li style="float: left;">'
									+'<label for="" class="radio-inline">'
										+'<input type="radio" name="way1" id="" value="" />临卡'
									+'</label> &nbsp;'
								+'</li>'
								+'<li style="float: left;">'
									+'<label for="" class="radio-inline">'
										+'<input type="radio" name="way1" id="" value="" />月卡'
									+'</label>'
								+'</li>'
							+'</ul>'
						+'</label>&nbsp;&nbsp;'
						+'<label for="" class="radio-inline  rebate-btn">'
							+'<input type="radio" name="way" id="" value="" />退款'
						+'</label>'
					+'</div>'
					+'<div class="clear"></div>'
					+'<div class="form-group col-sm-4 gap con col-sm-6 pull-top">'
						+'<label class="">日期：</label>'
						+'<input type="text" onfocus="WdatePicker()" id="logmin3" class="input-text Wdate radius" style="width:126px;">'
						+'至'
						+'<input type="text" onfocus="WdatePicker()" id=\"logmax5\" class=\"input-text Wdate radius\" style=\"width:126px;\">'
					+'</div>'
					+'<div class="gap form-group pull-top col-offset-6">'
						+'<button type="button" class="btn btn-success radius" id="" name=""><i class="Hui-iconfont">&#xe665;</i>查询</button>&nbsp;'
						+'<button type="button" class="btn btn-success radius downloading" id="" name=""><i class="Hui-iconfont">&#xe640;</i>导出Excel</button>'
					+'</div>'
				+'</form>'
				+'<div  style="width:98%;margin:0 auto;min-height:40px;line-height: 40px;" class="form-inline">'
					+'<label for="" style="font-weight:bold">总计：实结金额:</label>'
					+'<label for="" style="font-weight:bold">13251.00元</label>&nbsp;&nbsp;|&nbsp;&nbsp;'
					+'<label for="" style="font-weight:bold">手续费：</label>'
					+'<label for="" style="font-weight:bold">23561.00</label>'
					+'<div class="clear"></div>'
					+'<label for="" style="margin-left:40px">应结金额：</label>'
					+'<label for="">23232.00元</label>&nbsp;&nbsp;|&nbsp;&nbsp;'
					+'<label for="">订单金额：</label>'
					+'<label for="">23232.00元</label>&nbsp;&nbsp;|&nbsp;&nbsp;'
					+'<label for=""> 商户优惠：</label>'
					+'<label for="">23232.00元</label>&nbsp;&nbsp;|&nbsp;&nbsp;'
					+'<label for=""> 已结金额：</label>'
					+'<label for="">23232.00元</label>&nbsp;&nbsp;|&nbsp;&nbsp;'
					+'<label for=""> 待结金额：</label>'
					+'<label for="">23232.00元</label>'
				+'</div>'
				+'<div class="table-responsive table-condensed table-bg table-hover table-border table-bordered" style="width: 98%;margin:20px auto;">'
					+'<table border="0" cellspacing="0" cellpadding="0" class="table">'
						+'<thead>'
							+'<tr class="text-c">'
								+'<th>交易时间</th>'
								+'<th>商户</th>'
								+'<th>应结金额（元）</th>'
								+'<th>订单金额（元）</th>'
								+'<th>商户优惠（元）</th>'
								+'<th>已结金额（元）</th>'
								+'<th>待结金额（元）</th>'
								+'<th>结算类型</th>'
								+'<th>结算日期</th>'
							+'</tr>'
						+'</thead>'
						+'<tbody>'
							+'<tr class="text-c">'
								+'<td>2017-05-07</td>'
								+'<td>瀚森大厦</td>'
								+'<td>3,990.91</td>'
								+'<td>4,015.00</td>'
								+'<td>0.00</td>'
								+'<td>0.00</td>'
								+'<td>0.00</td>'
								+'<td>2017-04-30</td>'
								+'<td>2017-04-30</td>'
							+'</tr>'
							+'<tr class="text-c">'
								+'<td>2017-05-07</td>'
								+'<td>瀚森大厦</td>'
								+'<td>3,990.91</td>'
								+'<td>4,015.00</td>'
								+'<td>0.00</td>'
								+'<td>0.00</td>'
								+'<td>0.00</td>'
								+'<td>2017-04-30</td>'
								+'<td>2017-04-30</td>'
							+'</tr>'
						+'</tbody>'
					+'</table>'
				+'</div>'
				+'<div style="width:98%;margin:0 auto;">'
					+'<p>说明：</p>'
					+'<p>结算金额  =  临卡结算 + 月卡结算 - 退款金额 - 手续费</p>'
					+'<p> 手续费  =  （临卡结算 + 月卡结算 - 退款金额）* 1%</p>'
				+'</div>'
			+'</div>',
			link:function(scope,ele,attr){
				
			}
			
	}
})
