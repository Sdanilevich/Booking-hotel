<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:choose>
    <c:when test="${local=='En'}">
       <table border="0">
               <tr  valign ="top">
                    <td  valign ="top">
                        <img src="${pageContext.request.contextPath}/views/jpg/apartments/${apartment.id}/main.jpg"  width="150" height="150">
                    </td>
                    <td valign ="top">
                        <table border="0">
                            <tr>
                                <td colspan="2" style="color: darkblue;" ><b>${apartment.hotelNameEn}</b></td>
                            </tr>

                            <tr>
                                <td colspan="2"><i>${apartment.addressEn}</i></td>
                            </tr>
                            <tr>
                                <td colspan="2"><br/></td>
                            </tr>
                            <tr>
                                <td colspan="2"><b>${apartment.nameEn}</b></td>
                            </tr>
                            <tr>
                                <td><spring:message code="apartment.countGuest"/>:</td>
                                <td>${apartment.countGuest}</td>
                            </tr>

                            <tr>
                                <td><spring:message code="apartment.sizeRoom"/>:</td>
                                <td>${apartment.roomSize}</td>
                            </tr>
                            <tr>
                                <td><spring:message code="apartment.price"/>:</td>
                                <td style="color: crimson;">${apartment.price}</td>
                            </tr>
                        </table>
                    </td>
                    <td>

                        <ul class="list-facility">
                        <c:forEach items="${listFacility}" var="facility">
                            <li>${facility.nameEn}</li>
                        </c:forEach></ul>
                    </td>
                </tr>


    </table>
    </c:when>

    <c:otherwise>
        <table border="0">
            <tr  valign ="top">
                <td  valign ="top">
                    <img src="${pageContext.request.contextPath}/views/jpg/apartments/${apartment.id}/main.jpg"  width="150" height="150">
                </td>
                <td valign ="top">
                    <table border="0">
                        <tr>
                            <td colspan="2" style="color: darkblue;" ><b>${apartment.hotelName}</b></td>
                        </tr>

                        <tr>
                            <td colspan="2"><i>${apartment.address}</i></td>
                        </tr>
                        <tr>
                            <td colspan="2"><br/></td>
                        </tr>
                        <tr>
                            <td colspan="2"><b>${apartment.name}</b></td>
                        </tr>
                        <tr>
                            <td><spring:message code="apartment.countGuest"/>:</td>
                            <td>${apartment.countGuest}</td>
                        </tr>

                        <tr>
                            <td><spring:message code="apartment.sizeRoom"/>:</td>
                            <td>${apartment.roomSize}</td>
                        </tr>
                        <tr>
                            <td><spring:message code="apartment.price"/>:</td>
                            <td style="color: crimson;">${apartment.price}</td>
                        </tr>
                    </table>
                </td>
                <td>

                    <ul class="list-facility">
                        <c:forEach items="${listFacility}" var="facility">
                            <li>${facility.name}</li>
                        </c:forEach></ul>
                </td>
            </tr>


        </table>
    </c:otherwise>
    </c:choose>