package com.juaracoding.restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
//import groovyjarjarantlr4.v4.misc.EscapeSequenceParsing.Result.Type;
import io.restassured.http.ContentType;

public class TestCRUD {
	
	@Test
	public void testPost() {
		//https://reqres.in/api/users
		JSONObject request = new JSONObject();
		request.put("name", "John");
		request.put("job", "QA Engineer");
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log().all();

	}
	
	@Test
	public void testPut() {
		JSONObject request = new JSONObject();
		request.put("name", "John");
		request.put("job", "QA Engineer");
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.put("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test
	public void testPatch() {
		JSONObject request = new JSONObject();
		request.put("name", "John");
		request.put("job", "QA Engineer");
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.patch("https://reqres.in/api/users/2")
		.then()
		.statusCode(200)
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
