<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Doctor</title>

<style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 50px;
        }
        button {
            padding: 10px 20px;
            font-size: 16px;
            margin: 10px;
            cursor: pointer;
        }
    </style>

</head>
<body>
	<h1>Welcome to the Doctor Management System</h1>

    <form action="addDoctor" method="post">
        Enter your ID:<input type="text" id="did" name="id" required><br><br>

        Enter your Name:<input type="text" id="dname" name="name" required><br><br>

        Enter your Contact Number:<input type="text" id="dno" name="contact" required><br><br>

        Enter your Speciality:<input type="text" id="dspec" name="speciality" required><br><br>

        <h3>Availability:</h3>
        Select Day:
        <select name="availability[0].day" required>
            <option value="MONDAY">Monday</option>
            <option value="TUESDAY">Tuesday</option>
            <option value="WEDNESDAY">Wednesday</option>
            <option value="THURSDAY">Thursday</option>
            <option value="FRIDAY">Friday</option>
            <option value="SATURDAY">Saturday</option>
            <option value="SUNDAY">Sunday</option>
        </select><br><br>

       Start Time: <input type="time" name="availability[0].startTime" required><br><br>
       End Time: <input type="time" name="availability[0].endTime" required><br><br>


        <input type="submit" value="Add Doctor">
    </form>
    
    <h2>Search for Doctor</h2>
	<form action="searchDoctor" method="get">
    	Enter Doctor ID: <input type="text" name="id" required>
    	<input type="submit" value="Search">
	</form>

</body>
</html>