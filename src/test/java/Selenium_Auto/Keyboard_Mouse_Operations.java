package Selenium_Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Keyboard_Mouse_Operations
{
    @Test
    public void keyboard_mouse() throws InterruptedException, AWTException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:8080/login.do");
        Thread.sleep(3000);
        Robot r = new Robot();
        r.mouseMove(300,500);
        r.keyPress(KeyEvent.VK_M);
        r.keyRelease(KeyEvent.VK_M);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_H);
        r.keyRelease(KeyEvent.VK_H);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_A);
        Thread.sleep(3000);
        driver.close();

    }
}
