package com.java.SeleniumPackage;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.Properties;


public class FileStream {

    public static void main(String[] args) throws IOException, BiffException {

//        Properties p1 = new Properties();
//        FileInputStream fils = new FileInputStream("C:\\Users\\pc\\Desktop\\demo");
//        p1.load(fils);
//
//        System.out.println(p1.getProperty("name"));
//        System.out.println(p1.getProperty("course"));
//        System.out.println(p1.getProperty("sub-course"));
//        System.out.println(p1.getProperty("time"));

        //Reading File through BufferedReader
//        String fpath = "File_Path";
//        BufferedReader bf = new BufferedReader(new FileReader(fpath));
//        String Startline; //start reading from starting
//        while ((Startline = bf.readLine())!=null) {
//            System.out.println(Startline);
//        }

        //Reading xls file
//        Workbook wb = Workbook.getWorkbook(new File(""));
//        Sheet sh = wb.getSheet("abc");
//
//        for (int i = 0; i < sh.getRows() ; i++) {
//            System.out.println("U name : " +sh.getCell(0, i).getContents());
//
//            System.out.println("Password : " +sh.getCell(1, i).getContents());
//        }

        //Reading xls file and sending data
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement unm = driver.findElement(By.id("email"));
        WebElement pass = driver.findElement(By.id("pass"));

        //Reading xls file
        Workbook wb = Workbook.getWorkbook(new File(""));
        Sheet sh = wb.getSheet("abc");

        for (int i = 0; i < sh.getRows() ; i++) {
            unm.sendKeys(sh.getCell(0, i).getContents());
            pass.sendKeys(sh.getCell(1, i).getContents());

//            Thread.sleep(2000);
            unm.clear();
            pass.clear();
        }

    }
}

