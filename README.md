# Keycloak demo

Project which demonstartes how to break default auth method o keycloak by providing a webservice bean with different authorization method in the annotation. It assumes you have Wildlfy 9/10 patched with a keycloak adapter and keycloak server running on localhost port 8180.

To reproduce:

  - In standalone.xml set logging to DEBUG
  -  Deploy:
```sh
mvn clean wildfly:deploy
```
  -  In Wildfly logs search for line: 
 
```sh
DEBUG [org.keycloak.adapters.undertow.KeycloakServletExtension] (ServerService Thread Pool -- 152) auth-method is not keycloak!
```

Access application on: 
localhost:8080/product-portal

Keycloak security is now broken. Removing the annotations fixes the problem.



