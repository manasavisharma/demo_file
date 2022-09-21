package com.java.SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FileDownloadJava {

    public static void main(String[] args) throws InterruptedException, AWTException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");

        driver.findElement(By.id ("input")).sendKeys("java download");
        driver.findElement(By.id ("input")).sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        driver.findElement(By.xpath("//h3[contains(text(),'Download Java for Windows')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[contains(text(),'Download Java')]")).click();

        //another step include if agree to download option is there after above click.
//        driver.findElement(By.xpath("Agree and start free download")).click();
//        Thread.sleep(2000);

        //to be used if pop appears to save file on screen at time of downloading after above step.
        Robot r = new Robot();

        r.keyPress(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_ENTER);

    }
}
