package com.epam.blokhina;

import com.epam.blokhina.core.DriverManager;
import com.epam.blokhina.core.PropertyManager;
import com.epam.blokhina.pages.impl.ListPage;
import com.epam.blokhina.pages.impl.MainPage;
import com.epam.blokhina.pages.steps.MainSteps;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class BaseTest {

    protected WebDriver driver;
    protected MainPage mainPage;
    protected MainSteps mainSteps;
    protected ListPage listPage;

    @BeforeTest
    public void setUp() {
        driver = DriverManager.getInstance();
        driver.get(PropertyManager.getPropertyByName("url"));

    }

    @AfterSuite
    public void quit() {
        driver.quit();
    }
}
