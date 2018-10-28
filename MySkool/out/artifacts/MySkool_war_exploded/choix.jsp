<%@page import="java.util.ArrayList"%>
<%@page import="schoolProject.*"%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
test jsp

<% 
ArrayList<Questionnaires> arrayListQuestionnaire=(ArrayList)request.getAttribute("mesQuestions");
%>

<%
out.println(arrayListQuestionnaire.get(0).getQuestion());
out.println(arrayListQuestionnaire.get(0).getResponse());
%>

<hr/>
<%
out.println(arrayListQuestionnaire.get(1).getQuestion());
out.println(arrayListQuestionnaire.get(1).getResponse());
%>


</body>
</html>