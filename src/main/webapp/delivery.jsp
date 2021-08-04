<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>配送管理</title>
    <link rel="stylesheet" type="text/css" href="main_manager.css" />

</head>
<body>
<h3>配送上门或用户自行取件</h3>
<div class="inputBox">
    <br>
    <label>快递单号</label>
    <input type="text" name="delivery_number" id="delivery_number"  required="required">
    <label>位置号</label>
    <input type="text" name="room_number" id="room_number"  required="required">
    <input type="button" id="btn_delivery" value="开始配送" onclick="bDelivery();">
    <input type="button" id="btn_done" value="已自行取件" onclick="takeOut();">
    <br>
    <br>
</div>

<div>
    <table id="myTable">
        <tr class="header">
            <th style="width:10%;">单号</th>
            <th style="width:10%;">收件人</th>
            <th style="width:10%;">到件日期</th>
            <th style="width:25%;">地址</th>
            <th style="width:10%;">分仓号</th>
            <th style="width:15%;">位置号</th>
            <th style="width:10%;">分发状态</th>
            <th style="width:10%;">取件状态</th>
        </tr>
        <tr>
            <td>1005</td>
            <td>Lila</td>
            <td>20210717</td>
            <td>广东省珠海市香洲区暨南大学宿舍7栋</td>
            <td>7</td>
            <td>2021071707001</td>
            <td>1</td>
            <td>0</td>
        </tr>
    </table>
</div>
</body>

