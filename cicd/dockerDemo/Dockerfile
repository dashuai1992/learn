## 定制的镜像都是基于 FROM 的镜像
FROM openjdk:8-jdk-alpine
LABEL authors="yds"
## 构建命令 docker build 中可以使用 --build-arg key=val,
## ARG <参数名>[=<默认值>]，默认值可以被覆盖
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar

## ADD 指令和 COPY 的使用格式一致（同样需求下，官方推荐使用 COPY）
COPY ${JAR_FILE} /opt/app.jar

## ENTRYPOINT ["<executeable>","<param1>","<param2>",...]
ENTRYPOINT ["java"]

## 该写法是为 ENTRYPOINT 指令指定的程序提供默认参数
## 命令 docker run 中可以使用 -c -Xms256m -c -Xmx4096m -c -Xss1m -c -XX:+UseG1GC -c -jar -c /opt/app.jar
## 达到 java -Xms256m -Xmx4096m -Xss1m -XX:+UseG1GC -jar /opt/app.jar 效果
CMD ["-jar","/opt/app.jar"]

## 定义匿名数据卷。在启动容器时忘记挂载数据卷，会自动挂载到匿名卷。
VOLUME ["/data"]