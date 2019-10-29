<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品界面</title>
</head>
<body>
    <form action="/shopping" method="post">
        商品名称：
        <select name="bookName">
        <option value="java" name="java">java 单价15</option>
        <option value="c" name="c">c 单价15</option>
        </select>
        购买数量：<input type="text" name="count" value="1"><br>
        <input type="submit" value="添加到购物车">
    </form>
</body>
</html>
