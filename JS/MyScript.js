/**
 * 
 */




var $ = function(id) {
    return document.getElementById(id);
};

var validEmail=function(){
	
	var email1 = $("email_address1").value;
	var email2 = $("email_address2").value;
	var firstName = $("first_name").value;

	if( email1 != email2 )  {
		alert("Error: e-mail's must match");  
	}
	
	else if ( (email1 =="") || (email2=="") || (firstName=="") )	{
		alert("Error: You must fill in the blanks");
	}
		
	else {
		$("email_form").submit();	
		
	};

}

	
	
	
	
	
	
	
	
	
	
	






