FROM openjdk:17-jdk
EXPOSE 8080
ADD target/demo-cicd-flow.jar demo-cicd-flow.jar
ENTRYPOINT ["java","-jar","/demo-cicd-flow.jar"]