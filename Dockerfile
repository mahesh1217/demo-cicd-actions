FROM eclipse-temurin:17
EXPOSE 8080
ADD target/demo-cicd-flow.jar demo-cicd-flow.jar
ENTRYPOINT ["java","-jar","/demo-cicd-flow.jar"]