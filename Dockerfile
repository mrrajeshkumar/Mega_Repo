FROM openjdk:17
EXPOSE 9090
ADD target/springboot_dockerized_demo_app.jar springboot_dockerized_demo_app.jar
ENTRYPOINT ["java", "-jar", "springboot_dockerized_demo_app.jar"]