FROM openjdk:8-jdk-alpine

ADD target/springboot-image-github.jar springboot-image-github.jar
CMD ["java","-jar","/springboot-image-github.jar"]