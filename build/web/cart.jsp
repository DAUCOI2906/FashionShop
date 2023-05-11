<%-- 
    Document   : cart
    Created on : May 10, 2023, 3:57:02 PM
    Author     : Truyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <style>
            .cart-column{
                border-bottom: none;
            }
            table{
                width: 100%;
                border-collapse: collapse;
            }
            td,th {
                padding: 10px;
            }
            td>*{
                margin-left: 10px;
            }
            th>*{
                margin-left: 20px;
                
            }
        </style>
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

        <section class="container content-section" id="content-section">
            <h2 class="section-header">CART</h2>
            <table border="1">
                <thead>
                    <tr>
                        <th><span class="cart-item cart-header cart-column">ITEM</span></th>
                        <th><span class="cart-price cart-header cart-column">PRICE</span>
                        </th>
                        <th><span class="cart-quantity cart-header cart-column">QUANTITY</span></th>
                        <th><span class="cart-quantity cart-header cart-column">COST</span></th>
                        <th><span class="cart-quantity cart-header cart-column">CHANGE</span></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${requestScope.dscart}" var="i">
                        <tr>
                            <td><div class="cart-item cart-column">
                                    <img class="cart-item-image" src="./imgs/${i.getHinhanh()}" width="100" height="100" alt="khonglayduoc">
                                    <span class="cart-item-title">${i.getProductname()}</span>
                                </div></td>
                            <td><span class="cart-price cart-price-number cart-column">${i.getDongia()}</span></td>
                            <td>
                                <div class="cart-quantity cart-column">
                            <!--<input class="cart-quantity-input" type="number" value="${i.getSoluongmua()}"  min="1" max="${i.getSoluongcon()}">-->
                                    <span class="cart-quantity-input">${i.getSoluongmua()}</span>
                                </div>
                            </td>
                            <td><span class="cart-price cart-price-cost cart-column">1000</span></td>
                            <td><div class="cart-quantity cart-column">
                            <a href="deletecart?idbill=${i.getIdbill()}&iduser=${requestScope.iduser}" ><button class="btn btn-danger" type="button">REMOVE</button></a>

                            <a href="updatecart?idbill=${i.getIdbill()}&iduser=${requestScope.iduser}"><button class="btn btn-danger btn-update" type="button">UPDATE</button></a>
                        </div></td>
                        </tr>
                    
                </c:forEach>



                </tbody>
            </table>

            
            <div class="cart-total">
                <strong class="cart-total-title">Total</strong>
                <span class="cart-total-price">0</span>
            </div>
            <button class="btn btn-primary btn-purchase" type="button">PURCHASE</button>
        </section>

        <footer class="main-footer">
            <div class="container main-footer-container">
                <h3 class="band-name text-center">Fashion Store</h3>

            </div>
        </footer>

    </body>
    <script>
        let listPrice = document.querySelectorAll(".cart-price-number");
        let listQuantity = document.querySelectorAll(".cart-quantity-input");
        let listCost = document.querySelectorAll(".cart-price-cost");

        let totalPrice = 0;
        for (let i = 0; i < listPrice.length; i++) {
            let cost = parseFloat(listPrice[i].textContent) * parseInt(listQuantity[i].textContent);
            totalPrice += cost;
            listCost[i].textContent = cost;
            document.querySelector(".cart-total-price").textContent = totalPrice;
        }
    </script>
</html>
