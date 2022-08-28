package com.juaracoding.restassured.posttestduadua;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class TestHerokuDelete {
	
String endpoint = "https://mern-backend-8881.herokuapp.com/products";
	
	@Test
	public void testDelete() {
		when().
		get(endpoint).
		then().
		statusCode(200).
		log().all();
	}

}
