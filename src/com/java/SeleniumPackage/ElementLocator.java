package com.java.SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocator {

    public static void main(String[] args) throws InterruptedException {

        //=====Working on FaceBook.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //=====Element Locator for ID.
        WebElement unm = driver.findElement(By.id("email"));
        unm.sendKeys("send@gmail.com");

        //=====Element Locator for name.
        driver.findElement(By.name("pass")).sendKeys("test");
        driver.findElement(By.name("login")).click();

        //=====Element LinkText
//        driver.findElement(By.linkText("Create a Page")).click();
//        driver.findElement(By.partialLinkText("Data")).click();        //as text is take regardless of link even the...
                                                   //... text got change in future this will work if first word is DATA.
//        driver.close();
//        driver.quit();

        //=====Element Locator XPath
        //absoulte -- using attributes  ---  //*[@id="email"]...(* can be change with any elementLocator to customize Xpath.
        //relative -- based on  position

//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Welcome");

        /*
        //tagname[@attribute='value of Attribute']
        Example:- //input[@id='identifierld']
         */

        //=====Get Element TageName
//        WebElement unm = driver.findElement(By.id("email"));
//        System.out.println(unm.getAttribute("id"));
//        System.out.println(unm.getTagName());

        //=====Get Element Image
//        WebElement uimng = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
//        System.out.println(uimng.isDisplayed());
//        System.out.println(uimng.isEnabled());
//        System.out.println(uimng.isSelected());

        //=====clear
//        WebElement unm = driver.findElement(By.id("email"));
//        unm.sendKeys("send@gmail.com");

//        WebElement unm = driver.findElement(By.id("email"));
//        unm.sendKeys("Welcome");
//        Thread.sleep(2000);
//        unm.clear();
//        unm.sendKeys("send@gmail.com");

    }
}
