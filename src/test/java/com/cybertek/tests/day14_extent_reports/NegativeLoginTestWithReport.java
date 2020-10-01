package com.cybertek.tests.day14_extent_reports;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestWithReport extends TestBase {


    @Test
    public void wrongPassword(){

        extentLogger= report.createTest("Wrong Password Test");


        LoginPage lp=new LoginPage();
        extentLogger.info("Enter Username :user1");
        lp.usernameInput.sendKeys("user1");
        extentLogger.info("Enter Password :wrongPassword");
        // wrong Password
        lp.passwordInput.sendKeys("somepassword");
        extentLogger.info("Click Login");
        lp.loginBtn.click();
        extentLogger.info("Verify Page Url");

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa1.vytrack.com/user/login");
        extentLogger.pass("Wrong Password Test is Passed");

    }

    @Test
    public void wrongUsername(){
        extentLogger= report.createTest("Wrong Username Test");

        LoginPage lp=new LoginPage();
        extentLogger.info("Enter Username :Wrong username ");
        lp.usernameInput.sendKeys("wrongUser");
        extentLogger.info("Enter Password :CorrectPassword");

        // wrong Password
        lp.passwordInput.sendKeys("UserUser123");

        extentLogger.info("Click Login");

        lp.loginBtn.click();
        extentLogger.info("Verify Page Url");

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa1.vytrack.com/user/login");
        extentLogger.pass("Wrong Password Test is Passed");

    }

}
