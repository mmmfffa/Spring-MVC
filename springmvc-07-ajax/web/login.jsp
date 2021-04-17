<%--suppress ALL --%>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/16
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.js"></script>
    <script>
        function a1(){
           //发起ajax异步请求
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{"name":$("#name").val()},
                success:function (data){
                    //
                    if(data.toString()==='ok'){
                        $("#userinfo").css("color","green");
                    }else {
                        $("#userinfo").css("color","red");
                    }
                    $("#userinfo").html(data);
                }
            })
        }
        function a2(){
            $.post({
                url:"${pageContext.request.contextPath}/a3",
                data:{"pwd":$("#pwd").val()},
                success:function (data){
                    if(data.toString()==='ok'){
                        $("#pwdinfo").css("color","green");
                    }else {
                        $("#pwdinfo").css("color","red");
                    }
                    $("#pwdinfo").html(data);
                }
            })
        }
    </script>
</head>
<body>
   <p>
       用户名：<input type="text" id="name" onblur="a1()">
       <span id="userinfo"></span>
   </p>
   <p>
       密码：<input type="text" id="pwd" onblur="a2()">
       <span id="pwdinfo"></span>
   </p>
</body>
</html>
