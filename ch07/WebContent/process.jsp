<%@page import="ch07.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%/*스크립틀릿*/
         /*변수 선언 및 값 저장*/
      String id=request.getParameter("id");
      String password=request.getParameter("password1");
      String name=request.getParameter("name");
      String tel=request.getParameter("tel");
      String email=request.getParameter("email");
      String dob=request.getParameter("dob");
      String url=request.getParameter("url");
      String gender=request.getParameter("gender");
      
      Member member=new Member(id,password,name,tel,email,dob,url,gender);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=id %><!-- 표현식 --><br>
<%=password %><br>
<%=name %><br>
<%=tel %><br>
<%=email %><br>
<%=dob %><br>
<%=url %><br>
<%=gender %><br><hr>
<%=member %><br>
</body>
</html>