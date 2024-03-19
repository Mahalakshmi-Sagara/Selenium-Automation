package Selenium_Auto;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {
    public WebDriver driver;
    @Test
    public void screenshot() throws IOException {
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File sfile= ts.getScreenshotAs(OutputType.FILE);
        File dfile = new File("C:\\Users\\HP\\IdeaProjects\\Selenium_Automation\\Screenshots\\"+"Sh1.png");
        FileHandler.copy(sfile,dfile);
    }
}
