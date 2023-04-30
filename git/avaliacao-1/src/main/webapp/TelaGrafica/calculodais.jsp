<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>calcular Dias</h2>
<%
            String nome;
            int idade = 0;
            int dias = 0;
            String nomeStr = request.getParameter("nome");
            String idadeStr = request.getParameter("idade");
            if(idadeStr != null )
            {
                idade = Integer.parseInt(idadeStr);
                dias = idade*365;
            }
        %>
        <% if(dias > 0) { %>
            <h3><%=nomeStr%>, você ja viveu  <%=dias%> dias</h3>
        <% } %>
</body>
</html>