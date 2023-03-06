<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Velkommen til min side!" %>
</h1>
<br/>
<form action="hello-servlet">
    <label for="navn">Skriv dit navn:</label><br>
    <input type="text" id="navn" name="navn" value="Peter"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>