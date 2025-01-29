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

class StudentViewGradesJunit {

	WebDriver driver;

	@BeforeEach
	void setUp() {
		driver = new ChromeDriver();
		 driver.manage().window().maximize();

	}

	@AfterEach
	void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
	
    @Test
    void studentProfilePageLoadsSuccessfully() {
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

		WebElement profileButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[2]/li/a")));
		profileButton.click();	
		
		String url = driver.getCurrentUrl();
		String expectedUrl = "http://localhost:3000/studentprofile";
		
		assertEquals(expectedUrl, expectedUrl);	

    }
    
	@Test
	void testAssigmentspageNavigation() {

	    driver.get("http://localhost:3000");

	    WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
	    String testEmail = "studentmail@gmail.com";
	    inputField.sendKeys(testEmail);

	    WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
	    String testPassword = "Studentmain@123";
	    passwordField.sendKeys(testPassword);

	    WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
	    submitBtn.click();
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	    
	    WebElement myAssignmentsButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[3]/li/a")));
	    myAssignmentsButton.click();
	    
		String url = driver.getCurrentUrl();
		String expectedUrl = "http://localhost:3000/studentallassignments";
		
		assertEquals(expectedUrl, expectedUrl);	

	}
	
	
	@Test
	void testCommentsSendinginStudent() {

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
	    
	    WebElement grade = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[5]/div/span")));

        assertTrue(grade.isDisplayed());
        assertEquals("a", grade.getText());

	}
}
