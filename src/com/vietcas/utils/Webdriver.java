package com.vietcas.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webdriver {
    public static WebDriver getChromeDriver(){
        String path = System.getProperty("user.dir");
        String ChromeDriverPath = path + "//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
        ChromeOptions options = new ChromeOptions();
        options.setProxy(null);
        return new ChromeDriver(options);

    }
}
