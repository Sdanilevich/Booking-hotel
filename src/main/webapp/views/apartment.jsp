<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<%@ include file="include/head.jsp" %>
<body>

<div class="container">
    <%@ include file="include/menu.jsp" %>
    <br/><br/>
    <form method="post" action="createOrder?apartmentId=${apartment.id}" style="border: 0px;">
    <div>

        <div style="display: inline-block; ">
            <input type="text" class="form-control" id="dateBegin" value="${dateBegin}" name="dateBegin" required>
        </div>

        <div style="display: inline-block; ">
            <input type="text" class="form-control" id="dateEnd" value="${dateEnd}" name="dateEnd" required>

        </div>
    </div>
    <br/>
        <%@ include file="apartmentBody.jsp" %>
        <div>
            <button >Create order</button>
        </div>
    </form>
    </div>

</body>
</html>