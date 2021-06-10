<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<link rel="stylesheet" type="text/css" href="login.css"/>
<head>
    <title>暨南大学快递服务中心</title>
</head>

<body>
<h id="biaoti">暨南大学快递服务中心</h>
<div id="login_frame">
    <p id="image_logo"><img src="1.png"></p>
    <form method="post" action="${pageContext.request.contextPath}/login">
        <p><label class="label_input">用户名</label><input type="text" id="username" class="text_field" name="username"/></p>
        <p><label class="label_input">密码</label><input type="password" id="password" class="text_field" name="password"/></p>
        <input type="submit" id="btn_login" value="登录"/>
    </form>
</div>

</body>
</html>