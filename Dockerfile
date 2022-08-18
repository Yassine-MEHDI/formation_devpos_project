FROM openjdk:8-jdk-alpine
ARG JAR_FILE=/var/lib/jenkins/workspace/test-pipeline-01/target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
