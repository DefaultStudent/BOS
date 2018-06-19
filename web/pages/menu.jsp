<%--
  Created by IntelliJ IDEA.
  User: vodka
  Date: 2018/6/19
  Time: 上午10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<div class="sidebar ">

    <div class="sidebar-collapse">
        <div class="sidebar-header t-center">
            <span><img class="text-logo" src="/assets/img/logo1.png"><i class="fa fa-space-shuttle fa-3x blue"></i></span>
        </div>
        <div class="sidebar-menu">
            <ul class="nav nav-sidebar">
                <li><i class="fa fa-laptop"></i><span class="text"> 首页</span></li>
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
                        <li>
                            <a href="findAllUser.action">
                            <i class="fa fa-random"></i>
                            <span class="text"> 员工信息概览</span></a>
                        </li>
                        <li><a href="/pages/user/useradd.jsp">
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

        <div class="sidebar-brand">
        </div>

        <ul class="sidebar-terms">
        </ul>
    </div>

</div>

</body>
</html>