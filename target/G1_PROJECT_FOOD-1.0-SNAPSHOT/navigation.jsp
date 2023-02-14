<%-- 
    Document   : navigation
    Created on : Feb 12, 2023, 2:14:42 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./bootstap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="./assert/css/base.css"/>
        <link rel="stylesheet" href="./assert/css/home.css"/>
        <title>Navigation</title>
    </head>
    <body>
        <!-- 1. Navigation -->
        <nav class="navbar navbar-expand-lg">
            <div class="container-fluid">
                <a href="home.html">
                    <img class="navbar-logo" src="./assert/img/Logo.png" alt="">
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll"
                        aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarScroll">
                    <ul class="navbar-nav ms-auto my-2 my-lg-0 navbar-nav-scroll" style="--bs-scroll-height: 100px;">
                        <li class="nav-item">
                            <a class="nav-link" aria-current="page" href="#">Home-page</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Top-sale</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link">Contact</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link">Recriut</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link">Register</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link">Login</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link">Register</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </body>
</html>
