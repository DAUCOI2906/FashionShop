<%-- 
    Document   : UpdateCart
    Created on : May 11, 2023, 4:00:53 AM
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
            <h2 class="section-header">UPDATE CART</h2>
            
            <table border="1">
                <thead>
                    <tr>
                        <th><span class="cart-item cart-header cart-column">ITEM</span></th>
                        <th><span class="cart-item cart-header cart-column">DESCRIPTION</span></th>
                        <th><span class="cart-price cart-header cart-column">PRICE</span></th>
                        <th><span class="cart-quantity cart-header cart-column">QUANTITY</span></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>
                            <div class="cart-item cart-column">
                                <img class="cart-item-image" src="./imgs/${requestScope.product.getHinhanh()}" width="100" height="100" alt="khonglayduoc">
                                <span class="cart-item-title">${requestScope.product.getProductname()}</span>
                            </div>
                        </td>
                        <td> 
                            <span class="cart-price cart-column">${requestScope.product.getMota()}</span>
                        </td>
                        <td><span class="cart-price cart-column">${requestScope.product.getDongia()}</span></td>
                        <td>
                            <div class="cart-quantity cart-column">
                                <input class="cart-quantity-input" type="number" id="numSoluong" value="1"  min="1" max="${requestScope.product.getSoluong()}">
                                <script>
                                    let myNumber = document.querySelector('#numSoluong');
                                    
                                    const dongia =${requestScope.product.getDongia()};
                                    myNumber.addEventListener('input', (event) => {
                                        const newValue = event.target.value;
                                        myNumber.setAttribute('value', newValue);
                                        
                                        document.querySelector("a[href*='doupdatecart']").href = "doupdatecart?idbill=<%=request.getParameter("idbill")%>&iduser=<%=request.getParameter("iduser")%>&soluong=" + myNumber.value;
                                        document.querySelector('#txtTongtien').setAttribute('value', myNumber.value*dongia);
                                    });

                                </script>
                            </div>
                        </td>
                    </tr>
                </tbody>
            </table>

            <div class="cart-total">
                <strong class="cart-total-title">Total</strong>
                <input class="cart-total-price" style="border:none;" name="txtTongtien" id="txtTongtien" readonly=""style="font-weight: 700;" value="${requestScope.product.getDongia()}" type="text"  />
            </div>
            <a href="doupdatecart?idbill=<%=request.getParameter("idbill")%>&iduser=<%=request.getParameter("iduser")%>&soluong=1">
                <input class="btn btn-primary btn-purchase" id="Submit1" type="submit" value="UPDATE CART" />

            </a>

        </section>

        <footer class="main-footer">
            <div class="container main-footer-container">
                <h3 class="band-name text-center">Fashion Store</h3>

            </div>
        </footer>

    </body>
</html>

