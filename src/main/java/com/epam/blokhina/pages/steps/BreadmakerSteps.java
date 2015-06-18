package com.epam.blokhina.pages.steps;

import com.epam.blokhina.helpers.CustomUtils;
import com.epam.blokhina.pages.base.BaseSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class BreadmakerSteps extends BaseSteps {

    private static final String DESCRIPTION_WEIGHT_FILTER = "Регулировка веса";

    public BreadmakerSteps(WebDriver driver) {
        super(driver);
    }



    public boolean verifyBrandFilter() {
        List<String> brandList = CustomUtils.getStrings(listPage.getBrandFilter());
        List<String> nameList = CustomUtils.getStrings(listPage.getProductNamesFromOnePageList());
        return isAllBrandsPresent(brandList, nameList);
    }

    public BreadmakerSteps selectBrand() {
        List<WebElement> btnBrands = listPage.getBrandFilter();
        btnBrands.forEach(WebElement::click);
        return this;
    }

    private boolean isAllBrandsPresent(List<String> brandList, List<String> nameList) {
        List<String> helpNameList = new ArrayList<>();
        for (String name : nameList) {
            helpNameList.addAll(brandList.stream().filter(name::startsWith).map(brand -> name).collect(Collectors.toList()));
        }
        return helpNameList.containsAll(nameList);
    }




    public BreadmakerSteps selectWeightFilter() {
        listPage.getWeightFilter().click();
        return this;
    }

    public boolean verifyWeightFilter() {
        List<String> shortDescriptions = CustomUtils.getStrings(listPage.getShortDescriptions());
        for (String desc : shortDescriptions) {

            if (desc.contains(DESCRIPTION_WEIGHT_FILTER)) return true;
        }
        return false;
    }

}
