FROM openjdk:17-oracle
RUN mkdir data-shared
COPY target/ms-login.jar ms-login.jar
EXPOSE 8018
ENTRYPOINT ["java","-jar","/ms-login.jar"]