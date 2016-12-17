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
    <title>视频播放</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="Jason">
</head>

<body>
    <header class="header pr">详情<a href="selectThreeTypeVideoHost.do" class="back pa">&lt;返回</a><!-- <a href="" class="search-icon pa">搜索</a> --></header>
    <section class="page-box clearfix">
    		<c:if test="${not empty list_0.video_photo_url }">
		        <video id="myVideo" controls="controls" poster="${list_0.video_photo_url }" width="100%">
		            <source src="${list_0.video_address }" type="video/mp4" id="sourceId"/>
		            <p>Your browser does not support the video tag.</p>
		        </video>
	        </c:if>
	        <c:if test="${empty list_0.video_photo_url}">
		        <video id="myVideo" controls="controls" poster="${pageContext.request.contextPath}/static/video_m_n/pic/pic2.png" width="100%">
		            <source src="${list_0.video_address }" type="video/mp4" id="sourceId"/>
		            <p>Your browser does not support the video tag.</p>
		        </video>
	        </c:if>
	        <input type="hidden" id="currentTime"/>
	        <section class="page-links clearfix"><a onclick="play('${list_0.video_address }');" id="playOrpused">播放</a><a onclick="downLoad();">下载</a></section>
	        <section class="page-info clearfix">
	            <header class="page-info-hd">
	            	<span>
	            		<c:if test="${list_0.video_type==1 }">电视剧</c:if>
	            		<c:if test="${list_0.video_type==2 }">电影</c:if>
	            		<c:if test="${list_0.video_type==3 }">专题片</c:if>
	            	</span>
	            <h1>${list_0.video_name }</h1></header>
	            <p class="page-info-s">摘要：${list_0.video_context }</p>
	            <input type="hidden" id="video_like_hite_vtcId" value="${list_0.vtcId }"/>
	            <section class="page-info-reading">
	            <a onclick="videoHiteChange();" id="videoHiteId">${list_0.video_hite_count }</a>
	            <a onclick="videoLikeChange();" id="videoLikeId" >${list_0.video_like_count }</a>
	            <span id="play_span">观看${list_0.video_play_count }次</span></section>
	        </section>
        <section class="page-related clearfix">
		<em>剧集</em>
		<input type="hidden" id="video_id" value="${list_0.id }"/>
		<section class="page-related-list-2" id="chooseOrderF">
			<c:choose>
	    		<c:when test="${not empty list }">
	    			<c:forEach items="${list }" var="video">
	    					<c:if test="${video.video_order<=15 }">
	    						<a id="chooseOrder${video.video_order }" onclick="chooseOrder('${video.video_address}','${video.video_order }','${video.vtcId }')" <c:if test="${video.video_order==1 }"> class="on"</c:if>>${video.video_order }</a>
	    					</c:if>
	    					<c:if test="${video.video_order>15 }">
	    						<a id="chooseOrder${video.video_order }" onclick="chooseOrder('${video.video_address}','${video.video_order }','${video.vtcId }')" style="display: none;">${video.video_order }</a>
	    					</c:if>
	    			</c:forEach>
	    		</c:when>
	    	</c:choose>
			<c:if test="${more == 14 }"><a onclick="removeHdclass();" style="width: auto;font-size: .875rem;font-weight: 100;" id="showMore">更多&gt;&gt;</a></c:if>
		</section>
        </section>
    </section>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/video_m_n/myjs/page2.js"></script>

</html>