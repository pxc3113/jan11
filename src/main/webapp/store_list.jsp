<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="/common/inc.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
</head>

<body>
  <table border="1">
    <tr>
      <td>店铺id</td>
      <td>店铺名称</td>
      <td>店铺营业状态</td>
      <td>操作</td>
    </tr>
    <c:forEach items="${page.list}" var="m">
      <tr>
        <td>${m.tEatingId }</td>
        <td>${m.tEatingName }</td>
        <td>${m.tEatingIs==1?营业:关闭}</td>
        <!-- <td>
           <input type="button" value="订餐" class="btn btn-danger" onclick="order('${m.tEatingId }','${m.moviename }')"> 
         </td> -->
      </tr>
    </c:forEach>
  </table>
  <jsp:include page="/common/page.jsp"></jsp:include>
</body>
<script type="text/javascript">
  //单个删除
  function delMovie(movieid, moviename) {
    /*  alert(movieid);
     alert(moviename); */
    //使用发布确认框提示用户是否删除
    if (confirm("你确定删除 " + moviename + " 吗？")) {
      //发起ajax请求进行删除
      $.ajax({
        url: "<%=request.getContextPath()%>/movie/delMovie.do",
        type: "post",
        data: {
          "movieid": movieid
        },
        success: function () {
          location.reload();
        },
        error: function () {
          alert("删除失败");
        }
      })
    }
  }
</script>

</html>