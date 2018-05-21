<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%String path = request.getContextPath(); %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>资产管理系统</title>
<!-- Bootstrap Styles-->
<link href="<%=path %>/assets/css/bootstrap.css" rel="stylesheet" />
<!-- FontAwesome Styles-->
<link href="<%=path %>/assets/css/font-awesome.css" rel="stylesheet" />
<!-- Morris Chart Styles-->
<link href="<%=path %>/assets/js/morris/morris-0.4.3.min.css" rel="stylesheet" />
<!-- Custom Styles-->
<link href="<%=path %>/assets/css/custom-styles.css" rel="stylesheet" />
<!-- Google Fonts-->
<link href='https://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<!-- /. WRAPPER  -->
    <!-- JS Scripts-->
    <!-- jQuery Js -->
    <script src="<%=path %>/assets/js/jquery-1.10.2.js"></script>
    <!-- Bootstrap Js -->
    <script src="<%=path %>/assets/js/bootstrap.min.js"></script>
    <!-- Metis Menu Js -->
    <script src="<%=path %>/assets/js/jquery.metisMenu.js"></script>
    <!-- Morris Chart Js -->
    <script src="<%=path %>/assets/js/morris/raphael-2.1.0.min.js"></script>
    <script src="<%=path %>/assets/js/morris/morris.js"></script>
    <!-- Custom Js -->
    <script src="<%=path %>/assets/js/custom-scripts.js"></script>
    
    <script type="text/javascript" src="<%=path %>/scripts/jquery-3.3.1.js"></script>
    <script>
    $(function(){
		$("#testJson").click(function(){
			var url = this.href;
			var args = {};
			$.post(url, args, function(data){
				for(var i = 0; i < data.length; i++){
					var id = data[i].contractId;
					var lastName = data[i].contractName;
				}
			});
			return false;
		});
	});
    </script>
    
