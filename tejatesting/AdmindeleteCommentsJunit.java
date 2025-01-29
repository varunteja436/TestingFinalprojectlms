package iteration3testing;

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
import org.openqa.selenium.support.ui.WebDriverWait;

class AdmindeleteCommentsJunit {

    WebDriver driver;
	
	@BeforeEach
	void setUp() {
		driver = new ChromeDriver();
	}

	@AfterEach
	void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
	
	@Test
    void testAdminCanloginn() {
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
    void testAdminCanGotoViewContent() {
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

		WebElement ViewcontentBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[5]/li/a")));
		ViewcontentBtn.click();	
  	
		
		String url = driver.getCurrentUrl();
		String expectedUrl = "http://localhost:3000/adminviewcontent";
		
		assertEquals(expectedUrl, expectedUrl);	
        
	}
	
	@Test
    void testAdminCheckvissability() {
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

		WebElement ViewcontentBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[5]/li/a")));
		ViewcontentBtn.click();

		WebElement comments = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/div[5]/div[11]/div[1]/span[2]")));

        assertTrue(comments.isDisplayed());
        assertEquals("test hey", comments.getText());
        
	}
	
	
	@Test
    void testAdminCanDeleteCmts() {
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
  		
		WebElement ViewcontentBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[5]/li/a")));
		ViewcontentBtn.click();

		WebElement deleteBtn = 
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/div[5]/div[13]/div[2]")));
		deleteBtn.click();
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        assertEquals("Comment with has been deleted.", alertText);
	    alert.accept();
        
	}

}
