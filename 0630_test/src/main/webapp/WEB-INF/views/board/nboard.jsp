<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
    <tr>
        <td>제목</td>
        <td>작성자</td>
        <td>등록일</td>
        <td>조회수</td>
    </tr>
    <c:forEach items="${ list }" var = "list">
        <tr>
            <td>${list.BTITLE }</td>
            <td>${list.BID }</td>
            <td>${list.BWRITER}</td>
            <td>123</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>