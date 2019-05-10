<%--
  Created by IntelliJ IDEA.
  User: dsl
  Date: 2019/5/9
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script src="js/jquery.min.js"></script>

    <script>
        // 页面加载，绑定单击事件
        $(function(){
            $("#btn").click(function(){
                // alert("hello btn");
                // 发送ajax请求
                $.ajax({
                    // 编写json格式，设置属性和值
                    url:"user/Ajax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"id":10,"username":"hehe","password":"123"}',
                    dataType:"json",
                    type:"post",
                    success:function(data){
                        // data服务器端响应的json的数据，进行解析
                        alert(data);
                        alert(data.username);
                        alert(data.password);
                    }
                });

            });
        });

    </script>

</head>
<body>

<button id="btn">发送ajax的请求</button>
</body>
</html>
