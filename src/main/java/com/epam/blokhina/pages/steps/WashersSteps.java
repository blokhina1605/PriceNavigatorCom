package com.epam.blokhina.pages.steps;

import com.epam.blokhina.helpers.CustomUtils;
import com.epam.blokhina.pages.base.BaseSteps;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class WashersSteps extends BaseSteps {

    public WashersSteps(WebDriver driver) {
        super(driver);
    }


    public boolean verifyPriceFilter() {
        int min = Integer.parseInt(listPage.getMinPriceFilter().getText());
        int max = Integer.parseInt(listPage.getMaxPriceFilter().getText());
        List<String> priceList = CustomUtils.getStrings(listPage.getProductPricesFromOnePageList());
        for (String s : priceList) {
            double price = CustomUtils.selectPriceOnly(s);
            if (price > min && price < max) {
            } else return false;
        }
        return true;
    }

    public WashersSteps selectPriceFilter() {
        listPage.getMinPriceFilter().click();
        listPage.getMaxPriceFilter().click();
        return this;
    }
}
