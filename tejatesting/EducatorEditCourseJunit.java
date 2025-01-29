package iteration1testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class EducatorEditCourseJunit {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.get("http://localhost:3000/educatoreditcourse");
    }

    @Test
    void testEmptyTitleField() {
        WebElement titleField = driver.findElement(By.name("title"));
        titleField.clear();
        titleField.sendKeys("");

        WebElement updateButton = driver.findElement(By.className("submit-buttonn"));
        updateButton.click();

        WebElement errorMessage = driver.findElement(By.className("error-message"));
        assertTrue(errorMessage.isDisplayed());
        assertEquals("Title is required.", errorMessage.getText());
    }

//    @Test
//    void testValidTitleField() {
//        WebElement titleField = driver.findElement(By.name("title"));
//        titleField.clear();
//        titleField.sendKeys("Test Course");
//
//        WebElement updateButton = driver.findElement(By.className("submit-buttonn"));
//        updateButton.click();
//
//        assertTrue(driver.getCurrentUrl().contains("educatorCourseList"));
//    }
//
//    @Test
//    void testInvalidStartDateInThePast() {
//        WebElement startDateField = driver.findElement(By.name("startDate"));
//        startDateField.clear();
//        startDateField.sendKeys("2022-01-01");
//
//        WebElement updateButton = driver.findElement(By.className("submit-buttonn"));
//        updateButton.click();
//
//        WebElement errorMessage = driver.findElement(By.className("error-message"));
//        assertTrue(errorMessage.isDisplayed());
//        assertEquals("Start date must be today or in the future.", errorMessage.getText());
//    }
//
//    @Test
//    void testValidStartDate() {
//        WebElement startDateField = driver.findElement(By.name("startDate"));
//        startDateField.clear();
//        startDateField.sendKeys("2025-01-15");
//
//        WebElement updateButton = driver.findElement(By.className("submit-buttonn"));
//        updateButton.click();
//
//        assertTrue(driver.getCurrentUrl().contains("educatorCourseList"));
//    }
//
//    @Test
//    void testEndDateBeforeStartDate() {
//        WebElement startDateField = driver.findElement(By.name("startDate"));
//        startDateField.clear();
//        startDateField.sendKeys("2025-01-15");
//
//        WebElement endDateField = driver.findElement(By.name("endDate"));
//        endDateField.clear();
//        endDateField.sendKeys("2025-01-10");
//
//        WebElement updateButton = driver.findElement(By.className("submit-buttonn"));
//        updateButton.click();
//
//        WebElement errorMessage = driver.findElement(By.className("error-message"));
//        assertTrue(errorMessage.isDisplayed());
//        assertEquals("End date cannot be before the start date.", errorMessage.getText());
//    }
//
//    @Test
//    void testValidEndDate() {
//        WebElement startDateField = driver.findElement(By.name("startDate"));
//        startDateField.clear();
//        startDateField.sendKeys("2025-01-15");
//
//        WebElement endDateField = driver.findElement(By.name("endDate"));
//        endDateField.clear();
//        endDateField.sendKeys("2025-02-15");
//
//        WebElement updateButton = driver.findElement(By.className("submit-buttonn"));
//        updateButton.click();
//
//        assertTrue(driver.getCurrentUrl().contains("educatorCourseList"));
//    }
//
//    @Test
//    void testAddScheduleWithoutSelectingDays() {
//        WebElement updateButton = driver.findElement(By.className("submit-buttonn"));
//        updateButton.click();
//
//        WebElement errorMessage = driver.findElement(By.className("error-message"));
//        assertTrue(errorMessage.isDisplayed());
//        assertEquals("Please select at least one day for the schedule.", errorMessage.getText());
//    }
//
//    @Test
//    void testInvalidTimeRangeInSchedule() {
//        WebElement startDateField = driver.findElement(By.name("startDate"));
//        startDateField.clear();
//        startDateField.sendKeys("2025-01-15");
//
//        WebElement endDateField = driver.findElement(By.name("endDate"));
//        endDateField.clear();
//        endDateField.sendKeys("2025-02-15");
//
//        Select weekDropdown = new Select(driver.findElement(By.name("selectedWeek")));
//        weekDropdown.selectByIndex(0);
//
//
//        WebElement mondayCheckbox = driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/div[5]/div/div[1]/input"));
//        mondayCheckbox.click();
//
//        WebElement startTimeField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/div[5]/div/div[1]/div/input[1]"));
//        startTimeField.sendKeys("09:00");
//
//        WebElement endTimeField = driver.findElement(By.xpath("/html/body/div/div/div/main/div[2]/div[5]/div/div[1]/div/input[2]"));
//        endTimeField.sendKeys("12:00");
//
//        WebElement updateButton = driver.findElement(By.className("submit-buttonn"));
//        updateButton.click();
//
//        WebElement errorMessage = driver.findElement(By.className("error-message"));
//        assertTrue(errorMessage.isDisplayed());
//        assertEquals("End time must be later than start time.", errorMessage.getText());
//    }
//
//    @Test
//    void testEmptyDescriptionField() {
//        WebElement descriptionField = driver.findElement(By.name("description"));
//        descriptionField.clear();
//        descriptionField.sendKeys("");
//
//        WebElement updateButton = driver.findElement(By.className("submit-buttonn"));
//        updateButton.click();
//
//        WebElement errorMessage = driver.findElement(By.className("error-message"));
//        assertTrue(errorMessage.isDisplayed());
//        assertEquals("Description is required.", errorMessage.getText());
//    }
//
//    @Test
//    void testValidFormSubmission() {
//        WebElement titleField = driver.findElement(By.name("title"));
//        titleField.clear();
//        titleField.sendKeys("Updated Course");
//
//        WebElement startDateField = driver.findElement(By.name("startDate"));
//        startDateField.clear();
//        startDateField.sendKeys("2025-01-15");
//
//        WebElement endDateField = driver.findElement(By.name("endDate"));
//        endDateField.clear();
//        endDateField.sendKeys("2025-02-15");
//
//        WebElement descriptionField = driver.findElement(By.name("description"));
//        descriptionField.clear();
//        descriptionField.sendKeys("Updated course description.");
//
//        WebElement updateButton = driver.findElement(By.className("submit-buttonn"));
//        updateButton.click();
//
//        assertTrue(driver.getCurrentUrl().contains("educatorCourseList"));
//    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
