package crudperform;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Test_GetMethod {
	@Test
	public void testCase001() {
		      Response res= get("https://reqres.in/api/users?page=2");
		      System.out.println("Response body :"+res.asString());
		      System.out.println("Response code :"+ res.getStatusCode());
		      System.out.println("Response time :"+res.getTime());
		      System.out.println("Response header :"+res.getHeader("Content-Type"));
		      int actualStatusCode =res.getStatusCode();
		      int expectedStatusCode =200;
		      Assert.assertEquals(actualStatusCode, expectedStatusCode);
	}
    @Test
	public void testCase002() {
		baseURI = "https://reqres.in/api/users";
		given().queryParam("page", "2").when().get().then().statusCode(200);
	}
}
