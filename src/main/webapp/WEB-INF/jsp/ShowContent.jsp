<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@page import="java.util.ArrayList"%>      <%--Importing all the dependent classes--%>
	<%@page import="com.ramij.Airline"%>
	<%@page import="java.util.Iterator"%> 
			<% ArrayList<Airline> a = (ArrayList) request.getAttribute("list"); %> 
			 <table BORDER="2" CELLPADDING="20" CELLSPACING="2">
<tr><th>Source</th><th>Destination</th><th>Time</th><th>Cost</th></tr>
<%
// Iterating through subjectList

if(request.getAttribute("list") != null)  // Null check for the object
{
	Iterator<Airline> iterator = a.iterator();  // Iterator interface
	
	while(iterator.hasNext())  // iterate through all the data until the last record
	{
		Airline y = iterator.next(); //assign individual employee record to the employee class object
	%>
	<tr><td><%=y.source%></td>
		<td><%=y.des%></td>
		<td><%=y.time%></td>
		<td><%=y.cost%></td>
	</tr>
	<%
	}
}
%>
</table>
</body>
</html>