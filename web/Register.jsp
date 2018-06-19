<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/6/12
  Time: 下午5:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>欢迎注册</title>

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
    <style>
        footer {
            display: none;
        }
    </style>

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="container-fluid content">
    <div class="row">
        <div id="content" class="col-sm-12 full">
            <div class="row">

                <div class="login-box">

                    <div class="header">
                        添加新的管理员账号
                    </div>

                    <%--<script type="text/javascript">--%>
                        <%--function validateForm() {--%>
                            <%--var pwd = document.getElementById("password").valueOf();--%>
                            <%--var repwd = document.getElementById("repwd").valueOf();--%>
                            <%--if (pwd == repwd) {--%>
                                <%--return true;--%>
                            <%--} else {--%>
                                <%--alert("两次密码输入不相同");--%>
                                <%--return false;--%>
                            <%--}--%>
                        <%--}--%>
                    <%--</script>--%>
                    <form class="form-horizontal register" method="post" action="register.action">

                        <fieldset class="col-sm-12">
                            <div class="form-group">
                                <div class="controls row">
                                    <div class="input-group col-sm-12">
                                        <input type="text" class="form-control" required="required" placeholder="用户账号" name="username" id="id"/>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="controls row">
                                    <div class="input-group col-sm-12">
                                        <input type="password" class="form-control" required="required" placeholder="密码" name="password" id="password"/>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="controls row">
                                    <div class="input-group col-sm-12">
                                        <input type="password" class="form-control" required="required" placeholder="重复密码" name="repwd" id="repwd"/>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="controls row">
                                    <div class="input-group col-sm-12">
                                        <input type="text" class="form-control" placeholder="联系电话" name="phone" id="phone"/>
                                    </div>
                                </div>
                            </div>

                            <div class="confirm">
                                <input type="checkbox" name="agree"/>
                                <label>我同意 <a href="page-register.html#">用户守则</a></label>
                            </div>


                            <div class="row">

                                <button type="submit" class="btn btn-primary btn-lg col-xs-12">创建账户!</button>

                            </div>


                        </fieldset>

                    </form>

                    <div class="text-center">
                        <li></li>
                        <li></li>
                        <li></li>
                    </div>

                </div>
            </div><!--/row-->

        </div>

    </div><!--/row-->

</div><!--/container-->


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

<!-- theme scripts -->
<script src="assets/js/SmoothScroll.js"></script>
<script src="assets/js/jquery.mmenu.min.js"></script>
<script src="assets/js/core.min.js"></script>

<!-- end: JavaScript-->

</body>
</html>
