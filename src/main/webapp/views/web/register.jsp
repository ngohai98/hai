<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/9/2021
  Time: 11:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- Breadcrumb Section Begin -->
<div class="breacrumb-section">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <c:if test="${not empty message}">
                    <div class="alert alert-${alert}">${message}</div>
                </c:if>
                <div class="breadcrumb-text">
                    <a href="/home"><i class="fa fa-home"></i> Home</a>
                    <span>Register</span>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Breadcrumb Form Section Begin -->

<!-- Register Section Begin -->
<div class="register-login-section spad">
    <div class="container">
        <div class="row">
            <div class="col-lg-6 offset-lg-3">
                <div class="register-form">
                    <h2>Register</h2>
                    <form action="<c:url value='/dang-ky'/>" id="fromLogin" method="post">
                        <div class="group-input">
                            <label for="username">Username  *</label>
                            <input type="text" id="username" name="username">
                        </div>
                        <div class="group-input">
                            <label for="pass">Password *</label>
                            <input type="password" id="pass" name="password">
                        </div>
                        <div class="group-input">
                            <label for="con-pass">Confirm Password *</label>
                            <input type="password" id="con-pass" name="password1">
                        </div>
                        <div class="group-input">
                            <label for="phone">Number phone *</label>
                            <input type="text" id="phone" name="sodienthoai">
                        </div>
                        <div class="group-input">
                            <label for="email">Email *</label>
                            <input type="text" id="email" name="email">
                        </div>
                        <div class="group-input">
                            <label for="add">Address *</label>
                            <input type="text" id="add" name="diachi">
                        </div>
                        <input type="hidden" value="register" name="action"></input>
                        <button type="submit" class="site-btn register-btn">REGISTER</button>
                    </form>
                    <div class="switch-login">
                        <a href="/dang-nhap?action=login" class="or-login">Or Login</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Register Form Section End -->
</body>
</html>
