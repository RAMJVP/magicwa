FROM openjdk:17-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ./build/libs/magicw-0.0.1-SNAPSHOT.jar magicw.jar
ENTRYPOINT ["java", "-jar", "magicw.jar"]