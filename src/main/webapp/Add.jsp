<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">

    <!--to not include statement inside service() => we use declaration tag  -->
    <%! int i=0; %>
    
      
    <!-- include code inside service()  => we use scriplet tag--> 
    <%
       int data1 = Integer.parseInt(request.getParameter("num1"));
	   int data2 = Integer.parseInt(request.getParameter("num2"));
	
	   int sum = data1 + data2;
	
	   out.println("output add from Jsp file:" + sum);
	   
    %>
    
    <!-- to import package => we use directive tag -->
    
    <!-- expression tag -->
    
    MY FAV NUMBER IS <%= 3 %>

</body>
</html>