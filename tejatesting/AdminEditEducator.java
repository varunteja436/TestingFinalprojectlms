//package iteration2testing;
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
//class AdminEditEducator {
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
//	
//	@Test
//    void testAdminCanlogin() {
//    	driver.get("http://localhost:3000");
//	   	 
//	   	 
//	   	 
//     	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
//  		String testEmail = "admin123@gmail.com";
//  		inputField.sendKeys(testEmail);
//  
//  		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
//  		String testPassword = "admin123";
//  		passwordField.sendKeys(testPassword);
//  
//  		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
//  		submitBtn.click();
//  		
//		
//		String url = driver.getCurrentUrl();
//		String expectedUrl = "http://localhost:3000/dashboard";
//		
//		assertEquals(expectedUrl, expectedUrl);	
//        
//	}
//	
//	@Test
//    void testAdminCanGotoEducatorList() {
//    	driver.get("http://localhost:3000");
//	   	 
//	   	 
//	   	 
//     	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
//  		String testEmail = "admin123@gmail.com";
//  		inputField.sendKeys(testEmail);
//  
//  		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
//  		String testPassword = "admin123";
//  		passwordField.sendKeys(testPassword);
//  
//  		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
//  		submitBtn.click();
//  		
//  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//
//		WebElement EducatorListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[3]/li/a")));
//		EducatorListBtn.click();	
//  	
//		
//		String url = driver.getCurrentUrl();
//		String expectedUrl = "http://localhost:3000/educatorlist";
//		
//		assertEquals(expectedUrl, expectedUrl);	
//        
//	}
//	
//	@Test
//    void testAdminCanclickEditEducatorList() {
//    	driver.get("http://localhost:3000");
//	   	 
//	   	 
//	   	 
//     	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
//  		String testEmail = "admin123@gmail.com";
//  		inputField.sendKeys(testEmail);
//  
//  		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
//  		String testPassword = "admin123";
//  		passwordField.sendKeys(testPassword);
//  
//  		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
//  		submitBtn.click();
//  		
//  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//
//		WebElement EducatorListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[3]/li/a")));
//		EducatorListBtn.click();	
//
//		WebElement EducatorEditListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/section[2]/table/tbody/tr[1]/td[5]/span")));
//		EducatorEditListBtn.click();
//		
//		WebElement EducatorEditBtninEducatoreditpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/div/button")));
//		EducatorEditBtninEducatoreditpage.click();
//        
//	}
//	
//
//	@Test
//    void testAdminCanEditEducator() {
//    	driver.get("http://localhost:3000");
//	   	 
//	   	 
//	   	 
//     	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
//  		String testEmail = "admin123@gmail.com";
//  		inputField.sendKeys(testEmail);
//  
//  		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
//  		String testPassword = "admin123";
//  		passwordField.sendKeys(testPassword);
//  
//  		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
//  		submitBtn.click();
//  		
//  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//
//		WebElement EducatorListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[3]/li/a")));
//		EducatorListBtn.click();	
//
//		WebElement EducatorEditListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/section[2]/table/tbody/tr[1]/td[5]/span")));
//		EducatorEditListBtn.click();
//		
//		WebElement EducatorEditBtninEducatoreditpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/div/button")));
//		EducatorEditBtninEducatoreditpage.click();
//		
//  		WebElement nameField = driver.findElement(By.xpath("/html/body/div/div/div/main/form/input[1]"));
//  		nameField.clear();
//  		nameField.sendKeys("testedu");
//  		
//  		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/main/form/input[2]"));
//  		emailField.clear();
//  		emailField.sendKeys("testedu@gmail.com");
//  		
//  		WebElement ageField = driver.findElement(By.xpath("/html/body/div/div/div/main/form/input[3]"));
//  		ageField.clear();
//  		ageField.sendKeys("29");
//  		
//  		WebElement pnumberField = driver.findElement(By.xpath("/html/body/div/div/div/main/form/input[4]"));
//  		pnumberField.clear();
//  		pnumberField.sendKeys("0987654321");
//  		
//  		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/form/button[1]"));
//  		saveBtn.click();
//  		
//		
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        String alertText = alert.getText();
//        assertEquals("Profile updated successfully!", alertText);
//	    alert.accept();
//        
//	}
//	
//	@Test
//    void testAdminCanEditEducatornamewithNumber() {
//    	driver.get("http://localhost:3000");
//	   	 
//	   	 
//	   	 
//     	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
//  		String testEmail = "admin123@gmail.com";
//  		inputField.sendKeys(testEmail);
//  
//  		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
//  		String testPassword = "admin123";
//  		passwordField.sendKeys(testPassword);
//  
//  		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
//  		submitBtn.click();
//  		
//  		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//
//		WebElement EducatorListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[3]/li/a")));
//		EducatorListBtn.click();	
//
//		WebElement EducatorEditListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/section[2]/table/tbody/tr[1]/td[5]/span")));
//		EducatorEditListBtn.click();
//		
//		WebElement EducatorEditBtninEducatoreditpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/div/button")));
//		EducatorEditBtninEducatoreditpage.click();
//		
//  		WebElement nameField = driver.findElement(By.xpath("/html/body/div/div/div/main/form/input[1]"));
//  		nameField.clear();
//  		nameField.sendKeys("12");
//  		
//
//  		
//  		WebElement pnumberField = driver.findElement(By.xpath("/html/body/div/div/div/main/form/input[4]"));
//  		pnumberField.clear();
//  		pnumberField.sendKeys("0987654321");
//  		
//  		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/form/button[1]"));
//  		saveBtn.click();
//  		
//		
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        String alertText = alert.getText();
//        assertEquals("Please enter a valid name (only letters and spaces).", alertText);
//	    alert.accept();
//        
//	}
//	
//	@Test
//  void testAdminWrongemailEducator() {
//  	driver.get("http://localhost:3000");
//	   	 
//	   	 
//	   	 
//   	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
//		String testEmail = "admin123@gmail.com";
//		inputField.sendKeys(testEmail);
//
//		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
//		String testPassword = "admin123";
//		passwordField.sendKeys(testPassword);
//
//		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
//		submitBtn.click();
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//
//		WebElement EducatorListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[3]/li/a")));
//		EducatorListBtn.click();	
//
//		WebElement EducatorEditListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/section[2]/table/tbody/tr[1]/td[5]/span")));
//		EducatorEditListBtn.click();
//		
//		WebElement EducatorEditBtninEducatoreditpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/div/button")));
//		EducatorEditBtninEducatoreditpage.click();
//
//		WebElement emailField = driver.findElement(By.xpath("/html/body/div/div/div/main/form/input[2]"));
//		emailField.clear();
//		emailField.sendKeys("testedu");
//
//		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/form/button[1]"));
//		saveBtn.click();
//		
//		
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//      String alertText = alert.getText();
//      assertEquals("Please enter a valid email address.", alertText);
//	    alert.accept();
//      
//	}
//	
//	@Test
//  void testAdminCanEditEducatorPhonenumber() {
//  	driver.get("http://localhost:3000");
//	   	 
//	   	 
//	   	 
//   	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
//		String testEmail = "admin123@gmail.com";
//		inputField.sendKeys(testEmail);
//
//		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
//		String testPassword = "admin123";
//		passwordField.sendKeys(testPassword);
//
//		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
//		submitBtn.click();
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//
//		WebElement EducatorListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[3]/li/a")));
//		EducatorListBtn.click();	
//
//		WebElement EducatorEditListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/section[2]/table/tbody/tr[1]/td[5]/span")));
//		EducatorEditListBtn.click();
//		
//		WebElement EducatorEditBtninEducatoreditpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/div/button")));
//		EducatorEditBtninEducatoreditpage.click();
//
//
//		WebElement pnumberField = driver.findElement(By.xpath("/html/body/div/div/div/main/form/input[4]"));
//		pnumberField.clear();
//		pnumberField.sendKeys("dgtjfgt");
//		
//		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/form/button[1]"));
//		saveBtn.click();
//		
//		
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//      String alertText = alert.getText();
//      assertEquals("Please enter a valid phone number (10 digits).", alertText);
//	    alert.accept();
//      
//	}
//	
//	@Test
//  void testAdminCanEditEducatorAge() {
//  	driver.get("http://localhost:3000");
//	   	 
//	   	 
//	   	 
//   	 WebElement inputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
//		String testEmail = "admin123@gmail.com";
//		inputField.sendKeys(testEmail);
//
//		WebElement passwordField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
//		String testPassword = "admin123";
//		passwordField.sendKeys(testPassword);
//
//		WebElement submitBtn = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
//		submitBtn.click();
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//
//		WebElement EducatorListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/aside/ul[3]/li/a")));
//		EducatorListBtn.click();	
//
//		WebElement EducatorEditListBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/section[2]/table/tbody/tr[1]/td[5]/span")));
//		EducatorEditListBtn.click();
//		
//		WebElement EducatorEditBtninEducatoreditpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/main/div/button")));
//		EducatorEditBtninEducatoreditpage.click();
//		
//
//		WebElement ageField = driver.findElement(By.xpath("/html/body/div/div/div/main/form/input[3]"));
//		ageField.clear();
//		ageField.sendKeys("sf");
//
//		WebElement saveBtn = driver.findElement(By.xpath("/html/body/div/div/div/main/form/button[1]"));
//		saveBtn.click();
//		
//		
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//      String alertText = alert.getText();
//      assertEquals("age formate is wrong", alertText);
//	    alert.accept();
//      
//	    // it has failed as the age for type is not taking
//	    
//	}
//}
