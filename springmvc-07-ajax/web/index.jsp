<%--suppress ALL --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
<%--    js是一个很随便的语言--%>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.js"></script>
    <script>
       function a(){
          $.post({
            url:"${pageContext.request.contextPath}/a1",
            data: {"name":$("uername").val()},
            success: function (data,status){
              //alert(data);
              console.log("data=>"+data);
              console.log("status=>"+status);
            }
          })
       }
    </script>
  </head>
  <body>
<%--失去焦点的时候发起请求(携带信息)到后台  onblur失去焦点事件--%>
  用户名：<input type="text" id="uername" onblur="a()">


  </body>
</html>
