# 1. 背景

扩展除阻塞式的Servlet之外的Web方案, Reactor;

# 2. 目的

学习、并快速掌握Reactor相关知识; 进一步学习SpringWebFlux, 快速上手;

# 3. 文档地址

[Refactor 3](https://htmlpreview.github.io/?https://github.com/get-set/reactor-core/blob/master-zh/src/docs/index.html#getting-started-introducing-reactor)

[Refactor core api](https://projectreactor.io/docs/core/release/api/)

[SpringWebFlux](https://docs.spring.io/spring-framework/reference/web/webflux.html)

# 4. 主要概念

这中结果的返回方式和Rust中的Result与Option类似

## 1. 背压

可以想象一根水管, 安装了一个水龙头; 自己可以根据需要调节数据的消费;\
而不是像以前一样给多少处理多少;

## 2. Mono

针对 0-1的结果处理

## 3. Flux

针对0-N的结果处理

# 5. 模块介绍

## 1. reactor-base

主要是进行`refactor` api的测试

## 2. webflux

主要是进行`WebFlux`测试

## 3. boot-web-flux

主要是进行`SpringWebFlux`测试
