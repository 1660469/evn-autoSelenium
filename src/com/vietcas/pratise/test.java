package com.vietcas.pratise;

import com.vietcas.utils.Webdriver;
import org.openqa.selenium.WebDriver;

public class test {
    public static void main(String[] args) {
        WebDriver driver = Webdriver.getChromeDriver();
        driver.get("http://uat.evn-solar.com");
        System.out.println("quang");
    }
}
