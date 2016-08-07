<%--
  Created by IntelliJ IDEA.
  User: Yevhen
  Date: 06.08.2016
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%--@elvariable id="courses" type="com.company.restaurant.web.MainController"--%>
<%--@elvariable id="course" type="com.company.restaurant.model.Course"--%>

<div>
    <div class="horizontal-container">
        <div class="horizontal-part-holder">
            <div class="fifth form-label">
                <label for="courseName"><h3>Course</h3></label>
            </div>

            <div class="three-fifths">
                <input type="text" class="form-control" id="courseName"
                       name="courseName" placeholder="Enter course name" required autofocus>
            </div>

            <div class="fifth">

            </div>
        </div>
    </div>

    <div>
        <table class="course-table">
            <tr>
                <th>Title</th>
                <th style="text-align: right">Weight</th>
                <th style="text-align: right">Cost</th>
            </tr>
            <c:forEach items="${courses}" var="course">
                <tr>
                    <td><b><a href="/course/${course.courseId}">${course.name}</a></b></td>
                    <td style="text-align: right">${course.weight}</td>
                    <td style="text-align: right">${course.cost}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
