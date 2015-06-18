package com.epam.blokhina.pages.steps;

import com.epam.blokhina.helpers.CustomUtils;
import com.epam.blokhina.pages.base.BaseSteps;
import com.epam.blokhina.pages.impl.ObjectPage;
import com.epam.blokhina.pages.impl.PricePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ConditionersSteps extends BaseSteps {

    private ObjectPage objectPage;


    private static final int QUANTITY_OF_CONDITIONERS = 5;
    private static final String SHORT_DESCRIPTION_FOR_REMOVE = "помещение";

    public ConditionersSteps(WebDriver driver) {
        super(driver);
        objectPage = new ObjectPage(driver);
    }

    public boolean verifyInfoOnPages() {
        List<WebElement> shortDescriptions = listPage.getShortDescriptions();
        List<String> fullDescription;
        for (int i = 0; i < QUANTITY_OF_CONDITIONERS; i++) {
            fullDescription = getFullDescriptionForObject(i);
            List<String> shore = convertShortDescription(shortDescriptions.get(i));
            if (!fullDescription.containsAll(shore)) return false;
        }
        return true;
    }

    private List<String> getFullDescriptionForObject(int index) {
        listPage.getConditionersName().get(index).click();
        List<String> fullDescription = CustomUtils.getStringDescriptionForWebElements(objectPage.getProductDescriptionWithHead());
        objectPage.getGoToPrevPage().click();
        return fullDescription;
    }

    private List<String> convertShortDescription(WebElement shortDescription) {
        List<String> convertedShortDescription = CustomUtils.parseStringDescription(shortDescription);
        convertedShortDescription.remove(SHORT_DESCRIPTION_FOR_REMOVE);
        return convertedShortDescription;
    }

}
