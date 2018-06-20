<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/6/19
  Time: 下午1:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息添加</title>
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
                <h3 class="page-header"><i class="fa fa-indent"></i>员工信息添加</h3>
                <ol class="breadcrumb">
                    <li><i class="fa fa-home"></i><a href="/index.jsp">首页</a></li>
                    <li><i class="fa fa-list-alt"></i><a href="findAllUser.action">员工管理</a></li>
                    <li><i class="fa fa-indent"></i>员工信息添加</li>
                </ol>
            </div>
        </div>
        <div class="col-lg-12">
            <div class="row">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <form action="addStaff.action" method="post" enctype="multipart/form-data" class="form-horizontal ">
                                <input type="hidden" value="123" name="password">
                                <div class="form-group">
                                    <label class="col-md-3 control-label">员工姓名</label>
                                    <div class="col-md-9">
                                        <input name="username" type="text" class="form-control" required="required">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label">性别</label>
                                    <div class="col-md-9">
                                        <label class="checkbox-inline">
                                            <input type="radio" name="gender" value="男" checked="checked"> 男
                                        </label>
                                        <label class="checkbox-inline">
                                            <input type="radio" name="gender" value="女"> 女
                                        </label>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label">出生日期</label>
                                    <div class="col-md-9">
                                        <input type="date" name="birth">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label">员工职位</label>
                                    <div class="col-md-9">
                                        <select name="role" class="form-control" size="1">
                                            <option value="1">仓库管理员</option>
                                            <option value="2">普通员工</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label">家庭住址</label>
                                    <div class="col-md-9">
                                        <div id="distpicker">
                                            <div class="form-group">
                                                <div style="position: relative;">
                                                    <input id="city-picker3" name="address" class="form-control" readonly type="text" data-toggle="city-picker">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label" for="disabled-input">联系电话</label>
                                    <div class="col-md-9">
                                        <input type="tel" id="disabled-input" name="phone" class="form-control" placeholder="联系电话" required="required">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label" for="textarea-input">备注</label>
                                    <div class="col-md-9">
                                        <textarea id="textarea-input" name="remark" rows="9" class="form-control" placeholder="备注..."></textarea>
                                    </div>
                                </div>
                                <button type="submit" class="btn btn-sm btn-success"><i class="fa fa-dot-circle-o"></i> 添加</button>
                                <button type="reset" class="btn btn-sm btn-danger"><i class="fa fa-ban"></i> 重置</button>
                            </form>
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
