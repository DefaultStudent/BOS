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
                        <li><a href="findAllStorage.action"><i class="fa fa-hdd-o"></i><span class="text"> 仓库信息概览</span></a></li>
                        <li><a href="/pages/storage/storageadd.jsp"><i class="fa fa-car"></i><span class="text"> 仓库信息添加</span></a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-truck"></i><span class="text"> 进货管理</span> <span class="fa fa-angle-down pull-right"></span></a>
                    <ul class="nav sub">
                        <li><a href="findAllInstorage.action"><i class="fa fa-list"></i><span class="text"> 进货信息概览</span></a></li>
                        <li><a href="findAllSupplier_Ins.action"><i class="fa fa-ambulance"></i><span class="text"> 进货信息添加</span></a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-file-text"></i><span class="text"> 出货管理</span> <span class="fa fa-angle-down pull-right"></span></a>
                    <ul class="nav sub">
                        <li><a href="findAllStorage.action"><i class="fa fa-hdd-o"></i><span class="text"> 出库信息概览</span></a></li>
                        <li><a href="findAllSupplier_Ons.action"><i class="fa fa-car"></i><span class="text"> 出库信息添加</span></a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-signal"></i><span class="text"> 员工管理</span> <span class="fa fa-angle-down pull-right"></span></a>
                    <ul class="nav sub">
                        <li>
                            <a href="findAllUser.action">
                            <i class="fa fa-male"></i>
                            <span class="text"> 员工信息概览</span></a>
                        </li>
                        <li><a href="/pages/staff/useradd.jsp">
                            <i class="fa fa-plus-square"></i>
                            <span class="text"> 员工信息添加</span></a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-briefcase"></i><span class="text"> 供应商管理</span> <span class="fa fa-angle-down pull-right"></span></a>
                    <ul class="nav sub">
                        <li><a href="findAllSupplier.action"><i class="fa fa-th-list"></i><span class="text"> 供应商信息概览</span></a></li>
                        <li><a href="/pages/supplier/supplieradd.jsp"><i class="fa fa-plus-circle"></i><span class="text"> 供应商信息添加</span></a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-list-alt"></i><span class="text"> 商品管理</span> <span class="fa fa-angle-down pull-right"></span></a>
                    <ul class="nav sub">
                        <li>
                            <a href="findAllMaterial.action">
                                <i class="fa fa-align-left"></i>
                                <span class="text"> 全部商品信息</span>
                            </a>
                        </li>
                        <li>
                            <a href="findSupplier.action">
                                <i class="fa fa-align-left"></i>
                                <span class="text"> 商品信息添加</span>
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
