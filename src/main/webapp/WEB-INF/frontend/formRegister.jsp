 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   

<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8" />
<title>Person List</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>





	<br />

	<br />
	<div style="position: absolute; align-items: center; right: 50%">
		<h1>Đăng ký thành viên</h1>

		<c:choose>
			<c:when test="${param.error =='empty'}">
				<span style="color: red; font-weight: bold;">Bạn không được
					để trống ô dữ liệu có *</span>
			</c:when>
			<c:when test="${param.error =='emailExist'}">
				<span style="color: red; font-weight: bold;">Email đã tồn tại thử lại</span>
			</c:when>
			<c:when test="${param.error =='emailInvalid'}">
				<span style="color: red; font-weight: bold;">Email không hợp lệ thử lại</span>
			</c:when>
			<c:when test="${param.error =='emailExist'}">
				<span style="color: red; font-weight: bold;">Email này đã có người đăng ký thử lại</span>
			</c:when>
			<c:when test="${param.error =='password'}">
				<span style="color: red; font-weight: bold;">Mật khẩu có ít nhất 8 ký tự</span>
			</c:when>
			
			<c:when test="${param.error =='incorrectpassword'}">
				<span style="color: red; font-weight: bold;">Mật khẩu không tương ứng Thử lại</span>
			</c:when>
			<c:when test="${param.error =='incorrectdate'}">
				<span style="color: red; font-weight: bold;">Ngày không hợp lệ Thử lại</span>
			</c:when>

		</c:choose>

		<form:form action="dangkytaikhoan" method="post" modelAttribute="data">
			
			<form:label path="email">*Địa chỉ Email: </form:label>
			<br />
			<form:input path="email" />
			<br />
			<form:label path="password">*Mật Khẩu: </form:label>
			<br />
			<form:password path="password" />
			<br />
			<form:label path="repassword">* Nhập lại mật khẩu: </form:label>
			<br />
			<form:password path="repassword" />
			<br />
			<form:label path="fullname">*Họ Tên: </form:label>
			<br />
			<form:input path="fullname" />
			<br />
			<form:label path="dob">*Ngày Sinh</form:label>
			<br />
			<form:input path="dob" />
			<br />
			<form:label path="sex">Giới Tính</form:label>
			<br />

			<form:checkbox path="sex" value="true" />
			<span>Nữ</span>
			<br />
			<form:label path="hocvan">*Trình độ văn hóa</form:label>
			<br />
			<form:select path="hocvan" items="${listHocVan}" />
			<br />
			<form:label path="diachi">*Địa chỉ</form:label>
			<br />
			<form:select path="diachi" items="${listDiaChi}" />
			<br />
			<form:label path="dienthoai">Điện Thoại</form:label>
			<br />
			<form:input path="dienthoai" />
			<form:button>Summit</form:button>
		</form:form>


	</div>
</body>

</html>