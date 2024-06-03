FROM maven:3.5-jdk-8-alpine as build
WORKDIR /app
COPY pom.xml pom.xml
COPY jpa jpa
COPY backend_WebinarRegistrations_Backend_331 backend_WebinarRegistrations_Backend_331
RUN mvn clean package -DnoTest=true

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/backend_WebinarRegistrations_Backend_331/target/WebinarRegistrations_Backend-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar WebinarRegistrations_Backend-0.0.1-SNAPSHOT.jar"]