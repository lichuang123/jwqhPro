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
    <title>音频展示</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="Jason">
    
</head>
<style type="text/css">
    .music_showPhoto{text-align: center;}
</style>

<body>
    <header class="header pr">音频专区<a href="goMusicListPage.do" class="back pa">&lt;返回</a><!-- <a href="" class="search-icon pa">搜索</a> --></header>
    <section class="page-box clearfix">
        <div class="music_showPhoto">
        	<c:if test="${not empty list_0.music_photo_url }"><img src="${list_0.music_photo_url }" align="" /></c:if>
        	<c:if test="${empty list_0.music_photo_url}"><img src="${pageContext.request.contextPath}/static/video_m_n/pic/pic2.png" align="" /></c:if>
        </div>
        <audio autoplay="autoplay" id="audio_id" style="width:100%;filter:alpha(opacity=50);-moz-opacity:0.5;opacity:0.5;position:relative;top:-4.0rem;z-index:100;" controls="controls" loop="loop" preload="auto" src="${list_0.music_address }">
		      你的浏览器不支持audio标签
		</audio>
        <section class="page-links clearfix" style="margin-top:0rem;"><a id="playId" onclick="playOrStop();">暂停</a><a onclick="musicDownload();">下载</a></section>
        <section class="page-info clearfix">
            <header class="page-info-hd">
            	<span>
					<c:if test="${list_0.music_type==1 }">广播录音</c:if>
					<c:if test="${list_0.music_type==2 }">名人课堂</c:if>
				</span>
            	<h1>${list_0.music_name }</h1>
            </header>
            <p class="page-info-s">摘要：${list_0.music_context }</p>
            <section class="page-info-reading">
            	<a onclick="addLikeOrHiteCount(1);" id="hiteId">${list_0.music_hite_count }</a>
            	<a onclick="addLikeOrHiteCount(2);" id="likeId">${list_0.music_like_count }</a>
            	<span id="playCountId">播放${list_0.music_play_count }</span></section>
        </section>
        <section class="page-related clearfix">
		<em>剧集</em>
		<input type="hidden" id="music_table_id" value="${list_0.id }"/>
		<input type="hidden" id="music_table_count_id" value="${list_0.mtcId }"/>
		<section class="page-related-list-2" id="chooseOrderF">
			<c:choose>
	    		<c:when test="${not empty list }">
	    			<c:forEach items="${list }" var="music">
	    					<c:if test="${music.music_order<=15 }">
	    						<a id="chooseOrder${music.music_order }" onclick="chooseOrder('${music.music_address}','${music.music_order }','${music.mtcId }')" <c:if test="${music.music_order==1 }"> class="on"</c:if>>${music.music_order }</a>
	    					</c:if>
	    					<c:if test="${music.music_order>15 }">
	    						<a id="chooseOrder${music.music_order }" onclick="chooseOrder('${music.music_address}','${music.music_order }','${music.mtcId }')" style="display: none;">${music.music_order }</a>
	    					</c:if>
	    			</c:forEach>
	    		</c:when>
	    	</c:choose>
			<c:if test="${more == 14 }"><a onclick="removeHdclass();" style="width: auto;font-size: .875rem;font-weight: 100;" id="showMore">更多&gt;&gt;</a></c:if>

		</section>
        </section>
    </section>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/video_m_n/myjs/music_show.js"></script>
</html>