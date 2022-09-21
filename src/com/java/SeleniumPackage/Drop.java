package com.java.SeleniumPackage;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //*********************************************************************************************************
//        driver.get("https://jqueryui.com/droppable/");
//        driver.manage().window().maximize();

//        Actions act = new Actions(driver);
//
//        driver.findElement(By.tagName("iframe"));
//        driver.switchTo().frame(0);
//        Thread.sleep(1000);
//
//        WebElement drag = driver.findElement(By.id("draggable"));
//        WebElement drop = driver.findElement(By.id("droppable"));
//
//        act.dragAndDrop(drag, drop).perform();
//        if(drop.getText().matches("Dropped!")){
//            System.out.println("Successfully Dropped");
//            driver.quit();
//        }else {
//            driver.quit();
//        }

        //*********************************************************************************************************
        //Keys

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        Actions acti = new Actions(driver);

        driver.findElement(By.id("email")).sendKeys("Manasavi");

        acti.click(driver.findElement(By.id("email")))
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .click(driver.findElement(By.id("pass")))
                .keyDown(Keys.CONTROL)
                .sendKeys("v")
                .keyUp(Keys.CONTROL)
                .build()
                .perform();

    }
}
