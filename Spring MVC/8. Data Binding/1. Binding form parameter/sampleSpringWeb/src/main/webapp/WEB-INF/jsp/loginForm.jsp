<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form action="save" method="POST" class="form-horizontal">
	<div class="col-md-12">
		<div class="col-md-6">
			<div class="form-group">
		    	<label class="col-sm-2 control-label">Username</label>
		    	<div class="col-sm-10">
		      		<input type="text" name="username" class="form-control" required="required"/>
		    	</div>
	  		</div>
	  
	 		<div class="form-group">
		    	<label class="col-sm-2 control-label">Email</label>
		    	<div class="col-sm-10">
		      		<input type="email" name="email" class="form-control"/>
		    	</div>
	 		</div>
		  
		  	<div class="form-group">
		    	<label class="col-sm-2 control-label">DOB</label>
		    	<div class="col-sm-10">
		      		<input type="text" name="dob" class="form-control"/>
		    	</div>
	 		</div>
		  
		  	<div class="form-group">
		    	<label class="col-sm-2 control-label">Age</label>
		    	<div class="col-sm-10">
		      		<input type="text" name="age" class="form-control"/>
		    	</div>
	 		</div>
			
			<div class="form-group">
		    	<label class="col-sm-2 control-label">Phone</label>
		    	<div class="col-sm-10">
		      		<input type="text" name="phone" class="form-control"/>
		    	</div>
	 		</div>
	 		
		</div>
	
		<div class="col-md-6">
			<div class="form-group">
		    	<label class="col-sm-2 control-label">City</label>
		    	<div class="col-sm-10">
		      		<input type="text" name="userAddress.city" class="form-control"/>
		    	</div>
	  		</div>
	  
	 		<div class="form-group">
		    	<label class="col-sm-2 control-label">Country</label>
		    	<div class="col-sm-10">
		      		<input type="text" name="userAddress.country" class="form-control"/>
		    	</div>
	 		</div>
		  
		  	<div class="form-group">
		    	<label class="col-sm-2 control-label">Pin</label>
		    	<div class="col-sm-10">
		      		<input type="text" name="userAddress.pin" class="form-control"/>
		    	</div>
	 		</div>
	 		
		</div>
	</div>
	
	<div class="col-md-12">
		<input class="col-md-offset-1 btn btn-success btn-lg" style="width:20%" type="submit"/>
	</div>
</form>