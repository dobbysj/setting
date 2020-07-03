<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
    $(function(){
        
        $("#idchBtn").click(function(){
            //아이디 빈칸 체크
            if($(this).siblings("input").eq(0).val()==""){
                $("#mid").css("border", "1px solid red");
                $(".idHidden").css("display", "block").css("color", "red");
                $(".idHidden").text("아이디를 입력하세요.");
            } else {
                $("#mid").css("border", "1px solid #767676");
                $(".idHidden").css("display", "none");
            }

            
            
            //아이디 중복확인
            $.ajax({
                type : "post",
                url : "idCheck",
                data : $("#mid").val(),
                contentType : 'text/plain',
                success : function(val){
                    if(val == 1){
                    	$("#mid").css("border", "1px solid red");
                        $(".idHidden").css("display", "block").css("color", "red");
                        $(".idHidden").text("존재하는 아이디입니다.");
                    } else {
                    	$("#mid").css("border", "1px solid green");
                        $(".idHidden").css("display", "block").css("color", "green");
                        $(".idHidden").text("아이디를 사용하실 수 있습니다.");
                    }
                }
            });
        });
    });
</script>


</head>
<body>

<form action="join" method="post" name="join" id="join"> 
    <label for="mid">아이디</label><input type="text" name="mid" id="mid">
    <input type="button" name="idchBtn" id="idchBtn" value="중복체크">
    <br>
    <div class="idHidden" style="display:none"></div> 
    <label for="mpw">비밀번호</label><input type="password" name="mpw" id="mpw"><br>
    <div class="pwHidden" style="display:none"></div>
    <label for="mpw2">비밀번호 확인</label><input type="password" name="mpw2" id="mpw2"><br>
    <div class="pwHidden2" style="display:none"></div>
    <label for="mphone1">연락처</label>
    <select name="mphone1" id="mphone1">
        <option value="010">010</option>
        <option value="011">011</option>
        <option value="070">070</option>
    </select> - 
    <input type="text" name="mphone2" id="mphone2"> - <input type="text" name="mphone3" id="mphone3">
    <br>
    <input type="text" name="mpost" id="mpost">
    
    
    <input type="button" name="joinBtn" id="joinBtn" value="회원가입">
    <input type="button" name="cancelBtn" id="cancelBtn" value="취소">
</form>

</body>
</html>