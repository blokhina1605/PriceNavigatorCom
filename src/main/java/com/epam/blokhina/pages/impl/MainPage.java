package com.epam.blokhina.pages.impl;

import com.epam.blokhina.pages.base.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Yevheniia_Blokhina on 6/8/2015.
 */
public class MainPage extends BasePage{
    @FindBy(xpath = "//a[27]")
    private @Getter WebElement fridgesLink;

    @FindBy(xpath = "//a[28]")
    private @Getter WebElement washersLink;

    @FindBy(xpath = "//a[30]")
    private @Getter WebElement microwaveLink;

    @FindBy(xpath = "//a[33]")
    private @Getter WebElement breadmakerLink;

    @FindBy(xpath = "//a[25]")
    private @Getter WebElement conditionerLink;


    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
