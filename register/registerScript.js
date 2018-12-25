/**
 * 
 */
"use strict";

var $=function(id){
	
	return document.getElementById(id);
}



var validateInputs= function() {
	
	var msg="missing: \n";
	
	var userEmail= $("email_field").value;
	if(userEmail=="") {
		msg +="-email\n"
		$("email_field").nextElementSibling.firstChild.nodeValue="This field is required";
	}

	var userNb= $("mobileNb_field").value;
	if(userNb==""){  
		msg +="-mobile number \n"
		$("mobileNb_field").nextElementSibling.firstChild.nodeValue="This field is reqired";
	
	}

	var userCountry= $("country").value;
	if(userCountry=="Please Select one: "){  
		msg +="-country\n"
		$("country").nextElementSibling.firstChild.nodeValue="This field is required";
	}
	var tosInput= $("terms");
	if(tosInput.checked==false){
		msg+="-You must accept Terms of service";
		$("terms").nextElementSibling.firstChild.nodeValue="This field is required";
	}
	if(msg!="missing: \n")
		alert(msg);
	
	else 
		$("emailForm").submit();
	
}
	


window.onload = function() {
	 $("register").onclick=validateInputs;
	 }














