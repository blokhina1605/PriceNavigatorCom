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
public class ComparePage extends BasePage{

	@FindBys(@FindBy(xpath = "//table[@class='compare']//td[position() >1]//.. | //table[@class='compare']//td[position() >1]"))
	private @Getter List<WebElement> infoOfBothProducts;

	@FindBy(xpath = "//table[@class='compare']//tr//td[2]")
	@Getter private List<WebElement> firstProductInfo;

	@FindBy(xpath = "//table[@class='compare']//tr//td[3]")
	@Getter private List<WebElement> secondProductInfo;

	public ComparePage(WebDriver driver) {
		super(driver);
	}
}
