
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>spring jsp app</title>
</head>
<body>
<div align="center">
<table border="1" cellpadding="5">
<caption></caption>

<tr>
<th>Title</th>
<th>deadline</th>

</tr>
<c:forEach var="item" items="${tododatastorage.items}">

<c:url var="deleteitemlink" value="deleteitem">
<c:param name="id" value="${item.id}"/>
</c:url>


<c:url var="viewitemlink" value="viewitem">
<c:param name="id" value="${item.id}"/>
</c:url>

<tr>
<td><c:out value="${item.title}"/></td>
<td><c:out value="${item.details}"/></td>
<td><c:out value="${item.localDate}"/></td>

<td><a href="${deleteitemlink}">DELETE</a></td>
<td><a href="${viewitemlink}">View</a></td>

</tr>

</c:forEach>
</table>

<c:url var="newitemlink" value="additem"/>
<h2><a href="${newitemlink}">click to add new item</a></h2>


</div>

</body>
</html>