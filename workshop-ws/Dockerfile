FROM openjdk:jre-alpine
VOLUME /tmp
ARG JAR_FILE

ENV _JAVA_OPTIONS "-Xms256m -Xmx512m -Djava.awt.headless=true"

COPY ${JAR_FILE} /opt/app.jar

RUN addgroup workshop && \
    adduser -D -S -h /var/cache/workshop -s /sbin/nologin -G workshop workshop

WORKDIR /opt
USER workshop
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/opt/app.jar"]