FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/orchestrator.jar orchestrator.jar
ENTRYPOINT ["java","-jar","orchestrator.jar"]
