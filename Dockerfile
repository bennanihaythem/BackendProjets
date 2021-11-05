FROM maven:latest AS build
WORKDIR /src/app/
COPY . /src/app/
RUN mvn clean install
CMD run build
FROM openjdk:8-alpine 
COPY --from=build /src/app/target/*.jar BackendProjets.jar
EXPOSE 81
ENTRYPOINT["java","-jar","BackendProjets.jar"]