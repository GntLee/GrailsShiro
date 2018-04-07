#本项目集成Grails3-Shiro

项目描述：
```
本项目是基于grails3集成shiro权限管理的入门小demo，可实现基于用户、角色的权限管理，没有页面。
```

开发环境：

```
| Grails Version: 3.1.5
| Groovy Version: 2.4.6
| JVM Version: 1.8.0_141
```

集成shiro重点：

```
//build.gradle中新增maven库
maven { url "https://dl.bintray.com/shiranr/plugins" }
maven { url "https://dl.bintray.com/animator013/plugins/" }

//dependencies中新增依赖：
compile 'org.grails.plugins:grails-shiro:3.0.1'
```

项目如何运行？

```
1、项目clone导入idea,配置好gradle并刷新
2、修改数据库配置文件grails-app/conf/application.properties
3、用户名密码在grails-app/init/BootStrap.groovy中，可自行修改
```