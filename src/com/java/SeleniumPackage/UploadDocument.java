package com.java.SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadDocument {

    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
        Thread.sleep(1000);
        Robot r = new Robot();

        driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).click();
        r.setAutoDelay(1000);

        StringSelection ss = new StringSelection("C:\\Users\\pc\\Desktop\\offer letter ganesh");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);

        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

    }
}
