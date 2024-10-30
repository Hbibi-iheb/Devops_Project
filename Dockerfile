#FROM openjdk:8-jdk-alpine
FROM openjdk:17
EXPOSE 8082
ADD target/timesheet-devops-1.0-SNAPSHOT.jar timesheet-devops-1.0.jar
ENTRYPOINT ["java","-jar","/timesheet-devops-1.0.jar"]

