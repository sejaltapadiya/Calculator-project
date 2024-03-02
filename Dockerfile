FROM openjdk:11
COPY ./target/Calculator-1.0-SNAPSHOT-shaded.jar /app/Calculator.jar
WORKDIR ./
CMD ["java", "-cp", "Calculator-1.0-SNAPSHOT-shaded.jar", "org.example.ScientificCalculator"]
