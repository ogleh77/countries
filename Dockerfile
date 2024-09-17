FROM openjdk:17
LABEL authors="mohamedogleh"
COPY target/country-app.jar country-app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar","country-app"]