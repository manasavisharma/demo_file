package com.java.SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");

        //Get Title.
        String title = driver.getTitle();
        System.out.println("Title is :" +title);

        //Get URL.
        System.out.println(driver.getCurrentUrl());
        driver.quit();

        //Get Element TageName
//        WebElement unm = driver.findElement(By.id("input"));
//        System.out.println(unm.getAttribute("id"));
//        System.out.println(unm.getTagName());

    }
}
