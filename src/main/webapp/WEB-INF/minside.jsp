<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Din side: ${requestScope.navn}</title>
</head>
<body>
<h1>Du er nu på din side ${requestScope.navn}</h1>
<form action="min-servlet">
    <label for="tal">Skriv et tal:</label><br>
    <input type="text" id="tal" name="tal" value="537"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>