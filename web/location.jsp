<%-- 
    Document   : location
    Created on : May 2, 2023, 11:26:35 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href='css/bootstrap.css' rel='stylesheet'>
    <link href="css/home.css" rel="stylesheet">
    <link href="css/mystyles.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;500&display=swap" rel="stylesheet">
    <script src="js/jquery-3.5.1.js"></script>
    <script src="js/home.js"></script>
    <title>LOCATION</title>
    <link rel="icon" href="imgs/logo.png">
    </head>
    <body>
        <nav>
                    <ul>
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="about-us.jsp">About us</a></li>
                        <li><a href="location.jsp">Location</a></li>
                        <li><a href="contact.jsp">Contact us</a></li>
                        <li><a href="login">Login</a></li>
                    </ul>
                </nav>
        <div id="location" class='container'>
            <h2>Location</h2><br>
            <div>
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3833.771503349087!2d108.21084937479885!3d16.077342784603314!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3142184792140755%3A0xd4058cb259787dac!2zVHLGsOG7nW5nIMSQ4bqhaSBo4buNYyBTxrAgUGjhuqFtIEvhu7kgdGh14bqtdCAtIMSQ4bqhaSBo4buNYyDEkMOgIE7hurVuZw!5e0!3m2!1svi!2s!4v1682124056329!5m2!1svi!2s" width="100%" height="450" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
            </div><br>
            <div>
                <p id="address">
                    Bạn có thể đến để chọn đơn đặt hàng của bạn tại cửa hàng của chúng tôi và duyệt nhiều sản phẩm của chúng tôi.<br> Cửa hàng chúng tôi được đặt tại 48 Cao Thắng, quận Hải Châu, thành phố Đà Nẵng. Cạnh trường Đại học Sư phạm Kỹ Thuật</p>
            </div>
            
        </div><br>
        <footer>
            <div class="container">
                <div id="contact">
                    <a href=""><i class="fa fa-envelope"></i> Hotline</a>
                    <p><i class="fa fa-mobile"></i> +84123456789</p>
                    <i class="fa fa-map-marker"></i> Nga Trâm Dũng Truyền<br>
                    48 Cao Thắng, Hải Châu, Thành Phố Đà Nẵng<br>
                </div>
                <p id="footer">&copy; 2020 All rights reserved |Fashion Store</p>
            </div>
        </footer>
    </body>
</html>
