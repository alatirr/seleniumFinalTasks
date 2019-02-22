package ru.autotests.pages.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.autotests.pages.BasePage;

public class YandexElectronicsPage extends BasePage{
    @FindBy(xpath = "//A[@href='/catalog--televizory/59601/list?catId=90639&hid=90639'][text()='Телевизоры']")
    public  WebElement televisions;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[7]/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div[1]/a")
    public  WebElement headPhones;

    public WebElement getLinkByText(String product, WebDriver driver){
        WebElement element = driver.findElement(By.linkText(product));
        return element;
    }

}

