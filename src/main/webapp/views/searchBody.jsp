<div class="container">
    <form method="post" action="search" style="border: 0px;">
        <div class="row">
            <fieldset>
                <legend><spring:message code="search.title"/></legend>

                <div>

                    <div style="display: inline-block; ">
                        <input type="text" class="form-control" id="dateBegin" value="${dateBegin}"name="dateBegin"  required>
                    </div>

                    <div style="display: inline-block; ">
                        <input type="text" class="form-control" value="${dateEnd}"id="dateEnd" name="dateEnd"  required>

                    </div>
                </div>
                <br/>
<c:choose>
    <c:when test="${local=='En'}">
                <div style="display: inline-block; ">
                    <label for="country"><spring:message code="search.countryTitle"/></label>
                    <div>
                        <select id="country" name="country">
                            <option value = "0"></option>
                            <c:forEach items="${listCountry}" var="country" >
                                <option value = ${country.id}>${country.nameEn}</option>

                            </c:forEach>

                        </select>
                    </div>
                </div>

                <div style="display: inline-block; ">
                    <label  for="city"><spring:message code="search.cityTitle"/></label>
                    <div>
                        <select id="city" name="city">
                            <option value = "0"></option>
                            <c:forEach var="city" items="${listCity}">
                                        <option value = ${city.id}>${city.nameEn}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
    </c:when>
    <c:otherwise>
        <div style="display: inline-block; ">
            <label for="country"><spring:message code="search.countryTitle"/></label>
            <div>
                <select id="country" name="country">
                    <option value = "0"></option>
                    <c:forEach items="${listCountry}" var="country" >
                        <option value = ${country.id}>${country.name}</option>

                    </c:forEach>

                </select>
            </div>
        </div>

        <div style="display: inline-block; ">
            <label  for="city"><spring:message code="search.cityTitle"/></label>
            <div>
                <select id="city" name="city">
                    <option value = "0"></option>
                    <c:forEach var="city" items="${listCity}">
                        <option value = ${city.id}>${city.name}</option>
                     </c:forEach>
                </select>
            </div>
        </div>
    </c:otherwise>
</c:choose>
                <br/><br/>
                <div >
                    <label  for="signupbutton"></label>
                    <div >
                        <button id="signupbutton" name="signupbutton"><spring:message code="search.button"/></button>
                    </div>
                </div>
            </fieldset>
        </div>

    </form>
</div>
