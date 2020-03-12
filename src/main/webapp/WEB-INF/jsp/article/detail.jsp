<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.con {
	width: 1000px;
	margin: 0 auto;
}
</style>
</head>
<body>
	<h1 class="con">게시물 상세페이지</h1>
	<section class="con">
		번호 : ${article.id},
		제목 : ${article.title},
		내용 : ${article.body}
	</section>
	
	<div class="btns con">
		<a href="./list">게시물 리스트</a>
		<a href="./add">게시물 추가</a>
		<a href="./modify?id=${article.id}">게시물 수정</a>
		<a href="./detail?id=$[article.id}" onclick="if (confirm('삭제하시겠습니까?') == false) return false;">게시물 삭제</a>
	</div>
</body>
</html>