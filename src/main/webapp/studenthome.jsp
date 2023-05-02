<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>

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
  background-color: black;
}

li 
{
  float: left;
    border-right: 1px solid blue;
}

li a 
{
  display: block;
  color: grey;
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
</head>
<body>



<br>

<ul>
  <li><a class="active" href="studenthome">Home</a></li>
  <li><a href="viewstudent">View Profile</a></li>
  <li><a href="appointmentform">Book Appointments</a></li>
    <li><a href="studentviewslotsra">View Slots</a></li>
  <li><a href="studentlogin">Logout</a></li>
</ul>

<br>

<h3 align=right>Welcome&nbsp;<c:out value="${auname}"></c:out></h3>
<center><h3>Student Home</h3></center>

</body>
</html>

 
