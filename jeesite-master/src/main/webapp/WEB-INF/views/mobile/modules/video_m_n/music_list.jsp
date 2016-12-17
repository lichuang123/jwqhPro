<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">
<meta name="format-detection" content="email=no">
<meta name="wap-font-scale" content="no">
<title>音频列表</title>
<meta name="keywords" content="">
<meta name="description" content="">
<meta name="author" content="Jason">
<style type="text/css">
	.links a{width:3.5rem;}
</style>
</head>

<body>
<header class="header pr">音频专区<a href="../videoTableController/selectHostVideo.do" class="back pa">&lt;返回</a><a href="goSearchMusicPage.do" class="search-icon pa">搜索</a></header>
<section class="list-box clearfix">
	<section class="links clearfix">
	<c:choose>
		<c:when test="${not empty list }">
			<c:forEach items="${list }" var="be">
				<c:if test="${be.music_belongTo == 1}"><a href="goMusicMorePage.do?type=${be.music_belongTo }">听广播</a></c:if>
				<c:if test="${be.music_belongTo == 2}"><a href="goMusicMorePage.do?type=${be.music_belongTo }">听小说</a></c:if>
				<c:if test="${be.music_belongTo == 3}"><a href="goMusicMorePage.do?type=${be.music_belongTo }">听相声</a></c:if>
				<c:if test="${be.music_belongTo == 4}"><a href="goMusicMorePage.do?type=${be.music_belongTo }">听音乐</a></c:if>
				<c:if test="${be.music_belongTo == 5}"><a href="goMusicMorePage.do?type=${be.music_belongTo }">听经典</a></c:if>
				<c:if test="${be.music_belongTo == 6}"><a href="goMusicMorePage.do?type=${be.music_belongTo }">听英语</a></c:if>
				<c:if test="${be.music_belongTo == 7}"><a href="goMusicMorePage.do?type=${be.music_belongTo }">听热门</a></c:if>
			</c:forEach>
		</c:when>
	</c:choose>
     
    </section>
    <section class="list-box-con clearfix">
    	<header>听广播<a href="goMusicMorePage.do?type=1">更多&gt;</a></header>
        <ul class="list-box-con-s clearfix">
        <c:choose>
        	<c:when test="${not empty list1 }">
				<c:forEach items="${list1 }" var="music">
					<li>
					<a onclick="showMusicPermission(${music.id});">
						<c:if test="${not empty music.music_photo_url}"><img src="${music.music_photo_url }" /></c:if>
						<c:if test="${empty music.music_photo_url}"><img src="${pageContext.request.contextPath}/static/video_m_n/pic/pic2.png" /></c:if>
					<em>${music.music_name }</em>
             			<span>
              			<c:if test="${music.music_type==1 }">广播录音</c:if>
              			<c:if test="${music.music_type==2 }">名人课堂</c:if>
              		</span></a></li>
				</c:forEach>
			</c:when>
		</c:choose>
        </ul>
    </section>
    <section class="list-box-con clearfix">
    	<header>听小说<a href="goMusicMorePage.do?type=2">更多&gt;</a></header>
        <ul class="list-box-con-s clearfix">
        
        	<c:choose>
        	<c:when test="${not empty list2 }">
				<c:forEach items="${list2 }" var="music">
					<li><a onclick="showMusicPermission(${music.id});">
						<c:if test="${not empty music.music_photo_url }"><img src="${music.music_photo_url }" /></c:if>
						<c:if test="${empty music.music_photo_url}"><img src="${pageContext.request.contextPath}/static/video_m_n/pic/pic2.png" /></c:if>
					<em>${music.music_name }</em>
             			<span>
              			<c:if test="${music.music_type==1 }">广播录音</c:if>
              			<c:if test="${music.music_type==2 }">名人课堂</c:if>
              		</span></a></li>
				</c:forEach>
			</c:when>
		</c:choose>
        	
        </ul>
    </section>

</section>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/video_m_n/myjs/index.js"></script>

</html>