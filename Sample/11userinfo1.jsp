<%@page language="java" isThreadSafe= "false" import="java.io.*" %>
<html>
    <body bgcolor="white">
<%
	String name, bdate, email;
	int lucky;
	name = request.getParameter("userName");
	bdate = request.getParameter("birthDate");
	email = request.getParameter("emailAddr");
	lucky = Integer.parseInt(request.getParameter("luckyNo"));
%>
		<ul>
			<li> Name : <%= name %> </li>
			<li> BirthDate : <%= bdate %> </li>
			<li> EMail : <%= email %> </li>
			<li> Lucky : <%= lucky %> </li>
		</ul>
	</body>
</html>
