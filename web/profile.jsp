<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/6/15
  Time: 上午10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>查看个人信息</title>

    <!-- Import google fonts - Heading first/ text second -->
    <link rel='stylesheet' type='text/css' href='http://fonts.useso.com/css?family=Open+Sans:400,700|Droid+Sans:400,700' />
    <!--[if lt IE 9]>
    <link href="http://fonts.useso.com/css?family=Open+Sans:400" rel="stylesheet" type="text/css" />
    <link href="http://fonts.useso.com/css?family=Open+Sans:700" rel="stylesheet" type="text/css" />
    <link href="http://fonts.useso.com/css?family=Droid+Sans:400" rel="stylesheet" type="text/css" />
    <link href="http://fonts.useso.com/css?family=Droid+Sans:700" rel="stylesheet" type="text/css" />
    <![endif]-->

    <!-- Favicon and touch icons -->
    <link rel="shortcut icon" href="assets/ico/favicon.ico" type="image/x-icon" />

    <!-- Css files -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/css/jquery.mmenu.css" rel="stylesheet">
    <link href="assets/css/font-awesome.min.css" rel="stylesheet">
    <link href="assets/plugins/jquery-ui/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
    <link href="assets/css/style.min.css" rel="stylesheet">
    <link href="assets/css/add-ons.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
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
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">欢迎：<s:property value="#session.profile.username"/></a>
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
<!-- end: Header -->

<div class="container-fluid content">

    <div class="row">

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
                                <li><a href="chart-flot.html">
                                    <i class="fa fa-random"></i>
                                    <span class="text"> 员工信息添加</span></a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-briefcase"></i><span class="text"> 地区管理</span> <span class="fa fa-angle-down pull-right"></span></a>
                            <ul class="nav sub">
                                <li><a href="ui-sliders-progress.html"><i class="fa fa-align-left"></i><span class="text"> 地区信息添加</span></a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-list-alt"></i><span class="text"> 商品管理</span> <span class="fa fa-angle-down pull-right"></span></a>
                            <ul class="nav sub">
                                <li>
                                    <a href="ui-sliders-progress.html">
                                        <i class="fa fa-align-left"></i>
                                        <span class="text"> 商品入库</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="ui-sliders-progress.html">
                                        <i class="fa fa-align-left"></i>
                                        <span class="text"> 商品出库</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="ui-sliders-progress.html">
                                        <i class="fa fa-random"></i>
                                        <span class="text"> 商品移库</span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="sidebar-footer">
                <div class="copyright text-center">
                </div>
            </div>

        </div>
        <!-- end: Main Menu -->

        <!-- start: Content -->
        <div class="main ">

            <div class="row">
                <div class="col-lg-12">
                    <h3 class="page-header"><i class="fa fa-heart-o"></i>个人信息</h3>
                    <ol class="breadcrumb">
                        <li><i class="fa fa-home"></i><a href="index.jsp">首页</a></li>
                        <li><i class="fa fa-heart-o"></i>查看个人信息</li>
                    </ol>
                </div>
            </div>

            <div class="row profile">

                <div class="col-md-5">

                    <div class="panel panel-default">
                        <div class="panel-body">
                            <h3 class="text-center"><strong><s:property value="#session.profile.username"/></strong></h3>
                            <h4 class="text-center"><small><i class="fa fa-map-marker"></i><s:property value="#session.profile.address"/></small></h4>
                            <hr>
                            <div class="row text-center">
                                <div class="col-xs-4">
                                    <div><strong>1.256</strong></div>
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
                                    +25 2569 256
                                </li>
                                <li>
                                    <div><i class="fa fa-tablet"></i>通信住址</div>
                                    +62 2569 2568 256
                                </li>
                                </li>
                            </ul>

                        </div>

                    </div>

                </div><!--/.col-->

                <div class="col-md-7">

                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h2><i class="fa fa-heart-o red"></i><strong>Update info</strong></h2>
                        </div>
                        <div class="panel-body">
                            <form class="form-vertical hover-stripped" role="form">
                                <div class="form-group">
                                    <label class="control-label">姓名</label><br>
                                    <s:textfield name="username" value="%{#session.profile.username}" class="form-control"/>
                                </div>
                                <div class="form-group">
                                    <label class="control-label">密码</label>
                                    <s:textfield name="password" value="%{#session.profile.username}" class="form-control" type="password"/>
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Email</label>
                                    <input type="email" class="form-control" value="jhonsmith@mail.com">
                                </div>
                                <div class="form-group">
                                    <label class="control-label">New password</label>
                                    <input type="password" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label class="control-label">Repeat password</label>
                                    <input type="password" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label class="control-label"></label>
                                    <textarea class="form-control" rows="3"></textarea>
                                </div>

                                <div class="form-group pull-right">
                                    <button class="btn btn-primary">Change</button>
                                </div>

                            </form>
                        </div>
                    </div>

                </div><!--/.col-->

            </div><!--/.row profile-->
        </div>
        <!-- end: Content -->
        <br><br><br>


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
    <script src="http://localhost:8888/bootstrap/originAdmin/assets/js/jquery.easy-pie-chart.min.js"></script>

    <!-- theme scripts -->
    <script src="assets/js/SmoothScroll.js"></script>
    <script src="assets/js/jquery.mmenu.min.js"></script>
    <script src="assets/js/core.min.js"></script>

    <!-- inline scripts related to this page -->
    <script src="assets/js/pages/page-profile.js"></script>

    <!-- end: JavaScript-->

</body>
</html>
