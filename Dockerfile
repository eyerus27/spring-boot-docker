FROM openjdk:8-jdk-alpine

ADD target/spring-boot-docker.jar spring-boot-docker.jar
CMD ["java","-jar","/spring-boot-docker.jar"]