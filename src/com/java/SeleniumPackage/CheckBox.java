package com.java.SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.in/");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/span[1]/div[1]/div[1]/div[1]/div[6]/ul[8]/li[4]/span[1]/a[1]/div[1]/label[1]/i[1]")).click();

    }
}
