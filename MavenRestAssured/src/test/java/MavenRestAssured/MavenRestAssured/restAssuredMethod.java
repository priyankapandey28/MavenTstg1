package MavenRestAssured.MavenRestAssured;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

	public class restAssuredMethod {

		public void GetWeatherDetails()
		 {   
		RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
		 
		RequestSpecification httpRequest = RestAssured.given();
		 
		Response response = httpRequest.request(Method.GET, "/Hyderabad");
		 
		String responseBody = response.getBody().asString();
		 System.out.println("Response Body is =>  " + responseBody);
		
	}
	}

