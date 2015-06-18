package com.epam.blokhina.pages.impl;

import com.epam.blokhina.pages.base.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Yevheniia_Blokhina on 6/12/2015.
 */
public class PricePage extends BasePage {
    public PricePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='edit-name-1']")
    @Getter private WebElement searchField;

    @FindBy(xpath = "//tr[contains(@class,'price_table_tr')][1]//a[@class='description-link']")
    @Getter private WebElement descriptionOfFirstProduct;
}
