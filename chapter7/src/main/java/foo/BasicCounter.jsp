<%@ page import="foo.Counter" %>
<html>
<body>
The page count is:
<%
    out.println(Counter.getCount());
%>
</body>
</html>