package com.epam.blokhina;

import com.epam.blokhina.core.PropertyManager;
import com.epam.blokhina.pages.impl.MainPage;
import com.epam.blokhina.pages.steps.BreadmakerSteps;
import com.epam.blokhina.pages.steps.MainSteps;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class WeightFilterTest extends BaseTest{

    private BreadmakerSteps breadmakerSteps;

    @BeforeClass
    public void goToPage() {
        mainPage = new MainPage(driver);
        mainSteps = new MainSteps(driver);
        listPage = mainSteps.goToPage(mainPage.getBreadmakerLink());
        breadmakerSteps = new BreadmakerSteps(driver);
    }

    @Test
    public void testWeightFilter(){
        assertTrue(breadmakerSteps.selectWeightFilter().verifyWeightFilter(), "Verify that weight filter shows all the items that should show up and does not show anything extra.");
    }

    @AfterClass
    public void goToMainPage() {
        driver.get(PropertyManager.getPropertyByName("url"));
    }
}
