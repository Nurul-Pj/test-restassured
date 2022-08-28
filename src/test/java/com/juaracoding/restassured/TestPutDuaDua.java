package com.juaracoding.restassured;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestPutDuaDua {
	
	@Test(priority = 1)
	public void testPatch() {
		JSONObject request = new JSONObject();
		request.put("name", "Harian");
		request.put("category", "Daily");
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.patch("https://mern-backend-8881.herokuapp.com/products")
		.then()
		.statusCode(404)
		.log().all();
	}
	
	@Test
	public void testDelete() {
		
		when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204)
		.log().all();
		
	}

}
