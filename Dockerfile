FROM eclipse-temurin:17
COPY target/myaws.jar myaws.jar
CMD ["java","-jar","myaws.jar"]