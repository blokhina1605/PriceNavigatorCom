package com.epam.blokhina;

import com.epam.blokhina.core.PropertyManager;
import com.epam.blokhina.pages.impl.MainPage;
import com.epam.blokhina.pages.steps.MainSteps;
import com.epam.blokhina.pages.steps.WashersSteps;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class FilterPriceTest extends BaseTest {

    private WashersSteps washersSteps;

    @BeforeClass
    public void goToPage() {
        mainPage = new MainPage(driver);
        mainSteps = new MainSteps(driver);
        listPage = mainSteps.goToPage(mainPage.getWashersLink());
        washersSteps = new WashersSteps(driver);
    }

    @Test
    public void testPriceFilter(){
        assertTrue(washersSteps.selectPriceFilter().verifyPriceFilter(), "Verify that price filter shows all the items that should show up and does not show anything extra.");
    }

    @AfterClass
    public void goToMainPage() {
        driver.get(PropertyManager.getPropertyByName("url"));
    }
}
