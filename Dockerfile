FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/pizza-0.0.1-SNAPSHOT.jar pizza-docker-app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /pizza-docker-app.jar" ]
EXPOSE 8080