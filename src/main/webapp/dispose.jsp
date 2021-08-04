<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>收件管理</title>
    <link rel="stylesheet" type="text/css" media="screen" href="main_manager.css" />
    <script src="./js/branch_manager.js"></script>
</head>
<body>
<ul type="none">
    <h5>欢迎您，分仓管理员！</h5>
    <li><h3><a href="update.jsp" target="body">信息修改</a></h3></li>
    <li><h3><a href="dispose.jsp" target="body">收件处理</a></h3></li>
    <li><h3><a href="delivery.jsp" target="body">配送管理</a></h3></li>
    <li><h3><a href="index.jsp" target="_blank">退出登录</a></h3></li>
</ul>
</body>
<body>
<div>
    <h3>总仓取件请求</h3>
    <h3>总仓取件请求</h3>
    <table class="myTable table-hover table-striped">
        <thead>
        <tr>
            <th style="width:10%;">单号</th>
            <th style="width:10%;">收件人</th>
            <th style="width:15%;">到件日期</th>
            <th style="width:35%;">地址</th>
            <th style="width:10%;">分仓号</th>
            <th style="width:10%;">取件日期</th>
            <th style="width:10%;">取件码</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="commodity" items="${list}">
            <tr>
                <td>${commodity.name}</td>
                <td>${commodity.owerID}</td>
                <td>${commodity.arriveDate}</td>
                <td>${commodity.place}</td>
                <td>${commodity.warehouse}</td>
                <td>${commodity.name}</td>
                <td>${commodity.reciveDate}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<br>
<div class="inputBox">
    <br>
    <label>快递单号</label>
    <input type="text" name="delivery_number" id="delivery_number"  required="required">
    <label>位置号</label>
    <input type="text" name="room_number" id="room_number"  required="required">
    <input type="button" id="btn_up" value="上架" onclick="up();">
    <br>
    <br>
</div>


</body>
