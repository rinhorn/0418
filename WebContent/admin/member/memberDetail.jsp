<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="/admin/common/registStyle.jsp"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(function(){ 
	$($("input[type=button]")[0]).click(function(){
		edit();
	});
	$($("input[type=button]")[1]).click(function(){
		del();
	});
	$($("input[type=button]")[2]).click(function(){
		location.href="/admin/member/";
	});
});
</script>
</head>
<body>
	<h3>회원 정보</h3>
	<div class="container">
		<form enctype="multipart/form-data">
		 	<label for="lname">아이디</label>
			<input type="text" name="id"/> 
		 	<label for="lname">비밀번호</label>
			<input type="text" name="pass"/>
		 	<label for="lname">이름</label>
			<input type="text" name="name"/>
		 	<label for="lname">닉네임</label><p>
			<input type="text" name="nick"/>
		 	<label for="lname">이메일</label><p>
			<input type="text" name="email"/>
			
			<input type="button" value="수정"/>
			<input type="button" value="삭제"/>
			<input type="button" value="목록"/>
		</form>
	</div>
</body>
</html>
