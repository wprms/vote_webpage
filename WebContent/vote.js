window.onload = function() {
	var Vsubmit = document.getElementById("Vsubmit");
	var Vreset = document.getElementById("Vreset");
	Vsubmit.onclick = function() {
		var f = document.getElementById("voteGet");
		var vjumin = f.vjumin.value;
		var jumin = /([0-9]{2}(0[1-9]|1[0-2])(0[1-9]|[1,2][0-9]|3[0,1]))/;
		var vname = f.vname.value;
		var name = /^[가-힣]+$/; // 한글이름 유효성 검사
		if (vjumin == "") {
			alert("주민번호가 입력되지 않았습니다!");
			f.vjumin.focus();
		} else if (!jumin.test(vjumin) || vjumin.length < 13
				|| vjumin.length > 13) {
			alert("유효하지않은 주민번호 입니다.\n 숫자 13자리로 입력해주세요.");
			f.vjumin.focus();
		} else if (vname == "") {
			alert("성명이 입력되지 않았습니다!");
			f.vname.focus();
		} else if (!name.test(vname)) {
			alert("한글이름으로 입력해주세요.");
			f.vname.focus();
		} else if (f.mno.value == "") {
			alert("후보번호가 선택되지 않았습니다!");
			f.mno.focus();
		} else if (f.vtime.value == "") {
			alert("투표시간이 입력되지 않았습니다!");
			f.vtime.focus();
		} else if (f.vtime.value.length < 4 || f.vtime.value.length > 4) {
			alert("투표시간을 예시와 같이 입력해주세요! 예)0930");
			f.vtime.focus();
		} else if (f.varea.value == "") {
			alert("투표장소가 입력되지 않았습니다!");
			f.varea.focus();
		} else if (f.varea.value != "제1투표장" && f.varea.value != "제2투표장") {
			alert("투표장소를 제1투표장 또는 제2투표장으로 입력해주세요 !");
			f.varea.focus();
		} else if (f.vconfirm.value == "") {
			alert("유권자확인이 선택되지 않았습니다!");
		} else {
			f.submit();
		}
	}
	Vreset.onclick = function() {
		alert("정보를 지우고 처음부터 다시 입력합니다!");
		f.reset();
		f.vjumin.focus();
	}
}
