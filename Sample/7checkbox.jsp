<html>

<body bgcolor="white">
<font size=5 color="red">
<%! String[] fruits; %>
<% fruits = request.getParameterValues("fruit"); %>
<ul>
<%
    if (fruits != null) {
	  for (int i = 0; i < fruits.length; i++) {
%>
<li>
<%
	      out.println (fruits[i]);
	  }
	} else out.println ("none selected");
%>
</li>
</ul>
<br>
</font>
</body>
</html>
