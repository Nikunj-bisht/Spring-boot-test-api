
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add item</title>
</head>
<body>
<div align="center">
<form:form method="POST" modelAttribute="newitem">

<table>

<tr>
<td><label>ID</label</td>
<td>
<form:input path="id" disabled="true" />
</td>
</tr>


<tr>
<td><label>title</label</td>
<td>
<form:input path="title" />
</td>
</tr>


<tr>
<td><label>details</label</td>
<td>
<form:input path="details" />
</td>
</tr>




<tr>
<td><label>localdate</label</td>
<td>
<form:input path="localDate"/>
</td>
</tr>


<tr><td>
<input type="submit" value="Submit" />
</td>
</tr>



</table>

</form:form>
</div>

</body>
</html>