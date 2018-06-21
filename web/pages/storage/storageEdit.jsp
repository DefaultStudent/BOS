<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/6/20
  Time: 下午9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>编辑仓库信息</title>
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
    <script language="javascript">
        function crmedit() {
            if (!confirm("确认要修改？")) {
                window.event.returnValue = false;
            }
        }
    </script>
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
        <div class="main ">
            <div class="row">
                <div class="col-lg-12">
                    <h3 class="page-header"><i class="fa fa-indent"></i>修改员工信息</h3>
                    <ol class="breadcrumb">
                        <li><i class="fa fa-home"></i><a href="/index.jsp">首页</a></li>
                        <li><i class="fa fa-list-alt"></i><a href="findAllStorage.action">仓库管理</a></li>
                        <li><i class="fa fa-indent"></i>仓库信息修改</li>
                    </ol>
                </div>
            </div>
                <div class="col-lg-12">
                    <div class="row">
                        <div class="panel panel-default">
                            <div class="panel-body">
                                <form action="updateStorage.action" method="post" enctype="multipart/form-data" class="form-horizontal ">
                                    <input type="hidden" name="id" value="<s:property value="%{#session.storageById.id}"/>">
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">仓库名称</label>
                                        <div class="col-md-9">
                                            <input name="name" class="form-control" value="<s:property value="%{#session.storageById.name}"/>" required="required">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">仓库地址</label>
                                        <div class="col-md-9">
                                            <div id="distpicker">
                                                <div class="form-group">
                                                    <div style="position: relative;">
                                                        <input id="city-picker3" name="address" class="form-control" value="<s:property value="%{#session.storageById.address}"/>" readonly type="text" data-toggle="city-picker">
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 control-label">货物数量</label>
                                        <div class="col-md-9">
                                            <select name="materialnum" class="form-control" size="1">
                                                <s:if test='#session.storageById.materialnum=="10" '>
                                                    <option value="10" selected="selected">10件</option>
                                                    <option value="20">20件</option>
                                                    <option value="30">30件</option>
                                                    <option value="40">40件</option>
                                                    <option value="50">50件</option>
                                                    <option value="60">60件</option>
                                                    <option value="70">70件</option>
                                                    <option value="80">80件</option>
                                                    <option value="90">90件</option>
                                                    <option value="100">100件</option>
                                                </s:if>
                                                <s:elseif test='#session.storageById.materialnum=="20" '>
                                                    <option value="10">10件</option>
                                                    <option value="20" selected="selected">20件</option>
                                                    <option value="30">30件</option>
                                                    <option value="40">40件</option>
                                                    <option value="50">50件</option>
                                                    <option value="60">60件</option>
                                                    <option value="70">70件</option>
                                                    <option value="80">80件</option>
                                                    <option value="90">90件</option>
                                                    <option value="100">100件</option>
                                                </s:elseif>
                                                <s:elseif test='#session.storageById.materialnum=="30" '>
                                                    <option value="10">10件</option>
                                                    <option value="20">20件</option>
                                                    <option value="30" selected="selected">30件</option>
                                                    <option value="40">40件</option>
                                                    <option value="50">50件</option>
                                                    <option value="60">60件</option>
                                                    <option value="70">70件</option>
                                                    <option value="80">80件</option>
                                                    <option value="90">90件</option>
                                                    <option value="100">100件</option>
                                                </s:elseif>
                                                <s:elseif test='#session.storageById.materialnum=="40" '>
                                                    <option value="10">10件</option>
                                                    <option value="20">20件</option>
                                                    <option value="30">30件</option>
                                                    <option value="40" selected="selected">40件</option>
                                                    <option value="50">50件</option>
                                                    <option value="60">60件</option>
                                                    <option value="70">70件</option>
                                                    <option value="80">80件</option>
                                                    <option value="90">90件</option>
                                                    <option value="100">100件</option>
                                                </s:elseif>
                                                <s:elseif test='#session.storageById.materialnum=="50" '>
                                                    <option value="10">10件</option>
                                                    <option value="20">20件</option>
                                                    <option value="30">30件</option>
                                                    <option value="40">40件</option>
                                                    <option value="50" selected="selected">50件</option>
                                                    <option value="60">60件</option>
                                                    <option value="70">70件</option>
                                                    <option value="80">80件</option>
                                                    <option value="90">90件</option>
                                                    <option value="100">100件</option>
                                                </s:elseif>
                                                <s:elseif test='#session.storageById.materialnum=="60" '>
                                                    <option value="10">10件</option>
                                                    <option value="20">20件</option>
                                                    <option value="30">30件</option>
                                                    <option value="40">40件</option>
                                                    <option value="50">50件</option>
                                                    <option value="60" selected="selected">60件</option>
                                                    <option value="70">70件</option>
                                                    <option value="80">80件</option>
                                                    <option value="90">90件</option>
                                                    <option value="100">100件</option>
                                                </s:elseif>
                                                <s:elseif test='#session.storageById.materialnum=="70" '>
                                                    <option value="10">10件</option>
                                                    <option value="20">20件</option>
                                                    <option value="30">30件</option>
                                                    <option value="40">40件</option>
                                                    <option value="50">50件</option>
                                                    <option value="60">60件</option>
                                                    <option value="70" selected="selected">70件</option>
                                                    <option value="80">80件</option>
                                                    <option value="90">90件</option>
                                                    <option value="100">100件</option>
                                                </s:elseif>
                                                <s:elseif test='#session.storageById.materialnum=="80" '>
                                                    <option value="10">10件</option>
                                                    <option value="20">20件</option>
                                                    <option value="30">30件</option>
                                                    <option value="40">40件</option>
                                                    <option value="50">50件</option>
                                                    <option value="60">60件</option>
                                                    <option value="70">70件</option>
                                                    <option value="80" selected="selected">80件</option>
                                                    <option value="90">90件</option>
                                                    <option value="100">100件</option>
                                                </s:elseif>
                                                <s:elseif test='#session.storageById.materialnum=="90" '>
                                                    <option value="10">10件</option>
                                                    <option value="20">20件</option>
                                                    <option value="30">30件</option>
                                                    <option value="40">40件</option>
                                                    <option value="50">50件</option>
                                                    <option value="60">60件</option>
                                                    <option value="70">70件</option>
                                                    <option value="80">80件</option>
                                                    <option value="90" selected="selected">90件</option>
                                                    <option value="100">100件</option>
                                                </s:elseif>
                                                <s:else>
                                                    <option value="10">10件</option>
                                                    <option value="20">20件</option>
                                                    <option value="30">30件</option>
                                                    <option value="40">40件</option>
                                                    <option value="50">50件</option>
                                                    <option value="60">60件</option>
                                                    <option value="70">70件</option>
                                                    <option value="80">80件</option>
                                                    <option value="90">90件</option>
                                                    <option value="100" selected="selected">100件</option>
                                                </s:else>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-md-3 control-label" for="textarea-input">备注</label>
                                        <div class="col-md-9">
                                            <textarea id="textarea-input" name="remark" rows="9" class="form-control" placeholder="备注..."><s:property value="%{#session.storageById.remark}"/></textarea>
                                        </div>
                                    </div>
                                    <button type="submit" class="btn btn-sm btn-success" onclick="crmedit()"><i class="fa fa-dot-circle-o"></i> 修改</button>
                                    <button type="reset" class="btn btn-sm btn-danger"><i class="fa fa-ban"></i> 重置</button>
                                </form>
                            </div>

                        </div>
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
