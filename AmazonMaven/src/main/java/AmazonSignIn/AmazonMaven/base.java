package AmazonSignIn.AmazonMaven;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {

	  public WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	
 prop= new Properties();
/*FileInputStream fis=new FileInputStream("user.dir" + "/src/resources/data.properties");*/
 String userdir = System.getProperty("user.dir");
FileInputStream fis=new FileInputStream(userdir + "\\src\\main\\resources\\data.properties");
prop.load(fis);
String browserName=prop.getProperty("browser");
System.out.println(browserName);

if(browserName.equals("chrome"))
{
	 System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	driver= new ChromeDriver();
		
}
else if (browserName.equals("firefox"))
{
	 driver= new FirefoxDriver();
	
}
else if (browserName.equals("IE"))
{
	driver=new InternetExplorerDriver();
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;


}

}
