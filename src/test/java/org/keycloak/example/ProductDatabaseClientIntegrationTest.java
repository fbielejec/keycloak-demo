package org.keycloak.example;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

//http://www.first8.nl/blog/testing-keycloak-integration-with-arquillian/

@RunWith(Arquillian.class)
public class ProductDatabaseClientIntegrationTest {

	private static final String WEBAPP_SRC = "src/main/webapp";

	@Deployment(testable = false)
	public static WebArchive createDeployment() throws IOException {
		WebArchive war = ShrinkWrap.create(WebArchive.class, "product-portal.war")
				.addPackage(Package.getPackage("org.keycloak.example"))
				.setWebXML(new File(WEBAPP_SRC, "WEB-INF/web.xml"))
//				 .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
				 .addAsWebInfResource(new File(WEBAPP_SRC, "WEB-INF/jboss-deployment-structure.xml"))
				 .addAsWebInfResource(new File(WEBAPP_SRC, "WEB-INF/keycloak.json"))
				.addAsWebResource(new File(WEBAPP_SRC, "index.html"))
				.addAsWebResource(new File(WEBAPP_SRC, "products/servlet-logout.jsp"))
				.addAsWebResource(new File(WEBAPP_SRC, "products/view.jsp"))
				.addAsWebResource(new File(WEBAPP_SRC, "admin/admin.jsp"));

		  System.out.println(war.toString(true));
		
		return war;
	}

	@Test
	public void mocktest() throws Exception {
 

		assertEquals(new Boolean(true), new Boolean(true));
	}

}
