<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/9/2021
  Time: 7:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Fashi | Template</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="<c:url value="/template/web/css/bootstrap.min.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/template/web/css/font-awesome.min.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/template/web/css/themify-icons.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/template/web/css/elegant-icons.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/template/web/css/owl.carousel.min.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/template/web/css/nice-select.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/template/web/css/jquery-ui.min.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/template/web/css/slicknav.min.css"/>" type="text/css">
    <link rel="stylesheet" href="<c:url value="/template/web/css/style.css"/>" type="text/css">
    <script src="<c:url value="/template/web/js/jquery-3.3.1.min.js"/>"></script>

    <script src="<c:url value='/template/paging/jquery.twbsPagination.js' />"></script>
    <script src="<c:url value='/template/paging/jquery.twbsPagination.min.js' />"></script>
<%--    phan trang--%>

    <link href="<c:url value='/template/sweetalert/sweetalert2.min.css' />" rel="stylesheet" type="text/css" media="all" />
    <script type="text/javascript" src="<c:url value='/template/sweetalert/sweetalert2.min.js' />"></script>
<%--    canhr bao khi xoa--%>
</head>

<body>
<!-- Page Preloder -->
<div id="preloder">
    <div class="loader"></div>
</div>

<<header class="header-section">>
<%@include file="/common/web/headertop.jsp"%>


</header>

<%--body--%>
<dec:body/>
<%----%>


<!-- partner -->
<%@ include file="/common/web/partnerlogo.jsp" %>
<!-- / partner -->


<!-- footer -->
<%@ include file="/common/web/footerbot.jsp" %>
<!-- / footer -->






<!-- Js Plugins -->

<script src="<c:url value="/template/web/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/template/web/js/jquery-ui.min.js"/>"></script>
<script src="<c:url value="/template/web/js/jquery.countdown.min.js"/>"></script>
<script src="<c:url value="/template/web/js/jquery.nice-select.min.js"/>"></script>
<script src="<c:url value="/template/web/js/jquery.zoom.min.js"/>"></script>
<script src="<c:url value="/template/web/js/jquery.dd.min.js"/>"></script>
<script src="<c:url value="/template/web/js/jquery.slicknav.js"/>"></script>
<script src="<c:url value="/template/web/js/owl.carousel.min.js"/>"></script>
<script src="<c:url value="/template/web/js/main.js"/>"></script>
</body>
</html>
