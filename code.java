// Rajeev Mishra - 12110321 - Case-Study code for MOVEINSYNC

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginMoveinsync {

    public static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rajeev\\selenium chromedriver\\chromedriver-win64\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/login");
        driver.manage().window().maximize();

        // Provide username
        WebElement username = driver.findElement(By.id("userName"));
        username.isDisplayed();
        username.isEnabled();
        username.sendKeys("rajeev_0");

        // Provide password
        WebElement password = driver.findElement(By.id("password"));
        password.isDisplayed();
        password.isEnabled();
        password.sendKeys("Rajeev@5");

        // Clicking on a login button
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.isDisplayed();
        loginButton.isEnabled();
        loginButton.click();

    }
}
