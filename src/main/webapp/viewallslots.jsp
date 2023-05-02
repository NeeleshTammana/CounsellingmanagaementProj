<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
<style>
ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: pink;
}

li 
{
  float: left;
    border-right: 1px solid blue;
}

li a 
{
  display: block;
  color: black;
 font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: black;
color: white;
}
li a:hover {
  background-color: black;
  color: white;
}
</style>
<style>
.styled-table {
    border-collapse: collapse;
    margin: 25px 0;
    font-size: 0.9em;
    font-family: sans-serif;
    min-width: 400px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
}
.styled-table thead tr {
    background-color: #009879;
    color: #ffffff;
    text-align: left;
}
.styled-table th,
.styled-table td {
    padding: 12px 15px;
}
.styled-table tbody tr {
    border-bottom: 1px solid #dddddd;
}

.styled-table tbody tr:nth-of-type(even) {
    background-color: #f3f3f3;
}

.styled-table tbody tr:last-of-type {
    border-bottom: 2px solid #009879;
}
</style>
</head>
<body>

<h1 align=center>Counseling and Visitor management</h1>

<br>

<ul>
  <li><a href="adminhome">Home</a></li>
  <li><a class="active"  href="viewallemps">View All Counsellors</a></li>
  <li><a href="adminlogin">Logout</a></li>
</ul>

<br><br>

<h3 align=center><u>View All Counsellors</u></h3>


<table class="styled-table">
    <thead>
        <tr>
            <th>ID</th>
<th>Counsellor</th>
<th>AvailableSlots</th>
<th>Date</th>

        </tr>
    </thead>
<c:forEach items="${slotlist}" var="slot">

    <tbody>
        <tr>
            <td> <c:out value="${slot.id}"></c:out>   </td>
<td> <c:out value="${slot.Counsellor}"></c:out>   </td>
<td> <c:out value="${slot.AvailableSlots}"></c:out>   </td>
<td> <c:out value="${slot.Date}"></c:out>   </td>
        </tr>
        
</c:forEach>
        </tbody>
</table>
</body>
</html>

 
