<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/9/2021
  Time: 11:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<c:url var="APIurl" value="/add-tocart"/>

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
                    <span>Shop</span>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Breadcrumb Section Begin -->

<!-- Product Shop Section Begin -->
<section class="product-shop spad">
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-md-6 col-sm-8 order-2 order-lg-1 produts-sidebar-filter">
                <div class="filter-widget">
                    <h4 class="fw-title">Categories</h4>
                    <c:forEach var="item" items="${ brands}">
                        <ul class="filter-catagories">
                            <li><a id="fid" style="color: #70369c;"
                                   href="<c:url value='/shop?hangid=${item.hang_id}'/>">${item.hang_ten}</a></li>
                        </ul>
                    </c:forEach>
                </div>

            </div>
            <div class="col-lg-9 order-1 order-lg-2">
                <div class="product-show-option">
                    <div class="row">
                        <div class="col-lg-7 col-md-7">
                            <div class="select-option">
                                <select class="sorting">
                                    <option value="">Default Sorting</option>
                                </select>
                                <select class="p-show">
                                    <option value="">Show:</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-lg-5 col-md-5 text-right">
                            <p>Show 01- 09 Of 36 Product</p>
                        </div>
                    </div>
                </div>
                <div class="product-list">
                    <div class="row">
                        <c:forEach var="item" begin="0" end="7" items="${model.listResult}">
                            <div class="col-lg-4 col-sm-6">
                                <div class="product-item">
                                    <div class="pi-pic">
                                        <img src="${item.dt_HinhAnh}" alt="">
                                        <div class="sale pp-sale">Sale</div>
                                        <div class="icon">
                                            <i class="icon_heart_alt"></i>
                                        </div>
                                        <ul>
                                            <li>
                                                <button type="button" class="addtocart" data-dtid="${item.dt_id}"
                                                        data-userid="${USERMODEL.user_id}">
                                                    <i class="fa fa-shopping-cart"></i>Thêm vào giỏ hàng
                                                </button>
                                            </li>
                                                <%--
                                                                                        <li class="addtocart"><a href="#" title="addtocart" data-dtid="${item.dt_id}" data-userid="${USERMODEL.user_id}"><i class="icon_bag_alt"></i></a></li>
                                                --%>
                                            <li class="quick-view"><a href="#">+ Quick View</a></li>
                                            <li class="w-icon"><a href="/shop-details?dt_id=${item.dt_id}"
                                                                  title="Details"><i class="fa fa-random"></i></a></li>
                                        </ul>
                                    </div>
                                    <div class="pi-text">
                                        <div class="catagory-name">SmartPhone</div>
                                        <a href="#">
                                            <h5>${item.dt_Ten}</h5>
                                        </a>
                                        <div class="product-price">
                                                ${item.dt_GiaBan} đ
                                                <%--                                        <span>$35.00</span>--%>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
                <div class="loading-more">
                    <i class="icon_loading"></i>
                    <a href="#">
                        Loading More
                    </a>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Product Shop Section End -->
<script>
    $('.addtocart').on("click", function () {
        var gh_dt_id = $(this).data("dtid");
        var gh_user_id = $(this).data("userid");

        var data = {gh_dt_id: gh_dt_id, gh_user_id: gh_user_id};
        addtocart(data);
    })

    function addtocart(data) {
        $.ajax({
            url: '${APIurl}',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(data),
            dataType: 'json',
            success: function (result) {

                alert(" Thêm vào giỏ hàng thành công");
            },
            error: function (error) {
                alert("Bạn chưa đăng nhập");
            }
        });
    }
</script>
</body>
</html>
