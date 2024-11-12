<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Doctor Details</h1>
    <c:if test="${not empty doctor}">
        <p>ID: ${doctor.id}</p>
        <p>Name: ${doctor.name}</p>
        <p>Contact: ${doctor.contact}</p>
        <p>Speciality: ${doctor.speciality}</p>
        <h3>Availability:</h3>
        <ul>
            <c:forEach items="${doctor.availability}" var="availability">
                <li>Day: ${availability.day}, Start Time: ${availability.startTime}, End Time: ${availability.endTime}</li>
            </c:forEach>
        </ul>
    </c:if>
    <c:if test="${empty doctor}">
        <p>No doctor found with the specified ID.</p>
    </c:if>
</body>
</html>