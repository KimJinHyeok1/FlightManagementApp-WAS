FROM openjdk:17-jdk

WORKDIR /app

COPY build/libs/FlightManagementApp-0.0.1-SNAPSHOT.jar FlightManagement.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/FlightManagement.jar"]