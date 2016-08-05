<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>${restaurantName}</title>

    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
</head>
<body>

<header>
    <div class="nav">
        <ul>
            <li class="home"><a href="#">Home</a></li>
            <li class="tutorials"><a class="active" href="#">Tutorials</a></li>
            <li class="about"><a href="#">About</a></li>
            <li class="news"><a href="#">Newsletter</a></li>
            <li class="contact"><a href="#">Contact</a></li>
        </ul>
    </div>
</header>

<div>
    <img style="alignment: center" src="data:image/jpeg;base64,${restaurantEmblemImage}"/>
</div>

<div style="max-width: 70%">
    <img class="img" style="max-width: 100%" src="data:image/jpeg;base64,${restaurantRestaurantSchema}" />
</div>

</body>
</html>
