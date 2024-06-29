FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/serv-api-public-top-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_serv_public_top.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app_serv_public_top.jar"]