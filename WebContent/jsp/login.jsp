<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.text.SimpleDateFormat,java.util.Date"%>
<%@page import="java.text.SimpleDateFormat,java.util.Date"%>
<!doctype html>
<html>


<body>



	<%@ include file="/jsp/header.jsp"%>





	</div>
	<div class="space_08"></div>
	</div>

	<div
		style="width: 350px; border: #a5d1f1 1px solid; background: #FFF; margin: 0 auto;">
		<div class="T2_title hrbottom">
			<h3>&nbsp用户登录</h3>
			<div>${msg}</div>
		</div>

		<form class="form-horizontal"
			action="${pageContext.request.contextPath}/UserServlet?method=userLogin"
			method="post">

			<div class="form-group">
				<label for="username" class="col-sm-3 control-label">用户名</label>
				<div class="col-sm-6">
					<input type="text" name="username" class="form-control"
						id="username" placeholder="请输入用户名">
				</div>
			</div>
			<div class="form-group">
				<label for="inputPassword3" class="col-sm-3 control-label">密码</label>
				<div class="col-sm-6">
					<input type="password" name="password" class="form-control"
						id="inputPassword3" placeholder="请输入密码">
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-3 col-sm-7">
					<input type="submit" width="100" value="登录" name="submit"
						border="0"
						style="background: url('${pageContext.request.contextPath}/img/login.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0);
    height:35px;width:100px;color:white;">
				</div>
			</div>
		</form>
	</div>
	<div class="space_20"></div>
	<div class="T2_wrap"></div>
	<%@ include file="/jsp/footer.jsp"%>
</body>

</html>