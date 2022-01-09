## 常用注解

@Annotation: 被@Annotation注解的类会被装配到IOC容器中

@Annotation的几个衍生注解，在web开发中，安装MVC三层架构分成，衍生出一下几个注解
 - dao层注解 @Repository
 - service层注解 @Service
 - controller层注解 @Controller
 注意：这4个注解的功能其实是一样的，都是将bean装配到容器中
 
## 怎么选择xml和注解方式
- xml用来管理bean
- 注解用来做属性注入
- 使用的过程中要注意，必须要让注解生效，要开启注解的支持
```xml
<!--指定需要扫描的包，这个包下的注解才会生效-->
<context:component-scan base-package="com.hua.spring05"/>

<!--开启注解的支持-->
<context:annotation-config/>
```