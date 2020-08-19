

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>应用属性首页</title>
</head>
<body>
<% 
String name = request.getParameter("oid");//用request得到 url后面的参数
%> 


	
 

	<table border="1px" align="center" height="900px" width="1800px" cellpadding="0px" cellspacing="0px">
			
			<!--1.-->
			<tr>
				<td height="600px" height="600px"  style="text-align: center; width:100%;line-height: 70px;background-color: paleturquoise; display: table-cell;" >
					<!--2-->
					<form action="${pageContext.request.contextPath }/NodeAptAction_execute" method=post>
						<table  align="center" cellpadding="0px" cellspacing="0px" >
							<tr >
								<td >
									<font size="6">你好！您现在访问的是天宇设备制造公司所维护的应用属性管理服务器!</font> 
								</td>
							</tr>
							
							<tr >
								<td>
									<font size="6">您所查询的传感节点OID是：<%=name%></font> 
								</td>
							</tr>
							<tr>
								<td align="center">
									<input type="hidden" id="kaka" name="node_oid" >
                                    <input type="submit" value='继续'style='font-size:25px; width: 135px' height="44px" width="600px" style="width: 161px; height: 52px">
                                    <script type="text/javascript">
										/*使用正则表达式匹配，获取地址栏的 请求参数，地址栏参数的形式如下：../?oid=123&haha=234&heihei=345*/
										function GetQueryString(name)
										{
										     var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
										     var r = window.location.search.substr(1).match(reg);
										     if(r!=null)
										     return  unescape(r[2]);
										}
										var test = GetQueryString("oid");
										document.getElementById("kaka").value =test;//将test赋到id为"kaka"的form表单input中，表单提交的方式传递给后台
										
										/* 调用方法，通过对话框弹出显示
										alert(GetQueryString("oid"));
										*/
									</script>
								</td>
							</tr>
							<tr>
								<td align="center">
									<font size="4">点击继续，为您查询传感节点的应用属性信息详细内容</font> 
								</td>
							</tr>
							 
					</table>		
			</form>
		</table>

<form action="${pageContext.request.contextPath }/RaelAction_execute" method=post>


	</form>
	<s:debug></s:debug>
</body>
</html>