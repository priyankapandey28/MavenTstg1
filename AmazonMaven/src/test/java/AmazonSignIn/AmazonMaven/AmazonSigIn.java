package AmazonSignIn.AmazonMaven;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.NumberToTextConverter;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonSigIn {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		dataFetching df=new dataFetching();
		ArrayList<String> data = df.getData();
		
		String name = data.get(0);
		String mobileNo = data.get(1);
		String email = data.get(2);
		String password = data.get(3);
		
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in");

			driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']")).click();
			
			driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
			driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys(name);
			
			driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys(mobileNo);
			driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@id='continue']")).click();
			//Error Msg will be displayed.
			
			}
			}
		
