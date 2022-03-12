FROM openjdk:11.0.14.1-jre
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} app.jar
expose 8080
ENTRYPOINT ["java","-jar","/app.jar"]