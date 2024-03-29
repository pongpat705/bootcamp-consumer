FROM openjdk:17-alpine

ARG LOCAL_APP_FILE=consumer-0.0.1-SNAPSHOT.jar

RUN mkdir /home/app

COPY target/${LOCAL_APP_FILE} /home/app/app.jar

WORKDIR /home/app

EXPOSE 8080

ENTRYPOINT exec java -jar /home/app/app.jar --spring.config.location=/home/app/config/application.yaml