package com.selenium.example;

import org.testng.annotations.Test;

/**
 * Created by agab on 12/26/2016.
 */
public class SeleniumTabsClassTest extends SetSettings{
    @Test
    public void openProjectsTest(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.clickOnProjectTab();
        System.out.println("Test for Projects tab was running");
    }
    @Test
    public void openDownloadTest(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.clickOnDownloadTab();
        System.out.println("Test for Download tab was running");
    }
    @Test
    public void openDocumentationTest(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.clickOnDocumentTab();
        System.out.println("Test for Documentation tab was running");
    }
    @Test
    public void openSupportTest(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.clickOnSupportTab();
        System.out.println("Test for Support tab was running");
    }
    @Test
    public void openAboutTest(){
        SetupProperties setupProperties = new SetupProperties(getDriver());
        setupProperties.clickOnAboutTab();
        System.out.println("Test for About tab was running");
    }
}
