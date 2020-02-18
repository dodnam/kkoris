<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/index.css"/>
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/css/layout.css"/>
<style>
	.box_con{left:20px; width:800px; height:200px; background-color:#fcc6c9; position:absolute;}
	.box{width: 150px; height:150px; border-radius:70%; overflow:hidden; background-color:#fff;margin-top:25px;margin-left:280px;}
	.profile{width: 100%; height:100%; object-fit:cover; display:block; margin:0px auto;}
	.userTitle{font-size:40px; text-align:left; top:30px;}
	.submit{line-height: 30px; text-align: center; background-color: #ffe3e4; color:#ff4e59;border: 1px solid #fcc6c9; border-radius: 5px; width: 80px; height: 35px; position: absolute;left:50%;top:20px; outline:none;}
	.delete{line-height: 30px; text-align: center; background-color: #ffe3e4; color:#ff4e59;border: 1px solid #fcc6c9; border-radius: 5px; width: 80px; height: 35px; position: absolute;left:50%;top:20px; outline:none;margin-left:100px;}
	.boxBody{position:absolute; top:250px;margin-left:20px;}
	.submitBody{position:absolute; top:850px; margin-left:20px;}
	.choice_pet{top:400px; font-size: 10pt; width: 100px; padding: .7em .5em; font-family: inherit; background: url(https://farm1.staticflickr.com/379/19928272501_4ef877c265_t.jpg) no-repeat 95% 50%; -webkit-appearance: none; -moz-appearance: none; appearance: none; outline:none; border:1px solid #5d5d5d;}
</style>
</head>
<body>
	<%@ include file="views/layout.jsp" %>
	<div class="container">
    	<div class="userTitle">
			반려동물 프로필
    	</div>
    	
    	<div class="input-container">
    		<div class="box_con">
	    		<div class="box">
	    			<img class="profile" src="<%= request.getContextPath() %>/images/logo.png">
	    		</div>
    		</div>
    		<div class="choice_pet">
    			<select>
    				<option>너의 반려동물</option>
    				<option>고른다</option>
    			</select>
    		</div>
		    <div class="boxBody">	
				<div class="input-box">
					<p class="input-label">반려동물 이름</p><input type="text">
	    			<p class="input-label">품종</p><input type="text">
	    			<p class="input-label">성별</p><input type="text">
	    			<p class="input-label">생년월일</p><input type="text">
	    			<p class="input-label">중성화 여부</p><input type="email">
	    			<p class="input-label">기초 예방 접종 여부</p><input type="text">
	    			<p class="input-label">체중</p><input type="text">
	    		</div>
	    	</div>
    	</div>
    	
    	<div class="submitBody">
    		<div class="submit">수정</div>
    		<div class="delete">삭제</div>
    	</div>
	</div>
</body>
</html>