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
    <link rel="stylesheet" href="./assert/font/fontawesome-free-6.1.1-web/css/all.css">
    <link rel="stylesheet" href="assert/css/emailverification.css">
    <title>Email-Verification</title>
</head>

<body>
    <!-- Wrapper contains all website's components -->
    <div class="container-fluid wrapper">
        <!-- 1. Navigation -->
        <jsp:include page="navigation.jsp"></jsp:include>
        
        <div class="container-fluid container-fluid-form">
            <div class="wrapper-form">
                <form action="login" method="">
                    <div class="form-heading-group">
                        <i class="fa-solid fa-envelope-open-text fa-2x"></i>
                        <h2 class="form-heading">EMAIL VERIFICATION</h2>
                        <p class="form-text-caption">Please enter the OTP send to your email <br><b>abc@gmail.com</b> to
                            register
                            you
                            account!</p>
                    </div>
                    <div class="form-control-group">
                        <h4 class="form-text-label">OTP-Code:</h4>
                        <input placeholder="Enter OTP" required />
                        <div class="form-error"></div>
                    </div>
                    <div class="form-control-group form-caption">
                        <div class="form-text-caption">
                            If you don't receive the OTP, please
                            <a class="form-link" href="">click here!</a>
                        </div>
                    </div>
                    <div class="alert-warning error-message disabled">Account has been already exist! Register again!
                    </div>
                    <div class="form-btn-group">
                        <button class="btn-primary" type="submit">Submit</button>
                    </div>
                </form>
            </div>
        </div>

        <!-- 5. Footer  -->
        <jsp:include page="footer.jsp"></jsp:include>
    </div>
</body>

</html>