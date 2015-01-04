<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib  prefix="sf"  uri="http://www.springframework.org/tags/form"%>

<style>
.error {
    color: #ff0000;
    font-weight: bold;
}
</style>


<sf:form action="save" modelAttribute="userDetail" method="POST" cssClass="form-horizontal">
	<sf:errors path="*" cssClass="error"/>
	<div class="col-md-12">
		<div class="col-md-6">
			<div class="form-group">
		    	<label class="col-sm-2 control-label">Username</label>
		    	<div class="col-sm-10">
		    		<sf:input path="username"  cssClass="form-control"/>
		    	</div>
	  		</div>
	  		
	  		<%
	  			String genders[] = {"Male", "Female"};
	  			pageContext.setAttribute("genders", genders);
	  		%>
	  		
	 		<div class="form-group">
		    	<label class="col-sm-2 control-label">Gender</label>
		    	<div class="col-sm-10">
		    		<sf:select path="gender" items="${genders}" cssClass="form-control"></sf:select>
		    	</div>
	 		</div>
		  
		  	<div class="form-group">
		    	<label class="col-sm-2 control-label">DOB</label>
		    	<div class="col-sm-10">
		      		<sf:input path="dob" cssClass="form-control"/>
		    	</div>
	 		</div>
		  
		  	<div class="form-group">
		    	<label class="col-sm-2 control-label">Age</label>
		    	<div class="col-sm-10">
		      		<sf:input path="age" cssClass="form-control"/>
		    	</div>
	 		</div>
			
			<div class="form-group">
		    	<label class="col-sm-2 control-label">Email</label>
		    	<div class="col-sm-10">
		      		<sf:input path="email" cssClass="form-control"/>
		    	</div>
	 		</div>
			
			<div class="form-group">
		    	<label class="col-sm-2 control-label">Phone</label>
		    	<div class="col-sm-10">
		      		<sf:input path="phone" cssClass="form-control"/>
		    	</div>
	 		</div>
	 		
		</div>
	
		<div class="col-md-6">
			<div class="form-group">
		    	<label class="col-sm-2 control-label">City</label>
		    	<div class="col-sm-10">
		      		<sf:input path="userAddress.city" cssClass="form-control"/>
		    	</div>
	  		</div>
	  
	 		<div class="form-group">
		    	<label class="col-sm-2 control-label">Country</label>
		    	<div class="col-sm-10">
		      		<sf:input path="userAddress.country" cssClass="form-control"/>
		    	</div>
	 		</div>
		  
		  	<div class="form-group">
		    	<label class="col-sm-2 control-label">Pin</label>
		    	<div class="col-sm-10">
		      		<sf:input path="userAddress.pin" cssClass="form-control"/>
		    	</div>
	 		</div>
	 		
		</div>
	</div>
	
	<div class="col-md-12">
		<input class="col-md-offset-1 btn btn-success btn-lg" style="width:20%" type="submit"/>
	</div>
</sf:form>