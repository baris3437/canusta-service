<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/jsp/include/allDefinitions.jsp"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>SB Admin - Start Bootstrap Template</title>
  <!-- Bootstrap core CSS-->
  <link href="${baseUrl}/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="${baseUrl}/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="${assets}/styles/external/css/sb-admin.css" rel="stylesheet">
	  
  <c:set var="restActionUrl">${baseUrl}/login/doLogin</c:set>
  <c:set var="dashboardUrl">${baseUrl}/main/dashboard</c:set>

</head>

<body class="bg-dark">
  <div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Can Usta Kasap & Restaurant</div>
      <div class="card-body">
        <form>
          <div class="form-group">
            <label for="userId">Kullanıcı Adı</label>
            <input class="form-control" id="userId" type="email" aria-describedby="emailHelp" placeholder="Enter email">
          </div>
          <div class="form-group">
            <label for="password">Şifre</label>
            <input class="form-control" id="password" type="password" placeholder="Password">
          </div>
          <div class="form-group">
            <div class="form-check">
              <label class="form-check-label">
                <input class="form-check-input" type="checkbox">Beni Hatırla</label>
            </div>
          </div>
          <a class="btn btn-primary btn-block" href="#" id="loginButton">Giriş</a>
        </form>
      </div>
    </div>
  </div>
  <!-- Bootstrap core JavaScript-->
  <script src="${baseUrl}/vendor/jquery/jquery.min.js"></script>
  <script src="${baseUrl}/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Core plugin JavaScript-->
  <script src="${baseUrl}/vendor/jquery-easing/jquery.easing.min.js"></script>
  
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
  
</body>

</html>
