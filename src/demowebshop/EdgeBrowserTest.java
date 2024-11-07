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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class EdgeBrowserTest {
    private static WebDriver driver;

    public static void main(String[] args) {
        String browser = "firefox";  // Set the desired browser here: "chrome", "edge", or "firefox"

        // Initialize WebDriver based on the selected browser
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Soft\\Drivers\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Soft\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Soft\\Drivers\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else {
            System.out.println("Invalid browser specified.");
            return;
        }

        // Navigate to the base URL and perform operations
        navigateToBaseUrl();
        printTitle();
        printCurrentUrl();
        printPageSource();
        navigateToLoginPage();
        printCurrentUrl();
        navigateBackToHomePage();
        navigateToLoginPage();
        printCurrentUrl();
        refreshPage();
        login("test@example.com", "password123");
        closeBrowser();
    }

    public static void navigateToBaseUrl() {
        driver.get("https://demowebshop.tricentis.com/");
    }

    public static void printTitle() {
        System.out.println("Title of the page: " + driver.getTitle());
    }

    public static void printCurrentUrl() {
        System.out.println("Current URL: " + driver.getCurrentUrl());
    }

    public static void printPageSource() {
        System.out.println("Page Source: " + driver.getPageSource());
    }

    public static void navigateToLoginPage() {
        driver.navigate().to("https://demowebshop.tricentis.com/login");
    }

    public static void navigateBackToHomePage() {
        driver.navigate().back();
    }

    public static void refreshPage() {
        driver.navigate().refresh();
    }

    public static void login(String email, String password) {
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.cssSelector("input.login-button")).click();
    }

    public static void closeBrowser() {
        driver.quit();
    }
}
