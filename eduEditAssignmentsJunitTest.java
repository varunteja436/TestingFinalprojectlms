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

class eduEditAssignmentsJunitTest {


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
    public void testVerifyAssignmentTabsArePresent() {
    	
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
		
        WebElement assignmentTabs = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div"));
        assertTrue(assignmentTabs.isDisplayed(), "Assignment tabs are not displayed");

        WebElement tab1 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]"));
        WebElement tab2 = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]"));
        assertTrue(tab1.isDisplayed() && tab2.isDisplayed(), "Not all assignment tabs are displayed");
    }

    @Test
    public void testEditAssignmentsButtonIsClickable() {
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
		
		WebElement assignmentTabs = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div"));
		assertTrue(assignmentTabs.isDisplayed(), "Assignment tabs are not displayed");

		
        WebElement editassignmentbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[1]/div[2]/button[1]")));

        assertTrue(editassignmentbtn.isDisplayed());
        assertEquals("Edit Assignment", editassignmentbtn.getText());

    }

    @Test
    public void testRedirectToEditAssignmentPageAndVerifyHeader() {
    	
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
	
	WebElement assignmentTabs = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div"));
	assertTrue(assignmentTabs.isDisplayed(), "Assignment tabs are not displayed");

	
    WebElement editassignmentbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[1]/div[2]/button[1]")));
    editassignmentbtn.click();

    WebElement header = driver.findElement(By.cssSelector(".form-header1"));
    assertTrue(header.isDisplayed(), "Header for the Edit Assignment page is not displayed");
    }

    @Test
    public void testVerifyEditableFieldsOnEditAssignmentPage() {
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
    	
    	WebElement assignmentTabs = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div"));
    	assertTrue(assignmentTabs.isDisplayed(), "Assignment tabs are not displayed");
    
    	
        WebElement editassignmentbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[1]/div[2]/button[1]")));
        editassignmentbtn.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        

        WebElement assignmentTitleField = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/input"));
        WebElement submissionDateField = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/input"));
        WebElement descriptionField = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/textarea"));

        assertTrue(assignmentTitleField.isDisplayed(), "Assignment title field is not displayed");
        assertTrue(submissionDateField.isDisplayed(), "Submission date field is not displayed");
        assertTrue(descriptionField.isDisplayed(), "Description field is not displayed");

        assignmentTitleField.sendKeys("Updated Assignment");
        submissionDateField.sendKeys("01-22-2025");
        descriptionField.sendKeys("Updated description");

        assertEquals("Updated Assignment", assignmentTitleField.getAttribute("value"), "Assignment title is not editable");
        assertEquals("01-22-2025", submissionDateField.getAttribute("value"), "Submission date is not editable");
        assertEquals("Updated description", descriptionField.getAttribute("value"), "Description is not editable");
    }

    @Test
    public void testSubmitAssignmentAndVerifyAlertMessage() {
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
    	
    	WebElement assignmentTabs = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div"));
    	assertTrue(assignmentTabs.isDisplayed(), "Assignment tabs are not displayed");
    
    	
        WebElement editassignmentbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[1]/div[2]/button[1]")));
        editassignmentbtn.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement assignmentTitleField = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/input"));
        WebElement submissionDateField = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/input"));
        WebElement descriptionField = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/textarea"));
        assignmentTitleField.clear();
        assignmentTitleField.sendKeys("Updated Assignment Title");
        submissionDateField.clear();
        submissionDateField.sendKeys("02-22-2025");
        descriptionField.clear();
        descriptionField.sendKeys("Updated description");

        WebElement submitButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[4]/button[1]"));
        submitButton.click();
        
        wait.until(ExpectedConditions.alertIsPresent());
        
        Alert alert = driver.switchTo().alert();
        assertEquals("Assignment updated successfully.", alert.getText(), "Alert text did not match for course deletion");
        alert.accept();

           }

    @Test
    public void testCancelButtonRedirectsToMyAssignmentsPage() {
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
    	
    	WebElement assignmentTabs = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div"));
    	assertTrue(assignmentTabs.isDisplayed(), "Assignment tabs are not displayed");
    
    	
        WebElement editassignmentbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[1]/div[2]/button[1]")));
        editassignmentbtn.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement cancelButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[4]/button[2]"));
        cancelButton.click();

        wait.until(ExpectedConditions.urlContains("http://localhost:3000/educatormyassignments"));
        assertTrue(driver.getCurrentUrl().contains("http://localhost:3000/educatormyassignments"), "Did not navigate back to 'My Assignments' page after clicking cancel");
    }


}
