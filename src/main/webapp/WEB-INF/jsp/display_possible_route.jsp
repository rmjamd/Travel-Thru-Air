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
	<%@page import="java.util.Iterator"%>
			 <table BORDER="2" CELLPADDING="20" CELLSPACING="2">
<tr><th>Route</th><th>Cost</th></tr>
             <c:forEach items="${results}" var="result">
                    <tr>
                        <td>${result.route}</td>
                        <td>${result.cost}</td>
                    </tr>
                </c:forEach>
</table>
</body>
</html>