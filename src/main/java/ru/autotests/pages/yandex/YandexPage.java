package ru.autotests.pages.yandex;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.autotests.pages.BasePage;

public class YandexPage extends BasePage {

    @FindBy(xpath = "//A[@class='home-link home-link_blue_yes home-tabs__link home-tabs__search'][text()='Маркет']")
    public WebElement yandexMarket;

}
