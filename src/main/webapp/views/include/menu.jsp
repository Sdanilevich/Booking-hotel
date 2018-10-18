<%@ page contentType="text/html;charset=UTF-8"
         language="java" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<div class="wrap">
    <div class="left">
        <a href="index">Main</a>
        <a href="newSearch">Search</a>
    </div>
    <div class="right">
        <a style = "color:#800000" href="do?command=userOrder&UserId=${user.id}">${user.name}</a>
        <a  href="?lang=ru">RU</a>
        <a  href="?lang=en">ENG</a>
        <a  href="login">Login</a>
        <a  href="signup">SignUp</a>
    </div>
</div>
