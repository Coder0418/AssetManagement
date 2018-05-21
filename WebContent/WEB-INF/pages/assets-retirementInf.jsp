<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Bootstrap Styles-->
<link href="assets/css/bootstrap.css" rel="stylesheet" />
<!-- FontAwesome Styles-->
<link href="assets/css/font-awesome.css" rel="stylesheet" />
<!-- Morris Chart Styles-->

<!-- Custom Styles-->
<link href="assets/css/custom-styles.css" rel="stylesheet" />
<!-- Google Fonts-->
<link href='https://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<!-- TABLE STYLES-->
<link href="assets/js/dataTables/dataTables.bootstrap.css"
	rel="stylesheet" />

<!-- JS Scripts-->
<!-- jQuery Js -->
<script src="assets/js/jquery-1.10.2.js"></script>
<!-- Bootstrap Js -->
<script src="assets/js/bootstrap.min.js"></script>
<!-- Metis Menu Js -->
<script src="assets/js/jquery.metisMenu.js"></script>
<!-- DATA TABLE SCRIPTS -->
<script src="assets/js/dataTables/jquery.dataTables.js"></script>
<script src="assets/js/dataTables/dataTables.bootstrap.js"></script>
<script type="text/javascript">
	var ids = [];
	$(function() {
		$('#dataTables-example').dataTable();
		
		//实现全选与反选  
        /* $("#allAndNotAll").click(function() {
            if (this.checked) {
                $("input[name='assetItems']:checkbox").each(function() { 
                	$(this).prop("checked", true);
                	
                	ids.push($(this).attr("value"));
                });
            } else {
                $("input[name='assetItems']:checkbox").each(function() {     
                	$(this).prop("checked", false);
                });
            } 
            //var delIds=ids.join(",");   
            //console.log(delIds);
            console.log(ids);
        });
		
        $("input[name='assetItems']:checkbox").click(function() {
        	ids.push($(this).attr("value"));
        	$("#allAndNotAll").prop("checked", false);
        });
        
        $("form").submit(function(e) {
        	if(ids.length == 0) {
	        	e.preventDefault();
	        	alert("请选择项目");
        	}
        }); */
	});
	
</script>
<!-- Custom Js(分页用) -->
<script src="assets/js/custom-scripts.js"></script>

<!-- 引入表单元素 -->
<link rel="stylesheet" href="<%=path%>/forms/css/amazeui.css" />
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
<%-- <link rel="stylesheet" href="<%=path %>/forms/css/core.css" />
<link rel="stylesheet" href="<%=path %>/forms/css/menu.css" />
<link rel="stylesheet" href="<%=path %>/forms/css/index.css" />
<link rel="stylesheet" href="<%=path %>/forms/css/admin.css" />
<link rel="stylesheet" href="<%=path %>/forms/css/page/typography.css" /> --%>
<link rel="stylesheet" href="<%=path%>/forms/css/page/form.css" />

