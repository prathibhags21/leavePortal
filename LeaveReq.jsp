<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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
          width: 600px;
          height: 410px;
          border: double;
          border-width: 5px;
          color: black;
          margin-left: 300px;
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

input[type=date]
{
height: 30px;
margin:2px;
border:solid 1px;
background:none;
width:300px;
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
	margin-top: 40px;
	height:6vh;
	color:black;
	font-size:18px;
	margin-left:110px;
	
	
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


 <form action="LeaveReq"  method="post">

<h1 align="center" id="h1" >Apply Leave</h1>

<table>

<tr>
	<td><lable id="lable"> EmpID:</lable></td>
<td><input type="text" name="empId" placeholder="EmpId"></td>
</tr>

<tr>
	<td><lable id="lable"> From Date:</lable></td>
<td><input type="Date" name="frmDt" placeholder="From Date"></td>
</tr>


<tr>
	<td><lable id="lable" >To Date:</lable></td>
<td><input type="Date" name="toDt" placeholder="To Date"></td>
<tr>

<tr>
<td><lable id="lable" >Remarks:</lable></td>
<td><textarea rows="8" cols="50" name="remarks">

</textarea>	</td>
</tr>


       
</table>

<input type="submit" value="Apply" id="btn">
 <input type="submit" value="view leave" id="view">

</form>

</div>

</body>

</html>