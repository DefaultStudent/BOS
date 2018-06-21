<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/6/20
  Time: 上午10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>编辑员工</title>
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
                        <li><i class="fa fa-list-alt"></i><a href="findAllUser.action">员工管理</a></li>
                        <li><i class="fa fa-indent"></i>员工信息修改</li>
                    </ol>
                </div>
            </div>
            <div class="col-lg-12">
                <div class="row">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <form action="updateStaff.action" method="post" enctype="multipart/form-data" class="form-horizontal ">
                                <input type="hidden" name="id" value="<s:property value="%{#session.staff.id}"/>">
                                <input type="hidden" value="123" name="password">
                                <div class="form-group">
                                    <label class="col-md-3 control-label">员工姓名</label>
                                    <div class="col-md-9">
                                        <input name="username" type="text" value="<s:property value="%{#session.staff.username}"/>" class="form-control" required="required">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label">性别</label>
                                    <div class="col-md-9">
                                        <s:if test='#session.staff.gender=="男"'>
                                            <label class="checkbox-inline">
                                                <input type="radio" name="gender" value="男" checked="checked"> 男
                                            </label>
                                            <label class="checkbox-inline">
                                                <input type="radio" name="gender" value="女"> 女
                                            </label>
                                        </s:if>
                                        <s:else>
                                            <label class="checkbox-inline">
                                                <input type="radio" name="gender" value="男"> 男
                                            </label>
                                            <label class="checkbox-inline">
                                                <input type="radio" name="gender" value="女" checked="checked"> 女
                                            </label>
                                        </s:else>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label">出生日期</label>
                                    <div class="col-md-9">
                                        <input type="date" name="birth" value="<s:property value="%{#session.staff.birth}"/>">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label">员工职位</label>
                                    <div class="col-md-9">
                                        <select name="role" class="form-control" size="1">
                                            <s:if test="#session.staff.role==0">
                                                <option value="0" selected="selected">系统管理员</option>
                                                <option value="1">仓库管理员</option>
                                                <option value="2">普通员工</option>
                                            </s:if>
                                            <s:elseif test="#session.staff.role==1">
                                                <option value="0">系统管理员</option>
                                                <option value="1" selected="selected">仓库管理员</option>
                                                <option value="2">普通员工</option>
                                            </s:elseif>
                                            <s:else>
                                                <option value="0">系统管理员</option>
                                                <option value="1">仓库管理员</option>
                                                <option value="2" selected="selected">普通员工</option>
                                            </s:else>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label">家庭住址</label>
                                    <div class="col-md-9">
                                        <div id="distpicker">
                                            <div class="form-group">
                                                <div style="position: relative;">
                                                    <input id="city-picker3" name="address" class="form-control" readonly type="text" data-toggle="city-picker" value="<s:property value="#session.staff.address"/>">
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label" for="disabled-input">联系电话</label>
                                    <div class="col-md-9">
                                        <input type="tel" id="disabled-input" name="phone" value="<s:property value="%{#session.staff.phone}"/>" class="form-control" placeholder="联系电话" required="required">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label class="col-md-3 control-label" for="textarea-input">备注</label>
                                    <div class="col-md-9">
                                        <textarea id="textarea-input" name="remark" rows="9" class="form-control" placeholder="备注..."><s:property value="%{#session.staff.remark}"/></textarea>
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
