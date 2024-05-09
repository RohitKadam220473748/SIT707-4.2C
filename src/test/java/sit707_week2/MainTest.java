package sit707_week2;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainTest {

    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() {
        
        System.setProperty("webdriver.chrome.driver", "C:/Users/Rohit Kadam/Downloads/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.bunnings.com.au/login";
    }
    
    @Test
	public void testStudentIdentity() {
		String studentId = "S220473748";
		Assert.assertNotNull("Student ID is S220473748", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Rohit Kadam";
		Assert.assertNotNull("Student name is Rohit Kadam", studentName);
	}

    @Test
    public void testSuccessfulLogin() throws Exception {
        
        driver.get(baseUrl);

        
        WebElement emailField = driver.findElement(By.id("okta-signin-username"));
        WebElement passwordField = driver.findElement(By.id("okta-signin-password"));
        emailField.sendKeys("rohitkadam680@gmail.com");
        passwordField.sendKeys("Rohit@871");

       
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("okta-signin-submit")));
         
        loginButton.click();
        Thread.sleep(3000);
        
        String expectedUrl = "https://www.bunnings.com.au/";
        
         String currentUrl = driver.getCurrentUrl();
         System.out.println("Actual URL after successful login: " + currentUrl);

        assertEquals(expectedUrl, currentUrl);
    }

    @Test
    public void testWrongUsernameandWrongPassword() throws Exception {
       
        driver.get(baseUrl);

       
        WebElement emailField = driver.findElement(By.id("okta-signin-username"));
        WebElement passwordField = driver.findElement(By.id("okta-signin-password"));
        emailField.sendKeys("invalid_email@example.com");
        passwordField.sendKeys("invalid_password");

       
        WebElement loginButton = driver.findElement(By.id("okta-signin-submit"));
        loginButton.click();
        
        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"retailLogin\"]/div[1]/div[1]/div/div/p"));
        
        String expectedErrorMessage = "Your email address or password is incorrect."; 
        assertEquals("Error message text match", expectedErrorMessage, errorMessage.getText());
    }

    @Test
    public void testBlankUsernameandBlankPassword() throws Exception {
       
        driver.get(baseUrl);

        
        WebElement emailField = driver.findElement(By.id("okta-signin-username"));
        WebElement passwordField = driver.findElement(By.id("okta-signin-password"));
        emailField.sendKeys("");
        passwordField.sendKeys("");

      
        WebElement loginButton = driver.findElement(By.id("okta-signin-submit"));
        loginButton.click();
        
        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"retailLogin\"]/div[1]/div[1]/div/div/p"));
        
        String expectedErrorMessage = "Please correct the highlighted errors"; 
        assertEquals("Error message text match", expectedErrorMessage, errorMessage.getText());
    }
    
    @Test
    public void testBlankUsernameandWrongPassword() throws Exception {
        
        driver.get(baseUrl);

        
        WebElement emailField = driver.findElement(By.id("okta-signin-username"));
        WebElement passwordField = driver.findElement(By.id("okta-signin-password"));
        emailField.sendKeys("");
        passwordField.sendKeys("rohit");

        
        WebElement loginButton = driver.findElement(By.id("okta-signin-submit"));
        loginButton.click();

        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"retailLogin\"]/div[1]/div[1]/div/div/p"));
        
        String expectedErrorMessage = "Please correct the highlighted errors"; 
        assertEquals("Error message text match", expectedErrorMessage, errorMessage.getText());
    }
    
    @Test
    public void testBlankUsernameandCorrectPassword() throws Exception {
        
        driver.get(baseUrl);

        
        WebElement emailField = driver.findElement(By.id("okta-signin-username"));
        WebElement passwordField = driver.findElement(By.id("okta-signin-password"));
        emailField.sendKeys("");
        passwordField.sendKeys("Rohit@871");

       
        WebElement loginButton = driver.findElement(By.id("okta-signin-submit"));
        loginButton.click();

        
    
        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"retailLogin\"]/div[1]/div[1]/div/div/p"));
        
        String expectedErrorMessage = "Please correct the highlighted errors"; 
        assertEquals("Error message text match", expectedErrorMessage, errorMessage.getText());
    }
    
    @Test
    public void testWrongUsernameandBlankPassword() throws Exception {
      
        driver.get(baseUrl);

        
        WebElement emailField = driver.findElement(By.id("okta-signin-username"));
        WebElement passwordField = driver.findElement(By.id("okta-signin-password"));
        emailField.sendKeys("rohit123@gmail.com");
        passwordField.sendKeys("");

        
        WebElement loginButton = driver.findElement(By.id("okta-signin-submit"));
        loginButton.click();

      
        
        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"retailLogin\"]/div[1]/div[1]/div/div/p"));
        
        String expectedErrorMessage = "Please correct the highlighted errors"; 
        assertEquals("Error message text match", expectedErrorMessage, errorMessage.getText());
    }
    
    @Test
    public void testWrongUsernameandCorrectPassword() throws Exception {
       
        driver.get(baseUrl);

       
        WebElement emailField = driver.findElement(By.id("okta-signin-username"));
        WebElement passwordField = driver.findElement(By.id("okta-signin-password"));
        emailField.sendKeys("rohit123@gmail.com");
        passwordField.sendKeys("Rohit@871");

        
        WebElement loginButton = driver.findElement(By.id("okta-signin-submit"));
        loginButton.click();

       
        
        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"retailLogin\"]/div[1]/div[1]/div/div/p"));
        
        String expectedErrorMessage = "Your email address or password is incorrect."; 
        assertEquals("Error message text match", expectedErrorMessage, errorMessage.getText());
    }
    
    @Test
    public void testCorrectUsernameandBlankPassword() throws Exception {
       
        driver.get(baseUrl);

        
        WebElement emailField = driver.findElement(By.id("okta-signin-username"));
        WebElement passwordField = driver.findElement(By.id("okta-signin-password"));
        emailField.sendKeys("rohitkadam680@gmail.com");
        passwordField.sendKeys("");

        
        WebElement loginButton = driver.findElement(By.id("okta-signin-submit"));
        loginButton.click();

       
      
        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"retailLogin\"]/div[1]/div[1]/div/div/p"));
        
        String expectedErrorMessage = "Please correct the highlighted errors"; 
        assertEquals("Error message text match", expectedErrorMessage, errorMessage.getText());
    }
    
    @Test
    public void testCorrectUsernameandWrongPassword() throws Exception {
      
        driver.get(baseUrl);

        
        WebElement emailField = driver.findElement(By.id("okta-signin-username"));
        WebElement passwordField = driver.findElement(By.id("okta-signin-password"));
        emailField.sendKeys("rohitkadam680@gmail.com");
        passwordField.sendKeys("Rohit@87186");

       
        WebElement loginButton = driver.findElement(By.id("okta-signin-submit"));
        loginButton.click();

        
      
        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"retailLogin\"]/div[1]/div[1]/div/div/p"));
        
        String expectedErrorMessage = "Your email address or password is incorrect."; 
        assertEquals("Error message text match", expectedErrorMessage, errorMessage.getText());
    }
    
    
    
    
    
    
    
    @After
    public void tearDown() {
        driver.quit();
    }
}
