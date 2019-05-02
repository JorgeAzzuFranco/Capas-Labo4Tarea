<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Summoners</title>
</head>
<body>
	<h1>LoL Summoner Inscriptions</h1>
	
	<form:form method="post" action="${pageContext.request.contextPath}/validar" modelAttribute="User">
		<table>
          <tr>
              <td>Name:</td>
              <td><form:input type="text" name="name" path="name"/></td>
              <td><form:errors path="name" cssStyle="color: #ff0000;" /></td>
              
          </tr>
          <tr>
              <td>Surname:</td>
              <td><form:input type="text" name="surname" path="surname"/></td>
              <td><form:errors path="surname" cssStyle="color: #ff0000;" /></td>
          </tr>
          <tr>
              <td>LoL User:</td>
              <td><form:input type="text" name="lolUser" path="lolUser"/></td>
              <td><form:errors path="lolUser" cssStyle="color: #ff0000;" /></td>
          </tr>
          <tr>
              <td>Server:</td>
              <td><form:input type="text" name="server" path="server"/></td>
              <td><form:errors path="server" cssStyle="color: #ff0000;" /></td>
          </tr>
          <tr>
              <td colspan="2">
                  <input type="submit" value="Save Changes" />
              </td>
          </tr>
      </table>
	</form:form>
</body>
</html>