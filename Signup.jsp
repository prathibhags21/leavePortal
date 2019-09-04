
<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>

body
{
	background-color: white;
}

 .xyz
    {
          background-color: none;
          padding: 20px;
          width: 400px;
          height: 400px;
          border: double;
          border-width: 5px;
          color: black;
          margin-left: 480px;
          margin-top: 50px;
          border-color: black;
          



}
input[type=text]
{
height: 30px;
width:20vw;
border: solid 1px;
background:none;
color:black;
font-size: 15px;
margin:3px;
font-size: 15px;
margin-bottom:2px;
padding:2px;
border-color:black;
}

input[type=submit]
{
	
	height:40px;
	width: 100%;
    color: black;
    border:1px solid ;
    font-weight: bold;
    font-size: 15px;
    background-color: grey;
    margin-top:20px;
}
input[type=date]
{
height: 30px;
margin:2px;
outline:none;
background:none;
}
input[type=select]
{
height: 30px;
font-size: 15px;
}

select
{
	height: 30px;
	background: none;
}
#lable
{
	font-size: 20px;
	font-weight: 10px; 
	margin:3px;
	margin-right: 5px;
	color:black;
}

#btn
{   background-color:grey;
	margin:20px;
	width:27vw;
	margin-top: 30px;
	height:6vh;
	color:black;
	font-size:18px;
	
	
}

#report
{
	height: 30px;
width:20vw;
border: solid 1px;
border-color:black;
}

#h1{
	color:black;
}

</style>

</head>

<body>
<a href="Login">logout</a>

<div class="xyz">


 <form action="Signup"  method="post">

<h1 align="center" id="h1" >SIGNUP</h1>

<table>

<tr>
	<td><lable id="lable" >UserName:</lable></td>
<td><input type="text" name="userName" placeholder="UserName"></td>
<tr>
	
<tr>
	<td><lable id="lable">Email:</lable></td>
<td><input type="text" name="email" placeholder="Email"></td>
</tr>

<tr>
	<td><lable id="lable"> MobileNo:</lable></td>
<td><input type="text" name="mobile" placeholder="Mobile Number"></td>
</tr>


<tr>
	<td><lable id="lable"> Password:</lable></td>
<td><input type="text" name="password" placeholder="Password"></td>
</tr>


<tr>
	<td><lable id="lable">User Type</lable></td>
	<td><select name="userType" id="report">
	    <option value=" ">select</option>
        <option value="user">user</option>
        <option value="admin">admin</option>
        <option value="manager">manager</option>
        
</select></td>
</tr>

       
</table>

<input type="submit" value="submit" id="btn">
</form>

</div>

</body>

</html>