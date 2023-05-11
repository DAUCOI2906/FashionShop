<%-- 
    Document   : login
    Created on : May 2, 2023, 11:28:41 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/login.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.7/css/all.css">
        <link href="https://fonts.google.com/specimen/Source+Sans+Pro" rel="stylesheet">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="css/styles.css" rel="stylesheet" type="text/css">
        <script src="https://kit.fontawesome.com/85434d7cc7.js" crossorigin="anonymous"></script>
        <script src="js/jquery-3.5.1.js"></script>
        <script src="js/home.js"></script>
        <title>Login Account</title>
        <link href='css/bootstrap.css' rel='stylesheet'>
        <link href='css/home.css' rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Chilanka&display=swap" rel="stylesheet">
        <style>
            .thongbao{
                display: none;
            }
            .hien{
                display: block;
                text-align: center;
                font-weight: bold;
                color:red;
            }
        </style>

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
                    <h1><strong>FASHION</strong> STORE</h1>
                    <h2>Fashion store is an online shop, that sells fashion clothes and shoes in Rwanda.<br>
                        Shop with us both clothes and shoes.</h2>

                </div>
            </div>

        </header>
        <div class="modallogin js-login">
            <div class="modallogin_item js-item-close">
                <div class="btclose js-close">
                    <a href="index.jsp">
                        <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5"
                             stroke="currentColor" class="w-6 h-6">
                        <path stroke-linecap="round" stroke-linejoin="round" d="M6 18L18 6M6 6l12 12" />
                        </svg>
                    </a>
                </div>

                <div class="modallogin_head">
                    <h1>Login Account</h1>
                </div>
                <div class="modallogin_content">
                    <form action="login">

                        <label for="username">User name</label>
                        <input type="text" placeholder="username" id="username" name="username" required="">
                        <label for="pass">Pass word</label>
                        <input type="password" id="pass" name="password" required="">
                        <input type="submit" value="Login" id="dangnhap">
                    </form>
                    <h3 class="thongbao">${requestScope.tbao}</h3>
                    <p>If you don't have an account, click to <a href="signup.jsp">sign up</a>.</p>
                </div>
            </div>
        </div>
        <%
            String username = "John"; // khởi tạo giá trị biến username
        %>

        <script type="text/javascript">
            const btnsub = document.querySelector('#dangnhap');
            const tb= document.querySelector('.thongbao');
            function hienthi ()
            {
                tb.classList.add('hien');
            }
            btnsub.addEventListener('click',hienthi);
        </script>
    </body>

</html>
