package mypack;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Test1 {

	public static void main(String[] args)
	{
		 //1. Generate HTTP Request
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/posts";
		
		//2.submit that request
		Response res=RestAssured.get();
		
		//3.Analyze response
		String x=res.getStatusLine();
		System.out.println(x);
		
		//get and display Headers 
		Headers y=res.headers();
		System.out.println("Headers are:");
		for(Header h:y)
		{
			System.out.println(h);
		}
		
		//get and display body 
		System.out.println("Body is");
		String str=res.getBody().asString();
		System.out.println(str);
		
				
	}

}
