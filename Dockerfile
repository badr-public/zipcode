FROM openjdk:14-jdk

WORKDIR /app

COPY build/libs/zipcode-0.0.1-SNAPSHOT.jar .

EXPOSE 2001

ENV BADR_APP_ARGS prod
ENV BADR_JAVA_ARGS '-Xms256m -Xmx1024m'
CMD [ 'java', '-jar', 'zipcode-0.0.1-SNAPSHOT.jar', "${BADR_JAVA_ARGS}", "--spring.profiles.active=${BADR_APP_ARGS}" ]
