package com.epam.blokhina.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Yevheniia_Blokhina on 6/8/2015.
 */
public class Waiter {
    public static WebElement waitForElementPresent(WebDriver driver, String elementXpath) {
        return (new WebDriverWait(driver, 30)).until((WebDriver driver1) -> driver1.findElement(By.xpath(elementXpath)));
    }

    public static void waitForPage(WebDriver driver, WebElement firstProductInfo) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(firstProductInfo));

    }
}
