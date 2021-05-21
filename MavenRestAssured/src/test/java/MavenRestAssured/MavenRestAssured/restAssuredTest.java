package MavenRestAssured.MavenRestAssured;

public class restAssuredTest extends restAssuredMethod{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		restAssuredTest reTest= new restAssuredTest();
		reTest.GetWeatherDetails();
		
	}

}


// Response:
//Response Body is =>  {"City":"Hyderabad","Temperature":"27 Degree celsius","Humidity":"78 Percent","Weather Description":"scattered clouds","Wind Speed":"108 Km per hour","Wind Direction degree":"46 Degree"}
