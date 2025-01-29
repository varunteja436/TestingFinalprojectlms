package iteration1testing;

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

class StudentViewEditprofileJunit {
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
    void testEditStudentProfile() {
    	
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

    		WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/section/div/button")));
    		editButton.click();

        WebElement ageField = driver.findElement(By.xpath("/html/body/div/div/div/main/section/form/input[3]"));
        WebElement phoneField = driver.findElement(By.xpath("/html/body/div/div/div/main/section/form/input[4]"));



        ageField.clear();
        ageField.sendKeys("25");

        phoneField.clear();
        phoneField.sendKeys("1234567899");

        WebElement saveButton = driver.findElement(By.xpath("/html/body/div/div/div/main/section/form/button[1]"));
        saveButton.click();
        
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        assertEquals("Profile updated successfully!", alertText);
	    alert.accept();
   }

    @Test
    void testEditStudentProfileInvalidAge() {
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

   		WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/section/div/button")));
   		editButton.click();

       WebElement ageField = driver.findElement(By.xpath("/html/body/div/div/div/main/section/form/input[3]"));



       ageField.clear();
       ageField.sendKeys("0995");


       WebElement saveButton = driver.findElement(By.xpath("/html/body/div/div/div/main/section/form/button[1]"));
       saveButton.click();
       
       Alert alert = wait.until(ExpectedConditions.alertIsPresent());
       String alertText = alert.getText();
       assertEquals("Please enter a valid age (1-99).", alertText);
	    alert.accept();

    }

    @Test
    void testEditStudentProfileInvalidPhoneNumber() {
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

    		WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/section/div/button")));
    		editButton.click();
    		
        WebElement phoneField = driver.findElement(By.xpath("/html/body/div/div/div/main/section/form/input[4]"));



        phoneField.clear();
        phoneField.sendKeys("12345697899");

        WebElement saveButton = driver.findElement(By.xpath("/html/body/div/div/div/main/section/form/button[1]"));
        saveButton.click();
        
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        assertEquals("Please enter a valid phone number (10 digits).", alertText);
	    alert.accept();
    }



}
