<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/6/21
  Time: 下午2:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>供应商修改</title>
    <!-- Import google fonts - Heading first/ text second -->
    <link rel='stylesheet' type='text/css' href='http://fonts.useso.com/css?family=Open+Sans:400,700|Droid+Sans:400,700' />
    <!--[if lt IE 9]>
    <link href="http://fonts.useso.com/css?family=Open+Sans:400" rel="stylesheet" type="text/css" />
    <link href="http://fonts.useso.com/css?family=Open+Sans:700" rel="stylesheet" type="text/css" />
    <link href="http://fonts.useso.com/css?family=Droid+Sans:400" rel="stylesheet" type="text/css" />
    <link href="http://fonts.useso.com/css?family=Droid+Sans:700" rel="stylesheet" type="text/css" />
    <![endif]-->

    <!-- Favicon and touch icons -->
    <link rel="shortcut icon" href="/assets/ico/favicon.ico" type="image/x-icon" />

    <!-- Css files -->
    <link href="/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href=/"assets/css/jquery.mmenu.css" rel="stylesheet">
    <link href="/assets/css/font-awesome.min.css" rel="stylesheet">
    <link href="/assets/plugins/jquery-ui/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
    <link href="/assets/css/style.min.css" rel="stylesheet">
    <link href="/assets/css/add-ons.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <link href="http://hovertree.com/texiao/bootstrap/4/css/city-picker.css" rel="stylesheet" type="text/css" />
    <script src="http://hovertree.com/ziyuan/jquery/jquery-1.12.1.min.js"></script>
    <script src="http://hovertree.com/ziyuan/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://hovertree.com/texiao/bootstrap/4/js/city-picker.data.js"></script>
    <script src="http://hovertree.com/texiao/bootstrap/4/js/city-picker.js"></script>
    <script src="http://hovertree.com/texiao/bootstrap/4/js/main.js"></script>
</head>
<body>
<!-- start: Header -->
<s:include value="/pages/header.jsp"/>
<!-- end: Header -->
<div class="container-fluid content">

    <div class="row">

        <!-- start: Main Menu -->
        <s:include value="/pages/menu.jsp"/>
        <!-- end: Main Menu -->
    </div>
    <div class="main ">
        <div class="row">
            <div class="col-lg-12">
                <h3 class="page-header"><i class="fa fa-indent"></i>供应商信息添加</h3>
                <ol class="breadcrumb">
                    <li><i class="fa fa-home"></i><a href="/index.jsp">首页</a></li>
                    <li><i class="fa fa-list-alt"></i><a href="findAllSupplier.action">供应商管理</a></li>
                    <li><i class="fa fa-indent"></i>供应商信息修改</li>
                </ol>
            </div>
        </div>
        <div class="col-lg-12">
            <div class="row">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <form action="updateSupplier.action" method="post" enctype="multipart/form-data" class="form-horizontal ">
                            <input type="hidden" name="supplyid" value="<s:property value="%{#session.supplierById.supplyid}"/>">
                            <div class="form-group">
                                <label class="col-md-3 control-label">供应商名称</label>
                                <div class="col-md-9">
                                    <input name="sname" type="text" class="form-control" required="required" value="<s:property value="%{#session.supplierById.sname}"/>">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-3 control-label">联系电话</label>
                                <div class="col-md-9">
                                    <input name="phone" type="tel" class="form-control" required="required" value="<s:property value="%{#session.supplierById.phone}"/>">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-3 control-label">邮箱地址</label>
                                <div class="col-md-9">
                                    <input type="email" name="eMail" class="form-control" required="required" value="<s:property value="%{#session.supplierById.eMail}"/>">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-3 control-label">公司地址</label>
                                <div class="col-md-9">
                                    <div id="distpicker">
                                        <div class="form-group">
                                            <div style="position: relative;">
                                                <input id="city-picker3" name="address" class="form-control" readonly type="text" data-toggle="city-picker" value="<s:property value="%{#session.supplierById.address}"/>">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="col-md-3 control-label" for="disabled-input">邮编</label>
                                <div class="col-md-9">
                                    <input id="disabled-input" name="code" class="form-control" placeholder="邮编" required="required" value="<s:property value="%{#session.supplierById.code}"/>">
                                </div>
                            </div>
                            <button type="submit" class="btn btn-sm btn-success"><i class="fa fa-dot-circle-o"></i> 修改</button>
                            <button type="reset" class="btn btn-sm btn-danger"><i class="fa fa-ban"></i> 重置</button>
                        </form>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
<!-- start: JavaScript-->
<!--[if !IE]>-->

<script src="/assets/js/jquery-2.1.1.min.js"></script>

<!--<![endif]-->

<!--[if IE]>

<script src="/assets/js/jquery-1.11.1.min.js"></script>

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
<script src="/assets/js/jquery-migrate-1.2.1.min.js"></script>
<script src="/assets/js/bootstrap.min.js"></script>


<!-- page scripts -->
<script src="assets/plugins/jquery-ui/js/jquery-ui-1.10.4.min.js"></script>

<!-- theme scripts -->
<script src="/assets/js/SmoothScroll.js"></script>
<script src="/assets/js/jquery.mmenu.min.js"></script>
<script src="/assets/js/core.min.js"></script>

<!-- inline scripts related to this page -->
<script src="/assets/js/pages/table.js"></script>

<!-- end: JavaScript-->
</body>
</html>