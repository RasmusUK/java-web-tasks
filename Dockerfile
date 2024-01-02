FROM ubuntu:22.04

WORKDIR /code
RUN apt-get update && apt-get -y install maven default-jdk-headless
EXPOSE 5000
COPY src/ /code/src/
COPY pom.xml /code/pom.xml
RUN mvn clean dependency:copy-dependencies compile package

CMD ["mvn", "exec:java"]