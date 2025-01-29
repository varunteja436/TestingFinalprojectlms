package lmstestingone;


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

class educatorfirsttimeloginpasswordtest {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/");
    }

    @Test
    void verifyFirstTimeLoginRedirectsToChangePasswordPage() {

        WebElement emailInput = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[1]"));
        emailInput.sendKeys("educator2@gmail.com");

        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/input[2]"));
        passwordInput.sendKeys("Firsttime@123");

        WebElement signinButton = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/button"));
        signinButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.urlContains("http://localhost:3000/educatorchangepassword"));

        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("http://localhost:3000/educatorchangepassword"), "Educator should be redirected to the change password page on first login.");
    }

    @Test
    void validatePasswordFieldRequirements() {
        driver.get("http://localhost:3000/educatorchangepassword");

        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/input"));
        passwordInput.sendKeys("educator");

        WebElement updatePasswordButton = driver.findElement(By.xpath("/html/body/div/div/div/div/div/button"));
        updatePasswordButton.click();

        WebElement errorMessage = driver.findElement(By.xpath("/html/body/div/div/div/div/div/p[3]"));
        assertTrue(errorMessage.isDisplayed(), "An error message should be displayed for an invalid password.");
        assertEquals("Password must be at least 6 characters long, include one uppercase letter, one lowercase letter, one digit, and one special character.", errorMessage.getText(), "The error message should describe password requirements.");
    }



    @Test
    void handleEmptyPasswordField() {
        driver.get("http://localhost:3000/educatorchangepassword");

        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/input"));
        passwordInput.sendKeys("");

        WebElement updatePasswordButton = driver.findElement(By.xpath("/html/body/div/div/div/div/div/button"));
        updatePasswordButton.click();

        WebElement errorMessage = driver.findElement(By.xpath("/html/body/div/div/div/div/div/p[3]"));
        assertTrue(errorMessage.isDisplayed(),"Password must be at least 6 characters long, include one uppercase letter, one lowercase letter, one digit, and one special character.");
        assertEquals("Password must be at least 6 characters long, include one uppercase letter, one lowercase letter, one digit, and one special character.", errorMessage.getText(), "The error message should describe password requirements.");
    }



    @Test
    void checkElementsOnChangePasswordPage() {
        driver.get("http://localhost:3000/educatorchangepassword");

        WebElement header = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[1]"));
        assertEquals("Change Password", header.getText(), "The page header should be 'Change Password'.");

        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/input"));
        assertTrue(passwordInput.isDisplayed(), "The password input field should be visible.");

        WebElement updatePasswordButton = driver.findElement(By.xpath("/html/body/div/div/div/div/div/button"));
        assertTrue(updatePasswordButton.isDisplayed(), "The update password button should be visible.");
    }
    


    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
