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
<title>Login</title>
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
			<div class="card mt-0" style="height: 350px !important;">
				<div class="card-header bg-dark">
					<h3>Đăng nhập</h3>
					<div class="d-flex justify-content-end social_icon">
						<span><i class="fab fa-facebook-square smaller text-light"></i></span>
						<span><i
							class="fab fa-google-plus-square smaller text-light"></i></span> <span><i
							class="fab fa-twitter-square smaller text-light"></i></span>
					</div>
				</div>
				<div class="card-body">
					<form class="mt-3" action="login" method="post">
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-user"></i></span>
							</div>
							<input type="text" class="form-control"
								placeholder="Tên đăng nhập" name="id" value="">

						</div>
						<div class="input-group form-group">
							<div class="input-group-prepend">
								<span class="input-group-text"><i class="fas fa-key"></i></span>
							</div>
							<input type="password" class="form-control"
								placeholder="Mật khẩu" name="pass" value="">
						</div>

						<div class="form-group">
							<input type="submit" value="Login"
								class="btn float-right login_btn btn-dark">
						</div>
					</form>
				</div>
				<div class="card-footer">
					<div class="d-flex justify-content-center links">
						Bạn chưa có tài khoản?&nbsp;<a href="sign-in"
							class="font-weight-bold">Đăng ký</a>
					</div>
					<div class="d-flex justify-content-center">
						<a href="#" class="text-danger">Quên mật khẩu?</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>