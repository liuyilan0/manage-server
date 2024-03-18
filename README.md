<h1> manage-server </h1>

[前台项目地址](https://github.com/liuyilan0/manage-vue-front)

**项目说明**

- 引入了 lombok 大量简化了代码
- 引入了 MyBatis Plus 大量简化了 SQL
- 引入 hutool 工具包 规范工具类
- 引入 minio 分布式文件系统
- 引入[autoFull](https://github.com/yzcheng90/zhjg-common-autofull) 自动填充绑定框架,多表关联不用写 sql
- 自定义 Spring Security 支持获取 token

**版本信息**

- 核心框架：Spring Boot 2.7.7
- 安全框架：Spring Security 5.7.x
- 持久层框架：MyBatis Plus 3.5.2
- 日志管理：SLF4J 1.7、Log4j

**环境**

- jdk 1.8
- mysql 5.7+
- redis
- nginx

**项目结构**

```
manage-server
├─doc
│  ├─db.sql 项目SQL语句
│  ├─nginx.confi nginx 配置文件
│  ├─updateLog 更新日志
│
├─authentication 权限认证
├─common 公共模块
│  ├─annotation 自定义注解
│  ├─aspect 系统日志
│  ├─base base包
│  ├─exception 异常处理
│  ├─utils 一些工具类
│  └─xss XSS过滤
│
├─config 配置信息
├─interceptor token拦截器
│
├─modules 功能模块
│  ├─oss 文件服务模块
│  ├─sys 权限模块
│  └─gen 代码生成
│
├─Application 项目启动类
│
├──resources
│  ├─mapper SQL对应的XML文件


```

**问题**

1、启动报错

jdk 8 以上版本报错 ：Unable to make field protected java.lang.reflect.InvocationHandler java.lang.reflect..

```
 配置中添加VM Options虚拟机选项 --add-opens java.base/java.lang.reflect=ALL-UNNAMED
```
