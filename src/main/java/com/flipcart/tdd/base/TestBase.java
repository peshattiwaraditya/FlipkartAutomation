package com.flipcart.tdd.base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	static public WebDriver driver;
	static public Properties prop;
	

	public TestBase() {
		String propFilePath = "./src/main/java/com/flifcart/tdd/config/config.properties";
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(propFilePath);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("Unable to find the Properties File");
		} catch (IOException e) {
			System.out.println("Cannot load the properties file"); 
		}
	}

	public void initialization() {
		// check what browser is mentioned in the property file
		// based on that launch and do the browser config
		// use if-else
	String webBrowser=prop.getProperty("browser");
	System.out.println("Web Browser is: " + webBrowser);

	if( webBrowser.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if(webBrowser.equalsIgnoreCase("edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	else 
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
		
	
	
	String url11 = prop.getProperty("url11");
		System.out.println(url11);
		 driver.get(url11);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
