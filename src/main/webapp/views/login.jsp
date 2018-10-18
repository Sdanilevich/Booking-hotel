 <%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
 <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<%@ include file="include/head.jsp" %>
<body>
<div>
    <%@ include file="include/menu.jsp" %>
    <form id="form_login" method="post" action="login" style="border: 0px;">
        <fieldset>

            <!-- Form Name -->
            <legend><spring:message code="login.title"/></legend>

            <!-- Text input-->
            <div style="padding-top: 10px">
                <label for="login"><spring:message code="login.name"/></label>
                <div>
                    <input id="login" name="login" value="admin" type="text" placeholder=""
                           required="">
                </div>
            </div>


            <!-- Password input-->
            <div style="padding-top: 10px">
                <label  for="password"><spring:message code="login.password"/></label>
                <div >
                    <input id="password" name="password" value="123" type="password" placeholder=""
                           required="">
                </div>

            </div>

            <!-- Button -->
            <div style="padding-top: 10px">
                <label  for="signupbutton"></label>
                <div >
                    <button id="signupbutton" name="signupbutton"><spring:message code="login.button"/></button>
                </div>
            </div>

        </fieldset>
    </form>
</div>
</body>
</html>

