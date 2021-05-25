package com.vietcas.pratise;

import com.vietcas.models.pages.LandingPage;
import com.vietcas.utils.Url;
import com.vietcas.utils.Webdriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class landingPageSearch {
    @Test
    public void landingpageSearch() {
        WebDriver driver = Webdriver.getChromeDriver();
        driver.get("http://uat.evn-solar.com");

        LandingPage landingPage = new LandingPage(driver);
        landingPage.getKhuVucSelector();
        landingPage.clickBtnTimKiemSelector();
        System.out.println("quang");
    }
}
