FROM openjdk:8-alpine
ADD target/demo-springboot-dockr.jar demo-springboot-dockr.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","demo-springboot-dockr.jar"]