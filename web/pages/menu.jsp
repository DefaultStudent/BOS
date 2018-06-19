<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/6/19
  Time: 上午10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel='stylesheet' type='text/css' href='http://fonts.useso.com/css?family=Open+Sans:400,700|Droid+Sans:400,700' />
    <!-- Favicon and touch icons -->
    <link rel="shortcut icon" href="assets/ico/favicon.ico" type="image/x-icon" />
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/css/jquery.mmenu.css" rel="stylesheet">
    <link href="assets/css/font-awesome.min.css" rel="stylesheet">
    <link href="assets/plugins/jquery-ui/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
    <link href="assets/css/style.min.css" rel="stylesheet">
    <link href="assets/css/add-ons.min.css" rel="stylesheet">
</head>
<body>
<div class="sidebar ">

    <div class="sidebar-collapse">
        <div class="sidebar-header t-center">
            <span><img class="text-logo" src="assets/img/logo1.png"><i class="fa fa-space-shuttle fa-3x blue"></i></span>
        </div>
        <div class="sidebar-menu">
            <ul class="nav nav-sidebar">
                <li><i class="fa fa-laptop"></i><span class="text"> 首页</span></li>
                <li>
                    <a href="#"><i class="fa fa-file-text"></i><span class="text"> 仓库管理</span> <span class="fa fa-angle-down pull-right"></span></a>
                    <ul class="nav sub">
                        <li><a href="#"><i class="fa fa-car"></i><span class="text"> 仓库信息添加</span></a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-list-alt"></i><span class="text"> 分区管理</span> <span class="fa fa-angle-down pull-right"></span></a>
                    <ul class="nav sub">
                        <li><a href="form-elements.html"><i class="fa fa-indent"></i><span class="text"> 分区信息添加</span></a></li>
                    </ul>
                </li>
                <li>
                    <a href="findAllUser.action"><i class="fa fa-signal"></i><span class="text"> 员工管理</span> <span class="fa fa-angle-down pull-right"></span></a>
                    <ul class="nav sub">
                        <li><a href="chart-flot.html">
                            <i class="fa fa-random"></i>
                            <span class="text"> 员工信息添加</span></a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-briefcase"></i><span class="text"> 地区管理</span> <span class="fa fa-angle-down pull-right"></span></a>
                    <ul class="nav sub">
                        <li><a href="ui-sliders-progress.html"><i class="fa fa-align-left"></i><span class="text"> 地区信息添加</span></a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-list-alt"></i><span class="text"> 商品管理</span> <span class="fa fa-angle-down pull-right"></span></a>
                    <ul class="nav sub">
                        <li>
                            <a href="ui-sliders-progress.html">
                                <i class="fa fa-align-left"></i>
                                <span class="text"> 商品入库</span>
                            </a>
                        </li>
                        <li>
                            <a href="ui-sliders-progress.html">
                                <i class="fa fa-align-left"></i>
                                <span class="text"> 商品出库</span>
                            </a>
                        </li>
                        <li>
                            <a href="ui-sliders-progress.html">
                                <i class="fa fa-random"></i>
                                <span class="text"> 商品移库</span>
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <div class="sidebar-footer">

        <div class="sidebar-brand">
        </div>

        <ul class="sidebar-terms">
        </ul>
    </div>

</div>
<!-- start: JavaScript-->
<!--[if !IE]>-->

<script src="assets/js/jquery-2.1.1.min.js"></script>

<!--<![endif]-->

<!--[if IE]>

<script src="assets/js/jquery-1.11.1.min.js"></script>

<![endif]-->

<!--[if !IE]>-->

<script type="text/javascript">
    window.jQuery || document.write("<script src='assets/js/jquery-2.1.1.min.js'>"+"<"+"/script>");
</script>

<!--<![endif]-->

<!--[if IE]>

<script type="text/javascript">
    window.jQuery || document.write("<script src='assets/js/jquery-1.11.1.min.js'>"+"<"+"/script>");
</script>

<![endif]-->
<script src="assets/js/jquery-migrate-1.2.1.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>


<!-- page scripts -->
<script src="assets/plugins/jquery-ui/js/jquery-ui-1.10.4.min.js"></script>
<script src="assets/plugins/touchpunch/jquery.ui.touch-punch.min.js"></script>
<script src="assets/plugins/moment/moment.min.js"></script>
<script src="assets/plugins/fullcalendar/js/fullcalendar.min.js"></script>
<!--[if lte IE 8]>
<script language="javascript" type="text/javascript" src="assets/plugins/excanvas/excanvas.min.js"></script>
<![endif]-->
<script src="assets/plugins/flot/jquery.flot.min.js"></script>
<script src="assets/plugins/flot/jquery.flot.pie.min.js"></script>
<script src="assets/plugins/flot/jquery.flot.stack.min.js"></script>
<script src="assets/plugins/flot/jquery.flot.resize.min.js"></script>
<script src="assets/plugins/flot/jquery.flot.time.min.js"></script>
<script src="assets/plugins/flot/jquery.flot.spline.min.js"></script>
<script src="assets/plugins/xcharts/js/xcharts.min.js"></script>
<script src="assets/plugins/autosize/jquery.autosize.min.js"></script>
<script src="assets/plugins/placeholder/jquery.placeholder.min.js"></script>
<script src="assets/plugins/datatables/js/jquery.dataTables.min.js"></script>
<script src="assets/plugins/datatables/js/dataTables.bootstrap.min.js"></script>
<script src="assets/plugins/raphael/raphael.min.js"></script>
<script src="assets/plugins/morris/js/morris.min.js"></script>
<script src="assets/plugins/jvectormap/js/jquery-jvectormap-1.2.2.min.js"></script>
<script src="assets/plugins/jvectormap/js/jquery-jvectormap-world-mill-en.js"></script>
<script src="assets/plugins/jvectormap/js/gdp-data.js"></script>
<script src="assets/plugins/gauge/gauge.min.js"></script>


<!-- theme scripts -->
<script src="assets/js/SmoothScroll.js"></script>
<script src="assets/js/jquery.mmenu.min.js"></script>
<script src="assets/js/core.min.js"></script>
<script src="assets/plugins/d3/d3.min.js"></script>

<!-- inline scripts related to this page -->
<script src="assets/js/pages/index.js"></script>

<!-- end: JavaScript-->
</body>
</html>
