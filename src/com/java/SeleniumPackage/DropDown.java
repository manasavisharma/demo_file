package com.java.SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DropDown {

    public static void main(String[] args) {

        //=====Working on FaceBook.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.facebook.com/reg/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjYzMTU3NDk3LCJjYWxsc2l0ZV9pZCI6MzYzOTY5MDQ0ODc4OTI4fQ%3D%3D");

        driver.get("https://en-gb.facebook.com/");
//        driver.findElement(By.xpath("//a[@id='u_0_0_0P']")).click();
        driver.findElement(By.xpath(".//a[contains(text(),'Create New Account')]")).click();
        System.out.println("Account Created");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.className("_n3")));

        driver.findElement(By.name("firstname")).sendKeys("Hello");

        //Getting Date of birthday.
//        WebElement day = driver.findElement(By.id("day"));
//        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
//
//        Select d1 = new Select(day);
//        d1.selectByIndex(3);
////        d1.selectByValue("2");
////        d1.selectByVisibleText("Day");
//        System.out.println(day.getAttribute("value"));
//
//        //Get value of all elements in dropdown
//        List<WebElement> dd = d1.getOptions();
//        System.out.println(dd.size());
//
//        for (int i = 0; i< dd.size(); i++) {
//            String txt = dd.get(i).getText();
//            System.out.println(txt);
//            dd.get(i).click();
//        }

    }
}
