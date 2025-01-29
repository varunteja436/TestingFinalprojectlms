//package iteration2testing;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.time.Duration;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//class AdminViewStudentsJunit {
//
//    WebDriver driver;
//	
//	@BeforeEach
//	void setUp() {
//		driver = new ChromeDriver();
//	}
//
//	@AfterEach
//	void tearDown() {
//		if (driver != null) {
//			driver.quit();
//		}
//	}
//		@Test
//	    void testAdminCanlogin() {
//	    	driver.get("http://localhost:3000");
//		   	 
//		   	 
//		   	 
//	     	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
//	  		String testEmail = "admin123@gmail.com";
//	  		inputField.sendKeys(testEmail);
//	  
//	  		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
//	  		String testPassword = "admin123";
//	  		passwordField.sendKeys(testPassword);
//	  
//	  		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
//	  		submitBtn.click();
//	  		
//			
//			String url = driver.getCurrentUrl();
//			String expectedUrl = "http://localhost:3000/dashboard";
//			
//			assertEquals(expectedUrl, expectedUrl);	
//	        
//		}
//		
//		@Test
//	    void testAdminCanGotoStudentsList() {
//	    	driver.get("http://localhost:3000");
//		   	 
//		   	 
//		   	 
//	     	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
//	  		String testEmail = "admin123@gmail.com";
//	  		inputField.sendKeys(testEmail);
//	  
//	  		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
//	  		String testPassword = "admin123";
//	  		passwordField.sendKeys(testPassword);
//	  
//	  		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
//	  		submitBtn.click();
//	  		
//	  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//
//			WebElement StudentsListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[2]/li/a")));
//			StudentsListBtn.click();	
//	  	
//			
//			String url = driver.getCurrentUrl();
//			String expectedUrl = "http://localhost:3000/adminviewstudents";
//			
//			assertEquals(expectedUrl, expectedUrl);	
//	        
//		}
//		
//		
//		
//		
//		@Test
//	    void testAdminCanSuspendStudents() {
//	    	driver.get("http://localhost:3000");
//		   	 
//		   	 
//		   	 
//	     	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
//	  		String testEmail = "admin123@gmail.com";
//	  		inputField.sendKeys(testEmail);
//	  
//	  		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
//	  		String testPassword = "admin123";
//	  		passwordField.sendKeys(testPassword);
//	  
//	  		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
//	  		submitBtn.click();
//	  		
//	  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//
//			WebElement StudentsListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[2]/li/a")));
//			StudentsListBtn.click();	
//			
//			WebElement StudentsSuspendBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/section/table/tbody/tr[3]/td[2]/button")));
//			StudentsSuspendBtn.click();
//	  	
//			
//			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//	        String alertText = alert.getText();
//	        assertEquals("User deactivated successfully!", alertText);
//		    alert.accept();
//	        
//		}
//		
//		
//		@Test
//	    void testAdminCanUnsuspendStudents() {
//	    	driver.get("http://localhost:3000");
//		   	 
//		   	 
//		   	 
//	     	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
//	  		String testEmail = "admin123@gmail.com";
//	  		inputField.sendKeys(testEmail);
//	  
//	  		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
//	  		String testPassword = "admin123";
//	  		passwordField.sendKeys(testPassword);
//	  
//	  		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
//	  		submitBtn.click();
//	  		
//	  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//
//			WebElement StudentsListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[2]/li/a")));
//			StudentsListBtn.click();	
//			
//			WebElement StudentsSuspendBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/section/table/tbody/tr[3]/td[2]/button")));
//			StudentsSuspendBtn.click();
//	  	
//			
//			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//	        String alertText = alert.getText();
//	        assertEquals("User activated successfully!", alertText);
//		    alert.accept();
//	        
//		}
//}
