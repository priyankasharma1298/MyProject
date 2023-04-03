<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
    if (session.getAttribute("username")==null){
    	response.sendRedirect("login.jsp");
    	
    }
   
    %>
    this is welcome page hi 
    
    <a href="videos.jsp">videos here</a>
    
    <form action="Logout" method="get">
        <input type="submit" value ="Logout"> 
    </form>
    

</body>
</html>