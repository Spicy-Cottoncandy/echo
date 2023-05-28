FROM openjdk:17
COPY ./build/libs/ /usr/echo/
ENTRYPOINT ["java","-jar","/usr/echo/echo-0.0.1-SNAPSHOT.jar"]
