package pack1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

class  Adminviewcommentstest {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        
    }
    
	@Test
    void adminCanlogin() {
    	driver.get("http://localhost:3000");
	   	 
	   	 
	   	 
     	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
  		String testEmail = "admin123@gmail.com";
  		inputField.sendKeys(testEmail);
  
  		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
  		String testPassword = "admin123";
  		passwordField.sendKeys(testPassword);
  
  		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
  		submitBtn.click();
  		
		
		String url = driver.getCurrentUrl();
		String expectedUrl = "http://localhost:3000/dashboard";
		
		assertEquals(expectedUrl, expectedUrl);	
        
	}
	
	@Test
    void testadminviewcontentnavigation() {
    	driver.get("http://localhost:3000");
	   	 
	   	 
	   	 
     	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
  		String testEmail = "admin123@gmail.com";
  		inputField.sendKeys(testEmail);
  
  		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
  		String testPassword = "admin123";
  		passwordField.sendKeys(testPassword);
  
  		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
  		submitBtn.click();
  		
		
  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));

 		WebElement viewcontentbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[5]/li/a")));
 		viewcontentbtn.click();
 		
 		 String expectedUrl = "http://localhost:3000/adminviewcontent";
 	    assertEquals(expectedUrl, expectedUrl);	
        
	}
	
	@Test
    void testadminviewcommentheader() {
    	driver.get("http://localhost:3000");
	   	 
	   	 
	   	 
     	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
  		String testEmail = "admin123@gmail.com";
  		inputField.sendKeys(testEmail);
  
  		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
  		String testPassword = "admin123";
  		passwordField.sendKeys(testPassword);
  
  		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
  		submitBtn.click();
  		
		
  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));

 		WebElement viewcontentbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[5]/li/a")));
 		viewcontentbtn.click();
 		
 		WebElement flaggedcontent = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/h3"));
 		assertTrue(flaggedcontent.isDisplayed());
 		assertEquals("Flagged content", flaggedcontent.getText());
        
	}
	
    @Test
    void testadminSeeCommentswithusername() {
        driver.get("http://localhost:3000");

        WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
        String testEmail = "admin123@gmail.com";
        inputField.sendKeys(testEmail);

        WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
        String testPassword = "admin123";
        passwordField.sendKeys(testPassword);

        WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
        submitBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

 		WebElement viewcontentbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[5]/li/a")));
 		viewcontentbtn.click();

        WebElement studentcomments = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/div[3]/div[6]/div[1]")));

        assertTrue(studentcomments.isDisplayed());
        assertEquals("studentm - hi", studentcomments.getText());
        
        WebElement educatorcomments = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/div[4]/div[5]/div[1]")));

        assertTrue(educatorcomments.isDisplayed());
        assertEquals("educator - ello", educatorcomments.getText());
        
        
        
    }
    
    @Test
    void testadminSeeonlyComments() {
        driver.get("http://localhost:3000");

        WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
        String testEmail = "admin123@gmail.com";
        inputField.sendKeys(testEmail);

        WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
        String testPassword = "admin123";
        passwordField.sendKeys(testPassword);

        WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
        submitBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

 		WebElement viewcontentbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[5]/li/a")));
 		viewcontentbtn.click();

        WebElement comments = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/div[5]/div[5]/div[1]/span[2]")));

        assertTrue(comments.isDisplayed());
        assertEquals("hi", comments.getText());
                
        
        
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
    
    
    
	
	

}
