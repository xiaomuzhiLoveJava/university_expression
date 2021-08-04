<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>暨南大学快递配送服务平台</title>
<%--    <link rel="stylesheet" type="text/css" media="screen" href="login.css" />--%>

</head>
<style>
    body{
        margin: 0;
        padding: 0;
        font-family: sans-serif;
        background: url(background.jpg) no-repeat;
        /*	background: rgba(0.5);*/

        background-size: 100% 100%;
        background-attachment:fixed;
    }
    h1{
        padding: 0;
        color: #fff;
        text-align: center;
        margin-top:80px;
        font-size: 75px;
    }
    .box{
        /*绝对定位 */
        position: absolute;

        /* 居中 */
        top: 60%;
        left: 50%;
        transform: translate(-50%,-50%);

        /* 整个登陆图层的宽度 */
        width: 400px;

        /* 登陆图层内部元素跟图层边框的四周距离 */
        padding: 40px;

        /* 背景颜色 纯白 不透明度0.6 */
        background: rgba(102, 102, 102, 0.7);

        /* 设置box-sizing模式为border-box 这样内含图层的padding和border都会算在其大小中 */
        box-sizing: border-box;

        /* 添加阴影  x轴 y轴 blur 颜色*/
        box-shadow: 0 15px 20px rgba(0,0,0,0.8);

        /* 设置圆角 */
        border-top-left-radius: 30px;
        border-bottom-right-radius: 30px;
    }

    /* 设置box类中的h2标签属性 */
    .box h2{
        margin: 0 0 30px;
        padding: 0;
        color: #fff;
        text-align: center;
    }

    /* 设置box类中的inputBox类为相对定位 */
    .box .inputBox{
        position: relative;
    }

    /* 设置box类中的inputBox类中的input标签属性 */
    .box .inputBox input{

        /* 宽度和父亲容器一致 */
        width: 100%;

        /* 上下内边距为10px 左右内边距为0px */
        padding: 10px 0 5px;

        /* 字体大小16px */
        font-size: 16px;
        letter-spacing: 1px;
        color: #fff;
        margin-bottom: 30px;
        border: none;
        border-bottom: 2px solid #fff;
        outline: none;
        background: transparent;
    }

    /* 设置box类中inputBox类中的label标签 */
    .box .inputBox label{
        /* 绝对定位
            注意到上面已经把inputBox设置成了position: relative
            所以这里的label是相对于inputBox的绝对定位  而不是相对于body
        */
        position: absolute;
        top: 0;
        left: 0;
        padding: 10px 0;
        font-size: 16px;
        color: #fff;
        pointer-events: none;

        /* 设置label标签的过渡动画时间为0.8秒 */
        transition: .8s;
    }

    /* input监听获取焦点事件  改变选择的label标签的属性
    p~ul 选择前面有 <p> 元素的每个 <ul> 元素。
    我的理解是这里选同一inputBox中的每个<label>元素（<p>在这里没写即不做限制）
    */
    .box .inputBox input:focus ~label{
        /* Username提示向上移动20px 并且缩小字体 修改颜色 */
        top: -20px;
        left:0;
        font-size: 14px;
        /* color:rgb(225, 240, 137); */
        color: #9ff13b;
    }

    /* 监听input内容有效 保持label元素的属性 */
    .box .inputBox input:valid ~ label{
        top: -20px;
        left:0;
        font-size: 14px;
        /* color:rgb(225, 240, 137); */
        color: #9ff13b;
    }

    /* 选择box类中type为submit的input标签 */
    .box input[type="button"]{
        border: none;
        outline: none;
        color: #fff;
        background: #03a9f4;
        padding: 10px 20px;
        cursor: pointer;
        border-radius: 5px;
        /* 相对定位 享对于其父亲box类*/
        position: relative;

        /* 实现按钮水平居中 */
        /* 从父亲的左边宽度50%处开始 */
        left: 50%;
        /* 把元素沿着横向(x轴)移动自身宽度的50% */
        transform: translate(-50%);

        /* 实现元素相对于父亲水平/垂直居中都是用这种方法
            left:50%;
            top:50%;
            transform:translate(-50%, -50%);
        */
    }

</style>
<body>
<h1>暨南大学快递配送服务平台</h1>
<div class="box">
    <h2>登录</h2>
    <form method="post" action="${pageContext.request.contextPath}/login">
        <div class="inputBox">
            <input type="text" name="username" id="username" autocomplete="on" required="required">
            <label>账号</label>
        </div>
        <div class="inputBox">
            <input type="password" name="password" id="password" autocomplete="on" required="required">
            <label>密码</label>
        </div>

        <input type="submit" id="btn_login" value="提交">
    </form>
</div>
</body>
</html>

