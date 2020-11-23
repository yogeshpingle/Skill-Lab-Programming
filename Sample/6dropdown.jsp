<html>
<FONT size = 5 COLOR="#CC0000">
<br> You have selected the following item: <br>

<%	String item = request.getParameter("item");
	out.print(item); %> 
</FONT>
<hr>
<%@ include file ="6dropdown.html" %>
</html>
