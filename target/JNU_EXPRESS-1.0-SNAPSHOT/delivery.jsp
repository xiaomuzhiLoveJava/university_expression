
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>配送管理</title>
    <link rel="stylesheet" type="text/css" media="screen" href="main_manager.css" />
    <script src="./js/branch_manager.js"></script>
</head>
<body>
<h3>配送上门或用户自行取件</h3>

<div>
    <table class="myTable table-hover table-striped">
        <thead>
        <tr>
            <th style="width:10%;">单号</th>
            <th style="width:10%;">收件人</th>
            <th style="width:15%;">到件日期</th>
            <th style="width:10%;">分仓号</th>
            <th style="width:10%;">取件时间</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="commodity" items="${list}">
            <tr>
                <td style="width:10%;">${commodity.id}</td>
                <td style="width:10%;">${commodity.ownerID}</td>
                <td style="width:15%;">${commodity.arriveDate}</td>
                <td style="width:10%;">${commodity.warehouse}</td>
                <td style="width:10%;">${commodity.recevieDate}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <form method="post" action="${pageContext.request.contextPath}/getin">
        <p><label class="label_input">快递单号</label><input type="text" id="username" class="text_field" name="deliveryID"/></p>
        <input type="submit" id="btn_login" value="上架" acction="${pageContext.request.contextPath}/delivery"/>
    </form>
</div>
</body>

