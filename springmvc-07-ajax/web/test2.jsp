<%--suppress ALL --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/16
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.6.0.js"></script>
    <script>
        $(function (){
            $("#btn").click(function (){
                $.post("${pageContext.request.contextPath}/a2",function (data){
                   // console.log(data);
                    var html="";
                    for (let i = 0; i < data.length; i++) {
                        html+= "<tr>"+
                               "<td>"+data[i].name+"</td>"+
                               "<td>"+data[i].age+"</td>"+
                               "<td>"+data[i].sex+"</td>"+
                               "</tr>"
                    }
                    $("#content").html(html);
                })
            })
        });
    </script>
</head>
<body>
<input type="button" value="加载数据" id="btn">
<table>
    <thead>
       <tr>
           <th>姓名</th>
           <th>年龄</th>
           <th>性别</th>
       </tr>
    </thead>
    <tbody id="content">
    <%--            数据：后台--%>
    </tbody>
</table>
</body>
</html>
