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
<title>搜索</title>
<meta name="keywords" content="">
<meta name="description" content="">
<meta name="author" content="Jason">
<link href="css/style.css" type="text/css" rel="stylesheet" media="screen" />
</head>

<body>
<section class="search-box">
	<section class="search-con pr">
		<input type="hidden" id="searchOrback" value="1"/>
    	 <input type="text" id="music_search_id" placeholder="请输入关键词搜索" ／><span onclick="searchMusic();" class="pa" id="confirmId">取消</span>
    </section>
    <section class="search-list">
    	<header>热门搜索</header>
        <section class="search-list-con" id="music_search-list-con">
        <c:choose>
        	<c:when test="${not empty list }">
				<c:forEach items="${list }" var="music">
					<a onclick="showMusicPermission(${music.id});">${music.music_name }</a>
				</c:forEach>
			</c:when>
		</c:choose>

        </section>
    </section>
</section>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/video_m_n/myjs/index.js"></script>
</html>