<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员登录</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css" />
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js" type="text/javascript"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css" />

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
	<script>
		$(function () {
			$.post("${pageContext.request.contextPath}/book/findAll",{},function (data) {
				$("#booklist").empty();
				for (var i = 0; i < data.bookList.length; i++) {
					var book = data.bookList[i];
					$("#booklist").append('<div class="col-md-2" style="height: 230px">' +
							'<a href="product_info.html"> <img src="'+book.bimage+'"' +
							'width="170" height="170" style="display: inline-block;">' +
							'</a>' +
							'<p>' +
							'<a href="product_info.html" style="color: green">'+book.bname+'</a>' +
							'</p>' +
							'<p>' +
							'<font color="#FF0000">商城价：&yen;'+book.bprice+'</font>' +
							'</p>' +
							'</div>')
				}
				$("#bookpage").empty()
				if(data.pageNum==1) {
					$("#bookpage").append("<li class=\"disabled\"><a href=\"${pageContext.request.contextPath}/book/findAll?pageNum=1\" aria-label=\"Previous\"><span " +
							"aria-hidden=\"true\">&laquo;</span></a></li>")
				}
				if(data.pageNum != 1){
					$("#bookpage").append("<li><a href=\"${pageContext.request.contextPath}/book/findAll?pageNum="+(data.pageNum-1)+"\" aria-label=\"Previous\"><span " +
							"aria-hidden=\"true\">&laquo;</span></a></li>")
				}
				for (var i = 1; i <= data.pages; i++) {
					$("#bookpage").append('<li><a href="#">'+i+'</a></li>')
				}
				if(data.pageNum==data.pages) {
					$("#bookpage").append("<li class=\"disabled\"><a href=\"${pageContext.request.contextPath}/book/findAll?pageNum=1\" aria-label=\"Previous\"><span " +
							"aria-hidden=\"true\">&raquo;</span></a></li>")
				}
				if(data.pageNum != data.pages){
					$("#bookpage").append("<li><a href=\"${pageContext.request.contextPath}/book/findAll?pageNum="+(data.pageNum+1)+"\" aria-label=\"Previous\"><span " +
							"aria-hidden=\"true\">&raquo;</span></a></li>")
				}
			})
		})
	</script>
</head>

<body>


<!-- 登录 注册 购物车... -->
<div class="container-fluid">
	<div class="col-md-4">
		<img src="${pageContext.request.contextPath}/img/logo2.png" />
	</div>
	<div class="col-md-5">
		<img src="${pageContext.request.contextPath}/img/header.png" />
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


	<div class="row" style="width: 1210px; margin: 0 auto;" id="booklist">


		<div class="col-md-2" style="height: 230px">
			<a href="product_info.html"> <img src="${pageContext.request.contextPath}/bookImg/chushenggao_yingyu.jpg"
				width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>初升高英语教材</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;99.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="${pageContext.request.contextPath}/bookImg/chushenggao_yingyu.jpg"
											 width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>初升高英语教材</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;99.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="${pageContext.request.contextPath}/bookImg/chushenggao_yingyu.jpg"
											 width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>初升高英语教材</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;99.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="${pageContext.request.contextPath}/bookImg/chushenggao_yingyu.jpg"
											 width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>初升高英语教材</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;99.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="${pageContext.request.contextPath}/bookImg/chushenggao_yingyu.jpg"
											 width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>初升高英语教材</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;99.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="${pageContext.request.contextPath}/bookImg/chushenggao_yingyu.jpg"
											 width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>初升高英语教材</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;99.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="${pageContext.request.contextPath}/bookImg/chushenggao_yingyu.jpg"
											 width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>初升高英语教材</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;99.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="${pageContext.request.contextPath}/bookImg/chushenggao_yingyu.jpg"
											 width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>初升高英语教材</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;99.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="${pageContext.request.contextPath}/bookImg/chushenggao_yingyu.jpg"
											 width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>初升高英语教材</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;99.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="${pageContext.request.contextPath}/bookImg/chushenggao_yingyu.jpg"
											 width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>初升高英语教材</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;99.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="${pageContext.request.contextPath}/bookImg/chushenggao_yingyu.jpg"
											 width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>初升高英语教材</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;99.00</font>
			</p>
		</div>
		<div class="col-md-2" style="height: 230px">
			<a href="product_info.htm"> <img src="${pageContext.request.contextPath}/bookImg/chushenggao_yingyu.jpg"
											 width="170" height="170" style="display: inline-block;">
			</a>
			<p>
				<a href="product_info.html" style='color: green'>初升高英语教材</a>
			</p>
			<p>
				<font color="#FF0000">商城价：&yen;99.00</font>
			</p>
		</div>

	</div>

	<!--分页 -->
	<div style="width: 380px; margin: 0 auto; margin-top: 50px;">
		<ul class="pagination" style="text-align: center; margin-top: 10px;" id="bookpage">
			<li class="disabled"><a href="#" aria-label="Previous"><span
					aria-hidden="true">&laquo;</span></a></li>
			<li class="active"><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">4</a></li>
			<li><a href="#">5</a></li>
			<li><a href="#">6</a></li>
			<li><a href="#">7</a></li>
			<li><a href="#">8</a></li>
			<li><a href="#">9</a></li>
			<li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
			</a></li>
		</ul>
	</div>
	<!-- 分页结束 -->



<div class="container-fluid">
	<div style="margin-top:50px;">
		<img src="${pageContext.request.contextPath}/img/footer.jpg" width="100%" height="78" alt="我们的优势" title="我们的优势" />
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