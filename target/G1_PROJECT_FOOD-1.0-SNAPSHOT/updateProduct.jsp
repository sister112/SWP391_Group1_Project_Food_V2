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
        <link rel="stylesheet" href="./assert/css/base.css">
        <link rel="stylesheet" href="./assert/css/updateProduct.css">
        <link rel="stylesheet" href="./assert/font/fontawesome-free-6.1.1-web/css/all.css">
        <title> Update product</title>
    </head>

    <body>
        <!-- Wrapper contains all website's components -->
        <div class="container-fluid wrapper">
            <!-- 1. Navigation -->
            <jsp:include page="navigation.jsp"></jsp:include>

                <!-- Form update product -->
                <div class="container-fluid container-fluid-form">
                    <div class="wrapper-form">
                        <form id="myForm">
                            <div class="form-heading-group">
                                <i class="fa-solid fa-file-pen"></i>
                                <h2 class="form-heading">UPDATE PRODUCT</h2>
                            </div>

                            <div class="form-control-group">
                                <h4 class="form-text-label">Name:</h4>
                                <input type="text" id="name" name="name" placeholder="Enter name of product">
                                <div class="alert-warning" id="txtNameMessage"></div>
                            </div>

                            <div class="form-control-group">
                                <h4 class="form-text-label">Price of product:</h4>
                                <input type="number" id="price" name="price" placeholder="Enter price of product">
                                <div class="alert-warning" id="txtNameMessage1"></div>
                            </div>

                            <div class="form-control-group">
                                <h4 class="form-text-label">Sale-Percent:</h4>
                                <input type="number" id="salesoff" name="salesoff" placeholder="Enter sales of product">
                                <div class="alert-warning" id="txtNameMessage2"></div>
                            </div>

                            <div class="form-control-group">
                                <h4 class="form-text-label">Status:</h4>
                                <select id="category" name="category" >
                                    <option value="SOUL_OUT">SOUL_OUT</option>
                                    <option value="AVAILABLE">AVAILABLE</option>
                                    <option value="REMOVED">REMOVED</option>
                                </select>
                            </div>

                            <div class="form-control-group">
                                <h4 class="form-text-label">Category:</h4>
                                <select id="category" name="category">
                                    <option value="category1">Category 1</option>
                                    <option value="category1">Category 1</option>
                                    <option value="category1">Category 1</option>
                                </select>
                            </div>

                            <div class="form-control-group">
                                <h4 class="form-text-label">Description:</h4>
                                <input type="text" id="description" name="description" placeholder="Enter description of product">
                                <div class="alert-warning" id="txtDescriptionMessage"></div>
                            </div>

                            <div class="form-btn-group">
                                <button type="Submit" name="submit" class="btn-primary">Update</button>
                                <h6 class="form-btn-separator">&nbsp;OR&nbsp;</h6>
                                <button type="button" name="submit" class="btn-main">Cancel</button>
                            </div>
                        </form>
                    </div>
                </div>
                <!-- 5. Footer  -->
            <jsp:include page="footer.jsp"></jsp:include>
        </div>
        <script src="./bootstap/bootstrap.js"></script>
        <script src="jquery/Jquery.js"></script>
        <script src="jquery/updateProduct.js"></script>
    </body>

</html>