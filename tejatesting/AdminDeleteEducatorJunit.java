package iteration2testing;

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

class AdminDeleteEducatorJunit {
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
    void testAdminCanGotoEducatorListt() {
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

		WebElement EducatorListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[3]/li/a")));
		EducatorListBtn.click();	
  	
		
		String url = driver.getCurrentUrl();
		String expectedUrl = "http://localhost:3000/educatorlist";
		
		assertEquals(expectedUrl, expectedUrl);	
        
	}

	
	@Test
    void testAdminCanDeleteEducator() {
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

		WebElement EducatorListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[3]/li/a")));
		EducatorListBtn.click();	

		
		WebElement AdminEducatorDeleteBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/section[2]/table/tbody/tr[3]/td[6]/button")));
		AdminEducatorDeleteBtn.click();
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        assertEquals("User deleted successfully!", alertText);
	    alert.accept();
        
	}

}
