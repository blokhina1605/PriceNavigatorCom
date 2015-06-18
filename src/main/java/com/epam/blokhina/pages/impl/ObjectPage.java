package com.epam.blokhina.pages.impl;

import com.epam.blokhina.pages.base.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

/**
 * Created by Yevheniia_Blokhina on 6/8/2015.
 */
public class ObjectPage extends BasePage {

    @FindBys(@FindBy(xpath = "//div[@class='row']/span[2]"))
    @Getter private List<WebElement> productDescription;

	@FindBy(xpath = "//div[3]/div/div/a[3]")
	@Getter private WebElement goToPrevPage;

    @FindBy(xpath = "//div[@class='row']/span")
    @Getter private List<WebElement> productDescriptionWithHead;

    public ObjectPage(WebDriver driver) {
        super(driver);
    }
}
