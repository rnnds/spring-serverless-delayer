# spring-serverless-delayer

# Basic usage

Start project:

    mvn spring-boot:run
    
Request function:

    curl localhost:8080/delays -H "Content-Type: text/plain" -d 3000
