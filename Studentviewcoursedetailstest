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

class  Studentviewcoursedetailstest {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        
    }
    
	@Test
    void testStudentCanlogin() {
    	driver.get("http://localhost:3000");
	   	 
	   	 
	   	 
     	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
  		String testEmail = "studentmail@gmail.com";
  		inputField.sendKeys(testEmail);
  
  		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
  		String testPassword = "Studentmain@123";
  		passwordField.sendKeys(testPassword);
  
  		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
  		submitBtn.click();
  		
		
		String url = driver.getCurrentUrl();
		String expectedUrl = "http://localhost:3000/studentdashboard";
		
		assertEquals(expectedUrl, expectedUrl);	
        
	}
	
	@Test
	void testmycoursesbuttonisclickable() {
	   	driver.get("http://localhost:3000");
	   	 
	   	 
	   	 
    	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
 		String testEmail = "studentmail@gmail.com";
 		inputField.sendKeys(testEmail);
 
 		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
 		String testPassword = "Studentmain@123";
 		passwordField.sendKeys(testPassword);
 
 		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
 		submitBtn.click();
 		
  		
  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));

 		WebElement courseButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[2]/li/a")));
 		courseButton.click();
 		
 		 String expectedUrl = "http://localhost:3000/studentcourse";
 	    assertEquals(expectedUrl, expectedUrl);
		
	}
	
	@Test
	void testtoseeavaliablecourses() {
	   	driver.get("http://localhost:3000");
	   	 
	   	 
	   	 
    	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
 		String testEmail = "studentmail@gmail.com";
 		inputField.sendKeys(testEmail);
 
 		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
 		String testPassword = "Studentmain@123";
 		passwordField.sendKeys(testPassword);
 
 		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
 		submitBtn.click();
 		
  		
  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));

 		WebElement courseButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[2]/li/a")));
 		courseButton.click();
 		
 		WebElement availablecourses = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[2]/div[1]"));
 		assertTrue(availablecourses.isDisplayed());
 		assertEquals("Available Courses", availablecourses.getText());
 		

 		

	}
	
	@Test
	void testtoseecoursenames() {
	   	driver.get("http://localhost:3000");
	   	 
	   	 
	   	 
    	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
 		String testEmail = "studentmail@gmail.com";
 		inputField.sendKeys(testEmail);
 
 		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
 		String testPassword = "Studentmain@123";
 		passwordField.sendKeys(testPassword);
 
 		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
 		submitBtn.click();
 		
  		
  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));

 		WebElement courseButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[2]/li/a")));
 		courseButton.click();
 		
 		WebElement availablecourses = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[2]/div[1]"));
 		assertTrue(availablecourses.isDisplayed());
 		assertEquals("Available Courses", availablecourses.getText());
 		
 		
 		WebElement coursename = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div"));
 		assertTrue(coursename.isDisplayed());
 		assertEquals("React", coursename.getText());
 		
 		WebElement coursename1 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div"));
 		assertTrue(coursename1.isDisplayed());
 		assertEquals("ersdcfgvb", coursename1.getText());
	
    
	}
	
	@Test
	void testingcoursedetailsbutton() {
	   	driver.get("http://localhost:3000");
	   	 
	   	 
	   	 
   	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
		String testEmail = "studentmail@gmail.com";
		inputField.sendKeys(testEmail);

		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
		String testPassword = "Studentmain@123";
		passwordField.sendKeys(testPassword);

		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
		submitBtn.click();
		
 		
 		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));

		WebElement courseButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[2]/li/a")));
		courseButton.click();
		
		WebElement coursedetailsbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/button")));
		coursedetailsbutton.click();
		
		 String expectedUrl = "http://localhost:3000/studentunenrolledcourse";
 	    assertEquals(expectedUrl, expectedUrl);
		
		
	}
	
	
}
