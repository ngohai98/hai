<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/10/2021
  Time: 12:10 AM
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
                <div class="breadcrumb-text">
                    <a href="/home"><i class="fa fa-home"></i> Home</a>
                    <span>ChangePass</span>
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
                <div class="login-form">
                    <h2>ChangePass</h2>
                    <form action="<c:url value='/changepass?action=changepass'/>" method="post">
                        <div class="group-input">
                            <c:if test="${not empty message}">
                                <div class="alert alert-${alert}">${message}</div>
                            </c:if>
                            <label for="oldpass">Old password</label>
                            <input type="password" id="oldpass" name="oldpass">
                        </div>
                        <div class="group-input">
                            <label for="newpass">New password</label>
                            <input type="password" id="newpass" name="newpass">
                        </div>
                        <div class="group-input">
                            <label for="compass">Comfirm password</label>
                            <input type="password" id="compass" name="compass">
                        </div>
                        <div class="group-input gi-check">
                            <div class="gi-more">
                                <label for="save-pass">
                                    <%--                                    Save Password--%>
                                    <input type="checkbox" id="save-pass">
                                    <span class="checkmark"></span>
                                </label>
                                <a href="#" class="forget-pass">Forget your Password</a>
                            </div>
                        </div>
                        <input type="hidden" value="login" name="action"/>
                        <button type="submit" class="site-btn login-btn">Agree</button>
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
