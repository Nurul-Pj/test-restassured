package com.juaracoding.restassured;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.testng.Assert.assertEquals;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestGetDuaSatu {
	
	String endpoint = "https://mern-backend-8881.herokuapp.com/products";

	@Test(priority = 1)
	public void testStatusCode() {
		Response response = RestAssured.get(endpoint);
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int actual = response.getStatusCode();
		assertEquals(actual, 200);
	}
	
	@Test(priority = 2)
	public void tesIDOne() {
		given()
		.get(endpoint)
		.then()
		.statusCode(200)
		.body("_id[0]", equalTo("62b3f69f66f12cc8cf17fcef"));
		
	}
	
	@Test(priority = 3)
	public void testIDTwo() {
		given()
		.get(endpoint)
		.then()
		.statusCode(200)
		.body("_id[1]", equalTo("62b414789561ff15439844c7"));
		
	}
	
	@Test(priority = 4)
	public void testIDThree() {
		given()
		.get(endpoint)
		.then()
		.statusCode(200)
		.body("_id[2]", equalTo("62e209a8f0e24546b900e030"));
		
	}
	
	@Test(priority = 5)
	public void testIDFour() {
		given()
		.get(endpoint)
		.then()
		.statusCode(200)
		.body("_id[3]", equalTo("62e209f7f0e24546b900e034"));
		
	}
	
	@Test(priority = 6)
	public void testIDFive() {
		given()
		.get(endpoint)
		.then()
		.statusCode(200)
		.body("_id[4]", equalTo("62e20a17f0e24546b900e037"));
		
	}

}
