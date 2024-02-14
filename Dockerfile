# Use an official OpenJDK runtime as a parent image
FROM openjdk:8-jre-slim

# Set the working directory in the container
WORKDIR /usr/src/app

# Copy the application JAR file into the container
COPY target/Calculator-1.0-SNAPSHOT.jar .

# Specify the command to run your application
CMD ["java", "-jar", "Calculator-1.0-SNAPSHOT.jar"]
