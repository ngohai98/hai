<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/10/2021
  Time: 12:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<c:url var="APIurl" value="/add-tocart" />
<c:url var="giohangURL" value="/cart" />
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
                <div class="breadcrumb-text product-more">
                    <a href="/home"><i class="fa fa-home"></i> Home</a>
                    <a href="/shop">Shop</a>
                    <span>Shopping Cart</span>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Breadcrumb Section Begin -->

<!-- Shopping Cart Section Begin -->
<section class="shopping-cart spad">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="cart-table">
                    <table>
                        <thead>
                        <tr>
                            <th>Image</th>
                            <th class="p-name">Product Name</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Total</th>
                            <th><i class="ti-close"></i></th>
                        </tr>
                        </thead>
                        <tbody>
                    <c:forEach var="item" items="${model.listResult}">
                        <tr>
                            <td class="cart-pic first-row"><img src="${item.phone.dt_HinhAnh}" style="width: 170px; height: 170px;" alt=""></td>
                            <td class="cart-title first-row">
                                <h5>${item.phone.dt_Ten}</h5>
                            </td>
                            <td class="p-price first-row">${item.phone.dt_GiaBan}</td>
                            <td class="qua-col first-row">
                                <div class="quantity">
                                    <div class="pro-qty">
                                        <input type="text" value="${item.gh_soluongmua}">
                                    </div>
                                </div>
                            </td>
                            <td class="total-price first-row">${item.gh_soluongmua*item.gh_gia} đ</td>
                            <td class="close-td first-row">
<%--                                <i class="ti-close"></i>--%>
                        <input type="hidden"  value="${ item.gh_id}" id="ghid" />
                        <input type="hidden"  value="${ item.gh_dt_id}" id="dtid" />
                        <button  type="button"  class="delete" title='Xóa khỏi giỏ hàng'>Xóa</button>
                            </td>
                        </tr>
                    </c:forEach>

                        </tbody>
<%--                        <ul class="pagination" id="pagination"></ul>--%>
<%--                        <input type="hidden" value="" id="page" name="page"/>--%>
<%--                        <input type="hidden" value="" id="maxPageItem" name="maxPageItem"/>--%>
<%--                        <input type="hidden" value="" id="sortName" name="sortName"/>--%>
<%--                        <input type="hidden" value="" id="sortBy" name="sortBy"/>--%>
<%--                        <input type="hidden" value="" id="type" name="type"/>--%>
                    </table>
                </div>

                <div class="row">
                    <div class="col-lg-4">
                        <div class="cart-buttons">
                            <a href="/shop" class="primary-btn continue-shop">Tiếp tục mua sắm</a>
                            <a href="#" class="primary-btn up-cart">Update cart</a>
                        </div>
                        <div class="discount-coupon">
                            <h6>Discount Codes</h6>
                            <form action="#" class="coupon-form">
                                <input type="text" placeholder="Enter your codes">
                                <button type="submit" class="site-btn coupon-btn">Apply</button>
                            </form>
                        </div>
                    </div>
                    <div class="col-lg-4 offset-lg-4">
                        <div class="proceed-checkout">
                            <ul>
<%--                                <li class="subtotal">Subtotal <span>$240.00</span></li>--%>
                                <li class="cart-total">Total <span>${item.gh_soluongmua*item.gh_gia}</span></li>
                            </ul>
                            <a href="/checkout" class="proceed-btn">Đặt hàng</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Shopping Cart Section End -->
<script>
    var totalPages = ${model.totalPage};
    var currentPage = ${model.page};
    var limit = 5;
    $(function () {
        window.pagObj = $('#pagination').twbsPagination({
            totalPages: totalPages,
            visiblePages: 10,
            startPage: currentPage,
            onPageClick: function (event, page) {
                if (currentPage != page) {
                    $('#maxPageItem').val(limit);
                    $('#page').val(page);
                    $('#sortName').val('title');
                    $('#sortBy').val('desc');
                    $('#type').val('list');
                    $('#formSubmit').submit();
                }
            }
        });
    });




    $('.delete').on("click", function(){
        swal({
            title: "Xác nhận xóa",
            text: "Bạn có chắc chắn muốn xóa hay không",
            type: "warning",
            showCancelButton: true,
            confirmButtonClass: "btn-success",
            cancelButtonClass: "btn-danger",
            confirmButtonText: "Xác nhận",
            cancelButtonText: "Hủy bỏ",
        }).then(function(isConfirm) {
            if (isConfirm) {
                var data = {};
                var gh_dt_id=$("#dtid").val();
                var gh_id=$("#ghid").val();
                data={gh_dt_id:gh_dt_id,gh_id:gh_id};
                deletecart(data);
            }
        });

    })
    function deletecart(data) {
        $.ajax({
            url : '${APIurl}',
            type : 'DELETE',
            contentType : 'application/json',
            data : JSON.stringify(data),
            dataType : 'json',
            success : function(result) {

                alert("Bạn đã xóa 1 mặt hàng");
                window.location.href = "${giohangURL}?page=1&maxPageItem=5";
            },
            error : function(error) {
                alert("Xóa mặt hàng này không thành công");
                window.location.href = "${giohangURL}?page=1&maxPageItem=5";
            }
        });
    }
</script>
</body>
</html>
