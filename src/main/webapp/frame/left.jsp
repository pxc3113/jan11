<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
  dt{
    margin: 5px;
    padding:5px
  }
  dd{
     margin: 10px;
     margin-left: 25px
  }
</style>
</head>
<body>
     <dl>
       <c:forEach items="${list }" var="t">
         <c:if test="${t.pid==0 }">
           <dt>${t.text }</dt>
         </c:if>
         <c:if test="${t.pid!=0 }">
         <dd>
           <a href="<%=request.getContextPath() %>/${t.url }" target="main">${t.text }</a>
         </dd>
         </c:if>
       </c:forEach>
       
     </dl>
</body>
</html>