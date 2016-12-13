# Keycloak demo

Project which demonstartes how to secure a JEE application with keycloak.

## Deploy on Wildfly

mvn clean wildfly:deploy

Access application on: 
localhost:8080/product-portal

## Integration tests using arquillian

mvn clean install -Pintegration-tests

