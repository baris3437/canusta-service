<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/jsp/include/allDefinitions.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="${assets}/styles/main.css" />
<link rel="stylesheet" href="${assets}/styles/external/bootstrap.min.css">
<script type="text/javascript" src="${assets}/js/external/jquery-3.3.1.min.js"></script>

<c:set var="restActionUrl">${baseUrl}/login/doLogin</c:set>
<c:set var="dashboardUrl">${baseUrl}/main/dashboard</c:set>

<script>
	$(document).ready(function() {
		$("#loginButton").click(function(e) {
			
			console.log("running do login")
		    
			var url = "${restActionUrl}";
			var data = {
				"userId" : $('#userId').val(),
				"password" : $('#password').val()
			};
			
			$.ajax({
			  type: "POST",
			  url: url,
			  data: data,
			  success: function(data){
				  window.location.href = "${dashboardUrl}";
			  },
			  dataType: "json"
			});
		});
	});

</script>

</head>

<body>
		<header>
			<h2 style="text-align: center">Can Usta Kasap & Restaurant</h2>
		</header>	
		
		<div class="login-container">
			<div class="login-inner">
				<form id="loginForm" method="POST">
					<div class="imgcontainer">
						<img src="${assets}/img/img_avatar2.png" alt="Avatar" class="avatar">
					</div>
			
					<div class="login-inner-container">
						<div>
							<label><b>Kullanıcı Adı</b></label> <br>
							<input type="text" placeholder="Kullanıcı Adı" name="userId" id="userId" required>
						</div> 
						<div>
							<label><b>Şifre</b></label> <br>
							<input type="password" placeholder="Kullanıcı Şifre" name="password" id="password" required>
						</div>
						
						<div><button type="button" id="loginButton">Giriş Yap</button></div>
						
						<label> <input type="checkbox" checked="checked">
							Beni Hatırla
						</label>
					</div>
			
					<div class="login-inner-container" style="background-color: #f1f1f1">
						<span ><a href="#">Şifremi unuttum</a></span>
					</div>
				</form>
			</div>
		</div>
		
		<footer>
			Can Usta Kasap & Restaurant ©2018
		</footer>
</body>
</html>