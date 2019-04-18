<%@page import="game.common.board.Pager"%>
<%@page import="game.model.domain.Member"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%! Pager pager=new Pager(); %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="/admin/common/bar.jsp"%>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@ include file="/admin/common/tableStyle.jsp"%>
</head>
<style>
#member {
	background-color: #4CAF50;
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(function(){
	getMember();	
});

function getMember(){
	$.ajax({
		url:"/admin/members",
		type:"get",
		success:function(result){
			var str="";
			for(var i=0;i<result.length;i++){
				str+="<tr>";
				str+="<td>"+result[i].id+"</td>";
				str+="<td>"+result[i].pass+"</td>";
				str+="<td>"+result[i].name+"</td>";
				str+="<td>"+result[i].nick+"</td>";
				str+="<td>"+result[i].email+"</td>";
			}
			
			$("table").append(str);
			$("table").append("<tr>");
			$("table").append("<td style=float:left>");
			<%for(int i=1;i<=7;i++){%>
			$("table").append("<%=i%>");
			<%}%>
			$("table").append("</td>");
			$("table").append("</tr>");
		}
	});
}
function init(){
	pager.init(request, boardList.size());
}
</script>
<body>
	<div>
		<h2>회원 관리</h2>
	</div>
	<div>
		<form>
			<input type="text" placeholder="Search.." name="search">
			<button type="submit">
				<i class="fa fa-search"></i>
			</button>
		</form>
	</div>

		<table>
			<tr>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>이름</th>
				<th>닉네임</th>
				<th>이메일</th>
			</tr>
		</table>
			

</body>
</html>