<%-- 
    Document   : contact
    Created on : May 2, 2023, 11:27:04 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.7/css/all.css">
    <link href="https://fonts.google.com/specimen/Source+Sans+Pro" rel="stylesheet">
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
    <link href="css/mystyles.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;500&display=swap" rel="stylesheet">
    <script src="js/jquery-3.5.1.js"></script>
    <script src="js/home.js"></script>
    <title>Contacts</title>
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
    </nav>
    <div id="contact-us">
        <h2><center>CONTACT US</center></h2><br>
        <form id="myForm" class="container form-group">
            <input class='form-control' type="text" placeholder="Name..." id="name" required><br>
            <input class='form-control' type="email" placeholder="Email..." id="myInput" required ><br>
            <textarea  class='form form-control' id="myText" cols="20" rows="10" placeholder="Your message here"></textarea><br>
            <button class='btn btn-outline-secondary form-control' type="submit">Submit</button>
       </form>
       
    </div>   
    <footer>
        <div class="social-icons">
            <a href=""><i class="fab fa-facebook"></i></a>
            <a href=""><i class="fab fa-instagram"></i></a>
            <i class="fab fa-twitter"></i>
        </div>
        
            <div id="contact">
                <a href=""><i class="fa fa-envelope"></i> Hotline</a>
                <p><i class="fa fa-mobile"></i> +84123456789</p>
                <i class="fa fa-map-marker"></i> Nga Trâm Dũng Truyền<br>
                48 Cao Thắng, Hải Châu, Thành Phố Đà Nẵng<br>
                <p>&copy; 2020 All rights reserved |Fashion Store</p>
            </div>
    </footer>

</body>

</html>
