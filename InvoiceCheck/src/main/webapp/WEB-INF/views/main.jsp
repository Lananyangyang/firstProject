<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
  <%response.setHeader("Cache-Control","no-store");%>  
<base href="<%=basePath%>"> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
 		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>电子发票核查系统</title>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
		<link rel="stylesheet" type="text/css" href="css/main.css"/>
		<link rel="icon" type="x-icon" href="images/title_icon.png"/>
		<script>
			
			//if(!localStorage.userName) alert(2)
			
		</script> 
	</head>
	<body>
		<header>
			<div class="headerInner">
				<div class="logo"><img src="images/logo.png"></div>
				<div class="title">北京润华信通电子发票核查系统</div>
				<div class="userName">当前用户</br><span>${sessionScope.userInfo.name }</span></div>
				<div id="Quit">退出</div>
			</div>
		</header>
		<div class="main">
			<nav>
				<ul id="nav">
					<li data-fn="Enter" class="focus">发票信息录入</li>
					<li data-fn="Search">发票信息查询</li>
					<li data-fn="Gather">发票信息汇总</li>
					<li data-fn="Manage">用户管理</li>
				</ul>
			</nav>
			<div id="contentBox" class="contentBox">
				<div class="content">
					<div class="tabs">
						<ul id="tabsList">
							<li data-fn="Enter" class="focus">发票信息录入</li>
						</ul>
					</div>
					<div id="Module">
						<div id="Enter" class="module">
							<div class="inner">
								<div class="enterInfo">
									<div class="QRcode block">
										<div class="number">
											<p>输入OA流水号</p>
											<input id="oa_id" type="text" />
											<span id="Enter_icon"></span>
										</div>
										<div class="QRcodeContent">
											<textarea id="scan_content" style="ime-mode:disabled" placeholder="点击此处后扫码"></textarea>
										</div>
									</div>
									<ul class="infoList block">
										<li>
												<div><p>发票代码</p></div>
												<input id="t_id" type="text" name="scanningInfo" disabled />
										</li>
										<li>
												<div><p>发票号码</p></div>
												<input id="t_code" type="text" name="scanningInfo" disabled />
										</li>
										<li>
												<div><p>开票日期</p></div>
												<input id="inv_date" type="text" name="scanningInfo" disabled />
										</li>
										<li>
												<div><p>校验码</p></div>
												<input id="check_code" type="text" name="scanningInfo" disabled />
										</li>
										<li>
												<div><p>不含税金额</p></div>
												<input id="no_tax_amount" type="text" name="scanningInfo" disabled />
												<input id="fill_user_name" class="cm_handConfirm" type="text" value=${sessionScope.userInfo.name}  style="display: none;"/>
												<input id="fill_user_id" class="cm_handConfirm" type="text" value=${sessionScope.userInfo.id} style="display: none;"/>
										</li>
									</ul>
								</div>
							
								<div class="btn clearfix">
									<div class="hand">
										<input id="handEnter" type="button" value="无法输入，转入手工输入" />
									</div>
									<div class="hand">
										<input id="cleanScan" type="button" value="清空扫描内容" />
									</div>
								</div>
								
								<div id="addInv" class="infoTable">
									<table class="table_head" cellspacing="0" cellpadding="0">
										<thead>
											<tr>
												<th width="10%">OA流水号</th>
												<th width="15%">发票代码</th>
												<th width="10%">发票号</th>
												<th width="10%">开票日期</th>
												<th width="20%">校验码</th>
												<th width="15%">不含税金额</th>
												<th width="10%">录入人</th>
												<th width="10%">录入日期</th>
											</tr>
										</thead>
									</table>
									<div class="table_body">
										<table cellspacing="0" cellpadding="0">
											<thead>
												<tr>
													<th width="10%">OA流水号</th>
													<th width="15%">发票代码</th>
													<th width="10%">发票号</th>
													<th width="10%">开票日期</th>
													<th width="20%">校验码</th>
													<th width="15%">不含税金额</th>
													<th width="10%">录入人</th>
													<th width="10%">录入日期</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td class="noData" colspan="8">暂无数据</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
							</div>
							<div id="handInner">
								<ul id="handEnterInfo" class="clearfix">
									<li id="handoaid">
										<p>OA流水号</p>
										<input id="s_oa_id" class="cm_handConfirm" type="text" />
										<span id="s_oa_id_icon"></span>
									</li>
									<li>
										<p>发票代码</p>
										<input id="s_t_id" class="cm_handConfirm" type="text" />
									</li>
									<li>
										<p>发票号码</p>
										<input id="s_t_code" class="cm_handConfirm" type="text" />
									</li>
									<li>
										<p>开票日期</p>
										<a class="input-group date" id='HandDateTimePicker1'>
							                <input id="s_inv_date" name="handConfirm" type="text" class="form-control cm_handConfirm" />
							                <span class="input-group-addon">
							                    <span class="glyphicon glyphicon-calendar"></span>
							                </span>
							            </a>
									</li>
									<li>
										<p>校验码</p>
										<input  id="s_check_code" class="cm_handConfirm" type="text" />
									</li>
									<li>
										<p>不含税金额</p>
										<input id="s_no_tax_amount" class="cm_handConfirm number" type="number" />
									</li>
									<li>
										<p>录入人</p>
										<input id="s_fill_user_name" class="cm_handConfirm" type="text" value=${sessionScope.userInfo.name}  disabled/>
										<input id="s_fill_user_id" class="cm_handConfirm" type="text" value=${sessionScope.userInfo.id} style="display: none;"/>
									</li>
									<li>
										<p>录入日期</p>
										<a class="input-group date" id='HandDateTimePicker2'>
							                <input id="s_fill_date" name="handConfirm" type="text" class="form-control cm_handConfirm" disabled />
							                <span class="input-group-addon">
							                    <span class="glyphicon glyphicon-calendar"></span>
							                </span>
							            </a>
									</li>
								</ul>
								<section>
