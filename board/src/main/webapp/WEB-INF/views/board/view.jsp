<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href = "/board/modify?bno=${vo.bno}">
<input type = "button" value = "수정">
</a>
<a href = "/board/remove?bno=${vo.bno}">
<input type = "button" value = "삭제">
</a>

	<table>

		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>내용</td>
		</tr>
		<tr>
		
			<td>${vo.bno}</td>
			<td>${vo.title}</td>
			<td>${vo.writer}</td>
			<td>${vo.content}</td>
		</tr>
	</table>


</body>
</html>