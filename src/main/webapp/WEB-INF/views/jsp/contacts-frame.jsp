<%--
  Created by IntelliJ IDEA.
  User: Yevhen
  Date: 06.08.2016
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<h3>Contacts</h3>
<table class="standard-table">
    <tr>
        <td>Address :</td>
        <td><b>${restaurantAddress}</b></td>
    </tr>
    <tr>
        <td>Phone numbers: </td>
        <td>
            <table>
                <c:forEach items="${restaurantPhoneNumbers}" var="phoneNumber">
                    <tr>
                        <td><b><c:out value="${phoneNumber}"/></b></td>
                    </tr>
                </c:forEach>
            </table>
        </td>
    </tr>
    <tr>
        <td>e-mail :</td>
        <td><b>${restaurantEMail}</b></td>
    </tr>
</table>

</body>
</html>
