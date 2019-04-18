<%@page import="game.model.domain.Member"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<% Member member=(Member)request.getAttribute("member"); %>
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

function edit(){
	$("form").attr({
		action:"/admin/member/edit",
		method:"post"
	});
	$("form").submit();
}

function del(){
	$("form").attr({
		action:"/admin/member/delete",
		method:"post"
	});
	$("form").submit();
}
</script>
</head>
<body>
	<h3>회원 정보</h3>
	<div class="container">
		<form>
			<input type="hidden" name="member_id" value="<%=member.getMember_id()%>"/>
		
		 	<label>아이디</label>
			<input type="text" name="id" value="<%=member.getId()%>"/> 
			
		 	<label>비밀번호</label>
			<input type="text" name="pass" value="<%=member.getPass()%>"/>
			
		 	<label>이름</label>
			<input type="text" name="name" value="<%=member.getName()%>"/>
			
		 	<label>닉네임</label>
			<input type="text" name="nick" value="<%=member.getNick()%>"/>
			
		 	<label>이메일</label>
			<input type="text" name="email" value="<%=member.getEmail()%>"/>
			
			<input type="button" value="수정"/>
			<input type="button" value="삭제"/>
			<input type="button" value="목록"/>
		</form>
	</div>
</body>
</html>
