<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<%@ include file="include/head.jsp" %>
<body>
<div >
    <%@ include file="include/menu.jsp" %>
    <form  id ="form_signup" method="post" action="signup">
             <!-- Form Name -->
            <legend><spring:message code="registration.title"/>:</legend>
            <!-- Text input-->
            <div style="padding-top: 20px;">
                <label for = "login"><spring:message code="registration.login"/></label>
                <div >
                    <input id="login" name="login" value="" type="text" placeholder="" required="">
                </div>
            </div>

                        <!-- Password input-->
             <div style="padding-top: 20px;">
                 <label for="password"><spring:message code="registration.password"/></label>
                 <div >
                     <input id="password" name="password" value="" type="password" placeholder="" required="">
                     <span class="help-block"></span>
                 </div>
             </div>

            <div style="padding-top: 20px;">
                <label for="name"><spring:message code="registration.name"/></label>
                <div>
                    <input id="name" name="name" value="" type="text" placeholder="" required="">
                    <span ></span>
                </div>
            </div>
            <div style="padding-top: 20px;">
                <label  for="name"><spring:message code="registration.email"/></label>
                <div >
                    <input id="email" name="email" value="" type="email" placeholder="" required="">
                    <span ></span>
                </div>
            </div>
              <!-- Button -->
            <div style="padding-top: 20px;">
                <label for="signupbutton"></label>
                <div>
                    <button id="signupbutton" name="signupbutton"><spring:message code="registration.button"/></button>
                </div>
            </div>
    </form>

</div>
</body>
</html>




