<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>create</title>
</head>
<body>
<h1>Register Page</h1>
<form method = "post" action = "/board/register">
<fieldset>
<label>제목</label><input type ="text" name = "title" >
</fieldset>
<fieldset>
<label>작성자</label><input type ="text" name = "writer" >
</fieldset>
<label>내용</label>
<br>
<textarea name = "content" rows="10" cols="50"></textarea>

<fieldset>
	<input type = "submit" value="등록">
</fieldset>
</form>
</body>
</html>