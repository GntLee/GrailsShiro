<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
  <meta charset="utf-8">
  <title>Fullscreen Login</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">

  <!-- CSS -->
  <asset:stylesheet  href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'/>
  <asset:stylesheet  href="back/css/reset.css"/>
  <asset:stylesheet  href="back/css/style.css"/>
  <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
  <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->
</head>
<body>
  <g:if test="${flash.message}">
    <div class="message">${flash.message}</div>
  </g:if>

  <div class="page-container">
    <h1>后台登录</h1>
  <g:form action="signIn">
      <input type="hidden" name="targetUri" value="${targetUri}" />
      <input type="text" name="username" value="${username}" class="username" placeholder="用户名"/>
      <input type="password" name="password" class="password" placeholder="密码">
      <button type="submit">登录</button>
      <div class="error"><span>+</span></div>
  </g:form>
  </div>

<!-- Javascript -->
<asset:javascript src="back/js/jquery-1.8.2.min.js"/>

</body>
</html>
