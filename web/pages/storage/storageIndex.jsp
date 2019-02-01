<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/6/20
  Time: 下午3:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>仓库信息概览</title>
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
    <script language="javascript">
        function delcfm() {
            if (!confirm("确认要删除？")) {
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

        <!-- start: Content -->
        <div class="main sidebar-minified">
            <div class="row">
                <div class="col-lg-12">
                    <h3 class="page-header"><i class="fa fa-table"></i>仓库管理</h3>
                    <ol class="breadcrumb">
                        <li><a href="/index.jsp"><i class="fa fa-home"></i>首页</a></li>
                        <li><i class="fa fa-table"></i>仓库管理</li>
                    </ol>
                </div>

                <div class="col-lg-12">
                    <div class="panel panel-default">

                        <div class="panel-body">
                            <table class="table table-hover">
                                <thead>
                                <tr>
                                    <th>
                                        仓库编号
                                    </th>
                                    <th>仓库名称</th>
                                    <th>仓库地址</th>
                                    <th>备注</th>
                                    <th>已用空间</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                <s:iterator var="storage" value="#session.storage">
                                <tr>
                                    <td>
                                        <s:property value="#storage.id"/>
                                    </td>
                                    <td><s:property value="#storage.name"/></td>
                                    <td><s:property value="#storage.address"/></td>
                                    <td><s:property value="#storage.remark"/></td>
                                    <td>
                                        <div class="progress">
                                            <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="<s:property value="#storage.materialnum"/>" aria-valuemin="0" aria-valuemax="100" style="width: <s:property value="#storage.materialnum"/>%;">
                                                <s:property value="#storage.materialnum"/>
                                            </div>
                                        </div>
                                    </td>
                                    <td>
                                        <s:if test="#session.loginUser.role == 0">
                                            <s:a class="btn btn-info" href="findDetailById?id=%{#storage.id}">
                                                <i class="fa fa-edit "></i>
                                            </s:a>
                                            <s:a class="btn btn-danger" href="deleteStorage?id=%{#storage.id}" onclick="delcfm()">
                                                <i class="fa fa-trash-o "></i>
                                            </s:a>
                                        </s:if>
                                        <s:else>
                                            <s:a class="btn btn-info" href="findDetailById?id=%{#storage.id}">
                                                <i class="fa fa-edit "></i>
                                            </s:a>
                                        </s:else>
                                    </td>
                                </tr>
                                </s:iterator>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div><!--/col-->

            </div><!--/row-->
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
