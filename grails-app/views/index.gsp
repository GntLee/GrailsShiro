<!doctype html>
<html>
<head>
    <title>Welcome to Grails</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
    <h1>登录成功</h1>
    <shiro:isLoggedIn>
        当前登录用户：<shiro:principal/>
    </shiro:isLoggedIn>
    <shiro:isNotLoggedIn>
        请登录
    </shiro:isNotLoggedIn>
</body>
</html>
