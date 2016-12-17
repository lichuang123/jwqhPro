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
	#scroller li{width:50%; padding:10px; box-sizing:border-box; float:left; border-top: aliceblue; border-bottom: aliceblue; line-height: inherit;height: auto;};
</style>
</head>

<body onload="loaded()">
	<input type="hidden" id="video_type_id" value="${type }"/>
	<input type="hidden" id="frmUrl" value="${pageContext.request.contextPath}"/>
	<section id="wrapper">
		<section id="scroller">
			<section id="pullDown">
	  			<span class="pullDownIcon"></span><span class="pullDownLabel">这是顶部...</span>
	 		</section>
	 		<header class="header pr">听音乐<a href="goMusicListPage.do" class="back pa">&lt;返回</a></header>
			<section class="list-box clearfix">
	 		<section class="scroller-content" >
	 			<section class="list-box-con clearfix" style="border-top:0;">
			        <ul class="list-box-con-s clearfix" style="border-top:0;" id="loadingDataForpage">
			        	
			        </ul>
			    </section>
	 		</section>
	 		</section>
	 		<section id="pullUp">
				<span class="pullUpIcon"></span><span class="pullUpLabel">上拉刷新...</span>
			</section>
		</section>
	</section>

</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/video_m_n/myjs/index.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/video_m_n/myjs/music_more_list.js"></script>
</html>