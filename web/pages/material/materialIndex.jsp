<%@ page import="java.util.List" %>
<%@ page import="com.bos.domain.MaterialAndSupplier" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/6/22
  Time: 上午10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>商品管理</title>

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
                    <h3 class="page-header"><i class="fa fa-table"></i>商品管理</h3>
                    <ol class="breadcrumb">
                        <li><a href="/index.jsp"><i class="fa fa-home"></i>首页</a></li>
                        <li><i class="fa fa-table"></i>商品管理管理</li>
                    </ol>
                </div>
            </div>

            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h2><i class="fa fa-table red"></i><span class="break"></span><strong>商品信息列表</strong></h2>
                        <div class="panel-actions">
                        </div>
                    </div>
                    <div class="panel-body">
                        <table class="table table-bordered">
                            <thead>
                            <tr>
                                <th>商品编号</th>
                                <th>商品名称</th>
                                <th>商品类型</th>
                                <th>存储仓库</th>
                                <th>供应商</th>
                                <th>数量</th>
                                <th>备注</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>

                            <s:iterator var="ma" value="#session.ma">
                                <tr>
                                    <td><s:property value="#ma.materialId"/></td>
                                    <td><s:property value="#ma.materialName"/> </td>
                                    <td><s:property value="#ma.materialType"/> </td>
                                    <td><s:property value="#ma.storageName"/></td>
                                    <td><s:property value="#ma.supplierName"/></td>
                                    <td><s:property value="#ma.number"/></td>
                                    <td><s:property value="#ma.remark"/></td>
                                    <td>
                                        <s:a class="btn btn-info" href="findMaterialById?id=%{#ma.materialId}">
                                            <i class="fa fa-edit "></i>
                                        </s:a>
                                        <s:a class="btn btn-danger" href="deleteMaterial.action?id=%{#ma.materialId}&number=%{#ma.number}&sotrageid=%{#ma.storageid}&outsotrageid=%{#ma.outstorageId}&date=%{#ma.date}&remark=%{#ma.remark}" onclick="delcfm()">
                                            <i class="fa fa-trash-o "></i>
                                        </s:a>
                                    </td>
                                </tr>
                            </s:iterator>
                            </tbody>
                        </table>
                        <ul class="pagination">
                            <li><a href="table.html#">Prev</a></li>
                            <li class="active">
                                <a href="table.html#">1</a>
                            </li>
                            <li><a href="table.html#">2</a></li>
                            <li><a href="table.html#">3</a></li>
                            <li><a href="table.html#">4</a></li>
                            <li><a href="table.html#">5</a></li>
                            <li><a href="table.html#">Next</a></li>
                        </ul>
                    </div>
                </div>
            </div><!--/col-->

        </div><!--/row-->

        <!-- end: Content -->
        <br><br><br>


    </div><!--/container-->


    <div class="modal fade" id="myModal">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title">Modal title</h4>
                </div>
                <div class="modal-body">
                    <p>Here settings can be configured...</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary">Save changes</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->

    <div class="clearfix"></div>
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
