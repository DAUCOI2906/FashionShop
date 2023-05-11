<%-- 
    Document   : storeclothes
    Created on : May 2, 2023, 11:30:06 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Fashion Store</title>
        <link rel="stylesheet" href="css/bootstrap-grid.min.css">
        <link rel="stylesheet" href="css/shoes_clothes.css" />
        <link rel="stylesheet" href="css/clothes.css">
        <link rel="stylesheet" href="css/mystyles.css">
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
                    <li><a href="login.jsp">Login</a></li>
                </ul>
            </nav>
            <img src='imgs/logo.png'height='200'>
            <h1 class="band-name band-name-large"><strong>FASHION</strong> STORE</h1>
        </header>

        <section class="container content-section women">
            <h2 class="section-header">FEMALE CLOTHES</h2>
            <div class="shop-items">
                <c:forEach items="${requestScope.dsnu}" var="i">
                    <div class="shop-item">
                        <span class="shop-item-title">${i.getProductname()}</span>
                        <img class="shop-item-image" src="imgs/${i.getHinhanh()}">
                        <p class="shop-item-price">${i.getDongia()}</p>
                        <div class="shop-item-details">

                            <a href="addcart?cid=${i.getProductID()}&iduser=${requestScope.iduser}"><button class="btn btn-primary shop-item-button">THÊM VÀO GIỎ HÀNG</button></a>
                            <a href="details?cid=${i.getProductID()}&iduser=${requestScope.iduser}"><button class="btn btn-primary shop-item-button">XEM CHI TIẾT</button></a>
                            <a href="viewcart?iduser=${requestScope.iduser}"><button class="btn btn-primary shop-item-button">XEM GIỎ HÀNG</button></a>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </section>

        <section class="container content-section men">
            <h2 class="section-header">MALE CLOTHES</h2>
            <div class="shop-items">
                <c:forEach items="${requestScope.dsnam}" var="i">
                    <div class="shop-item">
                        <span class="shop-item-title">${i.getProductname()}</span>
                        <img class="shop-item-image" src="imgs/${i.getHinhanh()}">
                        <p class="shop-item-price">${i.getDongia()}</p>
                        <div class="shop-item-details">

                            <a href="addcart?cid=${i.getProductID()}&iduser=${requestScope.iduser}"><button class="btn btn-primary shop-item-button">THÊM VÀO GIỎ HÀNG</button></a>
                            <a href="details?cid=${i.getProductID()}&iduser=${requestScope.iduser}"><button class="btn btn-primary shop-item-button">XEM CHI TIẾT</button></a>
                            <a href="viewcart?iduser=${requestScope.iduser}"><button class="btn btn-primary shop-item-button">XEM GIỎ HÀNG</button></a>

                        </div>
                    </div>
                </c:forEach>

            </div>
        </section>
        
        <footer class="main-footer">
            <div class="container main-footer-container">
                <h3 class="band-name text-center">Fashion Store</h3>

            </div>
        </footer>

    </body>
</html>
