<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/6/19
  Time: 上午10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <link rel='stylesheet' type='text/css' href='http://fonts.useso.com/css?family=Open+Sans:400,700|Droid+Sans:400,700' />
    <!-- Favicon and touch icons -->
    <link rel="shortcut icon" href="../assets/ico/favicon.ico" type="image/x-icon" />
    <link href="../assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="../assets/css/jquery.mmenu.css" rel="stylesheet">
    <link href="../assets/css/font-awesome.min.css" rel="stylesheet">
    <link href="../assets/plugins/jquery-ui/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
    <link href="../assets/css/style.min.css" rel="stylesheet">
    <link href="../assets/css/add-ons.min.css" rel="stylesheet">
</head>
<body>
<div class="navbar" role="navigation">
    <div class="container-fluid">
        <form class="navbar-form navbar-left">
            <button type="submit" class="fa fa-search"></button>
            <input type="text" class="form-control" placeholder="搜点什么..."></a>
        </form>
        <ul class="nav navbar-nav navbar-right">
            <li class="dropdown visible-md visible-lg">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">欢迎：<s:property value="#session.loginUser.username"/></a>
                <ul class="dropdown-menu">
                    <li class="dropdown-menu-header">
                        <strong>个人账户</strong>
                    </li>
                    <li><a href="/profile.action"><i class="fa fa-user"></i> 查看个人信息</a></li>
                    <li><a href="/logout.action"><i class="fa fa-sign-out"></i> 登出</a></li>
                </ul>
            </li>
            <li><a href="/logout.action"><i class="fa fa-power-off"></i></a></li>
        </ul>

    </div>

</div>


</body>
</html>
