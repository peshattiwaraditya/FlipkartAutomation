
package com.flipcart.tdd.classfiles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.flipcart.tdd.base.TestBase;

public class LoginPage extends TestBase
{
	String expprod2;
	String expP3;
	public String getTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		return actualTitle;
	}
	
	public void login(String username, String password) throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Login']"));
        
        
        WebElement shop=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
        shop.sendKeys(username);
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(4000);
	}
	 public void registration(String mobileNo) throws InterruptedException
	 {
		 driver.findElement(By.xpath("//a[text()='Login']"));
		 driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).click();
		 driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys(mobileNo);
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		 Thread.sleep(4000);
	 }
	  
	 public void profilePage() throws InterruptedException {
		// driver.findElement(By.xpath("//div[text()='My Account']")).click();
		//WebElement user= driver.findElement(By.xpath("//div[@id='container']//following::div[text()='Practise']"));
		 WebElement practise = driver.findElement(By.xpath("//div[text()='Practise']"));
	        Actions action = new Actions(driver);
	        action.moveToElement(practise).perform();
	        Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='container']//following::div[text()='My Profile']")).click();
		// user.click();
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/svg")).click();
	 }
	 
	 public void searchItem(String item){
		 driver.findElement(By.xpath("//div[@id='container']//following::input[@name='q']")).click();
		 driver.findElement(By.xpath("//div[@id='container']//following::input[@name='q']")).sendKeys(item);
		 driver.findElement(By.xpath("//div[@id='container']//following::button[@class='L0Z3Pu']")).click();
	 }
	 
	 public void buyProduct() throws InterruptedException {
		 //WebElement aa=driver.findElement(By.xpath("//div[@id='container']//following::div[text()='APPLE iPhone 13 Pro (Graphite, 128 GB)']"));
	
		 //JavascriptExecutor jse=(JavascriptExecutor)driver;
			//jse.executeScript("arguments[0].click()", aa);
		 
		WebElement aa= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()", aa);
	     Thread.sleep(5000);
	     driver.navigate().to("https://www.flipkart.com/checkout/init?otracker=clp_metro_expandable_1_3.metroExpandable.METRO_EXPANDABLE_Shop%2BNow_mobile-phones-store_Q1PDG4YW86MF_wp2");
	        driver.navigate().back();
 	Thread.sleep(5000);
	 }
	 
	 
	 public void searchCart() throws InterruptedException
	  { 
	    driver.findElement(By.xpath("//div[@id='container']//following::a[@class='_3SkBxJ']")).click();
	}
	 
	 public void supercoins() throws InterruptedException {
		 WebElement practise = driver.findElement(By.xpath("//div[text()='Practise']"));
	        Actions action = new Actions(driver);
	        action.moveToElement(practise).perform();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//div[@id='container']//following::div[text()='SuperCoin Zone']")).click();
	        
		 
	 }
	 
	 public void orders() throws InterruptedException
	 {
		 WebElement practise = driver.findElement(By.xpath("//div[text()='Practise']"));
	        Actions action = new Actions(driver);
	        action.moveToElement(practise).perform();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//div[@id='container']//following::div[text()='Orders']")).click();
	        Thread.sleep(4000);
	 }
	 
	 public void wishlist() throws InterruptedException
	 {
		 WebElement practise = driver.findElement(By.xpath("//div[text()='Practise']"));
	        Actions action = new Actions(driver);
	        action.moveToElement(practise).perform();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//div[@id='container']//following::div[text()='Wishlist']")).click();
	        Thread.sleep(5000);
	 }
	 
	 
	public void logout() throws InterruptedException
{
		WebElement practise = driver.findElement(By.xpath("//div[text()='Practise']"));
        Actions action = new Actions(driver);
        action.moveToElement(practise).perform();
        Thread.sleep(5000);
	driver.findElement(By.xpath("//div[@id='container']//following::div[text()='Logout']")).click();
	Thread.sleep(5000);
}
	public void menu() throws InterruptedException
	{
		//WebElement menu = driver.findElement(By.xpath("//div[@class='_1kidPb']//following::span[text()='Baby & Kids']"));
		
		//WebElement menu = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[5]"));
	//WebElement menu=	driver.findElement(By.cssSelector("//div[@id='container']//following::span[@class='_2I9KP_ _2WDRax']"));
			driver.findElement(By.xpath("//div[@id='container']//following::div[text()='Mobiles']")).click();
//        Actions action = new Actions(driver);
//        action.moveToElement(menu).perform();
//        Thread.sleep(5000);
       // menu.click();
        Thread.sleep(5000);
      // driver.findElement(By.xpath("//div[@id='container']//following::a[@class='h1Fvn6']")).click();
        driver.findElement(By.xpath("//div[@id='container']//following::a[@class='_1AcS-S']")).click();
        Thread.sleep(2000);
	}

	public void changeWindow()
	{
		String parentWindow= driver.getWindowHandle();
        System.out.println("parant window id is: "+parentWindow);
        //driver.findElement(By.xpath("//div[@id='container']//following::div[text()='realme C11 2021 (Cool Grey, 32 GB)']")).click();
       driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F12 (Sky Blue, 64 GB)']")).click();
        Set<String> windows= driver.getWindowHandles(); //it will store the multiple windows id
        System.out.println("All windows");
        String childWindow=null;
        for(String a: windows)              
        { 
        	if(childWindow!=parentWindow)       //it checks the child id and parent id is not equals then finds the child window id.
        	{
        		childWindow=a;
        	}
        	System.out.println(a);
        }
        System.out.println(childWindow);
        driver.switchTo().window(childWindow);
        //System.out.println(driver.getTitle());
       
	}
	
	
	public void changeWindow2()
	{
		String parentWindow= driver.getWindowHandle();
        System.out.println("parant window id is: "+parentWindow);
        driver.findElement(By.xpath("//div[@id='container']//following::div[text()='APPLE iPhone 13 Pro (Graphite, 128 GB)']")).click();
        Set<String> windows= driver.getWindowHandles(); //it will store the multiple windows id
        System.out.println("All windows");
        String childWindow=null;
        for(String a: windows)              
        { 
        	if(childWindow!=parentWindow)       //it checks the child id and parent id is not equals then finds the child window id.
        	{
        		childWindow=a;
        	}
        	System.out.println(a);
        }
        
        driver.switchTo().window(childWindow);
        //System.out.println(driver.getTitle());
       
	}
	
	
	public void addCart() throws InterruptedException
	{
		 WebElement prod=driver.findElement(By.xpath("//div[@id='container']//following::button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
	        JavascriptExecutor jse=(JavascriptExecutor)driver;
	    	jse.executeScript("arguments[0].click()", prod);
	System.out.println("abcd");
	Thread.sleep(5000);
	}
	
	
	
	public void ordProduct() throws InterruptedException
	{
		//driver.findElement(By.xpath("//div[@id='container']//following::button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		WebElement ord=driver.findElement(By.xpath("//div[@id='container']//following::button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
    	jse.executeScript("arguments[0].click()", ord);
    	Thread.sleep(5000);
    	 driver.navigate().to("https://www.flipkart.com/checkout/init?otracker=clp_metro_expandable_1_3.metroExpandable.METRO_EXPANDABLE_Shop%2BNow_mobile-phones-store_Q1PDG4YW86MF_wp2");
	        driver.navigate().back();
    	Thread.sleep(5000);
	}
	
	public void searchUpdMenu() throws InterruptedException
	
	{
		WebElement menu=	driver.findElement(By.xpath("//div[@id='container']//following::div[text()='Mobiles']"));
//      Actions action = new Actions(driver);
//      action.moveToElement(menu).perform();
//      Thread.sleep(5000);
      menu.click();
      Thread.sleep(500);
     // driver.findElement(By.xpath("//div[@id='container']//following::a[@class='_1AcS-S']")).click();
	}
}


//electronics xpath: //div[@id='container']//following::div[text()='Electronics']

//flight= //div[@id='container']//following::a[text()='Flights']

// xpath: //div[@class='_2LURSF col col-4-12']

//product=  //div[text()='SAMSUNG Galaxy F12 (Sky Blue, 64 GB)']
