package com.epam.blokhina;

import com.epam.blokhina.core.PropertyManager;
import com.epam.blokhina.pages.impl.MainPage;
import com.epam.blokhina.pages.steps.FridgesSteps;
import com.epam.blokhina.pages.steps.MainSteps;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class SortFridgesTest extends BaseTest {

    private FridgesSteps fridgesSteps;

    @BeforeClass
    public void goToPage() {
        mainPage = new MainPage(driver);
        mainSteps = new MainSteps(driver);
        listPage = mainSteps.goToPage(mainPage.getFridgesLink());
        fridgesSteps = new FridgesSteps(driver);
    }

    @Test
    public void sortByName() {
        assertTrue(fridgesSteps.clickSortByName().sortByProductName(fridgesSteps.getSortedByNameList()), "Verify sort of product by name");
    }

    @Test
    public void sortByPrice() {
        assertTrue(fridgesSteps.clickSortByPrice().sortByProductPrice(fridgesSteps.getSortedByPriceList()), "Verify sort of product by price");
    }

    @AfterClass
    public void goToMainPage() {
        driver.get(PropertyManager.getPropertyByName("url"));
    }
}
