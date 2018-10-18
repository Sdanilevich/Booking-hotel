<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page contentType="text/html;charset=UTF-8"
          language="java" pageEncoding="UTF-8" %>
 <html>
<%@ include file="include/head.jsp" %>
<body>
<div class="container">
    <%@ include file="include/menu.jsp" %>
    <div class="row">
      <h2><spring:message code="formOrder.title"/></h2>
      <table style="border: 2px solid black;">
          <tr>
            <th></th>
            <th><spring:message code="formOrder.dateFrom"/></th>
            <th><spring:message code="formOrder.dateTo"/></th>
            <th><spring:message code="formOrder.countDay"/></th>
            <th><spring:message code="formOrder.hotel"/></th>
            <th><spring:message code="formOrder.countGuest"/></th>

            <th><spring:message code="formOrder.price"/></th>
            <th><spring:message code="formOrder.title"/></th>
              <th></th>

          </tr>
            ${userOrder}
          <c:forEach items="${userOrder}" var="order">
          <tr>
              <td class="order"><a href="apartmentview?id=${order.apartmentId}" >
                  <img src="${pageContext.request.contextPath}/views/jpg/apartments/${order.apartmentId}/main.jpg"  width="150" height="150">
              </a>
              </td>
              <td class="order">${order.beginDateFormat}</td>
              <td class="order">${order.endDateFormat}</td>
              <td class="order">${order.countDay}</td>
              <c:choose>
              <c:when test="${local=='En'}">
              <td class="order">
                  <table>
                      <tr>
                          <td style="color: darkblue;" ><b>${order.hotelNameEn}</b></td>
                      </tr>

                      <tr>
                          <td ><i>${order.addressEn}</i></td>
                      </tr>

                      <tr>
                          <td><b>${order.apartmentNameEn}</b></td>
                      </tr>
                  </table>
              </td>
              </c:when>
              <c:otherwise>
              <td class="order">
                  <table>
                      <tr>
                          <td style="color: darkblue;" ><b>${order.hotelName}</b></td>
                      </tr>

                      <tr>
                          <td ><i>${order.address}</i></td>
                      </tr>

                      <tr>
                          <td><b>${order.apartmentName}</b></td>
                      </tr>
                  </table>
              </td>
              </c:otherwise>
              </c:choose>

              <td class="order">${order.countGuest}</td>

              <td class="order">${order.price}</td>
              <td class="order">${order.total}</td>
              <td class="order"><a a href="do?command=editorder&deleteId=${order.id}">Отменить</a></td>


              </c:forEach>
      </table>
    </div>
</div>
</body>
</html>