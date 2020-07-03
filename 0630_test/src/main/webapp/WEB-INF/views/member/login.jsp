<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(function(){
		
		$("#loginBtn").click(function(){
			//아이디 패스워드 빈칸 체크
			if($(this).siblings("input").eq(0).val()==""){
				$(".idHidden").css("display", "block");
				$(".idHidden").text("아이디를 입력하세요.");
			} else {
				$(".idHidden").css("display", "none");
			}
			if($(this).siblings("input").eq(1).val()==""){
				$(".pwHidden").css("display", "block");
				$(".pwHidden").text("비밀번호를 입력하세요.");
			} else {
				$(".pwHidden").css("display", "none");
			}
			//아이디 패스워드 일치 확인
			$.ajax({
				type : "post",
				url : "loginCheck",
				data : $("#login").serialize(),
				success : function(val){
					if(val ==1){
						location.href="login";
					} else if(val == -1) {
						$(".pwHidden").css("display", "block");
						$(".pwHidden").text("비밀번호를 확인하세요.");
					} else {
						$(".idHidden").css("display", "block");
						$(".idHidden").text("아이디를 확인하세요.");
					}
				}
			});
		});
	});
</script>
<style>

</style>
</head>
<body>

<form action="login" method="post" name="login" id="login"> 
    <input type="text" name="mid"><br>
    <span class="idHidden"></span> 
    <input type="password" name="mpw"><br>
    <div class="pwHidden" style="display:none"></div>
    <input type="button" name="loginBtn" id="loginBtn" value="로그인">
</form>

</body>
</html>