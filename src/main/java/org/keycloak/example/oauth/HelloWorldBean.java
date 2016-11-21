package org.keycloak.example.oauth;

import javax.ejb.Stateless;
import javax.jws.WebService;

import org.jboss.ws.api.annotation.WebContext;

@Stateless
@WebService
@WebContext(urlPattern = "/hello", authMethod = "BASIC")
public class HelloWorldBean { 

	public String sayHello() {
		return "HELLO!!!";
	}

}
