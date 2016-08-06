<%--
  Created by IntelliJ IDEA.
  User: Yevhen
  Date: 06.08.2016
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<html>
<%@ include file="/WEB-INF/views/jsp/properties/common-page-properties.jsp" %>

<body>
<%@ include file="/WEB-INF/views/jsp/frames/main-menu-frame.jsp" %>

<div class="horizontal-container ordinary-container">
    <div class="horizontal-part-holder ordinary-container">
        <div class="two-thirds">
            <div class="ordinary-container" style="max-width: inherit">
                <img class="img" style="max-width: 100%" src="data:image/jpeg;base64,${restaurantTransportMapImage}"/>
            </div>
        </div>
        <div class="third">
            <%@ include file="/WEB-INF/views/jsp/frames/contacts-frame.jsp" %>
        </div>
    </div>
</div>

</body>
</html>
