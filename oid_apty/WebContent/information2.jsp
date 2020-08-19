<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link href="${pageContext.request.contextPath }/css/layout.css" type="text/css" rel=stylesheet />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<title>节点信息</title>
</head>
<body>
		<div id="header">
		</div>
		<div id="containter">
			<div class="t"></div>
			<div id="content">
				<div id="main">
					<div class="up"></div>
					<div class="t"></div>
					<div class="left">
					
					</div>
					<div class="right"></div>
					<div class="t"></div>
					<div class="bottom">
		<s:iterator value="list" status="status" >
		<table  style=" width: 100%; border-collapse: collapse; border-spacing: 0;" >
			<tr>
				<td colspan="3" style="text-align: center;padding: 8px; width:100%;line-height: 20px;background-color: #169fe6; display: table-cell;">OID为：<%String name = request.getParameter("node_oid");%>的传感节点应用属性信息</td>
				
			</tr>
			<tr>
				<td style="border-right: 1px solid #ddd; text-align: center;
	   padding: 8px; 	   
	   line-height: 20px;
	   background-color: #F5F5F5; 
	   border-top: 1px solid #ddd;  
	   border-right: 1px solid #ddd;	   
	   display: table-cell;">应用属性标识编码：</td>
				<td colspan="2" style="text-align: left;
	   padding: 8px;	   
	   line-height: 20px;
	   background-color: #F5F5F5;
	   border-top: 1px solid #ddd;
	   display: table-cell;"><s:property value="node_coding" /></td>
				
			</tr>
			<tr>
				<td style="text-align: center;
	   padding: 8px; 	   
	   line-height: 20px;
	   background-color: #fff;  
	   border-top: 1px solid #ddd;
	   border-right: 1px solid #ddd;	   
	   display: table-cell;">节点描述符：</td>
				<td colspan="2" style="text-align: left;
	   padding: 8px;	  
	   line-height: 20px;
	   background-color: #fff;
	   border-top: 1px solid #ddd;
	   display: table-cell;"><s:property value="desc_type" /></td>
			</tr>
			<tr>
				<td style="text-align: center;
	   padding: 8px; 	   
	   line-height: 20px;
	   background-color: #F5F5F5; 
	   border-top: 1px solid #ddd;  
	   border-right: 1px solid #ddd;	   
	   display: table-cell;">版本号：</td>
				<td colspan="2" style="text-align: left;
	   padding: 8px;	   
	   line-height: 20px;
	   background-color: #F5F5F5;
	   border-top: 1px solid #ddd;
	   display: table-cell;"><s:property value="desc_version" /></td>
			</tr>
			<tr>
				<td style="text-align: center;
	   padding: 8px; 	   
	   line-height: 20px;
	   background-color: #fff;  
	   border-top: 1px solid #ddd;
	   border-right: 1px solid #ddd;	   
	   display: table-cell;">通道口数量：</td>
				<td colspan="2" style="text-align: left;
	   padding: 8px;	  
	   line-height: 20px;
	   background-color: #fff;
	   border-top: 1px solid #ddd;
	   display: table-cell;"><s:property value="#list5[#status.index].chanum" /></td>				
			</tr>
			
			
			<tr>
				<td style="border-top: 1px solid #ddd;text-align: center;
	   padding: 8px; 
	   width:30%;
	   line-height: 17px;
	   background-color: #F5F5F5; 	   
		border-right: 1px solid #ddd;	   
	   display: table-cell;">供电方式：</td>
				<td style="text-align: left;
	   padding: 8px;
	   width:30%;
	   line-height: 17px;
	   background-color: #F5F5F5;
	   border-top: 1px solid #ddd;
	   border-right: 1px solid #ddd;
	   display: table-cell;">直交流</td>
				<td style="text-align: center;
	   padding: 8px; 
	   width:40%;
	   line-height: 17px;
	   background-color: #F5F5F5; 
	   border-top: 1px solid #ddd; 
			   
	   display: table-cell;"><s:property value="#list1[#status.index].powered" /></td>
			</tr>
			<tr>
				<td style="text-align: center;
	   padding: 8px; 
	   width:30%;
	   line-height: 17px;
	   background-color: #F5F5F5; 	   
	   border-right: 1px solid #ddd;	   
	   display: table-cell;"></td>
				<td style="
				text-align: left;
	   padding: 8px;
	   width:30%;
	   line-height: 17px;
	   background-color: #F5F5F5;
	   border-top: 1px solid #ddd;
	   border-right: 1px solid #ddd;
	   display: table-cell;">外部供电</td>
				<td style="text-align: center;
	   padding: 8px; 
	   width:40%;
	   line-height: 17px;
	   background-color: #F5F5F5; 
	   border-top: 1px solid #ddd; 
	  	   
	   display: table-cell;"><s:property value="#list1[#status.index].external" /></td>
			</tr>
			<tr>
				<td style="text-align: center;
	   padding: 8px; 
	   width:30%;
	   line-height: 17px;
	   background-color: #F5F5F5; 	   
	   border-right: 1px solid #ddd;	   
	   display: table-cell;"></td>
				<td style="
				text-align: left;
	   padding: 8px;
	   width:30%;
	   line-height: 17px;
	   background-color: #F5F5F5;
	   border-top: 1px solid #ddd;
	   border-right: 1px solid #ddd;
	   display: table-cell;">总线供电</td>
				<td style="text-align: center;
	   padding: 8px; 
	   width:40%;
	   line-height: 17px;
	   background-color: #F5F5F5; 
	   border-top: 1px solid #ddd; 
	     
	   display: table-cell;"><s:property value="#list1[#status.index].buspower" /></td>
			</tr>
			<tr>
			<td style="text-align: center;
	   padding: 8px; 
	   width:30%;
	   line-height: 17px;
	   background-color: #F5F5F5; 	   
	   border-right: 1px solid #ddd;	   
	   display: table-cell;"></td>
				<td style="
				text-align: left;
	   padding: 8px;
	   width:30%;
	   line-height: 17px;
	   background-color: #F5F5F5;
	   border-top: 1px solid #ddd;
	   border-right: 1px solid #ddd;
	   display: table-cell;">电池供电</td>
				<td style="text-align: center;
	   padding: 8px; 
	   width:40%;
	   line-height: 17px;
	   background-color: #F5F5F5; 
	   border-top: 1px solid #ddd; 
	  	   
	   display: table-cell;"><s:property value="#list1[#status.index].battery" /></td>
			</tr>
			
			
			<tr>
				<td style="border-top: 1px solid #ddd;text-align: center;
	   padding: 8px; 	
	   width:30%;	   
	   line-height: 17px;
	   background-color: #fff;  
	   border-right: 1px solid #ddd;	   
	   display: table-cell;">外壳防护等级：</td>
				<td style="text-align: left;
	   padding: 8px;	
	   width:30%;	   
	   line-height: 17px;
	   background-color: #fff;
	   border-top: 1px solid #ddd;
	   border-right: 1px solid #ddd;
	   display: table-cell;">防水等级</td>
				<td style="text-align: left;
	   padding: 8px;	
	   width:40%;	   
	   line-height: 17px;
	   background-color: #fff;
	   border-top: 1px solid #ddd;
	   
	   display: table-cell;"><s:property value="#list2[#status.index].waterproof" /></td>
			</tr>
			<tr>
				<td style=" text-align: center;
	   padding: 8px; 	
	   width:30%;	   
	   line-height: 17px;
	   background-color: #fff;  
	   border-right: 1px solid #ddd;	   
	   display: table-cell;"></td>
				<td style="text-align: left;
	   padding: 8px;	
	   width:30%;	   
	   line-height: 17px;
	   background-color: #fff;
	   border-top: 1px solid #ddd;
	   border-right: 1px solid #ddd;
	   display: table-cell;">防护等级</td>
				<td style=" text-align: left;
	   padding: 8px;	
	   width:40%;	   
	   line-height: 17px;
	   background-color: #fff;
	   border-top: 1px solid #ddd;
	  
	   display: table-cell;"><s:property value="#list2[#status.index].protection" /></td>
			</tr> 
			
			<tr>
				<td style="text-align: center;
	   padding: 8px; 	   
	   line-height: 20px;
	   background-color: #F5F5F5; 
	   border-top: 1px solid #ddd;  
	   border-right: 1px solid #ddd;	   
	   display: table-cell;">无线频段：</td>
				<td colspan="2" style="text-align: left;
	   padding: 8px;	   
	   line-height: 20px;
	   background-color: #F5F5F5;
	   border-top: 1px solid #ddd;
	   display: table-cell;"><s:property value="#list3[#status.index].frequency" /></td>
			</tr>
			<tr>
				<td style="text-align: center;
	   padding: 8px; 	   
	   line-height: 20px;
	   background-color: #fff;  
	   border-top: 1px solid #ddd;
	   border-right: 1px solid #ddd;	   
	   display: table-cell;">防爆类型：</td>
				<td colspan="2" style="text-align: left;
	   padding: 8px;	  
	   line-height: 20px;
	   background-color: #fff;
	   border-top: 1px solid #ddd;
	   display: table-cell;"><s:property value="#list4[#status.index].explosion" /></td>
			</tr>
		</table>
		</s:iterator>
		
		
					</div>
					
				</div>
				<div id="barside"></div>
			</div>
			<div class="t"></div>
			<div id="footer">
			</div>
		</div>
		
		
			
		
	</body>
</html>