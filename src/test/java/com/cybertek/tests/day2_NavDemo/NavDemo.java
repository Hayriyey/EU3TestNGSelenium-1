package com.cybertek.tests.day2_NavDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NavDemo {
    public static void main(String[] args) throws InterruptedException {


    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");
    driver.navigate().to("https://www.facebook.com");
    Thread.sleep(3000);

    driver.navigate().back();
    Thread.sleep(3000);
    driver.navigate().forward();
    driver.navigate().refresh();



    }}
