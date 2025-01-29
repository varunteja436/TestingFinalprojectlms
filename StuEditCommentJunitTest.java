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

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

class StuEditCommentJunitTest {
	
	  WebDriver driver;
	    WebDriverWait wait;

	    @BeforeEach
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	    @AfterEach
	    public void tearDown() {

	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	   @Test
	    void testStudentAssignmentsPageHeader() {
		   driver.get("http://localhost:3000");

		    WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
		    String testEmail = "studentmail@gmail.com";
		    inputField.sendKeys(testEmail);

		    WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
		    String testPassword = "Studentmain@123";
		    passwordField.sendKeys(testPassword);

		    WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
		    submitBtn.click();
		    
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    
		    WebElement myAssignmentsButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[3]/li/a")));
		    myAssignmentsButton.click();
		   
	        WebElement header = driver.findElement(By.className("student-courses-title"));
	        assertTrue(header.isDisplayed());
	        assertEquals("My Assignments", header.getText());
	    }

	    @Test
	    void testCommentValueDisplayed() {
	    	driver.get("http://localhost:3000");

		    WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
		    String testEmail = "studentmail@gmail.com";
		    inputField.sendKeys(testEmail);

		    WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
		    String testPassword = "Studentmain@123";
		    passwordField.sendKeys(testPassword);

		    WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
		    submitBtn.click();
		    
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    
		    WebElement myAssignmentsButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[3]/li/a")));
		    myAssignmentsButton.click();
		    
	        WebElement commentBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div[2]/div/div[8]/input")));

	        assertNotNull(commentBox, "Comment box is displayed");
	    }
	    


	    @Test
	    void testEditCommentButton() {
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
			
			WebElement AssignmentBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[3]/li/a")));
	 		AssignmentBtn.click();
			
			wait.until(ExpectedConditions.urlToBe("http://localhost:3000/studentallassignments"));
			
			WebElement edtButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[7]/div[2]/div[3]")));
			edtButton.click();
			
			WebElement textField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[7]/div[2]/div[2]/input")));
			textField.clear();
			textField.sendKeys("Updated Coment");

	        
	        WebElement saveButton = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[7]/div[2]/div[2]/button"));
	        assertTrue(saveButton.isDisplayed());
	        saveButton.click();
	    }

	    

}
