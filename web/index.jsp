<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/6/11
  Time: 下午1:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
<s:include value="pages/header.jsp"></s:include>
<!-- end: Header -->

<!-- start: Main Menu -->
<s:if test="#session.loginUser.role == 0">
  <s:include value="pages/menu.jsp"/>
</s:if>
<s:else>
  <s:include value="pages/menu.jsp"/>
</s:else>

<!-- end: Main Menu -->

<!-- start: Content -->
<div class="main">

  <div class="row">
    <div class="col-lg-12">
      <h3 class="page-header"><i class="fa fa-laptop"></i> 仓库总体信息</h3>
      <ol class="breadcrumb">
        <li><i class="fa fa-home"></i>首页</li>
        <li><i class="fa fa-laptop"></i>总体信息</li>
      </ol>
    </div>
  </div>

  <div class="row">

    <div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
      <div class="info-box red-bg">
        <i class="fa fa-thumbs-o-up"></i>
        <div class="count">root</div>
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

          <h3 class="text-center"><strong>root</strong></h3>
          <h4 class="text-center"><small><i class="fa fa-map-marker"></i> 辽宁, 锦州</small></h4>
          <hr>
          <div class="row text-center">
            <div class="col-xs-4">
              <div><strong>仓库管理员</strong></div>
              <div><small>职位</small></div>
            </div><!--/.col-->
            <div class="col-xs-4">
              <div><strong>男</strong></div>
              <div><small>性别</small></div>
            </div><!--/.col-->
            <div class="col-xs-4">
              <div><strong>第一仓库</strong></div>
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

          <h3 class="text-center"><strong>第一仓库</strong></h3>
          <h4 class="text-center"><small><i class="fa fa-map-marker"></i> 辽宁, 抚顺</small></h4>
          <hr>
          <div class="row text-center">
            <div class="col-xs-4">
              <div><strong>1.256</strong></div>
              <div><small>出货量</small></div>
            </div><!--/.col-->
            <div class="col-xs-4">
              <div><strong>root</strong></div>
              <div><small>负责人</small></div>
            </div><!--/.col-->
            <div class="col-xs-4">
              <div><strong>食品</strong></div>
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
              <th>仓库编号</th>
              <th>仓库位置</th>
              <th>负责人</th>
              <th>货物类型</th>
              <th>货物数量</th>
            </tr>
            </thead>
            <tbody>
            <tr>
              <td>1</td>
              <td>辽宁省/抚顺市/望花区</td>
              <td>root</td>
              <td>食品</td>
              <td>20</td>
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
