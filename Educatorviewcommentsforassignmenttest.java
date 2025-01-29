package lmstestingone;

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

class  Educatorviewcommentsforassignmenttest {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        
    }
    
	@Test
    void testeducatorCanlogin() {
    	driver.get("http://localhost:3000");
	   	 
	   	 
	   	 
     	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
  		String testEmail = "educator@mail.com";
  		inputField.sendKeys(testEmail);
  
  		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
  		String testPassword = "Educator@123";
  		passwordField.sendKeys(testPassword);
  
  		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
  		submitBtn.click();
  		
		
		String url = driver.getCurrentUrl();
		String expectedUrl = "http://localhost:3000/educatordashboard";
		
		assertEquals(expectedUrl, expectedUrl);	
        
	}
	
	@Test
    void testmyassignmentslinknavigation() {
    	driver.get("http://localhost:3000");
	   	 
	   	 
	   	 
     	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
  		String testEmail = "educator@mail.com";
  		inputField.sendKeys(testEmail);
  
  		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
  		String testPassword = "Educator@123";
  		passwordField.sendKeys(testPassword);
  
  		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
  		submitBtn.click();
  		
  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));

 		WebElement myassignmentsButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[4]/li/a")));
 		myassignmentsButton.click();
 		
 		 String expectedUrl = "http://localhost:3000/educatormyassignments";
 	    assertEquals(expectedUrl, expectedUrl);
  		
	}
	
    @Test
    void testEducatorSeeComments() {
        driver.get("http://localhost:3000");

        WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
        String testEmail = "educator@mail.com";
        inputField.sendKeys(testEmail);

        WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
        String testPassword = "Educator@123";
        passwordField.sendKeys(testPassword);

        WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
        submitBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        WebElement myAssignmentsButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[4]/li/a")));
        myAssignmentsButton.click();

        WebElement comments = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div/div[3]/div[4]/div[1]/span[2]")));

        assertTrue(comments.isDisplayed());
        assertEquals("This is a student comment", comments.getText());
    }
    
    @Test
    void testStudentNameVisibility() {
        driver.get("http://localhost:3000");
        
        WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
        String testEmail = "educator@mail.com";
        inputField.sendKeys(testEmail);

        WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
        String testPassword = "Educator@123";
        passwordField.sendKeys(testPassword);

        WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
        submitBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

        WebElement myAssignmentsButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[4]/li/a")));
        myAssignmentsButton.click();

        WebElement studentName = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div/div[3]/div[4]/div[1]/span[1]")));

        assertTrue(studentName.isDisplayed(), "Student name should be visible on the comments section.");
        assertEquals("Studentm", studentName.getText(), "Student name should match the expected value.");
    }
    
    
    
}
