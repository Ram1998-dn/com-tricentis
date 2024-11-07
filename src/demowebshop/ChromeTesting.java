package demowebshop;
/**
 *
 * BaseUrl = https://demowebshop.tricentis.com/
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demowebshop.tricentis.com/login ”
 * 7. Print the current URL.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current URL.
 * 11. Refresh the page.
 * 12. Enter the email in the email field.
 * 13. Enter the password in the password field.
 * 14. Click on the Login Button.
 * 15. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTesting {
    public void automateSteps() {
        // Set up the Chrome browser driver (make sure the path to chromedriver is correct)
        System.setProperty("webdriver.chrome.driver", "C:\\Soft\\Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Step 2: Open URL
        driver.get("https://demowebshop.tricentis.com/");

        // Step 3: Print the title of the page
        System.out.println("Page Title: " + driver.getTitle());

        // Step 4: Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Step 5: Print the page source
        System.out.println("Page Source: " + driver.getPageSource());

        // Step 6: Navigate to Login URL
        driver.navigate().to("https://demowebshop.tricentis.com/login");

        // Step 7: Print the current URL
        System.out.println("Current URL after navigation: " + driver.getCurrentUrl());

        // Step 8: Navigate back to the home page
        driver.navigate().back();

        // Step 9: Navigate to the login page again
        driver.navigate().forward();

        // Step 10: Print the current URL
        System.out.println("Current URL after navigating forward: " + driver.getCurrentUrl());

        // Step 11: Refresh the page
        driver.navigate().refresh();

        // Step 12: Enter the email in the email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("your-email@example.com");

        // Step 13: Enter the password in the password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("your-password");

        // Step 14: Click on the Login Button
        WebElement loginButton = driver.findElement(By.cssSelector("input.login-button"));
        loginButton.click();

        // Step 15: Close the browser
        driver.quit();
    }

    public static void main(String[] args) {
        // Creating an instance of the TricentisAutomation class and calling the automateSteps method
       ChromeTesting chromeTesting = new ChromeTesting();
        chromeTesting.automateSteps();



    }
}


