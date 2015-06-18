package com.epam.blokhina.pages.steps;

import com.epam.blokhina.helpers.CustomUtils;
import com.epam.blokhina.helpers.Waiter;
import com.epam.blokhina.pages.base.BaseSteps;
import com.epam.blokhina.pages.impl.ComparePage;
import com.epam.blokhina.pages.impl.ObjectPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class MicrowavesSteps extends BaseSteps {

    private ObjectPage objectPage;
    private ComparePage comparePage;

    private static final String COLOR_ATTRIBUTE_IN_COMPARSION = "class";
    private static final String VALUE_OF_ATTRIBUTE = "different";

    public MicrowavesSteps(WebDriver driver) {
        super(driver);
        objectPage = new ObjectPage(driver);
        comparePage = new ComparePage(driver);
    }

    public boolean verifyComparsion() {
        return compareMicrowavesParametres() && verifyThatDifferentProductOptionsMarked();
    }

    private boolean compareMicrowavesParametres() {
        List<String> listParametresFirst = getParametresMicrowave(listPage.getFirstMicrowave());
        List<String> listParametresSecond = getParametresMicrowave(listPage.getSecondMicrowave());
        return detailCompare(listParametresFirst, listParametresSecond);
    }

    private boolean verifyThatDifferentProductOptionsMarked() {
        List<WebElement> infoList = comparePage.getInfoOfBothProducts();
        for (int i = 0; i < infoList.size(); i += 3) {
            if (!compareWebElementsStringValues(infoList.get(i + 1), infoList.get(i + 2)))
                if (infoList.get(i).getAttribute(COLOR_ATTRIBUTE_IN_COMPARSION).equals(VALUE_OF_ATTRIBUTE)) return true;
        }
        return false;
    }

    private boolean compareWebElementsStringValues(WebElement first, WebElement second) {
        return first.getText().equalsIgnoreCase(second.getText());
    }

    private boolean detailCompare(List<String> listParametresFirst, List<String> listParametresSecond) {
        listPage.getAddToComparsionBtnFirst().click();
        listPage.getAddToComparsionBtnSecond().click();
        listPage.getGoToComparsion().click();
        Waiter.waitForPage(driver, comparePage.getFirstProductInfo().get(1));
        Waiter.waitForPage(driver, comparePage.getSecondProductInfo().get(1));
        return isDisplayedCorrectly(comparePage.getFirstProductInfo(), listParametresFirst) && isDisplayedCorrectly(comparePage.getSecondProductInfo(), listParametresSecond);
    }

    private boolean isDisplayedCorrectly(List<WebElement> webElementList, List<String> stringList) {
        List<String> webElementListToString = CustomUtils.getStrings(webElementList);
        return webElementListToString.containsAll(stringList);
    }


    private List<String> getParametresMicrowave(WebElement microwave) {
        microwave.click();
        List<WebElement> listWebElementParametres = objectPage.getProductDescription();
        List<String> listStringParametres = CustomUtils.getStrings(listWebElementParametres);
        objectPage.getGoToPrevPage().click();
        return listStringParametres;
    }

    }
