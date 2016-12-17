<%@ taglib prefix="shiro" uri="/WEB-INF/tlds/shiros.tld" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fns" uri="/WEB-INF/tlds/fns.tld" %>
<%@ taglib prefix="fnc" uri="/WEB-INF/tlds/fnc.tld" %>
<%@ taglib prefix="sys" tagdir="/WEB-INF/tags/sys" %>
<%@ taglib prefix="act" tagdir="/WEB-INF/tags/act" %>
<%@ taglib prefix="cms" tagdir="/WEB-INF/tags/cms" %>
<c:set var="ctx" value="${pageContext.request.contextPath}${fns:getAdminPath()}"/>
<c:set var="ctxStatic" value="${pageContext.request.contextPath}/static"/>
<link href="${pageContext.request.contextPath}/static/video_m_n/css/style.css" type="text/css" rel="stylesheet" media="screen" />
<link href="${pageContext.request.contextPath}/static/video_m_n/css/iscroll.css" type="text/css" rel="stylesheet" media="screen" />
<script type="text/javascript" src="${pageContext.request.contextPath}/static/video_m_n/myjs/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/video_m_n/myjs/iscroll-probe.js"></script>
<!-- v 5.2.0 -->
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/static/video_m_n/myjs/iscroll.js"></script> --%>
<!-- v 4.2.5 -->
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/static/jingle/js/lib/iscroll.js"></script> --%>