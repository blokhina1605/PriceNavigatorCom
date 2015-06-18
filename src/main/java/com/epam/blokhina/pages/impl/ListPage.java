package com.epam.blokhina.pages.impl;

import com.epam.blokhina.pages.base.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;


public class ListPage extends BasePage {
    @FindBy(xpath = "//a[contains(@href, 'sort=name')]")
    @Getter private WebElement sortByName;

    @FindBy(xpath = "//a[contains(@href, 'sort=price')]")
    @Getter private WebElement sortByPrice;

    @FindBy(xpath = "//div[5]/div[2]/a[8]")
    @Getter private List<WebElement> brandFilter;

    @FindBy(xpath = "//a[contains(text(),'18000')]")
    @Getter private WebElement minPriceFilter;

    @FindBy(xpath = "//div[@class='group'][2]//a[contains(text(), '21000')]")
    @Getter private WebElement maxPriceFilter;

    @FindBy(xpath = "//div[10]//a[2]")
    @Getter private WebElement weightFilter;

    @FindBy(xpath = "//div[3]/div[4]/span")
    @Getter private WebElement addToComparsionBtnFirst;

    @FindBy(xpath = "//div[4]/div[4]/span")
    @Getter private WebElement addToComparsionBtnSecond;

    @FindBy(xpath = "//div[3]/a")
    @Getter private WebElement goToComparsion;

    @FindBys(@FindBy(xpath = "//div[@class='catalog']/div[@class='item']/div[@class='name']/a"))
    @Getter private List<WebElement> productNamesFromOnePageList;

    @FindBys(@FindBy(xpath = "//div[@class='catalog']/div[@class='item']/div[@class='price']/strong"))
    @Getter private List<WebElement> productPricesFromOnePageList;

    @FindBy(xpath = "//div[3]/div[3]/div/a")
    @Getter private WebElement firstMicrowave;

    @FindBy(xpath = "//div[3]/div[4]/div/a")
    @Getter private WebElement secondMicrowave;

    @FindBy(xpath = "//div[@class='item']//div[@class='description']")
    @Getter private List<WebElement> shortDescriptions;

    @FindBy(xpath = "(//div[@class='name']//a)[position()<6]")
    @Getter private List<WebElement> conditionersName;

    public ListPage(WebDriver driver) {
        super(driver);
    }
}
