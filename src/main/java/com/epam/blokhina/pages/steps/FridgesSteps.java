package com.epam.blokhina.pages.steps;

import com.epam.blokhina.helpers.CustomUtils;
import com.epam.blokhina.pages.base.BaseSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class FridgesSteps extends BaseSteps {


    public FridgesSteps(WebDriver driver) {
        super(driver);
    }


    public boolean sortByProductPrice(List<WebElement> sortedByPriceList) {
        for (int i = 0; i < sortedByPriceList.size() - 1; i++) {
            double currentProductPrice = CustomUtils.selectPriceOnly(sortedByPriceList.get(i).getText());
            double followProductPrice = CustomUtils.selectPriceOnly(sortedByPriceList.get(i + 1).getText());
            if (currentProductPrice > followProductPrice) {
                return false;
            }
        }
        return true;
    }

    public boolean sortByProductName(List<WebElement> productsNames) {
        for (int i = 0; i < productsNames.size() - 1; i++) {
            String currentProductName = productsNames.get(i).getText();
            String followProductName = productsNames.get(i + 1).getText();
            if (currentProductName.compareTo(followProductName) > 0) {
                return false;
            }
        }
        return true;
    }

    public FridgesSteps clickSortByName() {
        listPage.getSortByName().click();
        return this;
    }

    public FridgesSteps clickSortByPrice() {
        listPage.getSortByPrice().click();
        return this;
    }

    public List<WebElement> getSortedByNameList() {
        return listPage.getProductNamesFromOnePageList();
    }

    public List<WebElement> getSortedByPriceList() {
        return listPage.getProductPricesFromOnePageList();
    }




}
