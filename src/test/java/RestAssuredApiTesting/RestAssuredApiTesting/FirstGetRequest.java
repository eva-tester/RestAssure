package RestAssuredApiTesting.RestAssuredApiTesting;

import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class FirstGetRequest {
//https://reqres.in/api/users?page=2
	@Test
	public void testCase001() {
	Response res=	get("https://reqres.in/api/users?page=2");
	System.out.println(res.asString());
	System.out.println("Status "+res.statusCode());
	}
}
