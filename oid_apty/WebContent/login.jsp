<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="s" uri="/struts-tags" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/UserinfoAction_login"  method=post>
登陆名<input type="text" name="user_name"><br>

密码<input type="password" name="user_password"><br>

<input type="submit" value="登陆"><br>
<font><s:property value="exception.message"/></font>
</form>
<s:debug></s:debug>
</body>
</html>