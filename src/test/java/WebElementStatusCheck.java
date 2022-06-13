/*
Solution of problem
            1. Check whether any web element is displayed, enabled and selected.
*/


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class WebElementStatusCheck {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        // # Check if web element is displayed using isDisplayed() method

        Boolean elementDisplayed = driver.findElement(By.className("page-title")).isDisplayed();
        System.out.println("Page title Register is displayed - true / false? : "+elementDisplayed);

        // # Check if web element is enabled using isEnabled() method
        Boolean elementEnabled = driver.findElement(By.name("FirstName")).isEnabled();
        System.out.println("Input box First Name is enabled - true / false? : "+elementEnabled);

        // # Check if web element is enabled using isEnabled() method
        Boolean elementSelected = driver.findElement(By.id("gender-male")).isSelected();
        System.out.println("Radio button Gender Male is selected - true / false? : "+elementSelected);

        driver.quit();

    }

}
