<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Toastmaster's - VP of Education</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  	<a href="app/members/mass_update.jsp">Mass Update</a>
  	<p/>
  	<a href="app/emails/cl.jsp">Create Competent Leadership Email</a>
  	<p/>
  	<a href="app/meetings/list_meetings.jsp">List Meetings</a>
  	<p/>
  	<a href="app/members/index.jsp">List Members</a>
  </body>
</html>
