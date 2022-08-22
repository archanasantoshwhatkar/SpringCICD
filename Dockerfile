FROM openjdk:8
EXPOSE 8181
ADD target/springboot-image1.jar springboot-image1.jar
ENTRYPOINT ["java","-jar","/springboot-image1.jar"]