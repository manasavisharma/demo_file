package com.java.SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.WeakHashMap;

public class Radio {

    public static void main(String[] args) throws InterruptedException {

        //=====Working on FaceBook.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjYzMTU3NDk3LCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");

        List<WebElement> gender = driver.findElements(By.name("sex"));

        int count = gender.size();
        System.out.println(count);

        for (int i = 0; i<count; i++) {
            String txt = gender.get(i).getText();
            System.out.println(txt);

            gender.get(i).click();
            Thread.sleep(1000);
        }

    }
}
