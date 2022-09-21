package com.java.SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //driver.get("https://www.google.co.in/");
        //=====Other way to launch the URL.
        driver.navigate().to("https://www.google.co.in/");

        driver.findElement(By.linkText("Images")).click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(1000);
        System.out.println("Back Done");

        driver.navigate().forward();
        Thread.sleep(1000);
        System.out.println("forward Done");

        driver.navigate().refresh();
        System.out.println("Refresh Done");

    }
}
