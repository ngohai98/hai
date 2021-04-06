<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/9/2021
  Time: 7:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- Header Section Begin -->

    <div class="header-top">
        <div class="container">
            <div class="ht-left">
                <div class="mail-service">
                    <i class=" fa fa-envelope"></i>
                    NgoHai@gmail.com
                </div>
                <div class="phone-service">
                    <i class=" fa fa-phone"></i>
                    0336363131
                </div>
            </div>
            <div class="ht-right">
<%--                <c:if test="${empty UESRMODEL}">--%>
<%--                    --%>

<%--                </c:if>--%>
<%--                <c:if test="${not empty USERMODEL}">--%>
<%--                    --%>
<%--                </c:if>--%>

                         <c:if test="${not empty USERMODEL}">
                             <a data-toggle="dropdown" href="#" class="login-panel">
                                 Xin chào, ${USERMODEL.user_ten}</a>
                             <a href="<c:url value="/dang-nhap?action=logout"/>" class="login-panel"><i class="fa fa-user"></i>Logout</a>
                             <a href="<c:url value="/changepass?action=changepass&userten=${USERMODEL.user_ten}&userid=${USERMODEL.user_ten}"/>" class="login-panel"><i class="fa fa-user"></i>Change Pass</a>

                         </c:if>
                        <c:if test="${empty USERMODEL}">
                            <a href="<c:url value="/dang-ky?action=register"/>" class="login-panel"><i class="fa fa-user"></i>Register</a>
                            <a href="<c:url value="/dang-nhap?action=login"/>" class="login-panel"><i class="fa fa-user"></i>Login</a>
                            <a href="<c:url value="/dang-nhap?action=login"/>" class="login-panel"><i class="fa fa-user"></i>My Account</a>

                        </c:if>


<%--                <c:if test="${empty USERMODEL}">--%>
<%--                 </c:if>--%>
<%--                <c:if test="${not empty USERMODEL}">--%>
<%--                    &lt;%&ndash;                        <li><a href="<c:url value="/changepass"/>">Change Pass</a></li>&ndash;%&gt;--%>
<%--                </c:if>--%>
                <div class="lan-selector">
                    <select class="language_drop" name="countries" id="countries" style="width:300px;">
                        <option value='yt' data-image="<c:url value="/template/web/img/222.png"/>" style="width:27px; height: 14px;" data-imagecss="flag yt"
                                data-title="VietNam"></option>
                        <option value='yu' data-image="<c:url value="/template/web/img/flag-2.jpg"/>" data-imagecss="flag yu"
                                data-title="English"></option>
                    </select>
                </div>
                <div class="top-social">
                    <a href="#"><i class="ti-facebook"></i></a>
                    <a href="#"><i class="ti-twitter-alt"></i></a>
                    <a href="#"><i class="ti-linkedin"></i></a>
                    <a href="#"><i class="ti-pinterest"></i></a>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="inner-header">
            <div class="row">
                <div class="col-lg-2 col-md-2">
                    <div class="logo">
                        <a href="./index.html">
                            <img src="<c:url value="/template/web/img/logo2.png"/>" alt="">
                        </a>
                    </div>
                </div>
                <div class="col-lg-7 col-md-7">
                    <div class="advanced-search">
                        <button type="button" class="category-btn">All Categories</button>
                        <div class="input-group">
                            <input type="text" placeholder="What do you need?">
                            <button type="button"><i class="ti-search"></i></button>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 text-right col-md-3">
                    <ul class="nav-right">
                        <li class="heart-icon">
                            <a href="#">
                                <i class="icon_heart_alt"></i>
                                <span>1</span>
                            </a>
                        </li>
                        <li class="cart-icon">
                            <a href="#">
                                <i class="icon_bag_alt"></i>
                                <span>3</span>
                            </a>
                            <div class="cart-hover">
                                <div class="select-items">
                                    <table>
                                        <tbody>
                                        <tr>
                                            <td class="si-pic"><img src="<c:url value="/template/web/img/select-product-1.jpg"/>" alt=""></td>
                                            <td class="si-text">
                                                <div class="product-selected">
                                                    <p>$60.00 x 1</p>
                                                    <h6>Kabino Bedside Table</h6>
                                                </div>
                                            </td>
                                            <td class="si-close">
                                                <i class="ti-close"></i>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="si-pic"><img src="<c:url value="/template/web/img/select-product-2.jpg"/>" alt=""></td>
                                            <td class="si-text">
                                                <div class="product-selected">
                                                    <p>$60.00 x 1</p>
                                                    <h6>Kabino Bedside Table</h6>
                                                </div>
                                            </td>
                                            <td class="si-close">
                                                <i class="ti-close"></i>
                                            </td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="select-total">
                                    <span>total:</span>
                                    <h5>$120.00</h5>
                                </div>
                                <div class="select-button">
                                    <a href="#" class="primary-btn view-card">VIEW CARD</a>
                                    <a href="#" class="primary-btn checkout-btn">CHECK OUT</a>
                                </div>
                            </div>
                        </li>
                        <li class="cart-price">$150.00</li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="nav-item">
        <div class="container">
            <div class="nav-depart">
                <div class="depart-btn">
                    <i class="ti-menu"></i>
                    <span>All departments</span>


<ul class="depart-hover">
    <c:forEach var="item" items="${ brands}">
                        <li ><a href="<c:url value='/shop?hangid=${item.hang_id}'/>">${item.hang_ten}</a></li>


<%--                        <li><a href="#">Luxury Brands</a></li>--%>
<%--                        <li><a href="#">Brand Outdoor Apparel</a></li>--%>
    </c:forEach>
    <li><a href="#">Tai nghe</a></li>
    <li><a href="#">Sặc dự phòng</a></li>
    <li><a href="#">Sặc điện thoại</a></li>
                    </ul>

                </div>
            </div>
            <nav class="nav-menu mobile-menu">
                <ul>
                    <li class="active"><a href="/home">Home</a></li>
                    <li><a href="/shop">Shop</a></li>
<%--                    <li><a href="#">Collection</a>--%>
<%--                        <ul class="dropdown">--%>
<%--                            <li><a href="/shop">Iphone</a></li>--%>
<%--                            <li><a href="#">Vsmart</a></li>--%>
<%--                            <li><a href="#">SamSung</a></li>--%>
<%--                        </ul>--%>
<%--                    </li>--%>
                    <li><a href="/blog">Blog</a></li>
                    <li><a href="/contact">Contact</a></li>
                    <li><a href="#">Pages</a>
                        <ul class="dropdown">
                            <li><a href="/blog-details">Blog Details</a></li>
                            <li><a href="<c:url value='/cart?page=1&maxPageItem=5'/>">Shopping Cart</a></li>
                            <li><a href="/checkout">Checkout</a></li>
                            <li><a href="/faq">Faq</a></li>
<%--                            <li><a href="/register">Register</a></li>--%>
<%--                            <li><a href="/login">Login</a></li>--%>
                        </ul>
                    </li>
                </ul>
            </nav>
            <div id="mobile-menu-wrap"></div>
        </div>
    </div>

<!-- Header End -->

</body>
</html>
