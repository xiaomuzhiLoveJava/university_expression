<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/7/17
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>信息修改</title>
  <link rel="stylesheet" type="text/css" media="screen" href="main_manager.css" />
</head>

<body >
<div class="modify">
  <form action="${pageContext.request.contextPath}/changinf">
    <table border="0" class="modify">

      <tr rowspan="">
        <td colspan="" class="message">姓名</td>
        <td colspan=""><input type="text" name="name"/></td>
      </tr>

      <tr rowspan="">
        <td colspan="" class="message">密码</td>
        <td colspan=""><input type="text" name="pwd"/></td>
      </tr>

      <tr rowspan="">
        <td colspan="" class="message">仓库编号</td>
        <td colspan=""><input type="text" name="RoomNumb"/></td>
      </tr>

      <tr rowspan="1">
        <td colspan="2" class="save">
          <input type="submit" value="保存修改"  />
        </td>
      </tr>
    </table>
  </form>
  </div>
</body>
