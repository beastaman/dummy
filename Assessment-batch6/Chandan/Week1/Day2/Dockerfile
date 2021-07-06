FROM maven

WORKDIR /app

COPY . .

RUN mvn clean compile
RUN mvn test
RUN mvn package

CMD java -cp target/myproject-1.0-SNAPSHOT.jar com.sapient.App