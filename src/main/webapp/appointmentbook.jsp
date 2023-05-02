<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>

<html>
<head>
<style>

.blink {
  animation: blink 1s steps(1, end) infinite;
}

@keyframes blink {
  0% {
    opacity: 1;
  }
  50% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}

.button {
  background-color: green;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}


{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

label 
{
  padding: 12px 12px 12px 0;
  display: inline-block;
  font-weight: bold;
}


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

<h1 align=center>Counselling and Visitor Management</h1>

<br>

<ul>
  <li><a  href="studenthome">Home</a></li>
  <li><a href="viewstudent">View Profile</a></li>
  <li><a href="schangepwd">Change Password</a></li>
  <li><a class="active"href="appointmentform">Book Appointments</a></li>
    <li><a href="studentviewslotsra">View Slots</a></li>
  <li><a href="studentlogin">Logout</a></li>
</ul>

<br><br>


<form action="saveappointment" method="post" modelAttribute="newappointment">
<p>Counsellor Name</p><br>
<input name="Counsellornamename" required="required" >
<br>
<p>Student ID</p><br>
<input name="Studentid" required="required" >
<br>
<p>Student Name</p><br>
<input name="StudentName" required="required" >
<br>
<p>Date</p><br>
<input name="Date" required="required" >
<br>
<p>Slot</p><br>
<input name="Slot" required="required" >
<br>
<p>Day</p><br>
<input name="Day" required="required" >
<br>
<p>Reason</p><br>
<input name="Reason" required="required" >
<br>
<input type="submit" value="Book slot">

</form>
</body>
</html>

 
