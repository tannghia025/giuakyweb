<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE HTML>
<html>
   <head>
      <meta charset="UTF-8" />
      <title>Danh sách thành viên</title>


   </head>
   <body>
      <h1>CHÀO MƯNG ${data.fullname}</h1>
      <h4>Bạn có thể đăng nhập với tên <b>${data.email}</b> và mật khẩu: <b>${data.password}</b></h4>
      <p><h4>Cảm ơn bạn đã đăng ký</h4></p>
       
     
         

      <button>Đóng</button>
       
   </body>
   
</html>