FROM alpine/java:21

COPY ./build/libs/products-0.0.1-SNAPSHOT.jar application.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "/application.jar"]