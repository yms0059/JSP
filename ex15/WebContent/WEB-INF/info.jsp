<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <jsp:useBean id="student" class="com.javalec.ex.Student" scope="page"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<jsp:setProperty name="student" property="name" vlaue="홍길동"/>
<jsp:setProperty name="student" property="age" vlaue="10"/>
<jsp:setProperty name="student" property="grade" vlaue="3"/>
<jsp:setProperty name="student" property="studentNum" vlaue="27"/>

이름:<jsp:getProperty name="stduent" property="name"/><br/>
나이:<jsp:getProperty name="stduent" property="age"/><br/>
학년:<jsp:getProperty name="stduent" property="grade"/><br/>
번호:<jsp:getProperty name="stduent" property="studentNum"/><br/>
</body>
</html>