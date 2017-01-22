<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>

	<%-- <c:choose>
		<c:when test="${ not empty exception and not empty exception.errCode and not empty exception.errMsg }">
		
			<c:if test="${not empty exception.errCode}">
				<h1>${exception.errCode} : System Errors</h1>
			</c:if>
		
			<c:if test="${empty exception.errCode}">
				<h1>System Error!</h1>
			</c:if>
		
			<c:if test="${not empty exception.errMsg}">
				<div class="ads-in-post hide_if_width_less_800">
				</div><h2>${exception.errMsg}</h2>
			</c:if>
		
		</c:when>
		<c:otherwise>
			<h1>System Error!</h1>
		</c:otherwise>
	</c:choose> --%>
	
	<h1>System Error!</h1>

</body>
</html>