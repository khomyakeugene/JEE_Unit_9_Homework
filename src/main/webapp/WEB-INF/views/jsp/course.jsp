<%--
  Created by IntelliJ IDEA.
  User: Yevhen
  Date: 06.08.2016
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%--@elvariable id="course" type="com.company.restaurant.model.Course"--%>

<%@ include file="/WEB-INF/views/jsp/properties/common-page-properties.jsp" %>

<html>
<body>
<%@ include file="/WEB-INF/views/jsp/frames/main-menu-frame.jsp" %>

<div class="horizontal-container ordinary-container">
    <div class="horizontal-part-holder ordinary-container">
        <div class="two-thirds">
            <%@ include file="/WEB-INF/views/jsp/frames/transport-map-frame.jsp" %>
        </div>
        <div class="third">
            <div class="ordinary-container" style="max-width: inherit">
                <img class="img" style="max-width: 100%" src="data:image/jpeg;base64,${course.base64EncodePhoto}"/>
            </div>
        </div>
    </div>
</div>

</body>
</html>
