<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<c:forEach items="${listApartment}" var="apartment">
    <div class="block1">
    <table>
    <tr>
    <td>
        <a href="apartment?id=${apartment.id}" >
            <img src="${pageContext.request.contextPath}/views/jpg/apartments/${apartment.id}/main.jpg"  width="150" height="150">
        </a>
    </td>
        <c:choose>
        <c:when test="${local=='En'}">

        <td padding="10">
        <a href="apartment?id=${apartment.id}">
                ${apartment.hotelNameEn}<br/>
        </a>
            ${apartment.nameEn}<br/>
            ${apartment.addressEn}<br/>
            ${apartment.countGuest}<br/>
            ${apartment.price}
        </td>
        </c:when>

        <c:otherwise>
            <td style="padding-left:30px">
                <a href="apartment?id=${apartment.id}">
                        ${apartment.hotelName}<br/>
                </a>
                    ${apartment.name}<br/>
                    ${apartment.address}<br/>
                    ${apartment.countGuest}<br/>
                    ${apartment.price}
            </td>
        </c:otherwise>
        </c:choose>
    </tr>
    </table>
    </div>
</c:forEach>

<c:forEach var="i" begin="1" end="${countApartment/countApartmentOnPage}">
    <a href="search?beginPortion=${(i-1)*countApartmentOnPage+1}">${i}  </a>
</c:forEach>

