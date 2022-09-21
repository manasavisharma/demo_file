package com.java.SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class MoveTo {

    public static void main(String[] args) {

        //=====Working with amazon
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.in/");
        driver.manage().window().maximize();

        Actions acti = new Actions(driver);

        WebElement sign = driver.findElement(By.xpath(".//span[contains(text(), 'Hello, sign in')]"));
        acti.moveToElement(sign).doubleClick().build().perform();
        acti.doubleClick().build().perform();



        //=====Working on FaceBook.
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.facebook.com/");
//
//        Actions act = new Actions(driver);
//
//        WebElement unm = driver.findElement(By.id("email"));
//        act.moveToElement(unm).sendKeys("test@gmail.com").build().perform();
//        WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
//        pass.click();
//        act.moveToElement(pass).sendKeys("test").build().perform();
//        WebElement log = driver.findElement(By.xpath(".//button[contains(text(),'Log In')]"));
//
//        int x = log.getLocation().getX();
//        int y = log.getLocation().getY();
//
//        act.moveByOffset(x,y).click().build().perform();

    }
}