<!-- 									<p>新增发票明细</p> -->
<!-- 									<textarea id="BillDetail" placeholder="项目名称、单位、数量、单价、金额、税率、税额"></textarea> -->
									<div>
										<input type="button" id="HandSubBtn" value="保存" />
										<input type="button" id="HandCancel" value="返回" />
									</div>
								</section>
								
								<div id="s_addInv" class="infoTable">
									<table class="table_head" cellspacing="0" cellpadding="0">
										<thead>
											<tr>
												<th width="10%">OA流水号</th>
													<th width="15%">发票代码</th>
													<th width="10%">发票号</th>
													<th width="10%">开票日期</th>
													<th width="20%">校验码</th>
													<th width="15%">不含税金额</th>
													<th width="10%">录入人</th>
													<th width="10%">录入日期</th>
											</tr>
										</thead>
									</table>
									<div class="table_body">
										<table cellspacing="0" cellpadding="0">
											<thead>
												<tr>
													<th width="10%">OA流水号</th>
														<th width="15%">发票代码</th>
														<th width="10%">发票号</th>
														<th width="10%">开票日期</th>
														<th width="20%">校验码</th>
														<th width="15%">不含税金额</th>
														<th width="10%">录入人</th>
														<th width="10%">录入日期</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td class="noData" colspan="8">暂无数据</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
								
							</div>
						</div>
						<div id="Search" class="module">
							<div class="inner">
								<div class="search clearfix">
									<ul>
										<li>
											<p>OA流水号</p>
											<input id="S_oaid" type="text" />
										</li>
										<li>
											<p>发票代码</p>
											<input id="S_id" type="text" />
										</li>
										<li>
											<p>发票号码</p>
											<input id="S_code" type="text" />
										</li>
										<li>
											<p>年份</p>
											<select id="Search_select" class="search_years"></select>
										</li>
									</ul>
									<input type="button" id="SearchBtn" value="查询" />
								</div>
								<div class="result">
									<table class="table_head" cellspacing="0" cellpadding="0">
										<thead>
											<tr>
												<th width="10%">OA流水号</th>
												<th width="15%">发票代码</th>
												<th width="10%">发票号</th>
												<th width="10%">开票日期</th>
												<th width="20%">校验码</th>
												<th width="15%">不含税金额</th>
												<th width="10%">录入人</th>
												<th width="10%">录入日期</th>
											</tr>
										</thead>
									</table>
									<div class="table_body">
										<table cellspacing="0" cellpadding="0">
											<thead>
												<tr>
													<th width="10%">OA流水号</th>
													<th width="15%">发票代码</th>
													<th width="10%">发票号</th>
													<th width="10%">开票日期</th>
													<th width="20%">校验码</th>
													<th width="15%">不含税金额</th>
													<th width="10%">录入人</th>
													<th width="10%">录入日期</th>
												</tr>
											</thead>
											<tbody></tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
						<div id="Gather" class="module">
							<div class="inner">
								<div class="search clearfix">
									<ul>
										<li>
											<p>年份</p>
											<select id="Gather_select" class="search_years"></select>
										</li>
									</ul>
									<input type="button" id="Gather_SearchBtn" value="查询" />
								</div>
								<div class="result">
									<table class="table_head" cellspacing="0" cellpadding="0">
										<thead>
											<tr>
												<th width="50%">OA流水号</th>
												<th width="25%">电子发票数量</th>
												<th width="25%">金额</th>
											</tr>
										</thead>
									</table>
									<div class="table_body">
										<table cellspacing="0" cellpadding="0">
											<thead>
												<tr>
													<th width="50%">OA流水号</th>
													<th width="25%">电子发票数量</th>
													<th width="25%">金额</th>
												</tr>
											</thead>
											<tbody></tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
						<div id="Manage" class="module">
							<div class="inner">
								<div id="AdminUser">
									<div class="edit clearfix">
									<form method="post" id="insertForm">
										<input name="fillUserId" hidden="ture" type="text" value=${sessionScope.userInfo.id}></input>
										
										<ul class="clearfix editList">
											<li>
												<p>用户登录名</p>
												<input class="cm_userManage" name="loginName" type="text" id="UserNameByAdmin" autocomplete="new-password" />
											</li>
											<li>
												<p>密码</p>
												<input class="cm_userManage" name="password" type="password" id="PassWordByAdmin"   autocomplete="new-password" /> <!-- -->
											</li>
											<li>
												<p>姓名</p>
												<input class="cm_userManage" name="name" type="text" id="NameByAdmin" />
											</li>
											
										</ul>
										<input id="userId" name="id" hidden="ture" class="cm_userManage" type="text" ></input>
										</form>
										<ul class="clearfix editBtn">
											<li><input type="button" name="add" value="新增" id="AddByAdmin" /></li>
											<li><input type="button" name="change" value="保存修改" id="ChangeByAdmin" /></li>
											<li><input type="button" name="res" value="重置" id="Resetting" /></li>
