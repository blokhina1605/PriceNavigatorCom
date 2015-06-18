package com.epam.blokhina.pages.steps;

import com.epam.blokhina.pages.base.BaseSteps;
import com.epam.blokhina.pages.impl.ListPage;
import com.epam.blokhina.pages.impl.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainSteps extends BaseSteps{

    private MainPage mainPage;

    public MainSteps(WebDriver driver) {
        super(driver);
    }

    public ListPage goToPage(WebElement link) {
        link.click();
        return new ListPage(driver);
    }
}
