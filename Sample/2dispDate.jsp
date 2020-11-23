<%@page language="java" isThreadSafe= "false" import="java.io.*,java.util.*" %>
<html>
    <body bgcolor="white">
<%
	Date now = new Date();
	out.println(now.toString());
	out.println(now.toGMTString());
%>
	</body>
</html>
