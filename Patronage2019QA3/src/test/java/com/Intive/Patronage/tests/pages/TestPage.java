package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestPage {

    private static String AUTOMATIONPRACTICE_URL = "http://automationpractice.com/index.php";
    private WebDriver driver;

    @FindBy(how = How.NAME, using = "search_query")
    public WebElement searchField;



    @FindBy (how = How.CLASS_NAME, using = "login")
    public WebElement signInButton;

    public TestPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openAutomationPage() {
        driver.get(AUTOMATIONPRACTICE_URL);
    }

    public void searchInAutomationpractice(String searchPhrase) {
        searchField.sendKeys(searchPhrase);
        searchField.sendKeys(Keys.ENTER);
    }


}
