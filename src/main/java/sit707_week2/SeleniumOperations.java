//package sit707_week2;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.FileUtils;
//import java.io.*;
//import org.openqa.selenium.*;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//
//
//
///**
// * This class demonstrates Selenium locator APIs to identify HTML elements.
// * 
// * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
// * 
// * @author Ahsan Habib
// */
//public class SeleniumOperations {
//
//	public static void sleep(int sec) {
//		try {
//			Thread.sleep(sec*1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	
//		
//		
//	
//	
//	
//	public static void officeworks_registration_page(String url) {
//		// Step 1: Locate chrome driver folder in the local drive.
//		System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
//		
//		// Step 2: Use above chrome driver to open up a chromium browser.
//		System.out.println("Fire up chrome browser.");
//		WebDriver driver = new ChromeDriver();
//		
//		System.out.println("Driver info: " + driver);
//		
//		sleep(2);
//	
//		// Load a webpage in chromium browser.
//		driver.get(url);
//		
//		/*
//		 * How to identify a HTML input field -
//		 * Step 1: Inspect the webpage, 
//		 * Step 2: locate the input field, 
//		 * Step 3: Find out how to identify it, by id/name/...
//		 */
//		
//		// Find first input field which is firstname
//		WebElement usernameelement1 = driver.findElement(By.id("okta-signin-username"));
//		WebElement passwordeelement1 = driver.findElement(By.id("okta-signin-password"));
//		usernameelement1.sendKeys(" ");
//		passwordeelement1.sendKeys(" ");
//		
//		WebElement passwordeelement1 = driver.findElement(By.id("okta-signin-username"));
//		System.out.println("Found element: " + passwordeelement1);
//		// Send first name
//		passwordeelement1.sendKeys(" ");
//		
//		
//		WebElement usernameelement2 = driver.findElement(By.id("okta-signin-username"));
//		System.out.println("Found element: " + usernameelement2);
//		// Send first name
//		usernameelement2.sendKeys(" ");
//		
//		WebElement passwordeelement2 = driver.findElement(By.id("okta-signin-username"));
//		System.out.println("Found element: " + passwordeelement2);
//		// Send first name
//		passwordeelement2.sendKeys(" ");
//		
//		/*
//		 * Find following input fields and populate with values
//		 */
//		// Write code
//		WebElement LastnameElement = driver.findElement(By.id("lastname"));
//		System.out.println("Found element: " + LastnameElement);
//		// Send first name
//		LastnameElement.sendKeys("kadam");
//		
//		WebElement numberelement = driver.findElement(By.id("phoneNumber"));
//		System.out.println("Found element: " + numberelement);
//		// Send first name
//		numberelement.sendKeys("0420492652");
//		
//		WebElement mailelement = driver.findElement(By.id("email"));
//		System.out.println("Found element: " + mailelement);
//		// Send first name
//		mailelement.sendKeys("rohitkadam680@gmail.com");
//		
//		
//		WebElement passwordelement = driver.findElement(By.id("password"));
//		System.out.println("Found element: " + passwordelement);
//		// Send first name
//		passwordelement.sendKeys("ABCDEFG");
//		
//		WebElement confirmpasswordelement = driver.findElement(By.id("confirmPassword"));
//		System.out.println("Found element: " + confirmpasswordelement);
//		// Send first name
//		confirmpasswordelement.sendKeys("ABCDEFG");
//		
//		/*
//		 * Identify button 'Create account' and click to submit using Selenium API.
//		 */
//		// Write code
//		WebElement createAccountButton = driver.findElement(By.className("ActionButton__StyledButton-r7njn9-0"));
//		createAccountButton.click();
//		/*
//		 * Take screenshot using selenium API.
//		 */
//		// Write code
//
//		    
//		try {
//            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(scrFile, new File("C:\\Users\\Rohit Kadam\\Desktop\\screenshot\\scrsht.png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//		    
//		
//		
//		// Sleep a while
//		sleep(2);
//		
//		// close chrome driver
//		driver.close();	
//	}
//	
//	public static void chemistwarehouse_registration_page(String url) {
//		
//		System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
//		
//		System.out.println("Fire up chrome browser.");
//		WebDriver driver = new ChromeDriver();
//		
//		System.out.println("Driver info: " + driver);
//		
//		sleep(2);
//	
//		driver.get(url);
//		
//		
//		
//		WebElement element = driver.findElement(By.id("name"));
//		System.out.println("Found element: " + element);
//		element.sendKeys("Rohit");
//		
//		
//		WebElement LastnameElement = driver.findElement(By.id("lastname"));
//		System.out.println("Found element: " + LastnameElement);
//		LastnameElement.sendKeys("kadam");
//		
//		
//		WebElement mailelement = driver.findElement(By.id("email"));
//		System.out.println("Found element: " + mailelement);
//		mailelement.sendKeys("rohitkadam680@gmail.com");
//		
//		
//		WebElement passwordelement = driver.findElement(By.name("pass_confirmation"));
//		System.out.println("Found element: " + passwordelement);
//		passwordelement.sendKeys("ABC");
//		
//		WebElement confirmpasswordelement = driver.findElement(By.name("pass"));
//		System.out.println("Found element: " + confirmpasswordelement);
//		confirmpasswordelement.sendKeys("ABCD");
//		
//		
//		WebElement createAccountButton = driver.findElement(By.name("p$lt$ctl10$pageplaceholder$p$lt$ctl00$wAMSReg$register"));
//	    createAccountButton.click();
//		
//
//		    
//		try {
//            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(scrFile, new File("C:\\Users\\Rohit Kadam\\Desktop\\screenshot\\scrshtchmst.png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//		    
//		
//		
//		sleep(2);
//		
//		driver.close();	
//	}
//	
//	
//}
