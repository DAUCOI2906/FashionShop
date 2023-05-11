<%-- 
    Document   : index
    Created on : May 2, 2023, 11:25:04 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.7/css/all.css" >
        <link href="https://fonts.google.com/specimen/Source+Sans+Pro" rel="stylesheet">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css">

        <script src="https://kit.fontawesome.com/85434d7cc7.js" crossorigin="anonymous"></script>
        <script src="js/jquery-3.5.1.js"></script>
        <script src="js/home.js"></script>
        <title> Fashion Store</title>
        <link href='css/bootstrap.css' rel='stylesheet'>
        <link href='css/home.css' rel='stylesheet'>
        <link href="https://fonts.googleapis.com/css2?family=Chilanka&display=swap" rel="stylesheet">
    </head>
    <body>
        <header class="container-fluid">
            <div id="home">
                <nav>
                    <ul>
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="about-us.jsp">About us</a></li>
                        <li><a href="location.jsp">Location</a></li>
                        <li><a href="contact.jsp">Contact us</a></li>
                        <li><a href="login">Login</a></li>
                    </ul>
                </nav>
                <div class="container">
                    <img src="imgs/logo.png" height="200">
                    <h1>WELCOME <strong>FASHION</strong> STORE</h1>
                    <h1><strong>${requestScope.tentk}</strong></h1>
                    <h2>Cửa hàng trực tuyến, bán quần áo thời trang và giày<br>
                        Mua sắm áo quần thời trang và giày cùng với chúng tôi</h2>
                    <button id="shop-btn"><span style="font-size: larger;font-weight: 600;">Shop now</span></button><br><br>
                    <%
                        Object rq = request.getAttribute("iduser");
                        int iduser_rq = (rq != null) ? Integer.parseInt(rq.toString()) : 0;
                    %>


                    <a href="shoes?cid=2&iduser=<%=iduser_rq%>">
                        <button class="button"><span style="font-size: larger;font-weight: 600;">Shoes</span></button>
                    </a>
                    <a href="clothes?cid=1&iduser=<%=iduser_rq%>">
                        <button class="button"><span style="font-size: larger;font-weight: 600;">Clothes</span></button>
                    </a>
                </div>
            </div>
        </header>
    </body>
</html>
