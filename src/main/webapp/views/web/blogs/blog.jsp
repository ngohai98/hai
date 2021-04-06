<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/10/2021
  Time: 12:01 AM
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
                    <span>Blog</span>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Breadcrumb Section Begin -->

<!-- Blog Section Begin -->
<section class="blog-section spad">
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-md-6 col-sm-8 order-2 order-lg-1">
                <div class="blog-sidebar">
                    <div class="search-form">
                        <h4>Search</h4>
                        <form action="#">
                            <input type="text" placeholder="Search . . .  ">
                            <button type="submit"><i class="fa fa-search"></i></button>
                        </form>
                    </div>
                    <div class="blog-catagory">
                        <h4>Categories</h4>
                        <ul>
                            <li><a href="#">Fashion</a></li>
                            <li><a href="#">Travel</a></li>
                            <li><a href="#">Picnic</a></li>
                            <li><a href="#">Model</a></li>
                        </ul>
                    </div>
<%--                    <div class="recent-post">--%>
<%--                        <h4>Recent Post</h4>--%>
<%--                        <div class="recent-blog">--%>
<%--                            <a href="#" class="rb-item">--%>
<%--                                <div class="rb-pic">--%>
<%--                                    <img src="<c:url value="/template/web/img/blog/recent-1.jpg"/>" alt="">--%>
<%--                                </div>--%>
<%--                                <div class="rb-text">--%>
<%--                                    <h6>The Personality Trait That Makes...</h6>--%>
<%--                                    <p>Fashion <span>- May 19, 2019</span></p>--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                            <a href="#" class="rb-item">--%>
<%--                                <div class="rb-pic">--%>
<%--                                    <img src="<c:url value="/template/web/img/blog/recent-2.jpg"/>" alt="">--%>
<%--                                </div>--%>
<%--                                <div class="rb-text">--%>
<%--                                    <h6>The Personality Trait That Makes...</h6>--%>
<%--                                    <p>Fashion <span>- May 19, 2019</span></p>--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                            <a href="#" class="rb-item">--%>
<%--                                <div class="rb-pic">--%>
<%--                                    <img src="<c:url value="/template/web/img/blog/recent-3.jpg"/>" alt="">--%>
<%--                                </div>--%>
<%--                                <div class="rb-text">--%>
<%--                                    <h6>The Personality Trait That Makes...</h6>--%>
<%--                                    <p>Fashion <span>- May 19, 2019</span></p>--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                            <a href="#" class="rb-item">--%>
<%--                                <div class="rb-pic">--%>
<%--                                    <img src="<c:url value="/template/web/img/blog/recent-4.jpg"/>" alt="">--%>
<%--                                </div>--%>
<%--                                <div class="rb-text">--%>
<%--                                    <h6>The Personality Trait That Makes...</h6>--%>
<%--                                    <p>Fashion <span>- May 19, 2019</span></p>--%>
<%--                                </div>--%>
<%--                            </a>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                    <div class="blog-tags">--%>
<%--                        <h4>Product Tags</h4>--%>
<%--                        <div class="tag-item">--%>
<%--                            <a href="#">Towel</a>--%>
<%--                            <a href="#">Shoes</a>--%>
<%--                            <a href="#">Coat</a>--%>
<%--                            <a href="#">Dresses</a>--%>
<%--                            <a href="#">Trousers</a>--%>
<%--                            <a href="#">Men's hats</a>--%>
<%--                            <a href="#">Backpack</a>--%>
<%--                        </div>--%>
<%--                    </div>--%>
                </div>
            </div>
            <div class="col-lg-9 order-1 order-lg-2">
                <div class="row">


                    <div class="col-lg-6 col-sm-6">
                        <div class="blog-item">
                            <div class="bi-pic">
                                <img src="<c:url value="/template/web/img/blog/blogIP1.jpg"/>" alt="">
                            </div>
                            <div class="bi-text">
                                <a href="/blog-details">
                                    <h4>Founder of Iphone</h4>
                                </a>
                                <p>famous people <span>- May 19, 2019</span></p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 col-sm-6">
                        <div class="blog-item">
                            <div class="bi-pic">
                                <img src="<c:url value="/template/web/img/blog/blogSamSung1.jpg"/>" alt="">
                            </div>
                            <div class="bi-text">
                                <a href="/blog-details">
                                    <h4>Founder of SamSung</h4>
                                </a>
                                <p>famous people <span>- May 19, 2019</span></p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6 col-sm-6">
                        <div class="blog-item">
                            <div class="bi-pic">
                                <img src="<c:url value="/template/web/img/blog/BlogVsmart.jpg"/>" alt="">
                            </div>
                            <div class="bi-text">
                                <a href="/blog-details">
                                    <h4>Last week I had my first work trip of the year to Sonoma Valley</h4>
                                </a>
                                <p>famous people <span>- May 19, 2019</span></p>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-12">
                        <div class="loading-more">
                            <i class="icon_loading"></i>
                            <a href="#">
                                Loading More
                            </a>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
</section>

<!-- Blog Section End -->
</body>
</html>
