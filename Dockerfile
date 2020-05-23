FROM openjdk:14-jdk

RUN yum update -y && yum install unzip -y

WORKDIR /apps/zipcode

ARG artifact=zipcode.zip

COPY build/distributions/${artifact} .
RUN unzip ${artifact} && mv zipcode/* . && rm -rf ${artifact} zipcode/ && chmod +x bin/zipcode

EXPOSE 8080

ENV BADR_APP_ARGS prod
ENV BADR_JAVA_ARGS "-Xms256m -Xmx1024m"
CMD [ "./bin/webstore_all_in_one", "${BADR_JAVA_ARGS}", "--spring.profiles.active=${BADR_APP_ARGS}" ]
