package mypack;

import java.util.Scanner;

import io.restassured.RestAssured;

public class Test6 {

	public static void main(String[] args) 
	{
		//Take value from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("enter path parameter value");
		//String x=sc.nextLine();
		int x=sc.nextInt();
		RestAssured.given()
		.baseUri("https://jsonplaceholder.typicode.com")
		.basePath("posts/"+x)
	.when()
		.get()
	.then()
		.log().all();
		
		
		

	}

}
