<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>关于我们</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	type="text/css" />
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"
	type="text/javascript"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css" type="text/css" />
</head>
<body>
	<!--
            	描述：页脚部分
            -->
	<div class="container-fluid">
		<div style="margin-top: 50px;">
			<img src="${pageContext.request.contextPath}/img/footer.jpg"
				width="100%" height="180" />
		</div>

		<div style="text-align: center; margin-top: 5px;">
			<ul class="list-inline">
				<li><a href="${pageContext.request.contextPath}/jsp/about.jsp">关于我们</a></li>
				<li><a href="#">加入我们</a></li>
				<li><a href="#">合作招商</a></li>
				<li><a href="#">友情链接</a></li>
				<li><a href="#">法律公告</a></li>
				<li><a href="https://www.nefu.edu.cn/">东北林业大学</a></li>
				<li><a
					href="${pageContext.request.contextPath}/admin/index.jsp">管理员入口</a></li>
			</ul>
		</div>
		<div style="text-align: center; margin-top: 5px; margin-bottom: 20px;">
			Copyright &copy; 1998-2018 东北林业大学商城 版权所有</div>
	</div>
</body>
</html>