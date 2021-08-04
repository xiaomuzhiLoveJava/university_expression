<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/7/17
  Time: 23:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>收件管理</title>
    <link rel="stylesheet" type="text/css" media="screen" href="main_manager.css" />
</head>
<body>
<div>
    <h3>总仓取件请求</h3>
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
</div>

<br>
    <div class="inputBox">
        <br>
        <label>快递单号</label>
        <input type="text" name="delivery_number" id="delivery_number"  required="required">
        <label>位置号</label>
        <input type="text" name="room_number" id="room_number"  required="required">
        <input type="button" id="btn_up" value="确认">
        <br>
        <br>
    </div>
</div>

</body>
