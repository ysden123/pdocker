FROM openjdk:11-jre-slim

ARG APP_FILE=scala-docker-starter-0.0.1.jar
ENV APP_FILE $APP_FILE
ENV APPLICATION_HOME /usr/apps/scala-docker-starter

ENV JAVA_OPTS ""

COPY target/scala-2.13/$APP_FILE $APPLICATION_HOME/

WORKDIR $APPLICATION_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java $JAVA_OPTS -jar $APP_FILE"]