FROM openjdk:14-jdk

RUN yum update -y && yum install unzip -y

WORKDIR /apps/zipcode

ARG artifact=zipcode-0.0.1-SNAPSHOT
ARG appname=zipcode

COPY build/distributions/${artifact}.zip .
RUN unzip ${artifact}.zip && mv ${artifact}/* . && rm -rf ${artifact}/ && chmod +x bin/${appname}

EXPOSE 2001

ENV BADR_APP_ARGS prod
ENV BADR_JAVA_ARGS "-Xms256m -Xmx1024m"
CMD [ "./bin/${appname}", "${BADR_JAVA_ARGS}", "--spring.profiles.active=${BADR_APP_ARGS}" ]
