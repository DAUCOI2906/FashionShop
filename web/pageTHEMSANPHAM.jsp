
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rimba Fashion Store</title>
    <link rel="stylesheet" href="css/bootstrap-grid.min.css">
    <link rel="stylesheet" href="css/shoes_clothes.css">
    <link rel="stylesheet" href="css/checkout.css">
    <link rel="stylesheet" href="css/mystyles.css">
    <script src="js/clothes.js" async></script>
    <link rel="icon" href="imgs/logo.png">
</head>
<body>
    <header class="main-header">
        <nav>
            <ul>
               <li><a href="index.jsp">Home</a></li>
                        <li><a href="about-us.jsp">About us</a></li>
                        <li><a href="location.jsp">Location</a></li>
                        <li><a href="contact.jsp">Contact us</a></li>
                        <li><a href="login">Login</a></li>
            </ul>
        </nav>
        <img src='imgs/logo.png'height='200'>
        <h1 class="band-name band-name-large"><strong>FASHION</strong> STORE</h1>
    </header>

    <section class="container container_them content-section ">
        <form class="form_them"  action="addproduct" method="post"  enctype = "multipart/form-data">
            <h3>THÊM SẢN PHẨM</h3>
            <label for="txtProductID">Mã sản phẩm</label>
            <input type="text" id="txtProductID" name="txtProductID" >
            <label for="txtProductname">Tên sản phẩm</label>
            <input type="text" id="txtProductname" name="txtProductname" >
            <label for="txtSoluong">Số lượng</label>
            <input type="text" id="txtSoluong" name="txtSoluong" >
            <label for="txtDongia">Đơn giá</label>
            <input type="text" id="txtDongia" name="txtDongia" >

            <label for="txtMota">Mô tả</label>
            <!-- <input type="text" id="txtMota" name="txtMota" > -->
            <textarea name="txtMota" id="txtMota" cols="30" rows="10"></textarea>
            
            <label for="txtNhasanxuat">Nhà sản xuất</label>
            <input type="text" id="txtNhasanxuat" name="txtNhasanxuat" >
            <label for="txtHinhanh">Hình ảnh</label>
            <input name="file" id="file" type="file" style="padding-bottom:20px ;" />
            <label for="txtLoaisanpham">Loại sản phẩm</label>
            <select name="selLoaisanpham" id="selLoaisanpham" name="D1"style="margin-bottom:20px ;">
              <option value="1">Áo quần</option>
              <option value="2">Giày</option>
            </select>
            <label for="selGioitinh">Giới tính</label>
            <select name="selGioitinh" id="selGioitinh" name="D1"style="margin-bottom:20px ;">
              <option value="1">Nam</option>
              <option value="2">Nữ</option>
            </select>
        <input class="checkout" id="Submit" type="submit" value="Thêm sản phẩm" />
        
      </form>
        <h1> ${requestScope.anounce}</h1>
    </section>
    

</body>
</html>