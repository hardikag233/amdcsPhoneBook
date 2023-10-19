FROM openjdk

MAINTAINER hardikag233

WORKDIR /app

COPY target/phonebook-project.jar /app/phonebook-project.jar

ENTRYPOINT ["java", "-jar", "phonebook-project.jar"]
