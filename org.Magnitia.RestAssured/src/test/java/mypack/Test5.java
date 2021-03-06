package mypack;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
public class Test5 {

	public static void main(String[] args)
	{
		//way-1 : path parameter value in URI
		RestAssured.given()
			.baseUri("https://jsonplaceholder.typicode.com")
			.basePath("posts/100")
		.when()
			.get()
		.then()
			.log().all();
			
		//way-2 : path parameter value in HTTP method
		given()
			.baseUri("https://jsonplaceholder.typicode.com")
			.basePath("posts")
		.when()
			.get("100")
		.then()
			.log().all();

	}

}
