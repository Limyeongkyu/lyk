<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UPDATE</title>
</head>
<body>
	<h1>UPDATE PAGE</h1>
	<form method="post" action="/board/modify">
		<fieldset>
			<label>글번호</label><input type="text" name="bno" value="${vo.bno}"
				readonly>
		</fieldset>
		<fieldset>
			<label>작성자</label><input type="text" name="writer"
				value="${vo.writer}" readonly>
		</fieldset>
		<fieldset>
			<label>제목</label><input type="text" name="title" value="${vo.title}">
		</fieldset>
		<fieldset>
			<label>내용</label><br>
			<textarea name="content">${vo.content}</textarea>
		</fieldset>
		<input type="submit" value="완료">
	</form>
</body>
</html>