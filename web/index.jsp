<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/6/11
  Time: 下午1:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>首页</title>
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
<!-- start: Header -->
<div class="navbar" role="navigation">

  <div class="container-fluid">



    <form class="navbar-form navbar-left">
      <button type="submit" class="fa fa-search"></button>
      <input type="text" class="form-control" placeholder="搜点什么..."></a>
    </form>
    <ul class="nav navbar-nav navbar-right">
      <li class="dropdown visible-md visible-lg">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">欢迎：jhonsmith@mail.com</a>
        <ul class="dropdown-menu">
          <li class="dropdown-menu-header">
            <strong>个人账户</strong>
          </li>
          <li><a href="page-profile.html"><i class="fa fa-user"></i> 查看个人信息</a></li>
          <li><a href="page-login.html"><i class="fa fa-wrench"></i> 修改个人信息</a></li>
          <li><a href="/logout.action"><i class="fa fa-sign-out"></i> 登出</a></li>
        </ul>
      </li>
      <li><a href="index.html"><i class="fa fa-power-off"></i></a></li>
    </ul>

  </div>

</div>
<!-- end: Header -->

<!-- start: Main Menu -->
<div class="sidebar ">

  <div class="sidebar-collapse">
    <div class="sidebar-header t-center">
      <span><img class="text-logo" src="assets/img/logo1.png"><i class="fa fa-space-shuttle fa-3x blue"></i></span>
    </div>
    <div class="sidebar-menu">
      <ul class="nav nav-sidebar">
        <li><a href="index.jsp"><i class="fa fa-laptop"></i><span class="text"> 首页</span></a></li>
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
          <a href="#"><i class="fa fa-signal"></i><span class="text"> 员工管理</span> <span class="fa fa-angle-down pull-right"></span></a>
          <ul class="nav sub">
            <li><a href="chart-flot.html"><i class="fa fa-random"></i><span class="text"> 员工信息添加</span></a></li>
          </ul>
        </li>
        <li>
          <a href="#"><i class="fa fa-briefcase"></i><span class="text"> 地区管理</span> <span class="fa fa-angle-down pull-right"></span></a>
          <ul class="nav sub">
            <li><a href="ui-sliders-progress.html"><i class="fa fa-align-left"></i><span class="text"> 地区信息添加</span></a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
  <div class="sidebar-footer">

    <div class="sidebar-brand">
      Proton
    </div>

    <ul class="sidebar-terms">
      <li><a href="index.html#">Terms</a></li>
      <li><a href="index.html#">Privacy</a></li>
      <li><a href="index.html#">Help</a></li>
      <li><a href="index.html#">About</a></li>
    </ul>
  </div>

</div>
<!-- end: Main Menu -->

<!-- start: Content -->
<div class="main">

  <div class="row">
    <div class="col-lg-12">
      <h3 class="page-header"><i class="fa fa-laptop"></i> 仓库总体信息</h3>
      <ol class="breadcrumb">
        <li><i class="fa fa-home"></i><a href="index.jsp">首页</a></li>
        <li><i class="fa fa-laptop"></i>总体信息</li>
      </ol>
    </div>
  </div>

  <div class="row">

    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
      <div class="info-box red-bg">
        <i class="fa fa-thumbs-o-up"></i>
        <div class="count">356K</div>
        <div class="title">最佳员工</div>
      </div><!--/.info-box-->
    </div><!--/.col-->

    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
      <div class="info-box green-bg">
        <i class="fa fa-cubes"></i>
        <div class="count">425K</div>
        <div class="title">库存总量</div>
      </div><!--/.info-box-->
    </div><!--/.col-->

    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
      <div class="info-box blue-bg">
        <i class="fa fa-cloud-download"></i>
        <div class="count">325K</div>
        <div class="title">订单总量</div>
      </div><!--/.info-box-->
    </div><!--/.col-->

    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
      <div class="info-box magenta-bg">
        <i class="fa fa-shopping-cart"></i>
        <div class="count">259K</div>
        <div class="title">运输量</div>
      </div><!--/.info-box-->
    </div><!--/.col-->

  </div><!--/.row-->

  <div class="row profile" >

    <div class="col-md-5">

      <div class="panel panel-default">
        <div class="panel-body">
          <div class="text-center">
            <h3>最佳员工</h3>
          </div>

          <h3 class="text-center"><strong>Jhon Smith</strong></h3>
          <h4 class="text-center"><small><i class="fa fa-map-marker"></i> 辽宁, 锦州</small></h4>
          <hr>
          <div class="row text-center">
            <div class="col-xs-4">
              <div><strong>1.256</strong></div>
              <div><small>职位</small></div>
            </div><!--/.col-->
            <div class="col-xs-4">
              <div><strong>2.568</strong></div>
              <div><small>性别</small></div>
            </div><!--/.col-->
            <div class="col-xs-4">
              <div><strong>25.265</strong></div>
              <div><small>所属仓库</small></div>
            </div><!--/.col-->
          </div><!--/.row-->
        </div>

      </div>

    </div><!--/.col-->
    <div class="col-md-7">

      <div class="panel panel-default">
        <div class="panel-body">
          <div class="text-center">
            <h3>优秀仓库</h3>
          </div>

          <h3 class="text-center"><strong>A1</strong></h3>
          <h4 class="text-center"><small><i class="fa fa-map-marker"></i> 辽宁, 锦州</small></h4>
          <hr>
          <div class="row text-center">
            <div class="col-xs-4">
              <div><strong>1.256</strong></div>
              <div><small>出货量</small></div>
            </div><!--/.col-->
            <div class="col-xs-4">
              <div><strong>2.568</strong></div>
              <div><small>负责人</small></div>
            </div><!--/.col-->
            <div class="col-xs-4">
              <div><strong>25.265</strong></div>
              <div><small>货物类型</small></div>
            </div><!--/.col-->
          </div><!--/.row-->
        </div>

      </div>

    </div><!--/.col-->
  </div>

  <div class="row">
    <div class="col-lg-12">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h2><i class="fa fa-table red"></i><span class="break"></span><strong>分区信息</strong></h2>
          <div class="panel-actions">
            <a href="table.html#" class="btn-setting"><i class="fa fa-rotate-right"></i></a>
            <a href="table.html#" class="btn-minimize"><i class="fa fa-chevron-up"></i></a>
            <a href="table.html#" class="btn-close"><i class="fa fa-times"></i></a>
          </div>
        </div>
        <div class="panel-body">
          <table class="table table-striped table-bordered bootstrap-datatable datatable">
            <thead>
            <tr>
              <th>分区编号</th>
              <th>分区位置</th>
              <th>负责人</th>
              <th>货物类型</th>
              <th>货物数量</th>
            </tr>
            </thead>
            <tbody>
            <tr>
              <td>A31</td>
              <td>第三库一区</td>
              <td>王二麻子</td>
              <td>电子产品</td>
              <td>2000</td>
            </tr>
            </tbody>
          </table>
        </div>
      </div>
    </div><!--/col-->

  </div><!--/row-->
</div>
<!-- end: Content -->

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
