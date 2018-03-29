# JarsLink Demo演示

## 模块

> moduel-main 用于加载模块JAR包，对外提供服务

> service-a 获取用户信息Action

> service-b 获取订单信息Action

## 类说明

|类名|说明|
|-----|--------|
|young.hu.jarslink.main.MainController|接收外部HTTP请求并将请求转发到具体模块|
|young.hu.jarslink.main.ModuleConfiguration|Bean配置|
|young.hu.jarslink.main.ModuelRefreshSchedulerImpl|模块加载器配置|
|young.hu.jarslink.a.actions.UserAction|获取用户信息Action|
|young.hu.jarslink.b.actions.OrderAction|获取订单信息Action|

## 使用说明
1. 将service-a和service-b打成jar包
1. ModuleRefreshSchedulerImpl类中的`PATH`参数值换成你本地路径
1. 启动ModuleApplication中的main方法
1. 浏览器请求`http://ip:8999/jarslink/service-a/user/*your-name*`获取模块用户信息
1. 浏览器请求`http://ip:8999/jarslink/service-b/order/*order-id*`获取模块订单信息