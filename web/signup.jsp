<%-- 
    Document   : signup
    Created on : May 2, 2023, 11:29:07 PM
    Author     : nguye
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/signup.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.7/css/all.css">
        <link href="https://fonts.google.com/specimen/Source+Sans+Pro" rel="stylesheet">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="css/styles.css" rel="stylesheet" type="text/css">
        <script src="https://kit.fontawesome.com/85434d7cc7.js" crossorigin="anonymous"></script>
        <script src="js/jquery-3.5.1.js"></script>
        <script src="js/home.js"></script>
        <title>Sign up Account</title>
        <link href='css/bootstrap.css' rel='stylesheet'>
        <link href='css/home.css' rel="stylesheet">
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
                        <li><a href="login.jsp">Login</a></li>
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
                    <h1>Sing up Acount</h1>
                </div>
                <div class="modallogin_content">
                    <form action="signup" method="post" enctype = "multipart/form-data">

                        <div class="inp">
                            <label for="username">User name</label>
                            <input type="text" placeholder="username" id="username" name="username">
                        </div>
                        <div class="inp">
                            <label for="pass">Pass word</label>
                            <input type="password" id="pass" name="password">
                        </div>
                        <div class="inp">
                            <label for="firstname">First name</label>
                            <input type="text" id="firstname" name="firstname">
                        </div>
                        <div class="inp">
                            <label for="lastname">Last name</label>
                            <input type="text" id="lastname" name="lastname">
                        </div>
                        <div class="inp">
                            <label for="address">Address</label>
                            <input type="text" id="address" name="address">
                        </div>
                        <div class="inp">
                            <label for="email">Email</label>
                            <input type="email" id="email" name="email">
                        </div>
                        <div class="inp">
                            <label for="phone">Phone</label>
                            <input type="text" id="phone" name="phone">
                        </div>
                        <div class="inp">
                            <label for="avata">Avatar</label>
                            <input type="file" id="avata" name="avatar">
                        </div>
                        <div class="inp">
                            <input type="submit" value="Sign up" id="dangnhap">
                        </div>
                        <h3>${requestScope.annouce}</h3>
                    </form>

                </div>
            </div>
        </div>

    </body>

</html>
