<%-- 
    Document   : about-us
    Created on : May 2, 2023, 11:28:11 PM
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
        <link href='css/mystyles.css' rel="stylesheet">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@100;500&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.7/css/all.css" >
        <link href="https://fonts.google.com/specimen/Source+Sans+Pro" rel="stylesheet">
        <script src="https://kit.fontawesome.com/85434d7cc7.js" crossorigin="anonymous"></script>
        <script src="js/jquery-3.5.1.js"></script>
        <script src="js/home.js"></script>
        <link href="https://fonts.googleapis.com/css2?family=Chilanka&display=swap" rel="stylesheet">
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
        <div id="about-us" class='container'>
            <h2>About us</h2><br>
            <section id="owners" class='row'>
                <div class='card col-mx-1'>
                    <img class='card-img-top'src='./imgs/avt/truyen.jpg'>
                    <div class='card-body'>
                        <h4>Nguyễn Đức Truyền</h4>
                    </div>
                </div>
                <div class='card col-mx-1'>
                    <img class='card-img-top'src='./imgs/avt/dung.png'>
                    <div class='card-body'>
                        <h4>Nguyễn Mạnh Dũng</h4>
                    </div>
                </div>
                <div class='card col-mx-1'>
                    <img class='card-img-top'src='./imgs/avt/nga.jpg'>
                    <div class='card-body'>
                        <h4>Nguyễn Thúy Nga</h4>
                    </div>
                </div>
                <div class='card col-mx-1'>
                    <img class='card-img-top'src='./imgs/avt/tram.jpg'>
                    <div class='card-body'>
                        <h4>Lê Thị Thùy Trâm</h4>
                    </div>
                </div>
               
            </section><br><br>
            <div id="about">
                Chúng tôi là một nhóm gồm có 4 thành viên đều có trái tim đam mê thời trang và tận tâm để cung cấp cho bạn các xu hướng thời trang mới nhất từ ​​khắp nơi trên thế giới.
                <br>Nhóm của chúng tôi đã kinh doanh hơn 5 năm và tiếp tục trung thành với khách hàng. Nếu bạn chọn chúng tôi, chúng tôi sẽ không bao giờ làm bạn thất vọng.
                <br>Từ lúc bạn bước qua cánh cửa của chúng tôi, bạn sẽ được đón nhận bởi những nụ cười ấm áp và đội ngũ giàu kinh nghiệm của chúng tôi
                cá nhân sẽ hỗ trợ bạn trong việc thiết lập một tủ quần áo cổ điển nhưng thời trang.
            </div><br>
            
        </div><br><br>
    </body>
</html>
