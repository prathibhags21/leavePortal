<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<style>

body
{
	/*background-image: url("C:/Users/User/Desktop/New folder/6.jpg");*/
	background-color:white ;
}


 .xyz
    {
          background-color: none;
          padding: 20px;
          width: 400px;
          height: 250px;
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
{   background-color:#c1b9b9;
	margin:20px;
	width:27vw;
	margin-top: 40px;
	height:6vh;
	color:black;
	font-size:18px;

	
	
}

#h1{
	color:black;
}

#report
{
 width:280px;
 border:solid 1px;
}




</style>

</head>

<body>

<div class="xyz">


 <form action="Login"  method="post">

<h1 align="center" id="h1" >LOGIN</h1>

<table>



<tr>
	<td><lable id="lable">Email:</lable></td>
<td><input type="text" name="email" placeholder="Email"></td>
</tr
>

<tr>
	<td><lable id="lable" >Password:</lable></td>
<td><input type="text" name="password" placeholder="password"></td>
<tr>


	       
</table>

<input type="submit" value="submit" id="btn">
</form>

<h2>${msg}</h2>
<h2>${msg1}</h2>

</body>
</html>