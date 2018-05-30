<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script src="<%=request.getContextPath()%>/js/commonjs.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.11.1.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<br>session<br/><br>${sessionScope.name}<br/>
<br>session<br/><br>${sessionScope.age}<br/>
<br>request<br/><br>${requestScope.name}<br/>
<br>request<br/><br>${requestScope.age}<br/>
</body>
</html>