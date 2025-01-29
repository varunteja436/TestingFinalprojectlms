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

class EduAddAssignmentJunitTest {

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
    public void testRedirectToEducatorMyAssignmentsAndHeaderDisplayed() {
    	
    	driver.get("http://localhost:3000");
    	
    	WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
 		String testEmail = "Educator@mail.com";
 		inputField.sendKeys(testEmail);

 		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
 		String testPassword = "Educator@123";
 		passwordField.sendKeys(testPassword);

 		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
 		submitBtn.click();
 		
 		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
 		
 		WebElement AssignmentBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[4]/li/a")));
 		AssignmentBtn.click();
		
		wait.until(ExpectedConditions.urlToBe("http://localhost:3000/educatormyassignments"));
		
        WebElement header = driver.findElement(By.cssSelector(".form-header1"));
        assertTrue(header.isDisplayed(), "The header 'Educator Assignments' is not displayed");
    }

    @Test
    public void testAddNewAssignmentButtonPresentAndClickable() {
    	driver.get("http://localhost:3000");
    	
    	WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
 		String testEmail = "Educator@mail.com";
 		inputField.sendKeys(testEmail);

 		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
 		String testPassword = "Educator@123";
 		passwordField.sendKeys(testPassword);

 		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
 		submitBtn.click();
 		
 		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
 		
 		WebElement AssignmentBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[4]/li/a")));
 		AssignmentBtn.click();
		
		wait.until(ExpectedConditions.urlToBe("http://localhost:3000/educatormyassignments"));
		
        WebElement addNewAssignmentButton = driver.findElement(By.cssSelector("#root > div > div > div.assignment-main > div > button"));
        assertTrue(addNewAssignmentButton.isDisplayed(), "Add New Assignment button is not displayed");
        addNewAssignmentButton.click();

        WebDriverWait wait1	 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("educatorcreateassignment"));
        assertTrue(driver.getCurrentUrl().contains("educatorcreateassignment"), "Did not navigate to 'Create Assignment' page");
    }

    @Test
    public void testRedirectToCreateAssignmentAndCheckFields() {
    	
    	driver.get("http://localhost:3000");
    	
    	WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
 		String testEmail = "Educator@mail.com";
 		inputField.sendKeys(testEmail);

 		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
 		String testPassword = "Educator@123";
 		passwordField.sendKeys(testPassword);

 		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
 		submitBtn.click();
 		
 		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
 		
 		WebElement AssignmentBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[4]/li/a")));
 		AssignmentBtn.click();
		
		wait.until(ExpectedConditions.urlToBe("http://localhost:3000/educatormyassignments"));
		
        WebElement addNewAssignmentButton = driver.findElement(By.cssSelector("#root > div > div > div.assignment-main > div > button"));
        assertTrue(addNewAssignmentButton.isDisplayed(), "Add New Assignment button is not displayed");
        addNewAssignmentButton.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("http://localhost:3000/educatorcreateassignment"));

        WebElement header = driver.findElement(By.cssSelector("#root > div > div > main > div.form-headerr1"));
        assertTrue(header.isDisplayed(), "Header on the Create Assignment page is not displayed");

        WebElement assignmentTitleField = driver.findElement(By.id("assignmentTitle"));
        WebElement submissionDateField = driver.findElement(By.id("submissionDate"));
        WebElement descriptionField = driver.findElement(By.id("assignmentDescription"));

        assertTrue(assignmentTitleField.isEnabled(), "Assignment title field is not enabled");
        assertTrue(submissionDateField.isEnabled(), "Submission date field is not enabled");
        assertTrue(descriptionField.isEnabled(), "Description field is not enabled");
    }

    @Test
    public void testCancelButtonRedirectsToMyAssignments() {
    	
    	driver.get("http://localhost:3000");
    	
    	WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
 		String testEmail = "Educator@mail.com";
 		inputField.sendKeys(testEmail);

 		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
 		String testPassword = "Educator@123";
 		passwordField.sendKeys(testPassword);

 		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
 		submitBtn.click();
 		
 		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
 		
 		WebElement AssignmentBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[4]/li/a")));
 		AssignmentBtn.click();
		
		wait.until(ExpectedConditions.urlToBe("http://localhost:3000/educatormyassignments"));
		
        WebElement addNewAssignmentButton = driver.findElement(By.cssSelector("#root > div > div > div.assignment-main > div > button"));
        assertTrue(addNewAssignmentButton.isDisplayed(), "Add New Assignment button is not displayed");
        addNewAssignmentButton.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("http://localhost:3000/educatorcreateassignment"));
        

        WebElement cancelButton = driver.findElement(By.cssSelector("#root > div > div > main > div.form-contentt1 > div.button-containerr1 > button.cancel-buttonn1"));
        cancelButton.click();

        wait.until(ExpectedConditions.urlContains("http://localhost:3000/educatormyassignments"));
        assertTrue(driver.getCurrentUrl().contains("http://localhost:3000/educatormyassignments"), "Did not navigate back to 'My Assignments' page");
    }

    @Test
    public void testSubmitAssignmentShowsAlertMessage() {
    	
    	driver.get("http://localhost:3000");
    	
    	WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
 		String testEmail = "Educator@mail.com";
 		inputField.sendKeys(testEmail);

 		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
 		String testPassword = "Educator@123";
 		passwordField.sendKeys(testPassword);

 		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
 		submitBtn.click();
 		
 		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
 		
 		WebElement AssignmentBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[4]/li/a")));
 		AssignmentBtn.click();
		
		wait.until(ExpectedConditions.urlToBe("http://localhost:3000/educatormyassignments"));
		
        WebElement addNewAssignmentButton = driver.findElement(By.cssSelector("#root > div > div > div.assignment-main > div > button"));
        assertTrue(addNewAssignmentButton.isDisplayed(), "Add New Assignment button is not displayed");
        addNewAssignmentButton.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("http://localhost:3000/educatorcreateassignment"));
       

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlContains("http://localhost:3000/educatorcreateassignment"));

        WebElement assignmentTitleField = driver.findElement(By.cssSelector("#assignmentTitle"));
        WebElement submissionDateField = driver.findElement(By.cssSelector("#submissionDate"));
        WebElement descriptionField = driver.findElement(By.cssSelector("#assignmentDescription"));
        WebElement courseField = driver.findElement(By.cssSelector("#courseId"));
        courseField.click();
        
        Select courseSelect = new Select(courseField);

     
        courseSelect.selectByIndex(1); 
        
        
        
        WebElement submitButton = driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/div[5]/button[1]"));
        

        assignmentTitleField.sendKeys("New Assignment");
        submissionDateField.sendKeys("2025-02-01");
        descriptionField.sendKeys("Assignment description");

        submitButton.click();
        
        WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        
        Alert alert = driver.switchTo().alert();
        assertEquals("Assignment submitted successfully!", alert.getText(), "Alert text did not match for course deletion");
        alert.accept();

        
    }
    
    

}
