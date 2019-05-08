<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
	<h1>Product Registration</h1>
	
	<form:form method="post" action="${pageContext.request.contextPath}/ingresar" modelAttribute="product">
		<table>
          <tr>
              <td>Name:</td>
              <td><form:input type="text" name="name" path="name"/></td>
              <td><form:errors path="name" cssStyle="color: #ff0000;" /></td>
          </tr>
          <tr>
              <td>Brand:</td>
              <td><form:input type="text" name="brand" path="brand"/></td>
              <td><form:errors path="brand" cssStyle="color: #ff0000;" /></td>
          </tr>
          <tr>
              <td>Description:</td>
              <td><form:input type="text" name="description" path="description"/></td>
              <td><form:errors path="description" cssStyle="color: #ff0000;" /></td>
          </tr>
          <tr>
              <td>Price:</td>
              <td><form:input type="text" name="price" path="price"/></td>
              <td><form:errors path="price" cssStyle="color: #ff0000;" /></td>
          </tr>
          <tr>
          <tr>
              <td>Expiration Date:</td>
              <td><form:input type="text" name="date" path="date"/></td>
              <td><form:errors path="date" cssStyle="color: #ff0000;" /></td>
          </tr>
          <tr>
              <td>
                  <input type="submit" value="Save Changes" />
              </td>
          </tr>
      </table>
	</form:form>
</body>
</html>