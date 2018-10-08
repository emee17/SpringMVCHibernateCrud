<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h2>Hello World!</h2>
 <form action="register" method="post" >
		<table>
			<tr>
				<th>Name</th>
				<th><input type="text" name="name"/> </th>
			</tr>
			<tr>
				<th>Email</th>
				<th><input type="text" name="email"/> </th>
			</tr>
			<tr>
				<th>Mobile</th>
				<th><input type="text" name="mobile"/> </th>
			</tr>
			<tr>
				<th>Country</th>
				<th>
					<select name="country">
						<option value="india">india</option>
						<option value="uk">uk</option>
						<option value="us">us</option>
					</select> 
					
				</th>
			</tr>
			<tr>
				<th><input type="submit" value="submit" > </th>
			</tr>
		</table>
	</form>
	<a href="/SpringHibernateCrud/listIdiots">List</a>

	<%-- <form:form action="/SpringWebMvcAnnotaiotnModelAttribute/register" method="post" modelAttribute="idiot">
		<table>
			<tr>
				<th>Name</th>
				<th><form:input path="name"/> </th>
			</tr>
			<tr>
				<th>Email</th>
				<th><form:input path="email"/> </th>
			</tr>
			<tr>
				<th>Mobile</th>
				<th><form:input path="mobile"/> </th>
			</tr>
			<tr>
				<th>Country</th>
				<th>
				<form:select path="country"></form:select>
					<select name="country">
						<option value="india">india</option>
						<option value="uk">uk</option>
						<option value="us">us</option>
					</select> 
					
				</th>
			</tr>
			<tr>
				<th><input type="submit" value="submit" > </th>
			</tr>
		</table>
	</form:form> --%>

</body>
</html>