<!-- 											<li><input type="button" name="del" value="删除" id="DelByAdmin" /></li> -->
										</ul>
									</div>
									<table class="table" cellspacing="0" cellpadding="0">
										<thead>
											<tr>
												<th></th>
												<th>用户登录名</th>
												<th>用户姓名</th>
											</tr>
										</thead>
										<tbody id="UserList"></tbody>
									</table>
								</div>
								<div id="NormalUser">
									
									<div class="inner" >
										<ul>
											<li>
												<p>用户登陆名</p>
												<input type="text" class="normalUserInfo" value=${sessionScope.userInfo.loginName} id="UserNameByNormal"  disabled/>
												<input type="text" class="normalUserInfo" value=${sessionScope.userInfo.id} id="UserIdByNormal" style="display: none;" />
											</li>
											<li>
												<p>用户密码</p>
												<input type="password" class="normalUserInfo" value="" autocomplete="new-password" id="PassWordByNormal" />
											</li>
											<li>
												<p>用户姓名</p>
												<input type="text" class="normalUserInfo" value=${sessionScope.userInfo.name} id="NameByNormal" disabled/>
											</li>
										</ul>
										<div class="btn">
											<input type="button" value="保存" id="SubByNormal" />
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<footer class="loginFooter">&copy; 2018 北京润华信通科技有限公司 版权所有</footer>
		<div id="black"></div>
		<div id="invoiceByOA">
			<table class="table_head" cellspacing="0" cellpadding="0">
				<thead>
					<tr>
						<th width="10%">OA流水号</th>
						<th width="15%">发票代码</th>
						<th width="10%">发票号</th>
						<th width="10%">开票日期</th>
						<th width="20%">校验码</th>
						<th width="15%">不含税金额</th>
						<th width="10%">录入人</th>
						<th width="10%">录入日期</th>
					</tr>
				</thead>
			</table>
			<div class="table_body">
				<table cellspacing="0" cellpadding="0">
					<thead>
						<tr>
							<th width="10%">OA流水号</th>
							<th width="15%">发票代码</th>
							<th width="10%">发票号</th>
							<th width="10%">开票日期</th>
							<th width="20%">校验码</th>
							<th width="15%">不含税金额</th>
							<th width="10%">录入人</th>
							<th width="10%">录入日期</th>
						</tr>
					</thead>
					<tbody id="invoiceByOAListMain"></tbody>
				</table>
			</div>
		</div>
		
		<script type="text/javascript" src="js/jquery-2.1.0.js"></script>
		  
		<script type="text/javascript" src="js/bootstrap.min.js"></script>  
		<script type="text/javascript" src="js/moment-with-locales.js"></script>
		<script type="text/javascript" src="js/bootstrap-datetimepicker.min.js"></script>
		<script type="text/javascript" src="js/bootstrap-datetimepicker.zh-CN.js"></script>
		<script>
			
			var userType ='${sessionScope.userInfo.userType }';
			
			var newUserName="";
			
			var oaIds = new Array();
			
			window.onload=function(){
				resize();
				findOaIds();
				initPage();
			}
			window.onresize=resize
			
			function findOaIds(){
				$.ajax({
					 url:"rest/invoice/findOaIds", 
					 type:"post",
					 data:{},
					 success:function(data){
						 oaIds=data;
					}
				});
			}
			
			function resize(){
				document.body.style.height=window.innerHeight+"px";
				if((window.innerHeight*0.9-60)>460&&(window.innerHeight*0.9-60)<1000){
					contentBox.style.height=window.innerHeight*0.9-60+"px"
					Module.style.height=window.innerHeight*0.9-90+"px"
				}
			}
			
			function initPage () {
				//左侧导航添加点击事件
				nav.onclick=navCut;
				//右侧tab页签添加点击事件
				tabsList.onclick=tabCut;
				//年份框初始化
				$(".search_years").each(function(index,item){
					var y=new Date().getFullYear();
					for(var i=y;i>=2018;i--){
						$(item).append("<option>"+i+"</option>")
					}
				})
				
				/**************信息录入相关**************/
				
				
				oa_id.onkeyup=function(){
					if(oa_id.value==""){
						Enter_icon.style.background="#fff";
						return
					};
					if(oaIds.length>0){
						var i=$.inArray(oa_id.value,oaIds); 
						 if(i<0){//数组中无输入的值，显示绿色对号   并鼠标经过叹号提示 “该OA流水号暂无关联发票信息”
							 Enter_icon.style.background="url(images/true.png) no-repeat";
							 Enter_icon.setAttribute("title","该OA流水号暂无关联发票信息");
						 }else{//数组中包含该oaid ，则显示黄色叹号  并鼠标经过叹号提示 “该OA流水号已关联有发票信息”
							 Enter_icon.style.background="url(images/warning.png) no-repeat";
							 Enter_icon.setAttribute("title","该OA流水号已关联有发票信息")
						 }
					}
				}
				
				
				scan_content.onfocus=function(){
					if(oa_id.value==""){
						oa_id.focus();
						alert("请先输入OA号！");
					}
				}
				//监听文本域回车
				scan_content.onkeydown =function(e){
					var e=e||window.event;
					if(e.keyCode==13){
						var scanContent = $("#scan_content").val();
						if(scanContent.indexOf("，")>-1){
							alert("请在英文输入法状态下扫码！");
							$("#scan_content").val("");
							no_tax_amount.focus();
							return;
						}
						var s = scanContent.split(",");
						if(s.length<7){
							alert("扫码信息错误！");
							return;
						}
						$("#t_id").val(s[2]);//发票代码
						$("#t_code").val(s[3]);//发票号码
						$("#inv_date").val(s[5]);//开票日期
						$("#check_code").val(s[6]);//校验码
						$("#no_tax_amount").val(s[4]);//不含税金额
						
						var tInvoice = {id:$("#t_id").val(),code:$("#t_code").val(),oaId:$("#oa_id").val(),
								checkCode:$("#check_code").val(),noTaxAmount:$("#no_tax_amount").val(),
								scanContent:scanContent,fillUserName:"admin",fillUserId:"1"};
						
						var d = $("#inv_date").val();
						var year = d.substring(0,4);
						var month = d.substring(4,6);
						var day = d.substring(6,d.length);
						
						$.post('rest/invoice/saveInvoice',{id:$("#t_id").val(),code:$("#t_code").val(),oaId:$("#oa_id").val(),
							checkCode:$("#check_code").val(),noTaxAmount:$("#no_tax_amount").val(),invDate:new Date(year+"/"+month+"/"+day),
							scanContent:scanContent,fillUserName:$("#fill_user_name").val(),fillUserId:$("#fill_user_id").val()},function(result){
								$("#scan_content").val("");
								
							if (result.status=="success"){
								var req = {};
								req.oaId=$("#oa_id").val();
								req.id="";
								req.code="";
								$.ajax({
									 url:"rest/invoice/selectByIdOrOaIdOrCode", 
									 type:"post",
									 data:req,
									 success:function(data){
										$("#addInv tbody .noData").remove();
										if(data.length>0){
											for(var i=0;i<data.length;i++){
												$("#addInv tbody").prepend("<tr><td>"+data[i].oaId+"</td><td>"+data[i].id+"</td><td>"+data[i].code+"</td><td>"+new Date(data[i].invDate).format("yyyy-MM-dd")+"</td><td>"+data[i].checkCode+"</td><td>"+data[i].noTaxAmount+"</td><td>"+data[i].fillUserName+"</td><td>"+new Date(data[i].fillDate).format("yyyy-MM-dd")+"</td></tr>")
											}
										}else{
											$("#addInv tbody").prepend("<tr><td colspan='8'>无数据</td></tr>")
										}
									}
								});
								
								$("#t_id").val("");//发票代码
								$("#t_code").val("");//发票号码
								$("#inv_date").val("");//开票日期
								$("#check_code").val("");//校验码
								$("#no_tax_amount").val("");//不含税金额
								no_tax_amount.focus();
								
// 								alert(result.errorMsg);
															
							}else if(result.status=="warning"){
								var req = {};
								req.oaId="";
								req.id=$("#t_id").val();
								req.code="";
								$.ajax({
									 url:"rest/invoice/selectByIdOrOaIdOrCode", 
									 type:"post",
									 data:req,
									 success:function(data){
										$("#addInv tbody").empty();
										if(data.length>0){
											for(var i=0;i<data.length;i++){
												$("#addInv tbody").prepend("<tr><td>"+data[i].oaId+"</td><td>"+data[i].id+"</td><td>"+data[i].code+"</td><td>"+new Date(data[i].invDate).format("yyyy-MM-dd")+"</td><td>"+data[i].checkCode+"</td><td>"+data[i].noTaxAmount+"</td><td>"+data[i].fillUserName+"</td><td>"+new Date(data[i].fillDate).format("yyyy-MM-dd")+"</td></tr>")
											}
										}else{
											$("#addInv tbody").prepend("<tr><td colspan='8'>无数据</td></tr>")
										}
									}
								});
								
								no_tax_amount.focus();
								
								alert(result.errorMsg);
							}else{
								alert(result.errorMsg);
							}
						},'json');
					}
				}
				//显示手工录入
				handEnter.onclick=function(){
					initDateTime(["#HandDateTimePicker1","#HandDateTimePicker2"]);
					handInner.style.right=0;
				}
				
				/**
				 * 清空扫描内容 
				 */
				cleanScan.onclick=function(){
					$("#scan_content").val("");
				}
				
				s_oa_id.onkeyup=function(){
					if(s_oa_id.value==""){
						s_oa_id_icon.style.background="#fff";
						return
					};
					if(oaIds.length>0){
						 var i=$.inArray(s_oa_id.value,oaIds); 
						 if(i<0){//数组中无输入的值，显示绿色对号   并鼠标经过叹号提示 “该OA流水号暂无关联发票信息”
							 s_oa_id_icon.style.background="url(images/true.png) no-repeat";
							 s_oa_id_icon.setAttribute("title","该OA流水号暂无关联发票信息");
						 }else{//数组中包含该oaid ，则显示黄色叹号  并鼠标经过叹号提示 “该OA流水号已关联有发票信息”
							 s_oa_id_icon.style.background="url(images/warning.png) no-repeat";
							 s_oa_id_icon.setAttribute("title","该OA流水号已关联有发票信息")
						 }
					}
				}
				//手工信息录入提交
				HandSubBtn.onclick=subHandEnterInfo;
				//手工信息录入取消
				HandCancel.onclick=function(){
					clearValue("handConfirm");
				}
				
				/**************发票信息查询相关**************/
				infoSearch();
				SearchBtn.onclick=infoSearch;
				/**************发票信息汇总相关**************/
				gatherUpData();
				Gather_SearchBtn.onclick=gatherUpData;
				black.onclick=function(){
					black.style.display="none";
					invoiceByOA.style.opacity="0";
					invoiceByOA.style.filter="alpha(opacity=0)";
					invoiceByOA.style.display="none";
				}
				/**************用户管理相关**************/
				//用户类型判断
				userRole();
			}
			var navItem=nav.children;
			var module=document.querySelectorAll(".module");
			
			function userRole () {
				if(userType==1){
					NormalUser.parentNode.removeChild(NormalUser);
					//初始化列表
					queryUser();
					//管理员添加用户
					AddByAdmin.onclick=userAdd;
					//管理员修改用户
					ChangeByAdmin.onclick=userChange;
					//管理员重置密码
					Resetting.onclick=userReset;
					//管理员删除用户
					DelByAdmin.onclick=userDel;
					//初始化用户列表
					/* ajax("",{},(data)=>{
						var obj=JSON.parse(data);
					}) */
				}else{
					//普通用户提交信息
					SubByNormal.onclick=normalUserSub;
					AdminUser.parentNode.removeChild(AdminUser);
				}
			}
			
			function navCut (e) {
				var e=e||window.event;
				var ele=e.target||e.srcElement;
				if(ele.tagName=="LI"){
					var tabItem=tabsList.children;
					var moduleDataArr=[]
					for(var i=0;i<tabItem.length;i++){
						moduleDataArr[i]=tabItem[i].getAttribute("data-fn");
					}
					if(moduleDataArr.indexOf(ele.getAttribute("data-fn"))==-1){
						var li=document.createElement("li");
						li.setAttribute("data-fn",ele.getAttribute("data-fn"));
						li.className="focus";
						li.innerHTML=ele.innerHTML;
						tabCut(ele.getAttribute("data-fn"));
						tabsList.appendChild(li);
					}else{
						tabCut(ele.getAttribute("data-fn"));
					}
					for(var i=0;i<nav.children.length;i++){
						nav.children[i].className=""
					}
					ele.className="focus";
				}
			}
			
			function tabCut(f){
				//控制模块显示与隐藏
				var tabItem=tabsList.children;
				for(var i=0;i<module.length;i++){
					module[i].style.display="none"
				}
				if(typeof f=="string"){
					document.getElementById(f).style.display="block";
					for(var i=0;i<tabItem.length;i++){
						tabItem[i].className=(tabItem[i].getAttribute("data-fn")==f)?"focus":""
					}
				}else{
					var e=window.event||arguments.callee.arguments[0];
					var ele=e.target||e.srcElement;
					document.getElementById(ele.getAttribute("data-fn")).style.display="block";
					for(var i=0;i<nav.children.length;i++){
						nav.children[i].className="";
						if(nav.children[i].getAttribute("data-fn")==ele.getAttribute("data-fn")){
							nav.children[i].className="focus"
						}
					}
					for(var i=0;i<tabItem.length;i++){
						tabItem[i].className=(tabItem[i].getAttribute("data-fn")==ele.getAttribute("data-fn"))?"focus":""
					}
				}
			}
			
			function subHandEnterInfo () {
				if(confirmation(".cm_handConfirm")){
					var d = $("#s_inv_date").val();
// 					var obj = {id:$("#s_t_id").val(),code:$("#s_t_code").val(),oaId:$("#s_oa_id").val(),
// 							checkCode:$("#s_check_code").val(),noTaxAmount:$("#s_no_tax_amount").val(),invDate:d.replace(/-/g,"/"),
// 							scanContent:"",fillUserName:"admin",fillUserId:"1"}
// 					return;
					$.post('rest/invoice/saveInvoice',{id:$("#s_t_id").val(),code:$("#s_t_code").val(),oaId:$("#s_oa_id").val(),
						checkCode:$("#s_check_code").val(),noTaxAmount:$("#s_no_tax_amount").val(),invDate:new Date(d.replace(/-/g,"/")),
						scanContent:"",fillUserName:$("#s_fill_user_name").val(),fillUserId:$("#s_fill_user_id").val()},function(result){
							s_oa_id.focus();
						if (result.status=="success"){
							var req = {};
							req.oaId=$("#s_oa_id").val();
							req.id="";
							req.code="";
							$.ajax({
								 url:"rest/invoice/selectByIdOrOaIdOrCode", 
								 type:"post",
								 data:req,
								 success:function(data){
									$("#s_addInv tbody .noData").remove();
									if(data.length>0){
										for(var i=0;i<data.length;i++){
											$("#s_addInv tbody").prepend("<tr><td>"+data[i].oaId+"</td><td>"+data[i].id+"</td><td>"+data[i].code+"</td><td>"+new Date(data[i].invDate).format("yyyy-MM-dd")+"</td><td>"+data[i].checkCode+"</td><td>"+data[i].noTaxAmount+"</td><td>"+data[i].fillUserName+"</td><td>"+new Date(data[i].fillDate).format("yyyy-MM-dd")+"</td></tr>")
										}
									}else{
										$("#s_addInv tbody").prepend("<tr><td colspan='8'>无数据</td></tr>")
									}
								}
							});
							
							$("#s_t_id").val("");//发票代码
							$("#s_t_code").val("");//发票号码
							$("#s_inv_date").val("");//开票日期
							$("#s_check_code").val("");//校验码
							$("#s_no_tax_amount").val("");//不含税金额
							$("#s_oa_id").val("");
							
							alert(result.errorMsg);
														
						}else{
							alert(result.errorMsg);
						}
					},'json');
					
// 					alert("保存成功");
// 					handInner.style.right="-100%";
				}
				
			}
			
			
			function clearValue (name) {
				var ele=$(name);
				for(var i=0;i<ele.length;i++){
					ele[i].value=""
				}
				if(name=="handConfirm"){
					$("#s_addInv tbody").empty();
					handInner.style.right="-100%";
				}
			}
			
			function confirmation (className) {
				var b=true;
				var itemList=$(className);
				for(var i=0;i<itemList.length;i++){
					if(itemList[i].name!="id"){
						if(itemList[i].value==""){
							itemList[i].style.background="pink";
							b=false
						}else{
							itemList[i].style.background="#fff";
						}
					}
				}
				return b
			}
			
			function initDateTime (arr) {
				for(var i=0;i<arr.length;i++){
					Datetime(arr[i])
				}
			}
			
			function infoSearch (){
				var req={};
				req.oaId=S_oaid.value;
				req.id=S_id.value;
				req.code=S_code.value;
				req.fillDate=Search_select.value;
				$.ajax({
					 url:"rest/invoice/selectByIdOrOaIdOrCode", 
					 type:"post",
					 data:req,
					 success:function(data){
						$("#Search tbody").empty();
						if(data.length>0){
							for(var i=0;i<data.length;i++){
								$("#Search tbody").append("<tr><td>"+data[i].oaId+"</td><td>"+data[i].id+"</td><td>"+data[i].code+"</td><td>"+new Date(data[i].invDate).format("yyyy-MM-dd")+"</td><td>"+data[i].checkCode+"</td><td class='right'>"+data[i].noTaxAmount+"</td><td>"+data[i].fillUserName+"</td><td>"+new Date(data[i].fillDate).format("yyyy-MM-dd")+"</td></tr>")
							}
						}else{
							$("#Search tbody").append("<tr><td colspan='8'>暂无数据</td></tr>")
						}
					}
				});
			}
			
			function gatherUpData () {
				var req={};
				req.fillDate=Gather_select.value;
				$.ajax({
					 url:"rest/invoice/countInvoiceByDesc", 
					 type:"post",
					 data:req,
					 success:function(data){
						 $("#Gather tbody").empty();
						if(data.length>0){
							for(var i=0;i<data.length;i++){
								$("#Gather tbody").append("<tr><td><a name='"+data[i].oaId+"' onclick='invoiceInfoByOA(this.name)'>"+data[i].oaId+"</a></td><td><a name='"+data[i].oaId+"' onclick='invoiceInfoByOA(this.name)'>"+data[i].count+"</a></td><td class='right'>"+data[i].noTaxAmount+"</td></tr>")
							}
						}else{
							$("#Gather tbody").append("<tr><td colspan='3'>暂无数据</td></tr>")
						}
					}
				});
			}
			
			function invoiceInfoByOA(oacode){
				$.ajax({
					 url:"rest/invoice/selectByIdOrOaIdOrCode",
					 type:"post",
					 data:{"oaId":oacode},
					 success:function(data){
						$("#invoiceByOA tbody").empty();
						if(data.length>0){
							for(var i=0;i<data.length;i++){
								$("#invoiceByOA tbody").append("<tr><td>"+data[i].oaId+"</td><td>"+data[i].id+"</td><td>"+data[i].code+"</td><td>"+new Date(data[i].invDate).format("yyyy-MM-dd")+"</td><td>"+data[i].checkCode+"</td><td class='right'>"+data[i].noTaxAmount+"</td><td>"+data[i].fillUserName+"</td><td>"+new Date(data[i].fillDate).format("yyyy-MM-dd")+"</td><tr>")
							}
							black.style.display="block"
							invoiceByOA.style.display="block"
							var h=invoiceByOA.scrollHeight;
							invoiceByOA.style.marginTop=-h/2+"px";
							invoiceByOA.style.opacity="1";
							invoiceByOA.style.filter="alpha(opacity=100)";
						}else{
							$("#invoiceByOA tbody").append("<tr><td colspan='8'>暂无数据</td></tr>");
							black.style.display="block"
							invoiceByOA.style.display="block"
							var h=invoiceByOA.scrollHeight;
							invoiceByOA.style.marginTop=-h/2+"px";
							invoiceByOA.style.opacity="1";
							invoiceByOA.style.filter="alpha(opacity=100)";
						}
					}
				});
			}
			
			function checkItem (ele) {
				var index=0;
				var ipt=$(".cm_userManage");
				var obj=JSON.parse(ele.getAttribute("data-info"));
				var radio=document.getElementsByName("check");
				if($(ele).hasClass("check")){
					ele.className="";
					ele.checked=false;
					$("#PassWordByAdmin").removeAttr("disabled")
					for(var i=0;i<ipt.length;i++){
						ipt[i].value="";
					}
					return
				}
				for(var i=0;i<radio.length;i++){
					radio[i].className="";
				}
				ele.className="check";
				$("#PassWordByAdmin").attr("disabled",true)
				for(var i in obj){
					ipt[index].value=obj[i];
					index++
				}
			}
			
			function userDel () {
				if(UserNameByAdmin.value==""){
					UserNameByAdmin.style.background="pink";
					return false
				}else{
					UserNameByAdmin.style.background="#fff";
				}
				var req={};
				req.id=userId.value;
				$.ajax({
					 url:"rest/user/deleteUser",
					 type:"post",
					 data:req,
					 success:function(data){
						queryUser();
						$(".cm_userManage").each(function(index,item){
							 item.value="";
						 })
						alert(data)	
					},
					error:function(){
						alert("删除失败！")
					}
				});
			}
			
			function userReset(){
				var radio=document.getElementsByName("check");
				for(var i=0;i<radio.length;i++){
					if(radio[i].checked){
						var obj=JSON.parse(radio[i].getAttribute("data-info"));
						var req={};
						req.id=userId.value;
						$.ajax({
							 url:"rest/user/resetUser", 
							 type:"post",
							 data:req,
							 success:function(data){
								 alert(data);
								 $(".cm_userManage").each(function(index,item){
									 item.value="";
								 })
								 queryUser();
							},
							error:function(){
								alert("重置失败！")
							}
						})
					}
				}
			}
			
			function userChange () {
				confirmation(".cm_userManage");
				var req={};
				req.loginName=UserNameByAdmin.value;
				req.password=PassWordByAdmin.value;
				req.id=userId.value;
				req.name=NameByAdmin.value;
				
				
				if(confirmation(".cm_userManage")){
				
				$.ajax({
					 url:"rest/user/updateUser", 
					 data:req,
					 success:function(data){
						if(data=="1"){
							alert("修改成功");
							$(".cm_userManage").each(function(index,item){
								 item.value="";
							 })
							queryUser();
						}	
						if(data=="2"){
							alert("用户名重复");
						}	
					}
				});
				
				}
			}
			
			function userAdd () {
				var req={};
				req.id=userId.value;
				if(req.id !="" ){
					alert("不能新增");
					return ;
					
				}
				
				if(confirmation(".cm_userManage")){
					$.ajax({
						 url:"rest/user/insertUser", 
						 data:$("#insertForm").serialize(),
						 success:function(data){
							if(data=="1"){
								alert("添加成功");
								$(".cm_userManage").each(function(index,item){
									 item.value="";
								 })
								queryUser();
							}	
							if(data=="2"){
								alert("用户名重复");
							}	
							
						}
					});
				}
				
				
				
				
			}
			function queryUser(){
				var option="";
				$.ajax({
					 url:"rest/user/queryUser", 
					 dataType : "json",
					 success:function(data){
						 $("#UserList").empty();
						 if(data.length>0){
							for(var i=0;i<data.length;i++){
								var obj={"userName":data[i].loginName,"password":data[i].password,"name":data[i].name,"id":data[i].id};
								$("#UserList").append("<tr><td><input type='radio' name='check' onclick='checkItem(this)' data-info='"+JSON.stringify(obj)+"'></td><td>"+data[i].loginName+"</td><td>"+data[i].name+"</td><td style='display:none'>"+data[i].id+"</td></tr>")
							}
						} else{
							$("#UserList").append("<tr><td colspan='4'>暂无数据</td></tr>")
						}
					}
				});
			}
			
			/**
			*	普通用户修改密码
			*/
			function normalUserSub () {
				confirmation(".normalUserInfo");
				var req={};
				req.loginName=UserNameByNormal.value;
				req.password=PassWordByNormal.value;
				req.id=UserIdByNormal.value;
				req.name=NameByNormal.value;
				$.ajax({
					 url:"rest/user/updateUser",  
					 dataType : "json",
					 data:req,
					 success:function(data){
						if(data=="1"){
							alert("修改成功");
							PassWordByNormal.value=""
						}	
						if(data=="2"){
							alert("用户名重复");
						}	
					}
				}); 
				


				
			}
			
			//设置日期时间控件
			function Datetime(dom) {
			    $(dom).datetimepicker({
			        language: 'zh-CN',//显示中文
			        format: 'yyyy-mm-dd',//显示格式
			        minView: "month",//设置只显示到月份
			        initialDate: new Date(),
			        autoclose: true,//选中自动关闭
			        todayBtn: true,//显示今日按钮
			        locale: moment.locale('zh-cn')
			    });
			    //默认获取当前日期
			    var today = new Date();
			    var nowdate = (today.getFullYear()) + "-" + (today.getMonth() + 1) + "-" + today.getDate();
			    //对日期格式进行处理
			    var date = new Date(nowdate);
			    var mon = date.getMonth() + 1;
			    var day = date.getDate();
			    var mydate = date.getFullYear() + "-" + (mon < 10 ? "0" + mon : mon) + "-" + (day < 10 ? "0" + day : day);
			    /*document.getElementById("nowdate").value = mydate;*/
			    if($.inArray(dom,["#HandDateTimePicker2"])!=-1) $(dom).find("input").val(mydate)
			}
			
			Date.prototype.format = function (format) {
			    if (!format) {
			        format = "yyyy-MM-dd hh:mm:ss";
			    }
			    var o = {
			        "M+": this.getMonth() + 1,  // month
			        "d+": this.getDate(),       // day
			        "H+": this.getHours(),      // hour
			        "h+": this.getHours(),      // hour
			        "m+": this.getMinutes(),    // minute
			        "s+": this.getSeconds(),    // second
			        "q+": Math.floor((this.getMonth() + 3) / 3), // quarter
			        "S": this.getMilliseconds()
			    };

			    if (/(y+)/.test(format)) {
			        format = format.replace(RegExp.$1, (this.getFullYear() + "")
			            .substr(4 - RegExp.$1.length));
			    }

			    for (var k in o) {
			        if (new RegExp("(" + k + ")").test(format)) {
			            format = format.replace(RegExp.$1, RegExp.$1.length == 1
			                ? o[k]
			                : ("00" + o[k]).substr(("" + o[k]).length));
			        }
			    }

			    return format;
			};
			
			
			
			function ajax (url,obj,fn) {
				var xhr=new XMLHttpRequest();
				xhr.open("post",url); 
				xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
				var req=obj?obj:{};
				req.userName=localStorage.unserName;
				xhr.send(req);
				xhr.onreadystatechange=function(){
					if(xhr.readyState==4&&xhr.status==200) fn(xhr.responseText);
				}
			}
			
			
			$("#Quit").click(function(){
			
				$.ajax({
					url:"rest/user/logout",
					success:function(data){
						window.location.href="<%= request.getContextPath()%>/index.jsp";
					}
					
				})
				
				
			})
			

			
		</script>
		
	</body>
</html>
