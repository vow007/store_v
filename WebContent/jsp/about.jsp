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
	<div class="container">

		<%@ include file="/jsp/header.jsp"%>

		<div class="container">
			<p>
			<h1>东北林业大学商城 介绍：</h1>
			</p>
			<br>随着互联网的发展成熟，网上商城系统的搭建能够帮助企业把现有的业务系统整合，网上商城系统又称在线商城系统，是一个功能完善的在线购物系统，
			主要为在线销售和在线购物服务。 其功能主要分为两部分，一部分是面向用户部分，包含： 用户在线注册、购物、提交订单、付款等操作；
			另一部分是商城管理部分，这部分的内容包括：产品的添加、删除、查询、订单的管理、操作员的管理、注册会员的管理等。 </br> <br>集中优势资源为客户提供个性化服务，并为企业创建一个良好的收入渠道。</br>
			<p>
			<h1>开发人员：</h1>
			</p>
			进哥：&nbsp;负责登录及注册模块，首页商品分类展示模块实现，以及将项目部署到阿里云服务器，负责工程上线调试。<br>
			李某：&nbsp;负责前端页面及UI设计<br>
			小明：&nbsp;负责购物车，及订单模块的实现，以及后期连接第三方：易宝支付功能实现，后台管理部分<br>
			老肖：&nbsp;负责部分前端页面及UI设计，后台管理模块的实现以及数据库的设计及数据录入等<br>


		</div>

		<%@ include file="/jsp/footer.jsp"%>
	</div>

</body>

</html>