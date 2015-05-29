<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Start of quiz</title>
</head>
<body>
${thisQuiz.quizName} <br/>
${thisQuiz.questions[0].question}
	<h2>Question #1</h2>
	<form method="post" action="start.do">
	<h3>What is the capital of Suriname?</h3>
	<ol>
		<input type="radio" name ="option" value="Paramaribo">Paramaribo<br>
		<input type="radio" name="option" value="Moengo">Moengo<br>
		<input type="radio" name="option" value="Albina">Albina<br>
		<input type="radio" name="option" value="Kourou">Kourou<br>
		<input type="submit" value="Submit">
	</ol>
	</form>
</body>
</html>