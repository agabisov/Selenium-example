package com.selenium.example;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * Created by Lenovo on 08.01.2017.
 */
public class SetupProperties {
    private WebDriver driver;
    public SetupProperties(WebDriver driver){
        this.driver = driver;
    }

    By projectTabLocator = By.cssSelector("#menu_projects>a");
    By downloadTabLocator = By.cssSelector("#menu_download>a");
    By documentationTabLocator = By.cssSelector("#menu_documentation>a");
    By supportTabLocator = By.cssSelector("#menu_support>a");
    By aboutTabLocator = By.cssSelector("#menu_about>a");

    By locatorForHeader = By.cssSelector("#mainContent>h2");//locator for headers: Projects, Download, Help
    By headerForDocumentation = By.cssSelector("#selenium-documentation>h1");
    By headerForSupport = By.cssSelector("#mainContent>h1");

    //////////////-----Project Tab-----///////////////////
    public void clickOnProjectTab(){
        driver.findElement(projectTabLocator).click();
        assertThat(driver.findElement(projectTabLocator).isEnabled(),equalTo(true));//test that tab is exist
        assertThat(driver.findElement(projectTabLocator).getText(),equalTo("Projects"));//test that name of the link is "Projects"
        assertThat(driver.findElement(locatorForHeader).getText(),equalTo("Selenium Projects"));//test that check is active tab or not
    }
    /////////////------Download Tab------///////////
    public void clickOnDownloadTab(){
        driver.findElement(downloadTabLocator).click();
        assertThat(driver.findElement(downloadTabLocator).isEnabled(),equalTo(true));
        assertThat(driver.findElement(downloadTabLocator).getText(),equalTo("Download"));
        assertThat(driver.findElement(locatorForHeader).getText(),equalTo("Downloads"));//test that check is active tab or not
    }
    /////////////------Documentation Tab------///////////
    public void clickOnDocumentTab(){
        driver.findElement(documentationTabLocator).click();
        assertThat(driver.findElement(documentationTabLocator).isEnabled(),equalTo(true));
        assertThat(driver.findElement(documentationTabLocator).getText(),equalTo("Documentation"));
        assertThat(driver.findElement(headerForDocumentation).getText(),equalTo("Selenium Documentation"));//test that check is active tab or not
    }
    /////////////------Support Tab------///////////
    public void clickOnSupportTab(){
        driver.findElement(supportTabLocator).click();
        assertThat(driver.findElement(supportTabLocator).isEnabled(),equalTo(true));
        assertThat(driver.findElement(supportTabLocator).getText(),equalTo("Support"));
        assertThat(driver.findElement(headerForSupport).getText(),equalTo("Getting Help"));//test that check is active tab or not
    }
    /////////////------About Tab------///////////
    public void clickOnAboutTab(){
        driver.findElement(aboutTabLocator).click();
        assertThat(driver.findElement(aboutTabLocator).isEnabled(),equalTo(true));
        assertThat(driver.findElement(aboutTabLocator).getText(),equalTo("About"));
        assertThat(driver.findElement(locatorForHeader).getText(),equalTo("About Selenium"));//test that check is active tab or not
    }
}

