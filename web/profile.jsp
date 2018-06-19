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
    <title>个人信息</title>
    <link rel='stylesheet' type='text/css' href='http://fonts.useso.com/css?family=Open+Sans:400,700|Droid+Sans:400,700' />
    <!-- Favicon and touch icons -->
    <link rel="shortcut icon" href="assets/ico/favicon.ico" type="image/x-icon" />
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/css/jquery.mmenu.css" rel="stylesheet">
    <link href="assets/css/font-awesome.min.css" rel="stylesheet">
    <link href="assets/plugins/jquery-ui/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
    <link href="assets/css/style.min.css" rel="stylesheet">
    <link href="assets/css/add-ons.min.css" rel="stylesheet">
    <link href="http://hovertree.com/texiao/bootstrap/4/css/city-picker.css" rel="stylesheet" type="text/css" />
    <script src="http://hovertree.com/ziyuan/jquery/jquery-1.12.1.min.js"></script>
    <script src="http://hovertree.com/ziyuan/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://hovertree.com/texiao/bootstrap/4/js/city-picker.data.js"></script>
    <script src="http://hovertree.com/texiao/bootstrap/4/js/city-picker.js"></script>
    <script src="http://hovertree.com/texiao/bootstrap/4/js/main.js"></script>
</head>
<body>
<!-- start: Header -->
<s:include value="pages/header.jsp"/>
<!-- end: Header -->

<!-- start: Main Menu -->
<s:include value="pages/menu.jsp"/>
<!-- end: Main Menu -->

<!-- start: Content -->
<div class="main">
    <div class="row">
        <div class="col-lg-12">
            <h3 class="page-header"><i class="fa fa-heart-o"></i>个人信息</h3>
            <ol class="breadcrumb">
                <li><a href="index.jsp"><i class="fa fa-home"></i>首页</a></li>
                <li><i class="fa fa-heart-o"></i>查看个人信息</li>
            </ol>
        </div>
    </div>

    <div class="row profile">

        <div class="col-md-5">

            <div class="panel panel-default">
                <div class="panel-body">
                    <h3 class="text-center"><strong><s:property value="#session.profile.username"/></strong></h3>
                    <h4 class="text-center"><small><i class="fa fa-map-marker"></i>&nbsp;&nbsp;<s:property value="#session.profile.address"/></small></h4>
                    <hr>
                    <div class="row text-center">
                        <div class="col-xs-4">
                            <div><strong>
                                <s:if test="#session.profile.role==0">
                                    系统管理员
                                </s:if>
                                <s:elseif test="#session.profile.role==1">
                                    仓库管理员
                                </s:elseif>
                                <s:else>
                                    普通员工
                                </s:else>
                            </strong></div>
                            <div><small>职位</small></div>
                        </div><!--/.col-->
                        <div class="col-xs-4">
                            <div><strong><s:property value="#session.profile.gender"/></strong></div>
                            <div><small>性别</small></div>
                        </div><!--/.col-->
                        <div class="col-xs-4">
                            <div><strong><s:property value="#session.profile.birth"/></strong></div>
                            <div><small>生日</small></div>
                        </div><!--/.col-->
                    </div><!--/.row-->

                    <hr>

                    <h4><strong>联系方式</strong></h4>

                    <ul class="profile-details">
                        <li>
                            <div><i class="fa fa-phone"></i>联系电话</div>
                            <s:property value="#session.profile.phone"/>
                        </li>
                        <li>
                            <div><i class="fa fa-tablet"></i>通信住址</div>
                            <s:property value="#session.profile.address"/>
                        </li>
                        </li>
                    </ul>

                </div>

            </div>

        </div><!--/.col-->

        <div class="col-md-7">

            <div class="panel panel-default">
                <div class="panel-heading">
                    <h2><i class="fa fa-heart-o red"></i><strong>更新信息</strong></h2>
                </div>
                <div class="panel-body">
                    <form class="form-vertical hover-stripped" role="form" method="post" action="updateUser.action">
                        <input name="id" type="hidden" value="<s:property value="%{#session.profile.id}"/>">
                        <input name="password" value="<s:property value="%{#session.profile.password}"/>" type="hidden" class="form-control"/>
                        <div class="form-group">
                            <label class="control-label">姓名</label><br>
                            <input name="username" value="<s:property value="%{#session.profile.username}"/>" required="required" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label class="control-label">性别</label><br>
                            <input name="gender" type="radio" value="男" checked="checked"/>&nbsp;&nbsp;男 &nbsp;&nbsp;
                            <input name="gender" type="radio" value="女"/>&nbsp;&nbsp;女
                        </div>
                        <div class="form-group">
                            <label class="control-label">出生日期</label><br>
                            <input type="date" name="birth" value="<s:property value="%{#session.profile.birth}"/>"/>
                        </div>
                        <div class="form-group">
                            <label class="control-label">职位</label><br>
                            <s:if test="#session.profile.role==0">
                                <input name="role" value="<s:property value="%{#session.profile.role}"/>" type="hidden" class="form-control"/>
                                <input name="role" value="系统管理员" disabled="disabled" class="form-control"/>
                            </s:if>
                            <s:elseif test="#session.profile.role==1">
                                <input name="role" value="<s:property value="%{#session.profile.role}"/>" type="hidden" class="form-control"/>
                                <input name="role" value="仓库管理员" disabled="disabled" class="form-control"/>
                            </s:elseif>
                            <s:else>
                                <input name="role" value="<s:property value="%{#session.profile.role}"/>" type="hidden" class="form-control"/>
                                <input name="role" value="普通员工" disabled="disabled" class="form-control"/>
                            </s:else>
                        </div>
                        <div class="form-group">
                            <label class="control-label">住址</label>
                            <div id="distpicker">
                                <div class="form-group">
                                    <div style="position: relative;">
                                        <input id="city-picker3" name="address" class="form-control" readonly type="text" data-toggle="city-picker">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label">电话</label>
                            <input name="phone" value="<s:property value="%{#session.profile.phone}"/>" required="required" class="form-control">
                        </div>
                        <div class="form-group">
                            <label class="control-label">备注</label>
                            <textarea type="" value="<s:property value="%{#session.profile.remark}"/>" class="form-control" rows="9" placeholder="备注..."></textarea>
                        </div>

                        <div class="form-group pull-right">
                            <button class="btn btn-primary">修改</button>
                        </div>

                    </form>
                </div>
            </div>

        </div><!--/.col-->

    </div><!--/.row profile-->
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