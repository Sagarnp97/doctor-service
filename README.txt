11/08/2024
Created doctor-service project.
Added dependencies of tomcat, jpa, PostgreSQL.
Created DOCTOR table and embedded DOCTOR_AVAILABILITY (maintains the availability of the doctor) table to it.

DOCTOR table has several entities(id, name, contact, speciality) designed in DOCTOR class.
DOCTOR_AVAILABILITY table has 3 entities (day, startTime, endTime)