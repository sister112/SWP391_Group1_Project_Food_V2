<%-- 
    Document   : navigation
    Created on : Feb 12, 2023, 2:14:42 AM
    Author     : PC
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./bootstap/css/bootstrap.min.css">
        <link rel="stylesheet" href="./bootstap/js/bootstrap.js">
        <link rel="stylesheet" href="assert/css/base.css">
        <link rel="stylesheet" href="assert/css/register.css">
        <link rel="stylesheet" href="./assert/font/fontawesome-free-6.1.1-web/css/all.css">
        <title>Register</title>
    </head>

    <body>
        <!-- Wrapper contains all website's components -->
        <div class="container-fluid wrapper">
            <!-- 1. Navigation -->
            <jsp:include page="navigation.jsp"></jsp:include>
                <div class="container-fluid container-fluid-form">
                    <div class="wrapper-form">
                        <form action="login" id="myForm">
                            <div class="form-heading-group">
                                <i class=" fa-solid fa-user-plus fa-2x"></i>
                                <h2 class="form-heading">REGISTER</h2>
                                <p class="form-text-caption">Please register to save your information!</p>
                            </div>

                            <div class="form-control-group">
                                <h4 class="form-text-label">Full name:</h4>
                                <input type="" id="name" name="name" placeholder="Le Van A" />
                                <div class="alert-warning" id="txtNameMessage"></div>
                            </div>

                            <div class="form-control-group">
                                <h4 class="form-text-label">Phone number:</h4>
                                <input type="" id="phone" name="phone" placeholder="0932987654" />
                                <div class="alert-warning" id="txtPhoneMessage"></div>
                            </div>

                            <div class="form-control-group">
                                <h4 class="form-text-label">Email address:</h4>
                                <input type="" id="email" name="email" placeholder="levana@gmail.com" />
                                <div class="alert-warning" id="txtEmailMessage"></div>
                            </div>

                            <div class="form-control-group">
                                <h4 class="form-text-label">Address:</h4>
                                <input type="" id="address" name="address" placeholder="An Binh, Ninh Kieu, Can Tho" />
                                <div class="alert-warning" id="txtAddressMessage"></div>
                            </div>

                            <div class="form-control-group">
                                <h4 class="form-text-label">Password:</h4>
                                <input type="" id="password" name="password" placeholder="Your password" />
                                <div class="alert-warning" id="txtPasswordMessage"></div>
                            </div>

                            <div class="form-control-group">
                                <h4 class="form-text-label">Confirm password:</h4>
                                <input type="" id="confirm" name="confirm" placeholder="Your password" />
                                <div class="alert-warning" id="txtConfirmMessage"></div>
                            </div>

                            <div class="form-control-group form-caption">
                                <div class="form-text-caption">If you have account please click
                                    <a class="form-link" href="login.html">login account!</a>
                                </div>
                            </div>
                            <div class="alert-warning error-message disabled">Account has been already exist! Register again!</div>
                            <div class="form-btn-group">
                                <button class="btn-primary" type="submit"><a href="">Register</a></button>
                                <h6 class="form-btn-separator">&nbsp;OR&nbsp;</h6>
                                <button class="btn-main"><a href="login.html">Login</a></button>
                            </div>
                        </form>
                    </div>
                </div>

                <!-- 5. Footer  -->
            <jsp:include page="footer.jsp"></jsp:include>
        </div>
        <script src="jquery/Jquery.js"></script>
        <script src="jquery/register.js"></script>
    </body>

</html>