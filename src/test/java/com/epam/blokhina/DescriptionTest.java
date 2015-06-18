package com.epam.blokhina;

import com.epam.blokhina.core.PropertyManager;
import com.epam.blokhina.pages.impl.MainPage;
import com.epam.blokhina.pages.steps.ConditionersSteps;
import com.epam.blokhina.pages.steps.MainSteps;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class DescriptionTest extends BaseTest {

    private ConditionersSteps conditionersSteps;

    @BeforeClass
    public void goToPage() {
        mainPage = new MainPage(driver);
        mainSteps = new MainSteps(driver);
        listPage = mainSteps.goToPage(mainPage.getConditionerLink());
        conditionersSteps = new ConditionersSteps(driver);
    }

    @Test
    public void sortByName() {
        assertTrue(conditionersSteps.verifyInfoOnPages(), "Verify description of product on different pages");
    }

    @AfterClass
    public void goToMainPage() {
        driver.get(PropertyManager.getPropertyByName("url"));
    }
}

