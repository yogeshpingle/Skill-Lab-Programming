<html>

<body bgcolor="white">
<h1> Request Information </h1>
<font size="4">
Request URI: <%= request.getRequestURI() %>
<br>
Request Protocol: <%= request.getProtocol() %>
<br>
Servlet path: <%= request.getServletPath() %>
<br>
Server name: <%= request.getServerName() %>
<br>
Server port: <%= request.getServerPort() %>
<br>
<hr>
The browser you are using is <% out.print(request.getHeader("User-Agent")); %>
<hr>
</font>
</body>
</html>
