//package iteration1testing;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
// class CreateEducatorJunit {
//
//	 WebDriver driver;
//
//		@BeforeEach
//		void setUp() {
//			driver = new ChromeDriver();
//		}
//
//		@AfterEach
//		void tearDown() {
//			if (driver != null) {
//				driver.quit();
//			}
//		}
//
//		@Test
//		void testEmptyFullName() {
//		    driver.get("http://localhost:3000/educatorcreate");
//		    
//		    WebElement fullnameField = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[1]/input"));
//		    fullnameField.sendKeys(""); 
//
//		    WebElement registerButton = driver.findElement(By.xpath("/html/body/div/div/div/main/div/button"));
//		    registerButton.click();
//
//		    Alert alert = driver.switchTo().alert();
//		    
//		    String alertText = alert.getText();
//		    assertEquals("Please enter a valid full name (letters and spaces only).", alertText, "Alert message does not match expected text.");
//
//		    alert.accept();
//		}
//
//
//	    @Test
//	    void testFullNameWithSpecialCharacters() {
//		    driver.get("http://localhost:3000/educatorcreate");
//		    
//		    WebElement fullnameField = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[1]/input"));
//		    fullnameField.sendKeys("tej@"); 
//
//		    WebElement registerButton = driver.findElement(By.xpath("/html/body/div/div/div/main/div/button"));
//		    registerButton.click();
//
//		    Alert alert = driver.switchTo().alert();
//		    
//		    String alertText = alert.getText();
//		    assertEquals("Please enter a valid full name (letters and spaces only).", alertText, "Alert message does not match expected text.");
//
//		    alert.accept();
//	    }
//
//	    @Test
//	    void testAgeWithNegativeNumber() {
//		    driver.get("http://localhost:3000/educatorcreate");
//		    
//		    WebElement agefield = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[2]/input"));
//		    agefield.sendKeys("-25"); 
//
//		    WebElement registerButton = driver.findElement(By.xpath("/html/body/div/div/div/main/div/button"));
//		    registerButton.click();
//
//		    Alert alert = driver.switchTo().alert();
//		    
//		    String alertText = alert.getText();
//		    assertEquals("Please enter a valid age (1-120).", alertText, "Please enter a valid age (1-120).");
//
//		    alert.accept();
//	    }
//
//	    @Test
//	    void testAgeWithLargeNumber() {
//		    driver.get("http://localhost:3000/educatorcreate");
//		    
//		    WebElement fullnameField = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[1]/input"));
//		    fullnameField.sendKeys("tej"); 
//		    
//		    WebElement agefield = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[2]/input"));
//		    agefield.sendKeys("999"); 
//
//		    WebElement registerButton = driver.findElement(By.xpath("/html/body/div/div/div/main/div/button"));
//		    registerButton.click();
//
//		    Alert alert = driver.switchTo().alert();
//		    
//		    String alertText = alert.getText();
//		    assertEquals("Please enter a valid age (1-120).", alertText, "Please enter a valid age (1-120).");
//
//		    alert.accept(); 
//	    }
//
//	    @Test
//	    void testPhoneNumberWithLetters() {
//		    driver.get("http://localhost:3000/educatorcreate");
//		    
//		    WebElement pnumberfield = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[2]/input"));
//		    pnumberfield.sendKeys("999dsg"); 
//
//		    WebElement registerButton = driver.findElement(By.xpath("/html/body/div/div/div/main/div/button"));
//		    registerButton.click();
//
//		    Alert alert = driver.switchTo().alert();
//		    
//		    String alertText = alert.getText();
//		    assertEquals("Please enter a valid 10-digit phone number.", alertText, "Please enter a valid 10-digit phone number.");
//
//		    alert.accept();
//	    }
//
//	    @Test
//	    void testPhoneNumberWithLessThan10Digits() {
//		    driver.get("http://localhost:3000/educatorcreate");
//		    
//		    WebElement pnumberfield = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[3]/input"));
//		    pnumberfield.sendKeys("12345"); 
//
//		    WebElement registerButton = driver.findElement(By.xpath("/html/body/div/div/div/main/div/button"));
//		    registerButton.click();
//
//		    Alert alert = driver.switchTo().alert();
//		    
//		    String alertText = alert.getText();
//		    assertEquals("Please enter a valid 10-digit phone number.", alertText, "Please enter a valid 10-digit phone number.");
//
//		    alert.accept();
//	    }
//
//	    @Test
//	    void testEmailWithoutextension() {
//		    driver.get("http://localhost:3000/educatorcreate");
//		    
//		    WebElement emailfield = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[4]/input"));
//		    emailfield.sendKeys("tej@"); 
//
//		    WebElement registerButton = driver.findElement(By.xpath("/html/body/div/div/div/main/div/button"));
//		    registerButton.click();
//
//		    Alert alert = driver.switchTo().alert();
//		    
//		    String alertText = alert.getText();
//		    assertEquals("Please enter a valid email address.", alertText, "Please enter a valid email address.");
//
//		    alert.accept();
//	    }
//
//	    @Test
//	    void testPasswordWithoutSpecialCharacter() {
//		    driver.get("http://localhost:3000/educatorcreate");
//		    
//		    WebElement passwordfield = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[5]/input"));
//		    passwordfield.sendKeys("123tej"); 
//		    
//		    WebElement registerButton = driver.findElement(By.xpath("/html/body/div/div/div/main/div/button"));
//		    registerButton.click();
//		    
//		    Alert alert = driver.switchTo().alert();
//		    
//		    String alertText = alert.getText();
//		    assertEquals("Password must be at least 8 characters long, include one uppercase letter, one number, and one special character.", alertText, "Password must be at least 8 characters long, include one uppercase letter, one number, and one special character.");
//
//		    alert.accept();
//	    	}
//
//	    @Test
//	    void testPasswordWithLessThan8Characters() {
//		    driver.get("http://localhost:3000/educatorcreate");
//		    
//		    WebElement passwordfield = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[5]/input"));
//		    passwordfield.sendKeys("123Ae."); 
//		    
//		    WebElement registerButton = driver.findElement(By.xpath("/html/body/div/div/div/main/div/button"));
//		    registerButton.click();
//		    
//		    Alert alert = driver.switchTo().alert();
//		    
//		    String alertText = alert.getText();
//		    assertEquals("Password must be at least 8 characters long, include one uppercase letter, one number, and one special character.", alertText, "Password must be at least 8 characters long, include one uppercase letter, one number, and one special character.");
//
//		    alert.accept();
//	    	}
//
//	    @Test
//	    void testEmptyQualificationField() {
//		    driver.get("http://localhost:3000/educatorcreate");
//		    
//		    WebElement qualificationfield = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[6]/input"));
//		    qualificationfield.sendKeys(""); 
//		    
//		    WebElement registerButton = driver.findElement(By.xpath("/html/body/div/div/div/main/div/button"));
//		    registerButton.click();
//		    
//		    Alert alert = driver.switchTo().alert();
//		    
//		    String alertText = alert.getText();
//		    assertEquals("Please enter a valid qualification (letters and spaces only).", alertText, "Please enter a valid qualification (letters and spaces only).");
//
//		    alert.accept();
//	    }
//
//	    @Test
//	    void testFormSubmissionWithValidData() {
//	    	driver.get("http://localhost:3000/educatorcreate");
//	    	
//	        WebElement fullnamField = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[1]/input"));
//	        fullnamField.sendKeys("Teja");
//
//	        WebElement agField = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[2]/input"));
//	        agField.sendKeys("26");
//
//	        WebElement phneField = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[3]/input"));
//	        phneField.sendKeys("1234567890");
//
//	        WebElement emaiField = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[4]/input"));
//	        emaiField.sendKeys("Teja@example.com");
//
//	        WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[5]/input"));
//	        passwordField.sendKeys("Teja@1234");
//
//	        WebElement qualificatioField = driver.findElement(By.xpath("/html/body/div/div/div/main/div/div[6]/input"));
//	        qualificatioField.sendKeys("Master's in testing");
//
//	        WebElement registeButton = driver.findElement(By.xpath("/html/body/div/div/div/main/div/button"));
//	        registeButton.click();
//	        
//	        Alert alert = driver.switchTo().alert();
//		    
//		    String alertText = alert.getText();
//		    assertEquals("Educator registered successfully!", alertText, "Educator registered successfully!");
//
//		    alert.accept();
//	    }
//
//
//
//
//
//}
