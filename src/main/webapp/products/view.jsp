<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ page import="org.keycloak.example.oauth.ProductDatabaseClient" %>
<%@ page session="false" %>
<html>
<head>
    <title>Product View Page</title>
</head>
<body bgcolor="#F5F6CE">

<h2>Product Listing</h2>
<%
    java.util.List<String> list = ProductDatabaseClient.getProducts( );
  for (String cust : list) {
   out.print("<p>");
   out.print(cust);
   out.println("</p>");
}
%>
<br><br>
</body>
</html>