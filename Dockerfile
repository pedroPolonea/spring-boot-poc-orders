FROM openjdk:11.0.3-jdk-stretch

MAINTAINER pedroPolonea

RUN mkdir /opt/app
COPY build/libs/*.jar /opt/app

EXPOSE 8000

CMD ["java", "-jar", "/opt/app/orders-0.0.1.jar"]