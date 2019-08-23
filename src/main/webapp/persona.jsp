<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado</title>
</head>
<body>

	<label>Nombres:</label>
	<ul>
		<c:forEach var="persona" items="${personas}">
			<c:url var="linkActualizar" value="PersonasController">
				<c:param name="instruccion" value="valor"></c:param>
				<c:param name="id" value="${persona}"></c:param>

			</c:url>
			
			
			<li>${persona}</li>
			
			
			<li><a href="${linkActualizar}">Actualizar</a></li>
		</c:forEach>
	</ul>
</body>
</html>