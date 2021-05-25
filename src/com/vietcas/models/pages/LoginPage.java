package com.vietcas.models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage {


    private WebDriver driver;
    private By loginBtnOutSide = By.cssSelector(".MuiButton-label");
    private By usernameSelector = By.cssSelector("[name=\"username\"]");
    private By passwordSelector = By.cssSelector("[name=\"password\"]");
    private By loginBtnSelector = By.cssSelector(".MuiButtonBase-root.MuiButton-root.MuiButton-contained.btnLogin.MuiButton-containedSecondary");

//    WebDriverWait wait = new WebDriverWait(driver, 30);
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
//    public LoginPage waitLogin(){
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        driver.findElement(loginBtnOutSide);
//        return this;
//    }
    //    By usernameSelector = By.cssSelector(".MuiTypography-root.titleBanner.MuiTypography-h5.MuiTypography-gutterBottom.MuiTypography-alignCenter");
    public LoginPage clickBtnLoginOutSide() {
        driver.findElement(loginBtnOutSide).click();
        return this;
    }

    public LoginPage inputUsername(String username) {
        WebElement userNameEle = driver.findElement(usernameSelector);
        userNameEle.sendKeys(username);
        return this;
    }

    public LoginPage inputPassword(String password) {
        WebElement passwordEle = driver.findElement(passwordSelector);
        passwordEle.sendKeys(password);
        return this;
    }

    public LoginPage clickBtnLogin(){
        driver.findElement(loginBtnSelector).click();
        return this;
    }
}
