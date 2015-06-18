package com.epam.blokhina;

import com.epam.blokhina.core.PropertyManager;
import com.epam.blokhina.pages.impl.MainPage;
import com.epam.blokhina.pages.steps.MainSteps;
import com.epam.blokhina.pages.steps.MicrowavesSteps;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class ComparsionTest extends BaseTest{

    private MicrowavesSteps microwavesSteps;

    @BeforeClass
    public void goToPage() {
        mainSteps = new MainSteps(driver);
        mainPage = new MainPage(driver);
        listPage = mainSteps.goToPage(mainPage.getMicrowaveLink());
        microwavesSteps = new MicrowavesSteps(driver);
    }

    @Test
    public void testComparsion(){
        assertTrue(microwavesSteps.verifyComparsion(), "Verify that difference between two products is highlighted and all info is");
    }

    @AfterClass
    public void goToMainPage() {
        driver.get(PropertyManager.getPropertyByName("url"));
    }
}
