FROM openjdk:8-jre-alpine
MAINTAINER dhibdhafer@gmail.com
ADD target/docker-springboot-mysql-0.0.1-SNAPSHOT.jar app.jar
ADD run.sh run.sh
RUN bash -c 'chmod +x /run.sh'
RUN bash -c 'touch /app.jar'
EXPOSE 8081 8081

ENTRYPOINT ["/bin/bash", "/run.sh"]
#RUN bash -c 'touch /app.jar'
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]