/*
At first we will open chrome browser and load Google Home page
Then we will load youtube home page
Then navigate back to the Google home page
Then navigate forward to the Youtube page
And then refresh the page
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Navigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.google.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.youtube.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.navigate().back();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.navigate().forward();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.navigate().refresh();

        driver.navigate().to("https://www.geeksforgeeks.org/");
        Thread.sleep(2000);

        driver.quit();
    }

}
