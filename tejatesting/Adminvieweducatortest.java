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

class  Adminvieweducatortest {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        
    }
    
	@Test
    void testadminCanlogin() {
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
    void testeducatorlistnavigation() {
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

 		WebElement educatorlistbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[3]/li/a")));
 		educatorlistbtn.click();
 		
 		 String expectedUrl = "http://localhost:3000/educatorlist";
 	    assertEquals(expectedUrl, expectedUrl);	
        
	}
	
	@Test
    void testadminvieweducatorlistheader() {
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

 		WebElement educatorlistbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[3]/li/a")));
 		educatorlistbtn.click();
 		
 		WebElement adminlist = driver.findElement(By.xpath("/html/body/div/div/div/main/header/h1"));
 		assertTrue(adminlist.isDisplayed());
 		assertEquals("Admin Educator List", adminlist.getText());
        
	}
	
	@Test
    void testadminvieweducatorlist() {
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

 		WebElement educatorlistbtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[3]/li/a")));
 		educatorlistbtn.click();
	
    WebElement educatorname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/main/section[2]/table/tbody/tr[1]/td[1]")));
    assertTrue(educatorname.isDisplayed(), "educator");

	
	
	
	}
}
