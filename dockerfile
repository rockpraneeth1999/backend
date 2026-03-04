FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/*.jar app.jar

RUN chown 1001:1001 app.jar

USER 1001

EXPOSE 8081

ENTRYPOINT ["java", "-XX:MaxRAMPercentage=75.0", "-jar", "app.jar"]