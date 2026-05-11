package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        // Launch Chrome Browser
        driver = new ChromeDriver();

        // Maximize Browser Window
        driver.manage().window().maximize();

        // Implicit Wait
        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        // Open Application
        driver.get("https://www.saucedemo.com/");
    }

    // Valid Login Test
    @Test
    public void validLoginTest() {

        // Enter Username
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        // Enter Password
        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        // Click Login Button
        driver.findElement(By.id("login-button"))
                .click();

        // Validate Login Success
        String pageTitle = driver.getTitle();

        Assert.assertEquals(pageTitle, "Swag Labs");

        System.out.println("Valid Login Test Passed");
    }

    // Invalid Login Test
    @Test
    public void invalidLoginTest() {

        // Enter Username
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        // Enter Wrong Password
        driver.findElement(By.id("password"))
                .sendKeys("wrongpassword");

        // Click Login Button
        driver.findElement(By.id("login-button"))
                .click();

        // Capture Error Message
        String errorMessage = driver.findElement(By.tagName("h3"))
                .getText();

        // Validate Error Message
        Assert.assertTrue(errorMessage.contains("Epic sadface"));

        System.out.println("Invalid Login Test Passed");
    }

    // Empty Username Test
    @Test
    public void emptyUsernameTest() {

        // Enter Password Only
        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        // Click Login Button
        driver.findElement(By.id("login-button"))
                .click();

        // Capture Error Message
        String errorMessage = driver.findElement(By.tagName("h3"))
                .getText();

        // Validate Error Message
        Assert.assertTrue(errorMessage
                .contains("Username is required"));

        System.out.println("Empty Username Test Passed");
    }

    @AfterMethod
    public void closeBrowser() throws InterruptedException {

        // Keep Browser Open For 3 Seconds
        Thread.sleep(3000);

        // Close Browser
        driver.quit();
    }
}