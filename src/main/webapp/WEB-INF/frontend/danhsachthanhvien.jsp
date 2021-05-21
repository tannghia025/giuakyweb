<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Welcome</title>
    <style>
        table, th, td {
            border: 1px solid black;
        }

        #container {
            display: flex;
            flex-direction: row;
            justify-content: space-between;
            padding: 10px;
            height: 50px;
            margin-bottom: 50px;
        }


    </style>

</head>
<body>
<div style="position: inherit; align-items: center">
    <h1>DANH SÁCH THÀNH VIÊN</h1>
    <div id="container">
        <div class="item">
            <h4>Tổng số thành viên: </h4>
            <div style="display: inline">
                <span><h4>Chọn giới tính: </h4></span>
                <select name="cars" id="cars">
                    <option value="Nam">Nam</option>
                    <option value="Nữ">Nữ</option>
                </select>
            </div>
        </div>
        <div class="item" >
            <form:form action="dangky" method="get" >
            <button type="submit" style="
    margin-top: 30px;
">Thêm thành viên
            </button>
            </form:form>
        </div>


    </div>


    <br>
    <br>
    <table style="width: 70%">
        <tr style="background-color:#05e2cf">
            <th><b>Họ tên</b></th>
            <th><b>Ngày sinh</b></th>
            <th><b>Giới tính</b></th>
            <th><b>Email</b></th>
        </tr>

        <c:forEach var="item" items="${listmem}">


        <tr>
            <td>${item.fullname}</td>
            <td>${item.dob}</td>
            <c:if test="${item.sex==false}">
                <td>Nam</td>
            </c:if>
            <c:if test="${item.sex==true}">
                <td>Nữ</td>
            </c:if>
            <td>${item.email}</td>

        </tr>
        </c:forEach>
    </table>

</div>
</body>

</html>