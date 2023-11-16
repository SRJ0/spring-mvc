<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>회원가입</h2>
    <form action="step3" method="post">
        <p>
        <label for="mail"> 이메일
            <input type="text" name="mail" id="mail">
        </label>
        </p>
        <p>
        <label for="name"> 이름
            <input type="text" name="name" id="name">
        </label>
        </p>
        <p>
        <label for="pw"> 비번
            <input type="password" name="pw" id="pw">
        </label>
        </p>
        <p>
        <label for="pw2"> 비번 확인
            <input type="password" name="pw2" id="pw2">
        </label>
        </p>
        <input type="submit" value="완료">
    </form>
</body>
</html>
