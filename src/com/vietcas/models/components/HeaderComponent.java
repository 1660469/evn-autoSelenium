package com.vietcas.models.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HeaderComponent {
    private WebDriver driver;
    public HeaderComponent(WebDriver driver) {
        this.driver = driver;
    }
    private By menuHeaderSelector = By.cssSelector(".MuiGrid-root.MuiGrid-container.MuiGrid-wrap-xs-nowrap.MuiGrid-align-items-xs-center.MuiGrid-justify-xs-flex-end .MuiGrid-root.wrap-menu.MuiGrid-item");
    final int MENUHEADER_FIRST_INDEX = 0;
    final int MENUHEADER_SECOND_INDEX = 1;

    public void clickHoiDapHeader() {
        List<WebElement> menuHeaderGroup = driver.findElements(menuHeaderSelector);
        menuHeaderGroup.get(MENUHEADER_SECOND_INDEX).click();
    }
}
