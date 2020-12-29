
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>spring jsp app</title>
</head>
<body>
<div align="center">
<c:url var="itemslink" value="${items}"/>
<h2><a href="${itemslink}">Show all items</a></h2>

</div>

</body>
</html>