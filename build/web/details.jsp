<%-- 
    Document   : details
    Created on : May 9, 2023, 11:57:30 PM
    Author     : Truyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fashion Store</title>
    <link rel="stylesheet" href="css/shoes_clothes.css">
    <link rel="stylesheet" href="css/mystyles.css">
    <link rel="stylesheet" href="css/details.css">
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

    <section class="container content-section women">
        <h2 class="section-header">Chi tiết sản phẩm</h2>
        <span class="shop-item-title">${requestScope.product.getProductname()}</span>
        <div class="container_product">
            <div class="img_box"><img class="shop-item-image" src="imgs/${requestScope.product.getHinhanh()}">
                <div class="shop-item-details">
                    <a href="addcart?cid=<%=request.getParameter("cid")%>&iduser=<%=request.getParameter("iduser")%>"><button class="btn btn-primary shop-item-button">THÊM VÀO GIỎ HÀNG</button></a>
                    <a href="viewcart?iduser=<%=request.getParameter("iduser")%>"><button class="btn btn-primary shop-item-button">XEM GIỎ HÀNG</button></a>
                </div>
            </div>
                
                <div class="product_content">
                    <div class="discription">
                        <p class="label_info">Mô tả sản phẩm:</p>
                        <p class="info_product">${requestScope.product.getMota()}</p>
                    </div>
                    <div class="discription">
                        <p class="label_info">Giá bán:</p>
                        <p class="info_product price">${requestScope.product.getDongia()}</p>
                    </div>
                    <div class="discription">
                        <p class="label_info">Số lượng còn</p>
                        <p class="info_product">${requestScope.product.getSoluong()}</p>
                    </div>
                    <div class="discription">
                        <p class="label_info">Nhà sản xuất</p>
                        <p class="info_product">${requestScope.product.getNhasx()}</p>
                    </div>

                </div>
                
            
        </div>
        
    </section>

    <footer class="main-footer">
        <div class="container main-footer-container">
            <h3 class="band-name text-center">Fashion Store</h3>
            
        </div>
    </footer>

</body>
</html>
