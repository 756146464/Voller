<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员登录</title>
<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css" />
<script src="../js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="../js/bootstrap.min.js" type="text/javascript"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet" href="../css/style.css" type="text/css" />

<style>
body {
	margin-top: 20px;
	margin: 0 auto;
	width: 100%;
}

.carousel-inner .item img {
	width: 100%;
	height: 300px;
}
</style>
</head>

<body>


<!-- 登录 注册 购物车... -->
<div class="container-fluid">
	<div class="col-md-4">
		<img src="../img/logo2.png" />
	</div>
	<div class="col-md-5">
		<img src="../img/header.png" />
	</div>
	<div class="col-md-3" style="padding-top:20px">
		<ol class="list-inline">
			<li><a href="login.jsp">登录</a></li>
			<li><a href="register.jsp">注册</a></li>
			<li><a href="cart.jsp">购物车</a></li>
			<li><a href="order_list.jsp">我的订单</a></li>
		</ol>
	</div>
</div>

<!-- 导航条 -->
<div class="container-fluid">
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">首页</a>
			</div>

			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">公务员考试<span class="sr-only">(current)</span></a></li>
					<li><a href="#">高考</a></li>
					<li><a href="#">中考</a></li>
					<li><a href="#">专升本</a></li>
				</ul>
				<form class="navbar-form navbar-right" role="search">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
			</div>
		</div>
	</nav>
</div>


	<div class="row" style="width: 1210px; margin: 0 auto;">


		<c:forEach items="${UserList.list}" var="user">
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="..${user.bimage}"
				width="170" height="170" style="display: inline-block;">
			</a>
			${user.bname}
			${user.bprice}
		</div>
		</c:forEach>
