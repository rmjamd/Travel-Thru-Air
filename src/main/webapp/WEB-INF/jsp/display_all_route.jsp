<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<body>
	<%@page import="java.util.ArrayList"%>      <%--Importing all the dependent classes--%>
	<%@page import="com.AirlineSystem.model.FlightTrip"%>
	<%@page import="java.util.Iterator"%> 
			 <table BORDER="2" CELLPADDING="20" CELLSPACING="2">
<tr><th>Source</th><th>Destination</th><th>Via</th><th>Cost</th></tr>
             <c:forEach items="${trips}" var="trip">
                    <tr>
                        <td>${trip.source}</td>
                        <td>${trip.destination}</td>
                        <td>${trip.time}</td>
                         <td>${trip.cost}</td>
                    </tr>
                </c:forEach>
</table>

</body>
</html>