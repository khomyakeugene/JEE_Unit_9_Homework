<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>${restaurantName}</title>
</head>

<body>

<%@ include file="/WEB-INF/views/jsp/index.jsp" %>

<div class="container">
    <img src="data:image/jpeg;base64,${restaurantEmblemImage}"/>
</div>

<div class="container" style="max-width: 70%">
    <img class="img" style="max-width: 100%" src="data:image/jpeg;base64,${restaurantRestaurantSchema}" />
</div>

</body>
</html>
