package com.epam.blokhina.pages.base;

import com.epam.blokhina.pages.impl.ListPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Yevheniia_Blokhina on 6/8/2015.
 */
public abstract class BaseSteps {
    BasePage basePage;
    protected WebDriver driver;
    protected ListPage listPage;

    public BaseSteps(WebDriver driver) {
        this.driver = driver;
        this.listPage = new ListPage(driver);
    }

    public BasePage goToPage(WebElement link) {
        link.click();
        return new ListPage(driver);
    }
}
