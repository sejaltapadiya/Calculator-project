# Use an official OpenJDK runtime as a parent image
FROM openjdk:11

# Set the working directory in the container
WORKDIR /usr/src/app

# Copy the source code into the container at the specified working directory
COPY . .

# Compile the Java code
RUN javac ScientificCalculator.java

# Run the application
CMD ["java", "-cp", "src", "org.example.ScientificCalculator"]


