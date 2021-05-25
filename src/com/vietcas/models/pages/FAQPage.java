package com.vietcas.models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FAQPage {
    private WebDriver driver;

    public FAQPage(WebDriver driver) {
        this.driver = driver;
    }

    private By datCauHoiSelector = By.cssSelector("#root > div > div:nth-child(2) > div > div > div:nth-child(1) > div.MuiGrid-root.MuiGrid-container.MuiGrid-item.MuiGrid-justify-xs-flex-end.MuiGrid-grid-xs-4 > button");
    private By titleQuestionSelector = By.cssSelector("[name = \"title\"]");
    private By contentQuestionSelector = By.cssSelector("[name = \"title\"]");
    private By tagQuestionSelector = By.cssSelector("input[value='Liên hệ gần đây']");
    private By btnAddQuestionSelector = By.cssSelector("body > div.MuiDialog-root > div.MuiDialog-container.MuiDialog-scrollBody > div > div > form > div > div.MuiGrid-root.MuiGrid-container.MuiGrid-item.MuiGrid-justify-xs-flex-end > div > button.MuiButtonBase-root.MuiButton-root.MuiButton-contained.MuiButton-containedPrimary");

    public void clickBtnDatCauHoi() {
        driver.findElement(datCauHoiSelector).click();
    }

    public void inputTitleQuestion(String titleQuestion) {
        WebElement titleEle = driver.findElement(titleQuestionSelector);
        titleEle.sendKeys(titleQuestion);
    }

    public void inputcontentQuestion(String contentQuestion) {
        WebElement contentEle = driver.findElement(contentQuestionSelector);
//        System.out.println(contentQuestion.toString());
//            contentEle.click();
        contentEle.sendKeys(contentQuestion);
    }

    public void inputTagQuestion(String tagQuestion) {
        WebElement tagEle = driver.findElement(tagQuestionSelector);
        Select select = new Select(tagEle);
        select.selectByVisibleText(tagQuestion);
    }

    public void clickBtnAddQuestion() {
        driver.findElement(btnAddQuestionSelector).click();
    }
}
