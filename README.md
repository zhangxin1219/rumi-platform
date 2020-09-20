# rumi-platform
## 模板介绍
##### rumi-platform-base
统一的底层依赖，如统一异常、返回、分页等

todo 未来抽离成单独的工程作为独立的底层依赖 
##### rumi-platform-client
开放给外部的相关服务
##### rumi-platform-common
项目中的通用部分，如service模块中沉淀出的通用能力，提供给未来的引擎使用
##### rumi-platform-dao
持久化
##### rumi-platform-gateway
网关

1.0版本 仍采用MVC思想Controller

2.0版本 通过RPC调用服务层逻辑，将网关与业务代码解耦
##### rumi-platform-service
client接口中的具体实现
##### rumi-platform-start
项目启动

## 作者
ZhangXin, a fan of Rumi and Runi