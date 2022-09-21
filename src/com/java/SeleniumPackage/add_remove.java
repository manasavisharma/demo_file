package com.java.SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class add_remove {

    public static void main(String[] args) throws InterruptedException {

        //=====Working on Booking(For Alerts).
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Add Element')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Delete')]")).click();
        Thread.sleep(2000);
        driver.quit();


    }
}
