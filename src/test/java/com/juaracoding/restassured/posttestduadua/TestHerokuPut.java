package com.juaracoding.restassured.posttestduadua;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestHerokuPut {
	
String endpoint = "https://mern-backend-8881.herokuapp.com/products";
	
	@Test
	public void testPut() {
		
		JSONObject request = new JSONObject();
		request.put("name", "Nurul Pj");
		request.put("categoty", "Rest Assured");
		request.put("price", "1999");
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.put(endpoint)
		.then()
		.statusCode(404)
		.log().all();
	}
}
