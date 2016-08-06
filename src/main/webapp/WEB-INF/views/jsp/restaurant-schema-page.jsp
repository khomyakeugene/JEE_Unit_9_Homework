<%--
  Created by IntelliJ IDEA.
  User: Yevhen
  Date: 06.08.2016
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: Yevhen
  Date: 05.08.2016
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<html>
<%@ include file="/WEB-INF/views/jsp/common-page-properties.jsp" %>

<body>
<%@ include file="/WEB-INF/views/jsp/main-menu.jsp" %>

<div class="horizontal-container ordinary-container">
    <div class="horizontal-part-holder ordinary-container">
        <div class="two-thirds">
            <div class="ordinary-container" style="max-width: 75%">
                <img class="img" style="max-width: 100%" src="data:image/jpeg;base64,${restaurantRestaurantSchema}"/>
            </div>
        </div>
        <div class="third">
            <%@ include file="/WEB-INF/views/jsp/contacts-frame.jsp" %>
        </div>
    </div>
</div>

</body>
</html>
