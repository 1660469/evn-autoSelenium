package com.vietcas.models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InternalRegion {
    public InternalRegion(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private By titleMainPage = By.className(".MuiTypography-root.MuiTypography-subtitle1");

    public WebElement getTitleMainPage() {
        return driver.findElement(titleMainPage);
    }

}
