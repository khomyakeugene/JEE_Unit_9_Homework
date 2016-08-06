<%--
  Created by IntelliJ IDEA.
  User: Yevhen
  Date: 06.08.2016
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%--@elvariable id="employees" type="com.company.restaurant.web.PersonnelController"--%>
<%--@elvariable id="employee" type="com.company.spring.mvc.model.Employee"--%>

<h3>Our personnel</h3>
<table class="standard-table">
    <tr>
        <th>Name</th>
        <th>Position</th>
        <th>Photo</th>
    </tr>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <td>${employee.firstName}</td>
        </tr>
    </c:forEach>
</table>

