package ru.autotests.pages.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.autotests.pages.BasePage;

public class CatalogPage extends BasePage {
    @FindBy(xpath = "/html/body/div[1]/div[5]/div[2]/div[2]/div/div/div/div[3]/div/div[3]/div/a/span")
    public WebElement allFilters;

    @FindBy(id = "glf-pricefrom-var")
    public WebElement priceMin;

    @FindBy(xpath = "//LABEL[@class='checkbox__label'][text()='LG']")
    public WebElement labelLG;

    @FindBy(xpath = "//LABEL[@class='checkbox__label'][text()='Samsung']")
    public  WebElement labelSamsung;

    @FindBy(xpath = "//LABEL[@class='checkbox__label'][text()='Beats']")
    public WebElement labelBeats;

    //чекбоксы для выбора марки
    public WebElement getLabel(String company, WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//LABEL[@class='checkbox__label'][text()='"+ company +"']"));
        return element;
    }

    //@FindBy(xpath = "/html/body/div[1]/div[5]/div/div[1]/div[5]/a[2]")
    @FindBy(xpath = "(//A[@role='button'])[4]")
    public WebElement buttonResultFilter;

    @FindBy(xpath = "//DIV[@class='layout layout_type_maya']")
    public WebElement tableResultFilter;


}
