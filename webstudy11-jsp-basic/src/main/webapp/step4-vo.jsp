<%@page import="model.FoodVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
FoodVO vo = new FoodVO("3분카페", "오뚜기", 1200);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>vo test</title>
<link rel="stylesheet" type="text/css" href="css/home.css">

</head>
<body>
	<table>
		<thead>
			<th>name</th>
			<th>maker</th>
			<th>price</th>
		</thead>
		<tbody>
			<tr>
				<td><%=vo.getName()%></td>
				<td><%=vo.getMaker()%></td>
				<td><%=vo.getPrice()%></td>
			</tr>
		</tbody>
	</table>
</body>
</html>