package ru.autotests.pages.yandex;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.autotests.pages.BasePage;

public class YandexMarketPage extends BasePage {
    @FindBy(xpath = "//DIV[@class='n-region-notification b-zone i-bem n-region-notification_js_inited']")
    public WebElement OkRegion;
    //Ссылка электроника
    @FindBy( xpath = "/html/body/div[1]/div/span/div[2]/noindex/div[2]/div/div/div[2]/a")
    public WebElement Electronics;



}
