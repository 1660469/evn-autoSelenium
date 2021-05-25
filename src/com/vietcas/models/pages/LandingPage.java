package com.vietcas.models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class LandingPage {
    private WebDriver driver;
    private By khuVucSelector = By.cssSelector("input[placeholder=\"Chọn Khu vực\"]");
    private By tinhThanhSelector= By.cssSelector("");
    private By quanHuyenSelector = By.cssSelector("");
    private By btnTimKiemSelector = By.cssSelector(".MuiBox-root.jss717 [type='submit']");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getKhuVucSelector() {
        WebElement khuVucEle = driver.findElement(khuVucSelector);
//        Select select = new Select(khuVucEle);
        khuVucEle.sendKeys("Khu vực miền Bắc", Keys.ARROW_DOWN, Keys.ENTER);

    }

    public void setTinhThanhSelector(By tinhThanhSelector) {
        this.tinhThanhSelector = tinhThanhSelector;
    }

    public void setQuanHuyenSelector(By quanHuyenSelector) {
        this.quanHuyenSelector = quanHuyenSelector;
    }

    public void clickBtnTimKiemSelector() {
        driver.findElement(btnTimKiemSelector).click();
    }
}
