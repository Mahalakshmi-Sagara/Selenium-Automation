package Selenium_Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyUNPWDAlignment
{
    @Test
    public void verify_un_pwd_text_box()
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:8080/login.do");
        WebElement unTB = driver.findElement(By.id("username"));
        int un_x = unTB.getLocation().getX();
        int un_width = unTB.getSize().getWidth();

    }
}
