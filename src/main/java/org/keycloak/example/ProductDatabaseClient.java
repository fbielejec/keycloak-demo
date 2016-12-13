package org.keycloak.example;

import java.util.ArrayList;
import java.util.List;

public class ProductDatabaseClient {

	public static List<String> getProducts() {
		List<String> products = new ArrayList<String>();

		products.add(new String("Beans"));
		products.add(new String("Strawberries"));
		products.add(new String("Onions"));

		return products;
	}

}
