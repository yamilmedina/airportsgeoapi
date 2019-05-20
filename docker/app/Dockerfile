FROM adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.28

COPY ./build/libs/airportsgeoapi-0.0.1-SNAPSHOT.jar /usr/app/app.jar
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "app.jar"]