<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>

<body>
<form method="post" action="<%=request.getContextPath()%>/user">

<form:hidden path="id"/>
    <table>
        <tr>
            <td>Логин</td>
            <td><form:input path="login"/></td>
        </tr>
        <tr>
            <td>Имя пользователя</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>E-mail</td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td>Дата рождения</td>
            <td><form:input path="birthDate"/></td>
        </tr>
        <tr>
            <td>Активен</td>
            <td><form:checkbox path="active"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Сохранить"/></td>
        </tr>
    </table>
</form>
</body>
</html>