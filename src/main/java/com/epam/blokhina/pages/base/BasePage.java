package com.epam.blokhina.pages.base;

import com.epam.blokhina.core.DriverManager;
import com.epam.blokhina.core.WebDriverFactory;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by Yevheniia_Blokhina on 6/8/2015.
 */
public abstract class BasePage {
    @Getter
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
