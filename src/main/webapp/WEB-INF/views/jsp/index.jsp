<%--
  Created by IntelliJ IDEA.
  User: Yevhen
  Date: 05.08.2016
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>${restaurantName}</title>
<style type="text/css">
    * {font-family: Arial, Helvetica, sans-serif}
    .nav_menu {padding: 0; width: 762px; margin: 0 auto}
    .nav_menu ul {list-style: none; margin: 0; padding: 0}
    .nav_menu li {display: inline}
    .nav_menu a {
        float: left;
        width: 125px;
        height: 30px;
        background-color: #cc0033;
        border-left: 2px solid #ffffff;
        text-decoration: none;
        text-align: center;
        padding: 0;
        padding-top: 10px;
        font-size: 18px;
        color: #ffffff
    }
    .nav_menu a:hover {background-color: #990033; color: Tomato}
</style>
</head>
<body>
<div class="nav_menu">
    <ul>
        <li><a href="#">Sony</a></li>
        <li><a href="#">Asus</a></li>
        <li><a href="#">Dell</a></li>
        <li><a href="#">Toshiba</a></li>
        <li><a href="#">Acer</a></li>
        <li><a href="#">Lenovo</a></li>
    </ul>
</div>
</body>
</html>
