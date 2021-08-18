FROM openjdk:8-jdk-alpine
LABEL maintainer="tongher1685@gmail.com"
VOLUME /tmp
ARG JAR_FILE=./build/libs/*.jar
ADD ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://221.148.138.28/test","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
