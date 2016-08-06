<%--
  Created by IntelliJ IDEA.
  User: Yevhen
  Date: 05.08.2016
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/WEB-INF/views/jsp/common-page-properties.jsp" %>

<html>
<body>
<%@ include file="/WEB-INF/views/jsp/main-menu.jsp" %>

<div class="horizontal-container ordinary-container">
    <div class="horizontal-part-holder">
        <div class="third around-emblem-text">
            Restaurant
        </div>
        <div class="third image-to-centre">
            <img src="data:image/jpeg;base64,${restaurantEmblemImage}"/>
        </div>
        <div class="third around-emblem-text">
            ${restaurantName}
        </div>
    </div>
</div>

<div class="horizontal-container ordinary-container">
    <div class="horizontal-part-holder ordinary-container">
        <div class="two-thirds">
            <h3>Menu</h3>
        </div>
        <div class="third">
            <%@ include file="/WEB-INF/views/jsp/contacts-frame.jsp" %>
        </div>
    </div>
</div>

</body>
</html>
