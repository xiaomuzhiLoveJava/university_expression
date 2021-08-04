<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>信息修改</title>
  <link rel="stylesheet" type="text/css" media="screen" href="main_manager.css" />
</head>

<body>
<div class="modify">
  <form action="">
    <table border="0" class="modify">
      <tr rowspan="">
        <td colspan="" class="message">账号</td>
        <td colspan=""><input type="text" /></td>
      </tr>

      <tr rowspan="">
        <td colspan="" class="message">密码</td>
        <td colspan=""><input type="text" /></td>
      </tr>

      <tr rowspan="">
        <td colspan="" class="message">姓名</td>
        <td colspan=""><input type="text" /></td>
      </tr>

      <tr rowspan="">
        <td colspan="" class="message">
          管理权限
        </td>
        <td colspan="">
          <input type="radio" name="manager" value="main_manager" id="main_manager" />
          <label >总仓</label>
          <input type="radio" name="manager" value="branch_manager" id="branch_manager" />
          <label >分仓</label>
        </td>
      </tr>

      <tr rowspan="">
        <td colspan="" class="message">
          仓号
        </td>
        <td colspan="">
          <input type="text" />
        </td>
      </tr>

      <tr rowspan="1">
        <td colspan="2" class="save">
          <input type="reset" value="保存修改" />
        </td>
      </tr>
    </table>
  </form>
  <div/>
</body>
