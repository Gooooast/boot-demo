# 使用官方Tomcat基础镜像
FROM tomcat:9-jdk11

# 将Spring Boot的JAR重命名并复制到Tomcat的webapps目录中
COPY target/boot-demo-0.0.1-SNAPSHOT.jar /usr/local/tomcat/webapps/ROOT.war

# 设置环境变量
ENV JAVA_OPTS="-Djava.security.egd=file:/dev/./urandom"

# 暴露Tomcat的默认端口
EXPOSE 8080

# 启动Tomcat服务器
CMD ["catalina.sh", "run"]