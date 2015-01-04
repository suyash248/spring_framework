<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1>Welcome ${userDetail.username}</h1>
<div class="col-md-12">
	
		<form class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">Gender : </label>
				<div class="col-sm-10">
					<p class="form-control-static">${userDetail.gender}</p>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">DOB : </label>
				<div class="col-sm-10">
					<p class="form-control-static">${userDetail.dob}</p>
				</div>
			</div>
		  	<div class="form-group">
				<label class="col-sm-2 control-label">Age : </label>
				<div class="col-sm-10">
					<p class="form-control-static">${userDetail.age}</p>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Hobby : </label>
				<div class="col-sm-10">
					<p class="form-control-static">${userDetail.hobby}</p>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Phone : </label>
				<div class="col-sm-10">
					<p class="form-control-static">${userDetail.phone}</p>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Email : </label>
				<div class="col-sm-10">
					<p class="form-control-static">${userDetail.email}</p>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">City : </label>
				<div class="col-sm-10">
					<p class="form-control-static">${userDetail.userAddress.city}</p>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Country : </label>
				<div class="col-sm-10">
					<p class="form-control-static">${userDetail.userAddress.country}</p>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Pin : </label>
				<div class="col-sm-10">
					<p class="form-control-static">${userDetail.userAddress.pin}</p>
				</div>
			</div>
		</form>
		
</div>