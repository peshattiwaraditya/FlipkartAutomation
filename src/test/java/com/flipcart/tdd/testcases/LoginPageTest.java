package com.flipcart.tdd.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipcart.tdd.base.TestBase;
import com.flipcart.tdd.classfiles.LoginPage;



public class LoginPageTest extends TestBase
{
	LoginPage lp = new LoginPage();
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	@Test(priority=1)
	public void validateTitleTest() {
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		//LoginPage lp = new LoginPage();
		String actualTitle = lp.getTitle();
		AssertJUnit.assertEquals(expectedTitle, actualTitle);
	}

	@Test(priority=2)
	public void validateLoginTest() throws InterruptedException {
	
		lp.login("7083464581","admin");
	}

      @Test (priority=3)	
		public void invalidateLoginTest() throws InterruptedException {
			lp.login("12345672", "123");
		}
      @Test(priority=4)
       public void register() throws InterruptedException
       {
    	   lp.registration("");
//    	   String text= driver.findElement(By.xpath("//h4[@class='alert alert-danger text-center']")).getText();
//   	    System.out.println(text);
//   		AssertJUnit.assertTrue("Text not found!" , text.contains("Password and repeat password must be the same"));
       
       }
	@Test(dependsOnMethods = "validateLoginTest",priority=5)
     public void showProfile() throws InterruptedException
     {
		lp.login("6282104008", "admin");
    	 lp.profilePage();
    	Thread.sleep(4000);
     }
      
	@Test(priority=10)
	public void search() throws InterruptedException
	{
		lp.login("6282104008", "admin");
		lp.searchItem("iphone13 pro");
		Thread.sleep(5000);
	}
	@Test(priority=11)
	public void buy() throws InterruptedException
	{
		lp.login("6282104008", "admin");
		Thread.sleep(2000);
		lp.searchItem("iphone13 pro");
		Thread.sleep(3000);
		lp.changeWindow2();
		Thread.sleep(4000);
		lp.buyProduct();
		Thread.sleep(2000);
	}
	@Test(priority=12)
	public void cart() throws InterruptedException
	{
		lp.login("6282104008", "admin");
		lp.searchCart();
		Thread.sleep(3000);
		
	}
	@Test(dependsOnMethods = "validateLoginTest",priority=6)
	public void coin() throws InterruptedException {
		
		lp.login("6282104008", "admin");
		lp.supercoins();
		Thread.sleep(3000);
	}
	
	@Test(dependsOnMethods = "validateLoginTest",priority=7)
	public void showorders() throws InterruptedException
	{
		lp.login("6282104008", "admin");
		lp.orders();
		Thread.sleep(4000);
	}
	
	@Test(dependsOnMethods = "validateLoginTest",priority=8)
	public void showWishlist() throws InterruptedException
	{
		lp.login("6282104008", "admin");
		lp.wishlist();
	}
	
	@Test(dependsOnMethods = "validateLoginTest",priority=9)
	public void logOut() throws InterruptedException {
		lp.login("6282104008", "admin");
		lp.logout();
	}
	@Test(priority=13)
	public void selectFromMenu() throws InterruptedException
	{
		lp.login("6282104008", "admin");
		lp.menu();
		Thread.sleep(2000);
		lp.changeWindow();
		Thread.sleep(4000);
		lp.addCart();
		Thread.sleep(5000);
		
	}
	
	@Test(priority=14)
	public void orderProducts() throws InterruptedException
	{
		lp.login("6282104008", "admin");
		lp.menu();
		Thread.sleep(2000);
		lp.changeWindow();
		Thread.sleep(4000);
		lp.ordProduct();
		Thread.sleep(4000);
		
	}
	
//	@Test
//	public void ordersssss() throws InterruptedException
//	{
//
//		lp.login("6282104008", "admin");
//		lp.searchUpdMenu();
//		
//	}
	
	
	
	@AfterMethod
	public void close()
	{
		
		tearDown();
	}
	
	
	
}
