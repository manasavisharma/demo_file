package com.java.SeleniumPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Aler111t {

    public static void main(String[] args) throws InterruptedException {

        //=====Working on Booking(For Alerts).
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ksrtc.in/oprs-web/");

        driver.findElement(By.xpath(".//button[contains(text(),'Search for Bus')]")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(1000));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        Thread.sleep(500);
        alert.accept();


    }

}
