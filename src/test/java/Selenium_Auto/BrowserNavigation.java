package Selenium_Auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserNavigation
{
    @Test
    public void navigation() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.instagram.com/");
        driver.navigate().to("https://www.myntra.com/login");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.close();

    }
}
