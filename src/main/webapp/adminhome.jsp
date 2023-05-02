<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="adminlogin">Counselling & Visitor Management</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Registrations <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="studentregistration">Student registration</a></li>
          <li><a href="counsellorregistration">Counsellor registration</a></li>
          
        </ul>
      </li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">View all<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="viewallstudents">Students</a></li>
          <li><a href="viewallcounsellors">Counsellors</a></li>
          <li><a href="adminviewslots">Counsellor Slots</a></li>
        </ul>
      </li>
      <li><a href="adminlogin">Logout</a></li>
      
    </ul>
  </div>
</nav>
  

<center><h3 align=right>Welcome&nbsp;<c:out value="${auname}"></c:out></h3></center>
</body>
</html>

