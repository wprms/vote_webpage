<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>후보자 조회</title>
<link rel="stylesheet" href="jstyle.css">
</head>
<body>
	<header>
		<h2>글로벌인 IT 5기 JPS/SERVLET 프로젝트</h2>
	</header>
	<nav>
		<a href="vote.do">투표하기</a><a href="candidatelist.do">후보조회</a> <a
			href="voteCheck.do">투표결과조회</a> <a href="candidateRank.do">후보자 등수</a>
	</nav>
	<section>
		<h2>후보자 조회</h2>
		<div class="wrapper">
			<table border=1>
				<tr>
					<th>후보번호</th>
					<th>성명</th>
					<th>소속정당</th>
					<th>학력</th>
					<th>주민번호</th>
					<th>지역구</th>
					<th>대표전화</th>
				</tr>
				<c:forEach var="vo" items="${vos}">
					<tr>
						<td>${vo.mno}</td>
						<td>${vo.mname}</td>
						<td>${vo.pname}</td>
						<td>${vo.pschool}</td>
						<td>${vo.mjumin}</td>
						<td>${vo.mcity}</td>
						<td>${vo.ptel1}-${vo.ptel2}-${vo.ptel3}</td>
					</tr>
				</c:forEach>
				<tr>
			</table>
		</div>
	</section>
	<footer>Copyright ⓒ 2023 Globalin IT 5th Kim Jisoo, Jang
		Jekeun, Yu Minjeong, Kim Chaeyeon All rights reserved.</footer>
</body>
</html>