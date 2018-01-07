<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" >
<script>
function validate()
{
	var msg="";
    var username=document.sampleform.uname.value;
	var sex=document.sampleform.sex.value;
	var dob=document.sampleform.dob.value;

                if(username.length==0 && sex.length==0 && dob.length==0)
                                        msg=msg+"Please enter all the details \n";
				if(username.length>30)
					msg=msg+"please enter username with max of 30 characteres or minumun of 2 characters \n";
				if(username.length<2)
					msg=msg+"please enter username with max of 30 characteres or minumun of 2 characters \n";
														
                                if(msg.length>0) 
                                {
                                       window.alert(msg);
                                        valid=false;
                                }
                              else   
                                   valid=true;
                 return valid;
}
              </script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration Form</title>
</head>
<body>
<div align="center">
<form name="sampleform"  action="UserServlet" method="post" onsubmit="validate()">
<H3>User Registration Form</H3>
<table border="1">
<tr>
<th>UserName:</th>
<td><input type="text"  name="uname"></input></td>
</tr>
<tr>
<th>Sex:</th>
<td><input type="text"  name="sex"></input></td>
</tr>
<tr>
<th>DOB:</th>
<td><input type="text"  name="dob"></input></td>
</tr>
<tr>
<th>Address:</th>
<td><textarea name="add"></textarea></td>
</tr>
<tr>
<th>State:</th>
<td><select name="state" width="20">
<option value="scl">--Select---</option>
  <option value="andhra">Andhra</option>
  <option value="tamilnadu">Tamilnadu</option>
  <option value="maharastra">Maharastra</option>
  <option value="calcutta">Calcutta</option>
</select></td>
</tr>
<tr>
<th>Country:</th>
<td><input type="text"  value="india" name="country"></input></td>
</tr>
<tr>
<th>Contact No.:</th>
<td><input type="text"  name="contact"></input></td>
</tr>
</table><br/>
<input type="submit" value="Create User" name="create"></input>
<input type="hidden" value="Create User" name="hiddenmsg"></input>
<br/>
<a href="Home.html"><font size=4 face="cambria">Back to home page</font></a>
</form>
</div>
</body>
</html>