<title>资产管理系统</title>
</head>
<body>
	<div id="wrapper">
		<nav class="navbar navbar-default top-navbar" role="navigation">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".sidebar-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.html">资产管理系统</a>
		</div>

		<ul class="nav navbar-top-links navbar-right">
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#" aria-expanded="false"> <i
					class="fa fa-envelope fa-fw"></i> <i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-messages">
					<li><a href="#">
							<div>
								<strong>John Doe</strong> <span class="pull-right text-muted">
									<em>Today</em>
								</span>
							</div>
							<div>Lorem Ipsum has been the industry's standard dummy
								text ever since the 1500s...</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<strong>John Smith</strong> <span class="pull-right text-muted">
									<em>Yesterday</em>
								</span>
							</div>
							<div>Lorem Ipsum has been the industry's standard dummy
								text ever since an kwilnw...</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<strong>John Smith</strong> <span class="pull-right text-muted">
									<em>Yesterday</em>
								</span>
							</div>
							<div>Lorem Ipsum has been the industry's standard dummy
								text ever since the...</div>
					</a></li>
					<li class="divider"></li>
					<li><a class="text-center" href="#"> <strong>Read
								All Messages</strong> <i class="fa fa-angle-right"></i>
					</a></li>
				</ul> <!-- /.dropdown-messages --></li>
			<!-- /.dropdown -->
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#" aria-expanded="false"> <i
					class="fa fa-tasks fa-fw"></i> <i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-tasks">
					<li><a href="#">
							<div>
								<p>
									<strong>Task 1</strong> <span class="pull-right text-muted">60%
										Complete</span>
								</p>
								<div class="progress progress-striped active">
									<div class="progress-bar progress-bar-success"
										role="progressbar" aria-valuenow="60" aria-valuemin="0"
										aria-valuemax="100" style="width: 60%">
										<span class="sr-only">60% Complete (success)</span>
									</div>
								</div>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<p>
									<strong>Task 2</strong> <span class="pull-right text-muted">28%
										Complete</span>
								</p>
								<div class="progress progress-striped active">
									<div class="progress-bar progress-bar-info" role="progressbar"
										aria-valuenow="28" aria-valuemin="0" aria-valuemax="100"
										style="width: 28%">
										<span class="sr-only">28% Complete</span>
									</div>
								</div>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<p>
									<strong>Task 3</strong> <span class="pull-right text-muted">60%
										Complete</span>
								</p>
								<div class="progress progress-striped active">
									<div class="progress-bar progress-bar-warning"
										role="progressbar" aria-valuenow="60" aria-valuemin="0"
										aria-valuemax="100" style="width: 60%">
										<span class="sr-only">60% Complete (warning)</span>
									</div>
								</div>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<p>
									<strong>Task 4</strong> <span class="pull-right text-muted">85%
										Complete</span>
								</p>
								<div class="progress progress-striped active">
									<div class="progress-bar progress-bar-danger"
										role="progressbar" aria-valuenow="85" aria-valuemin="0"
										aria-valuemax="100" style="width: 85%">
										<span class="sr-only">85% Complete (danger)</span>
									</div>
								</div>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a class="text-center" href="#"> <strong>See
								All Tasks</strong> <i class="fa fa-angle-right"></i>
					</a></li>
				</ul> <!-- /.dropdown-tasks --></li>
			<!-- /.dropdown -->
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#" aria-expanded="false"> <i
					class="fa fa-bell fa-fw"></i> <i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-alerts">
					<li><a href="#">
							<div>
								<i class="fa fa-comment fa-fw"></i> New Comment <span
									class="pull-right text-muted small">4 min</span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<i class="fa fa-twitter fa-fw"></i> 3 New Followers <span
									class="pull-right text-muted small">12 min</span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<i class="fa fa-envelope fa-fw"></i> Message Sent <span
									class="pull-right text-muted small">4 min</span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<i class="fa fa-tasks fa-fw"></i> New Task <span
									class="pull-right text-muted small">4 min</span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a href="#">
							<div>
								<i class="fa fa-upload fa-fw"></i> Server Rebooted <span
									class="pull-right text-muted small">4 min</span>
							</div>
					</a></li>
					<li class="divider"></li>
					<li><a class="text-center" href="#"> <strong>See
								All Alerts</strong> <i class="fa fa-angle-right"></i>
					</a></li>
				</ul> <!-- /.dropdown-alerts --></li>
			<!-- /.dropdown -->
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#" aria-expanded="false"> <i
					class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-user">
					<li><a href="#"><i class="fa fa-user fa-fw"></i> User
							Profile</a></li>
					<li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
					</li>
					<li class="divider"></li>
					<li><a href="#"><i class="fa fa-sign-out fa-fw"></i>
							Logout</a></li>
				</ul> <!-- /.dropdown-user --></li>
			<!-- /.dropdown -->
		</ul>
		</nav>
		<!--/. NAV TOP  -->
		<nav class="navbar-default navbar-side" role="navigation">
		<div class="sidebar-collapse">
			<ul class="nav" id="main-menu">

				<li><a class="active-menu" href="index.html"><i
						class="fa fa-fw fa-file"></i> 系统公告信息</a></li>
				<li><a href="ui-elements.html"><i class="fa fa-desktop"></i>
						资产总体情况<span class="fa arrow"></span></a>

					<ul class="nav nav-second-level">
						<li><a href="#">固定资产汇总表</a></li>
						<li><a href="#">单位资产统计表</a></li>
						<li><a href="#">设备类别年限表</a></li>
					</ul></li>
				<li><a href="chart.html"><i class="fa fa-bar-chart-o"></i>
						综合查询<span class="fa arrow"></span></a>

					<ul class="nav nav-second-level">
						<li><a href="integratedQuery">设备与软件</a></li>
						<li><a href="furnitureQuery">家具物资</a></li>
						<li><a href="houseQuery">房屋</a></li>
						<li><a href="outsideBuildingQuery">室外建筑物</a></li>
						<li><a href="assetStatisticsQuery">资产统计信息</a></li>
					</ul></li>
				<li><a href="table.html"><i class="fa fa-table"></i> 合同付款<span
						class="fa arrow"></span></a>

					<ul class="nav nav-second-level">
						<li><a href="contractApplication">发送申请</a></li>
						<li><a href="getApplication">查询申请</a></li>
					</ul></li>
				<li>
					<!-- <a href="form.html"><i class="fa fa-edit"></i> 设备现场验收 </a> -->
					<a href="#"><i class="fa fa-edit"></i> 设备现场验收 <span
						class="fa arrow"></span></a>

					<ul class="nav nav-second-level">
						<li><a href="#">发送或确认申请</a></li>
						<li><a href="#">查询申请</a></li>
					</ul>
				</li>

				<li><a href="#"><i class="fa fa-sitemap"></i> 资产验收入账<span
						class="fa arrow"></span></a>

					<ul class="nav nav-second-level">
						<li><a href="#">发送验收申请</a></li>
						<li><a href="#">查询验收申请</a></li>
					</ul></li>
				<li><a href="#"><i class="fa fa-sitemap"></i> 资产修改调拨<span
						class="fa arrow"></span></a>

					<ul class="nav nav-second-level">
						<li><a href="#">发送修改申请</a></li>
						<li><a href="#">撤销修改申请</a></li>
						<li><a href="#">查询修改信息</a></li>
					</ul></li>
				<li><a href="#"><i class="fa fa-sitemap"></i> 资产报废<span
						class="fa arrow"></span></a>
					<ul class="nav nav-second-level">
						<li><a href="retirementSubmit">发送报废申请</a></li>
						<li><a href="revokeRetirement">撤销报废申请</a></li>
						<li><a href="getRetirementsInf">查询报废申请</a></li>
					</ul></li>
				<li><a href="#"><i class="fa fa-sitemap"></i> 资产现场盘点<span
						class="fa arrow"></span></a>
					<ul class="nav nav-second-level">
						<li><a href="#">已经盘点的记录</a></li>
						<li><a href="#">查询盘盈记录</a></li>
						<li><a href="#">尚未盘点的记录</a></li>
					</ul></li>
			</ul>
		</div>

		</nav>
		<!-- /. NAV SIDE  -->
		<div id="page-wrapper">
			<div id="page-inner">
				<div class="row">
					<div class="col-md-12">
						<h2 class="page-header">
							报废资产信息
							<!-- <small>Summary of your App</small> -->
						</h2>
						<!-- <button onclick="retirementSubmit()" class="am-btn am-btn-primary">提交选中信息</button>&nbsp;&nbsp;&nbsp;&nbsp; -->
						<a download="data_123.xlsx" href="#" class="am-btn am-btn-primary" id="anchorNewApi-xlsx" onclick="return newApi('xlsx');">导出表格</a>
					</div>
				</div>
				<!-- /. ROW  -->
				<div class="row">
					<div class="col-md-12">
						<!-- Advanced Tables -->
						<div class="panel panel-default">
							<div class="panel-heading">资产表</div>
							<div class="panel-body">
								<div class="table-responsive">
									<table class="table table-striped table-bordered table-hover"
										id="dataTables-example">
										<thead>
											<tr>
												<th>使用单位</th>
												<th>资产名称</th>
												<th>资产数量</th>
												<th>资产净值</th>
												<th>领用人</th>
												<th>经办人</th>
												<th>存放地点</th>
												<th>入库时间</th>
												<th>购置日期</th>
												<th>资产类别</th>
											</tr>
										</thead>
										<tbody id="tbody-result">
											<c:forEach items="${retirementList }" var="asset">
												<tr>
													<td>${asset.usedDepartment }</td>
													<td>${asset.assetName }</td>
													<td>${asset.assetCount }</td>
													<td>${asset.assetEquity }</td>
													<td>${asset.user.nickName }</td>
													<td>${asset.assetAgent }</td>
													<td>${asset.assetLocation.locationName }</td>
													<td>${asset.strStorageTime }</td>
													<td>${asset.strPurchaseTime }</td>
													<td>${asset.assetCategory.categoryName }</td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
						<!--End Advanced Tables -->
					</div>
				</div>
			</div>
			<!-- /. PAGE INNER  -->
		</div>
		<!-- /. PAGE INNER  -->
	</div>
	<!-- /. PAGE WRAPPER  -->
	<!-- /. WRAPPER  -->
</body>
</html>