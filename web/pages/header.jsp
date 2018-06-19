<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/6/19
  Time: 上午10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <link rel='stylesheet' type='text/css' href='http://fonts.useso.com/css?family=Open+Sans:400,700|Droid+Sans:400,700' />
    <!-- Favicon and touch icons -->
    <link rel="shortcut icon" href="../assets/ico/favicon.ico" type="image/x-icon" />
    <link href="../assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="../assets/css/jquery.mmenu.css" rel="stylesheet">
    <link href="../assets/css/font-awesome.min.css" rel="stylesheet">
    <link href="../assets/plugins/jquery-ui/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
    <link href="../assets/css/style.min.css" rel="stylesheet">
    <link href="../assets/css/add-ons.min.css" rel="stylesheet">
</head>
<body>
<div class="navbar" role="navigation">

    <div class="container-fluid">



        <form class="navbar-form navbar-left">
            <button type="submit" class="fa fa-search"></button>
            <input type="text" class="form-control" placeholder="搜点什么..."></a>
        </form>
        <ul class="nav navbar-nav navbar-right">
            <li class="dropdown visible-md visible-lg">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">欢迎：<s:property value="#session.loginUser.username"/></a>
                <ul class="dropdown-menu">
                    <li class="dropdown-menu-header">
                        <strong>个人账户</strong>
                    </li>
                    <li><a href="/profile.action"><i class="fa fa-user"></i> 查看个人信息</a></li>
                    <li><a href="/logout.action"><i class="fa fa-sign-out"></i> 登出</a></li>
                </ul>
            </li>
            <li><a href="/logout.action"><i class="fa fa-power-off"></i></a></li>
        </ul>

    </div>

</div>
<!--[if !IE]>-->

<script src="../assets/js/jquery-2.1.1.min.js"></script>

<!--<![endif]-->

<!--[if IE]>

<script src="assets/js/jquery-1.11.1.min.js"></script>

<![endif]-->

<!--[if !IE]>-->

<script type="text/javascript">
    window.jQuery || document.write("<script src='../assets/js/jquery-2.1.1.min.js'>"+"<"+"/script>");
</script>

<!--<![endif]-->

<!--[if IE]>

<script type="text/javascript">
    window.jQuery || document.write("<script src='assets/js/jquery-1.11.1.min.js'>"+"<"+"/script>");
</script>

<![endif]-->
<script src="../assets/js/jquery-migrate-1.2.1.min.js"></script>
<script src="../assets/js/bootstrap.min.js"></script>


<!-- page scripts -->
<script src="../assets/plugins/jquery-ui/js/jquery-ui-1.10.4.min.js"></script>
<script src="../assets/plugins/touchpunch/jquery.ui.touch-punch.min.js"></script>
<script src="../assets/plugins/moment/moment.min.js"></script>
<script src="../assets/plugins/fullcalendar/js/fullcalendar.min.js"></script>
<!--[if lte IE 8]>
<script language="javascript" type="text/javascript" src="assets/plugins/excanvas/excanvas.min.js"></script>
<![endif]-->
<script src="../assets/plugins/flot/jquery.flot.min.js"></script>
<script src="../assets/plugins/flot/jquery.flot.pie.min.js"></script>
<script src="../assets/plugins/flot/jquery.flot.stack.min.js"></script>
<script src="../assets/plugins/flot/jquery.flot.resize.min.js"></script>
<script src="../assets/plugins/flot/jquery.flot.time.min.js"></script>
<script src="../assets/plugins/flot/jquery.flot.spline.min.js"></script>
<script src="../assets/plugins/xcharts/js/xcharts.min.js"></script>
<script src="../assets/plugins/autosize/jquery.autosize.min.js"></script>
<script src="../assets/plugins/placeholder/jquery.placeholder.min.js"></script>
<script src="../assets/plugins/datatables/js/jquery.dataTables.min.js"></script>
<script src="../assets/plugins/datatables/js/dataTables.bootstrap.min.js"></script>
<script src="../assets/plugins/raphael/raphael.min.js"></script>
<script src="../assets/plugins/morris/js/morris.min.js"></script>
<script src="../assets/plugins/jvectormap/js/jquery-jvectormap-1.2.2.min.js"></script>
<script src="../assets/plugins/jvectormap/js/jquery-jvectormap-world-mill-en.js"></script>
<script src="../assets/plugins/jvectormap/js/gdp-data.js"></script>
<script src="../assets/plugins/gauge/gauge.min.js"></script>


<!-- theme scripts -->
<script src="../assets/js/SmoothScroll.js"></script>
<script src="../assets/js/jquery.mmenu.min.js"></script>
<script src="../assets/js/core.min.js"></script>
<script src="../assets/plugins/d3/d3.min.js"></script>

<!-- inline scripts related to this page -->
<script src="../assets/js/pages/index.js"></script>

<!-- end: JavaScript-->
</body>
</html>
