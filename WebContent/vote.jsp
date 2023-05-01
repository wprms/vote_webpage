<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>투표하기</title>
<link rel="stylesheet" href="jstyle.css">
<script src="vote.js"></script>
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
		<h2>투표하기</h2>
		<form action="voteGet.do" method="post" id="voteGet">
			<div class="wrapper">
				<table border=1>
					<tr>
						<th>주민번호</th>
						<td><input class="voteDo" type="text" name="vjumin" size="20">
							&nbsp;&nbsp;예) 9304021111111</td>
					</tr>
					<tr>
						<th>성명</th>
						<td><input class="voteDo" type="text" name="vname" size="20"></td>
					</tr>
					<tr>
						<th>투표번호</th>
						<td><select class="voteDo" name="mno" style="font-size: 15px">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
						</select></td>
					</tr>
					<tr>
						<th>투표시간</th>
						<td><input class="voteDo" type="text" name="vtime" size="20">
							&nbsp;&nbsp;예) 0930</td>
					</tr>
					<tr>
						<th>투표장소</th>
						<td><input class="voteDo" type="text" name="varea" size="20">
							&nbsp;&nbsp;예) 제1투표장</td>
					</tr>
					<tr>
						<th>유권자 확인</th>
						<td><input type="radio" name="vconfirm" value="Y"
							checked="checked">확인 <input type="radio" name="vconfirm"
							value="N">미확인</td>
					</tr>
					<tr>
						<td colspan="2" style="text-align: center"><input
							id="Vsubmit" type="button" value="투표하기"> <input
							id="Vreset" type="button" value="다시하기"></td>
					</tr>
				</table>
			</div>
		</form>
	</section>
	<footer>Copyright ⓒ 2023 Globalin IT 5th Kim Jisoo, Jang
		Jekeun, Yu Minjeong, Kim Chaeyeon All rights reserved.</footer>
</body>
</html>