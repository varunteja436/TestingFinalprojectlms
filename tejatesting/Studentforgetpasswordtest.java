package pack1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.time.Duration;

class Studentforgetpasswordtest {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }
    
    

    @Test
    public void stupassword() {
        driver.get("http://localhost:3000");
        
        
        WebElement forgotpasswordlink = driver.findElement(By.xpath("/html/body/div/div/div/div/div/p[2]"));
        forgotpasswordlink.click();
        
        WebElement Enteremail = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/input"));
        Enteremail.sendKeys("student@gmail.com");
        
        WebElement sendresetlink = driver.findElement(By.xpath("/html/body/div/div/div/div/div/button"));
        sendresetlink.click();

        

        
    	}
    
    @Test
    void ResetButtonCheck_CustomErrorMessage() {

        driver.get("http://localhost:3000");


        WebElement forgotPasswordLink = driver.findElement(By.xpath("/html/body/div/div/div/div/div/p[2]"));
        forgotPasswordLink.click();

        WebElement emailInputField = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/input"));
        emailInputField.click();
        
        WebElement resetButton = driver.findElement(By.xpath("/html/body/div/div/div/div/div/button"));


        resetButton.click();

        WebElement errormessage = driver.findElement(By.xpath("/html/body/div/div/div/div/div/p[1]"));

        assertTrue(errormessage.isDisplayed(), "Please enter a valid email.");
    }

    
    @Test
     void checkForgotPasswordLink() {
        driver.get("http://localhost:3000");

        WebElement forgotPasswordLink = driver.findElement(By.xpath("/html/body/div/div/div/div/div/p[2]"));

        assertTrue(forgotPasswordLink.isDisplayed(), "'Forgot Password' link should be visible.");
        assertTrue(forgotPasswordLink.isEnabled(), "'Forgot Password' link should be clickable.");
    }

             
    @Test
     void resetPasswordLinkNavigation() {
        driver.get("http://localhost:3000/");

        WebElement forgotPasswordLink = driver.findElement(By.xpath("/html/body/div/div/div/div/div/p[2]"));
        forgotPasswordLink.click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.urlContains("http://localhost:3000/forgotpassword"));  

        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("http://localhost:3000/forgotpassword"), "User should be redirected to the reset password page.");
    }
    
      
     

       @AfterEach
       void tearDown() {
           driver.quit();
       }

}

