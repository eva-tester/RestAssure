package crudperform;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Test_PostMethod {
	@Test
	public void test001() {
		JSONObject jsonData= new JSONObject();
		jsonData.put("name", "morpheus");
		jsonData.put("job", "QA");
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured.given().header("Content-type","application/json").
		contentType(ContentType.JSON).
		body(jsonData.toJSONString()).
		when().post().
		then().statusCode(201).log().all();


	}
}
