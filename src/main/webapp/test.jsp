<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
@import aurl(https://fonts.googleapis.com/css?family=Roboto:400,300,600,400italic);
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
        * {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-font-smoothing: antialiased;
  -moz-font-smoothing: antialiased;
  -o-font-smoothing: antialiased;
  font-smoothing: antialiased;
  text-rendering: optimizeLegibility;
}

body {
    background-image: url("photographer.jfif");
    height: 500px;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
  font-family: "Roboto", Helvetica, Arial, sans-serif;
  font-weight: 100;
  font-size: 12px;
  line-height: 30px;
  color: #777;
  /* background: #4CAF50; */
}

.container {
  max-width: 400px;
  width: 100%;
  margin: 0 auto;
  position: relative;
}

#contact input[type="text"],
#contact input[type="email"],
#contact input[type="tel"],
#contact input[type="url"],
#contact textarea,
#contact button[type="submit"] {
  font: 400 12px/16px "Roboto", Helvetica, Arial, sans-serif;
}

#contact {
  background: #F9F9F9;
  padding: 25px;
  margin: 150px 0;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}

#contact h3 {
  display: block;
  font-size: 30px;
  font-weight: 300;
  margin-bottom: 10px;
}

#contact h4 {
  margin: 5px 0 15px;
  display: block;
  font-size: 13px;
  font-weight: 400;
}

fieldset {
  border: medium none !important;
  margin: 0 0 10px;
  min-width: 100%;
  padding: 0;
  width: 100%;
}

#contact input[type="text"],
#contact input[type="email"],
#contact input[type="tel"],
#contact input[type="url"],
#contact textarea {
  width: 100%;
  border: 1px solid #ccc;
  background: #FFF;
  margin: 0 0 5px;
  padding: 10px;
}

#contact input[type="text"]:hover,
#contact input[type="email"]:hover,
#contact input[type="tel"]:hover,
#contact input[type="url"]:hover,
#contact textarea:hover {
  -webkit-transition: border-color 0.3s ease-in-out;
  -moz-transition: border-color 0.3s ease-in-out;
  transition: border-color 0.3s ease-in-out;
  border: 1px solid #aaa;
}

#contact textarea {
  height: 100px;
  max-width: 100%;
  resize: none;
}

#contact button[type="submit"] {
  cursor: pointer;
  width: 100%;
  border: none;
  background: #4CAF50;
  color: #FFF;
  margin: 0 0 5px;
  padding: 10px;
  font-size: 15px;
}

#contact button[type="submit"]:hover {
  background: #43A047;
  -webkit-transition: background 0.3s ease-in-out;
  -moz-transition: background 0.3s ease-in-out;
  transition: background-color 0.3s ease-in-out;
}

#contact button[type="submit"]:active {
  box-shadow: inset 0 1px 3px rgba(0, 0, 0, 0.5);
}

.copyright {
  text-align: center;
}

#contact input:focus,
#contact textarea:focus {
  outline: 0;
  border: 1px solid #aaa;
}

::-webkit-input-placeholder {
  color: #888;
}

:-moz-placeholder {
  color: #888;
}

::-moz-placeholder {
  color: #888;
}

:-ms-input-placeholder {
  color: #888;
}
        </style>
        
<link rel="stylesheet" href="formsnew.css">
</head>
<body>
    <h1 align=center>Counseling and Visitor management</h1>

<br>

<ul>
  <li><a href="/">Home</a></li>
  <li><a href="adminlogin">Admin</a></li>
  <li><a class="active" href="counsellorlogin">Counsellor</a></li>
</ul>

<br><br>
    <div class="container">  
        <form id="contact" form action="saveappointment" method="post" modelAttribute="newappointment">
          <h3>Book Your Appointment</h3>
          <h4>Contact your counsellor and resolve your queries.</h4>
          <fieldset>
            <input placeholder="Counsellor name" type="text" tabindex="1" required autofocus>
          </fieldset>
          <fieldset>
            <input placeholder="Student ID" type="text" tabindex="2" required>
          </fieldset>
          <fieldset>
            <input placeholder="Student Name" type="text" tabindex="3" required>
          </fieldset>
          <fieldset>
            <p>Date Of Appointment:</p>
            <input placeholder="Date" type="date" tabindex="4" required>
          </fieldset>
          <fieldset>
            <input placeholder="Slot" type="text" tabindex="5" required>
          </fieldset>
          <fieldset>
            <textarea placeholder="Reason" tabindex="6" required></textarea>
          </fieldset>
          <fieldset>
            <button name="submit" type="submit" id="contact-submit" data-submit="...Sending">Book Slot</button>
          </fieldset>
          <!-- <p class="copyright">Designed by <a href="https://colorlib.com" target="_blank" title="Colorlib">Colorlib</a></p> -->
        </form>
      </div>

</body>