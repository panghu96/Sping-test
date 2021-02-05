<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SpringMVC测试页</title>
</head>
<body>
	<h1><a href="hello">Hello</a></h1>
	<h1><a href="testRequestParam?username=Tom&age=50">处理请求参数</a></h1>
	<h1><a href="testResponse">处理响应数据</a></h1>
	<h1><a href="testRedirect">重定向</a></h1>
	<!-- REST方式进行传参时，直接写参数值即可 -->
	<h1><a href="testREST/jerry/18">REST方式请求</a></h1>
</body>
</html>