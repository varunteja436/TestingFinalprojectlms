package lmstestingone;

import static org.junit.jupiter.api.Assertions.*;
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

import java.time.Duration;

class educatorfirsttimeloginpasswordtestone {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/");
    }

    @Test
    void updatePasswordSuccessfully() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));


        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Email']")));
        emailInput.sendKeys("test@gmail.com");

        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        passwordInput.sendKeys("Test@123");

        WebElement signinButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Login']")));
        signinButton.click();


        WebElement newPasswordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter New Password']")));
        newPasswordInput.sendKeys("Test@12345");

        WebElement updatePasswordButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Update Password']")));
        updatePasswordButton.click();


        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        assertEquals("Password updated successfully!", alertText, "Alert message does not match expected text.");
        alert.accept();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}