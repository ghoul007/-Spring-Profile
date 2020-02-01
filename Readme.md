#Spring Boot @ConfigurationProperties

## Activating a Spring Profile

Using application properties
```$xslt
spring.profiles.active=dev
```

Using command line argument
```$xslt
# Packaging the app
mvn clean package -Dspring.profiles.active=staging

# Running the packaged jar with `spring.profiles.active` argument
java -jar -Dspring.profiles.active=staging target/config-properties-demo-0.0.1-SNAPSHOT.jar
```


```$xslt
mvn spring-boot:run -Dspring.profiles.active=dev
```

Using environment variable
```$xslt
export SPRING_PROFILES_ACTIVE=prod
```