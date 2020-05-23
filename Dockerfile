FROM openjdk:14-jdk

RUN yum update -y && yum install unzip -y

WORKDIR /apps/zipcode

ARG artifact=zipcode-0.0.1-SNAPSHOT
ARG appname=zipcode

COPY build/distributions/${artifact}.zip .
RUN unzip ${artifact}.zip && mv ${artifact}/* . && rm -rf ${artifact}/ && chmod +x bin/${appname}

EXPOSE 2001

CMD [ "./bin/zipcode", "-Xmx1024m", "--spring.profiles.active=prod" ]
