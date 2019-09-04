

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Apply Leave List</title>
</head>
<body>
<a href="Login" align="right">logout</a>

    <div align="center">
        <h1>Leave List</h1>
        
      <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/assign"
        user="root" password="root"
    />
     
    <sql:query var="listUsers"   dataSource="${myDS}">
        SELECT * FROM assign.leave;
    </sql:query>  
       
        <table border="1">
            <th>EmpId</th>
			<th>FROM DATE</th>
			<th>TO DATE</th>
			<th>REMARKS</th>
			<th>APPROVE</th>
           
 
           
			 <c:forEach var="user" items="${listUsers.rows}">
                <tr>
                    <td><c:out value="${user.empId}" /></td>
                    <td><c:out value="${user.frmDt}" /></td>
                    <td><c:out value="${user.toDt}" /></td>
                    <td><c:out value="${user.remarks}" /></td>
                  <!--<td><c:out value="${user.approve}" /></td>-->
                    <td><input type="checkbox" name="approved"
                    value="${user.approve}" /></td>
                       
                </tr>
            </c:forEach>
               
        </table>
        <br>
        <br>
        <input type="submit" value="Approved" >
    </div>
</body>
</html>