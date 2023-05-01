
<%@page import="project.vote.vo.VoteVo"%>
<%@page import="project.vote.dao.VoteDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>투표결과조회</title>
<link rel="stylesheet" href="jstyle.css">
</head>
<body>
	<header>
		<h2>글로벌인 IT 5기 JPS/SERVLET 프로젝트</h2>
	</header>
	<nav>
		<a href="vote.do">투표하기</a> <a href="candidatelist.do">후보조회</a> <a
			href="voteCheck.do">투표결과조회</a> <a href="candidateRank.do">후보자 등수</a>
	</nav>
	<section>
		<h2>투표결과조회(제1투표장)</h2>
		<div class="wrapper">
			<table border=1>
				<tr>
					<th>성명</th>
					<th>생년월일</th>
					<th>나이</th>
					<th>성별</th>
					<th>후보번호</th>
					<th>투표시간</th>
					<th>유권자확인</th>
				</tr>
				<c:forEach var="vos" items="${vo}">
					<tr>
						<td>${vos.vname}</td>
						<td>${vos.vbirth}</td>
						<td>만${vos.vage}세</td>
						<td>${vos.vgender}</td>
						<td>${vos.mno}</td>
						<td>${vos.vtime}</td>
						<td>${vos.vconfirm}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</section>
	<footer>Copyright ⓒ 2023 Globalin IT 5th Kim Jisoo, Jang
		Jekeun, Yu Minjeong, Kim Chaeyeon All rights reserved.</footer>
</body>
</html>