<title>资产管理系统</title>
</head>
<body>
	<!-- <a href="../getAllContractApplication" id="testJson">Test Json</a> -->
	<div id="wrapper">
        <nav class="navbar navbar-default top-navbar" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">资产管理系统</a>
            </div>

            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                        <i class="fa fa-envelope fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Doe</strong>
                                    <span class="pull-right text-muted">
                                        <em>Today</em>
                                    </span>
                                </div>
                                <div>Lorem Ipsum has been the industry's standard dummy text ever since the 1500s...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem Ipsum has been the industry's standard dummy text ever since an kwilnw...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem Ipsum has been the industry's standard dummy text ever since the...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>Read All Messages</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-messages -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                        <i class="fa fa-tasks fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-tasks">
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 1</strong>
                                        <span class="pull-right text-muted">60% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                            <span class="sr-only">60% Complete (success)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 2</strong>
                                        <span class="pull-right text-muted">28% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="28" aria-valuemin="0" aria-valuemax="100" style="width: 28%">
                                            <span class="sr-only">28% Complete</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 3</strong>
                                        <span class="pull-right text-muted">60% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 4</strong>
                                        <span class="pull-right text-muted">85% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="85" aria-valuemin="0" aria-valuemax="100" style="width: 85%">
                                            <span class="sr-only">85% Complete (danger)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>See All Tasks</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-tasks -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                        <i class="fa fa-bell fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-alerts">
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-comment fa-fw"></i> New Comment
                                    <span class="pull-right text-muted small">4 min</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                    <span class="pull-right text-muted small">12 min</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-envelope fa-fw"></i> Message Sent
                                    <span class="pull-right text-muted small">4 min</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-tasks fa-fw"></i> New Task
                                    <span class="pull-right text-muted small">4 min</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                    <span class="pull-right text-muted small">4 min</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>See All Alerts</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-alerts -->
                </li>
                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" aria-expanded="false">
                        <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="#"><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
        </nav>
        <!--/. NAV TOP  -->
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">

                    <li>
                        <a class="active-menu" href="index.html"><i class="fa fa-fw fa-file"></i> 系统公告信息</a>
                    </li>
                    <li>
                        <a href="ui-elements.html"><i class="fa fa-desktop"></i> 资产总体情况<span class="fa arrow"></span></a>
                        
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="../assetsCondition">固定资产汇总表</a>
                            </li>
                            <li>
                                <a href="#">单位资产统计表</a>
                            </li>
                            <li>
                                <a href="#">设备类别年限表</a>
                            </li>
                        </ul>
                    </li>
					<li>
                        <a href="#"><i class="fa fa-bar-chart-o"></i> 综合查询<span class="fa arrow"></span></a>
                        
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="../integratedQuery">设备与软件</a>
                            </li>
                            <li>
                                <a href="../furnitureQuery">家具物资</a>
                            </li>
                            <li>
                                <a href="../houseQuery">房屋</a>
                            </li>
                            <li>
                                <a href="../outsideBuildingQuery">室外建筑物</a>
                            </li>
                            <li>
                                <a href="../assetStatisticsQuery">资产统计信息</a>
                            </li>
                        </ul>
                    </li>
                    <!-- <li>
                        <a href="tab-panel.html"><i class="fa fa-qrcode"></i> 房屋使用情况<span class="fa arrow"></span></a>
                        
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">单位用房</a>
                            </li>
                            <li>
                                <a href="#">校区分组</a>
                            </li>
                            <li>
                                <a href="#">使用方向分组</a>
                            </li>
                            <li>
                                <a href="#">用途分组</a>
                            </li>
                        </ul>
                    </li> -->
                    
                    <li>
                        <a href="#"><i class="fa fa-table"></i> 合同付款<span class="fa arrow"></span></a>
                        
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="../contractApplication">发送申请</a>
                            </li>
                            <li>
                                <a href="../getApplication">查询申请</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <!-- <a href="form.html"><i class="fa fa-edit"></i> 设备现场验收 </a> -->
                        <a href="#"><i class="fa fa-edit"></i> 设备现场验收 <span class="fa arrow"></span></a>
                        
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">发送或确认申请</a>
                            </li>
                            <li>
                                <a href="#">查询申请</a>
                            </li>
                        </ul>
                    </li>
						
                    <li>
                        <a href="#"><i class="fa fa-sitemap"></i> 资产验收入账<span class="fa arrow"></span></a>
                        
						<ul class="nav nav-second-level">
                            <li>
                                <a href="#">发送验收申请</a>
                            </li>
                            <li>
                                <a href="#">查询验收申请</a>
                            </li>
                        </ul>
                    </li>
					<li>
                        <a href="#"><i class="fa fa-sitemap"></i> 资产修改调拨<span class="fa arrow"></span></a>
                        
						<ul class="nav nav-second-level">
                            <li>
                                <a href="../alterAssetApplication">发送修改申请</a>
                            </li>
                            <li>
                                <a href="../alterAssetRevoke">撤销修改申请</a>
                            </li>
                            <li>
                                <a href="../getAlterAssetInf">查询修改信息</a>
                            </li>
                        </ul>
                    </li>
					<li>
                        <a href="#"><i class="fa fa-sitemap"></i> 资产报废<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="../assetRetirement">发送报废申请</a>
                            </li>
                            <li>
                                <a href="../revokeRetirement">撤销报废申请</a>
                            </li>
                            <li>
                                <a href="../getRetirementsInf">查询报废申请</a>
                            </li>
                        </ul>
                    </li>
					<li>
                        <a href="#"><i class="fa fa-sitemap"></i> 资产现场盘点<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="#">已经盘点的记录</a>
                            </li>
                            <li>
                                <a href="#">查询盘盈记录</a>
                            </li>
                            <li>
                                <a href="#">尚未盘点的记录</a>
                            </li>
                        </ul>
                    </li>
                    <!-- <li>
                        <a href="empty.html"><i class="fa fa-dashboard"></i> Empty Page</a>
                    </li> -->
                </ul>

            </div>

        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper">
            <div id="page-inner">


                <div class="row">
                    <div class="col-md-12">
                        <h1 class="page-header">
                            	系统公告 <!-- <small>Summary of your App</small> -->
                        </h1>
                        <p>
                            <h5>
                            	按照财政部《事业单位财务规则》（第68号令）文件要求，经校长办公会研究决定，现对学校固定资产标准进行调整。标准如下： <br>
                            	1、使用年限在1年以上，单位价值在1500元以上（含1500元），并在使用过程中基本保持原有物质形态的专用设备； <br>
                            	2、使用年限在1年以上，单位价值在1000元以上（含1000元），并在使用过程中基本保持原有物质形态的一般设备（含办公家具等）； <br>
                            	3、单位价值虽不足规定标准，但一次性购置100件以上（含100件），且单位价值在500元以上（含500元），耐用时间在1年以上的大批同类物资（如办公家具等），按固定资产管理。 新标准自2013年1月1日起执行。
                            </h5>
                        </p>
                    </div>
                </div>
                <!-- /. ROW  -->
            </div>
            <!-- /. PAGE INNER  -->
        </div>
        <!-- /. PAGE WRAPPER  -->
    </div>
</body>
</html>