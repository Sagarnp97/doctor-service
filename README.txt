11/08/2024
Created doctor-service project.
Added dependencies of tomcat, jpa, PostgreSQL.
Created DOCTOR table and embedded DOCTOR_AVAILABILITY (maintains the availability of the doctor) table to it.

DOCTOR table has several entities(id, name, contact, speciality) designed in DOCTOR class.
DOCTOR_AVAILABILITY table has 3 entities (day, startTime, endTime)

11/09/2024
--->Created a search button for doctor's id and based on the id fetching all details of doctor.
--->Controller displays result in "search.jsp" file. Here we need to check whether that particular ID is present or not. So we have to use 
	<c:..> tag that is part of JSTL specifically Core(c) Tag Library which provides utility functions such as conditional statements, loops and 
	other logics for JSP pages.
--->Add JSTL dependency in pom.xml.