<%--		<div class="col-md-2" style="height: 230px">--%>
<%--			<a href="product_info.htm"> <img src="../bookImg/chushenggao_yingyu.jpg"--%>
<%--											 width="170" height="170" style="display: inline-block;">--%>
<%--			</a>--%>
<%--			<p>--%>
<%--				<a href="product_info.html" style='color: green'>初升高英语教材</a>--%>
<%--			</p>--%>
<%--			<p>--%>
<%--				<font color="#FF0000">商城价：&yen;99.00</font>--%>
<%--			</p>--%>
<%--		</div>--%>
<%--		<div class="col-md-2" style="height: 230px">--%>
<%--			<a href="product_info.htm"> <img src="/bookImg/chushenggao_yingyu.jpg"--%>
<%--											 width="170" height="170" style="display: inline-block;">--%>
<%--			</a>--%>
<%--			<p>--%>
<%--				<a href="product_info.html" style='color: green'>初升高英语教材</a>--%>
<%--			</p>--%>
<%--			<p>--%>
<%--				<font color="#FF0000">商城价：&yen;99.00</font>--%>
<%--			</p>--%>
<%--		</div>--%>
<%--		<div class="col-md-2" style="height: 230px">--%>
<%--			<a href="product_info.htm"> <img src="/bookImg/chushenggao_yingyu.jpg"--%>
<%--											 width="170" height="170" style="display: inline-block;">--%>
<%--			</a>--%>
<%--			<p>--%>
<%--				<a href="product_info.html" style='color: green'>初升高英语教材</a>--%>
<%--			</p>--%>
<%--			<p>--%>
<%--				<font color="#FF0000">商城价：&yen;99.00</font>--%>
<%--			</p>--%>
<%--		</div>--%>
<%--		<div class="col-md-2" style="height: 230px">--%>
<%--			<a href="product_info.htm"> <img src="/bookImg/chushenggao_yingyu.jpg"--%>
<%--											 width="170" height="170" style="display: inline-block;">--%>
<%--			</a>--%>
<%--			<p>--%>
<%--				<a href="product_info.html" style='color: green'>初升高英语教材</a>--%>
<%--			</p>--%>
<%--			<p>--%>
<%--				<font color="#FF0000">商城价：&yen;99.00</font>--%>
<%--			</p>--%>
<%--		</div>--%>
<%--		<div class="col-md-2" style="height: 230px">--%>
<%--			<a href="product_info.htm"> <img src="/bookImg/chushenggao_yingyu.jpg"--%>
<%--											 width="170" height="170" style="display: inline-block;">--%>
<%--			</a>--%>
<%--			<p>--%>
<%--				<a href="product_info.html" style='color: green'>初升高英语教材</a>--%>
<%--			</p>--%>
<%--			<p>--%>
<%--				<font color="#FF0000">商城价：&yen;99.00</font>--%>
<%--			</p>--%>
<%--		</div>--%>
<%--		<div class="col-md-2" style="height: 230px">--%>
<%--			<a href="product_info.htm"> <img src="/bookImg/chushenggao_yingyu.jpg"--%>
<%--											 width="170" height="170" style="display: inline-block;">--%>
<%--			</a>--%>
<%--			<p>--%>
<%--				<a href="product_info.html" style='color: green'>初升高英语教材</a>--%>
<%--			</p>--%>
<%--			<p>--%>
<%--				<font color="#FF0000">商城价：&yen;99.00</font>--%>
<%--			</p>--%>
<%--		</div>--%>
<%--		<div class="col-md-2" style="height: 230px">--%>
<%--			<a href="product_info.htm"> <img src="/bookImg/chushenggao_yingyu.jpg"--%>
<%--											 width="170" height="170" style="display: inline-block;">--%>
<%--			</a>--%>
<%--			<p>--%>
<%--				<a href="product_info.html" style='color: green'>初升高英语教材</a>--%>
<%--			</p>--%>
<%--			<p>--%>
<%--				<font color="#FF0000">商城价：&yen;99.00</font>--%>
<%--			</p>--%>
<%--		</div>--%>
<%--		<div class="col-md-2" style="height: 230px">--%>
<%--			<a href="product_info.htm"> <img src="/bookImg/chushenggao_yingyu.jpg"--%>
<%--											 width="170" height="170" style="display: inline-block;">--%>
<%--			</a>--%>
<%--			<p>--%>
<%--				<a href="product_info.html" style='color: green'>初升高英语教材</a>--%>
<%--			</p>--%>
<%--			<p>--%>
<%--				<font color="#FF0000">商城价：&yen;99.00</font>--%>
<%--			</p>--%>
<%--		</div>--%>
<%--		<div class="col-md-2" style="height: 230px">--%>
<%--			<a href="product_info.htm"> <img src="/bookImg/chushenggao_yingyu.jpg"--%>
<%--											 width="170" height="170" style="display: inline-block;">--%>
<%--			</a>--%>
<%--			<p>--%>
<%--				<a href="product_info.html" style='color: green'>初升高英语教材</a>--%>
<%--			</p>--%>
<%--			<p>--%>
<%--				<font color="#FF0000">商城价：&yen;99.00</font>--%>
<%--			</p>--%>
<%--		</div>--%>
<%--		<div class="col-md-2" style="height: 230px">--%>
<%--			<a href="product_info.htm"> <img src="/bookImg/chushenggao_yingyu.jpg"--%>
<%--											 width="170" height="170" style="display: inline-block;">--%>
<%--			</a>--%>
<%--			<p>--%>
<%--				<a href="product_info.html" style='color: green'>初升高英语教材</a>--%>
<%--			</p>--%>
<%--			<p>--%>
<%--				<font color="#FF0000">商城价：&yen;99.00</font>--%>
<%--			</p>--%>
<%--		</div>--%>
<%--		<div class="col-md-2" style="height: 230px">--%>
<%--			<a href="product_info.htm"> <img src="/bookImg/chushenggao_yingyu.jpg"--%>
<%--											 width="170" height="170" style="display: inline-block;">--%>
<%--			</a>--%>
<%--			<p>--%>
<%--				<a href="product_info.html" style='color: green'>初升高英语教材</a>--%>
<%--			</p>--%>
<%--			<p>--%>
<%--				<font color="#FF0000">商城价：&yen;99.00</font>--%>
<%--			</p>--%>
<%--		</div>--%>

	</div>

	<!--分页 -->
	<div style="width: 480px; margin: 0 auto; margin-top: 50px;">
		<ul class="pagination" style="text-align: center; margin-top: 10px;">
			<li class="disabled"><a href="${pageContext.request.contextPath}/User/Userlist.do?pageNum=${UserList.pageNum-1}" aria-label="Previous"><span
					aria-hidden="true">&laquo;</span></a></li>
			<c:forEach begin="1" end="${UserList.pages}" var="i" step="1">
				<c:if test="${i==UserList.pageNum}">
			<li class="active"><a href="${pageContext.request.contextPath}/User/Userlist.do?pageNum=${i}">${i}</a></li>
				</c:if>
				<c:if test="${i!=UserList.pageNum}">
				<li><a href="${pageContext.request.contextPath}/User/Userlist.do?pageNum=${i}">${i}</a></li>
				</c:if>
			</c:forEach>
			<li><a href="${pageContext.request.contextPath}/User/Userlist.do?pageNum=${UserList.pageNum+1}" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
			</a></li>
		</ul>
	</div>
	<!-- 分页结束 -->



<div class="container-fluid">
	<div style="margin-top:50px;">
		<img src="../img/footer.jpg" width="100%" height="78" alt="我们的优势" title="我们的优势" />
	</div>

	<div style="text-align: center;margin-top: 5px;">
		<ul class="list-inline">
			<li><a href="info.jsp">关于我们</a></li>
			<li><a>联系我们</a></li>
			<li><a>招贤纳士</a></li>
			<li><a>法律声明</a></li>
			<li><a>友情链接</a></li>
			<li><a>支付方式</a></li>
			<li><a>配送方式</a></li>
			<li><a>服务声明</a></li>
			<li><a>广告声明</a></li>
		</ul>
	</div>
	<div style="text-align: center;margin-top: 5px;margin-bottom:20px;">
		Copyright &copy; 2005-2018 黑马商城 版权所有
	</div>
</div>

</body>

</html>