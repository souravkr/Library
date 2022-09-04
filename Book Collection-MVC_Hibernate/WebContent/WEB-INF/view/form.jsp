<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Record Book Details</h2>

<form:form modelAttribute="book" action="processForm">

Enter Book Name <form:input type="text" path="bookName"/>
<form:errors path="bookName"/>

<br/><br/>

Select Published Date <form:input type="date" path="publishedDate"/>

<form:errors path="publishedDate"/>
<br/><br/>

Select Author Name

 <form:select path="aid" >

<c:forEach var="temp" items="${authors}">
<form:option value="${temp.authorId}" label="${temp.authorName}"/>
</c:forEach>
</form:select>


<input type="submit"/>

</form:form>



</body>
</html>