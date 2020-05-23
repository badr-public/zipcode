FROM openjdk:14-jdk

RUN yum update -y && yum install unzip -y

WORKDIR /apps/zipcode

ARG artifact=zipcode.zip

RUN unzip build/distributions/${artifact} && mv zipcode-*/* . && rm -rf zipcode-*/ && chmod +x bin/zipcode

EXPOSE 8080

ENV BADR_APP_ARGS prod
ENV BADR_JAVA_ARGS "-Xms256m -Xmx1024m"
CMD [ "./bin/zipcode", "${BADR_JAVA_ARGS}", "--spring.profiles.active=${BADR_APP_ARGS}" ]
