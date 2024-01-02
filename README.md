# `java-web-templates`

Just a sloppy starter project with `docker-compose` that builds and runs a java application...

## How do I start the container?

Easy, just do `docker-compose up -d --build` and it will build and run the container in the background.

## How do I run the project on my own machine?

Install maven along with java and run:

```sh
mvn clean compile exec:java
```
