package com.vietcas.pratise;

import com.vietcas.models.components.HeaderComponent;
import com.vietcas.models.pages.FAQPage;
import com.vietcas.models.pages.LoginPage;
import com.vietcas.utils.Url;
import com.vietcas.utils.Webdriver;
import org.openqa.selenium.WebDriver;

public class practiseFirst {
    public static void main(String[] args) {
        WebDriver driver = Webdriver.getChromeDriver();
        driver.get(Url.currentUrl("HOME_PAGE"));

        LoginPage loginPage = new LoginPage(driver);
        loginPage
                .clickBtnLoginOutSide();
        loginPage
                .inputUsername("nhathauquang@gmail.com")
                .inputPassword("Dinosys123")
                .clickBtnLogin();
//        InternalRegion internalRegion = new InternalRegion(driver);
//        String expectResult = "Các đối tượng chính";
//        System.out.println(driver.getCurrentUrl());
//        String actualresult = internalRegion.getTitleMainPage().getText();
//        Thread.sleep(3000);
//        System.out.println(actualresult);
//        Assert.assertEquals(actualresult, expectResult, "This is failed from tc login!");
        HeaderComponent headerComponent = new HeaderComponent(driver);
        headerComponent.clickHoiDapHeader();

        FAQPage faqPage = new FAQPage(driver);
        faqPage.clickBtnDatCauHoi();
        faqPage.inputTitleQuestion("test auto");
//        faqPage.inputcontentQuestion("test quato 01");
//        faqPage.inputTagQuestion("Liên hệ gần đây");
//        faqPage.clickBtnAddQuestion();

    }
}
