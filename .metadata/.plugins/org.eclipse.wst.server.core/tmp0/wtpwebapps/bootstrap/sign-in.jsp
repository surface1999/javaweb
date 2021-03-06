<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link href="fontawesome/css/fontawesome.css" rel="stylesheet">
<link href="fontawesome/css/brands.css" rel="stylesheet">
<link href="fontawesome/css/solid.css" rel="stylesheet">
<link href="css/login1.css" rel="stylesheet">
<title>Sign in</title>
</head>
<body>
	<div class="login d-flex justify-content-center">
		<div style="margin-top: 150px;">
			<%
				String[] warnings = null;
				if (request.getAttribute("warning") != null) {
					warnings = (String[]) request.getAttribute("warning");
				}
				if (warnings != null) {
					for (String warning : warnings) {
			%>
			<div class="alert alert-danger" role="alert">
				<%=warning%>
			</div>
			<%
				}
				}
			%>
			<div class="card mt-0" style="height: 420px;">
				<div class="card-header bg-dark">
					<h3>Đăng ký</h3>
					<div class="d-flex justify-content-end social_icon">
						<span><i class="fab fa-facebook-square smaller text-light"></i></span>
						<span><i
							class="fab fa-google-plus-square smaller text-light"></i></span> <span><i
							class="fab fa-twitter-square smaller text-light"></i></span>
					</div>
				</div>
				<div class="p-4">
					<form action="sign-in" method="post">
						<div class="form-group">
							<label for="exampleInputEmail1">Tên người dùng:</label> <input
								type="text" class="form-control" id="exampleInputEmail1"
								aria-describedby="emailHelp" name="id" placeholder="Nhập tên người dùng.">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Mật khẩu:</label> <input
								type="password" class="form-control" id="exampleInputPassword1"
								name="pass" placeholder="Nhập mật khẩu.">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Nhập lại mật khẩu:</label> <input
								type="password" class="form-control" id="exampleInputPassword1"
								name="repass" placeholder="Nhập lại mật khẩu.">
						</div>
						<input type="submit" class="btn btn-dark" value="Đăng ký">
						<span class="mt-3 mr-3" style="float: right;"><a href="login" style="color: #0E80D7; font-size: smaller;">Trở về<i class="fas fa-undo ml-2"></i></a></span>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script src="bootstrap/js/jquery-3.5.1.min.js"></script>
	<script src="bootstrap/js/bootstrap.js"></script>
</body>
</html>