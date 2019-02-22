package ru.autotests.pages.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.autotests.pages.BasePage;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ResultCatalogPage extends BasePage {
    @FindBy(xpath = "//DIV[@class='layout layout_type_maya']")
    public WebElement resultList;

    @FindBy(id = "header-search")
    public WebElement searchMarket;

    @FindBy(xpath = "/html/body/div[1]/div[1]/noindex/div[2]/div/div[2]/div/div[1]/form/span/span[2]/button")
    public WebElement searchButton;

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[2]/div[2]/div/div[1]/div[1]/div/h1")
    public WebElement searchDevice;

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[2]/div[1]/div[1]/div/div[3]/span/button")
    public WebElement resultCount;

    @FindBy(xpath = "//SPAN[@class='select__text'][text()='Показывать по 12']")
    public WebElement chooseResultCount;

    @FindBy(xpath = "/html/body/div[1]/div[5]/div[1]/div[2]/div[2]/div/span/label[1]")
    public WebElement directoryMapping;

    public String getTableRowCount(WebElement element){
        //To locate rows of table.
        List<WebElement> rows_table = element.findElements(By.className("n-snippet-card2"));
        //To calculate no of rows In table.
        String textFirstElement = rows_table.get(0).getText();
        int pos = textFirstElement.indexOf("\n");
        String textFirstElementName = textFirstElement.substring(0, pos);
        int rows_count = rows_table.size();
        assertEquals(rows_count, 12);
        return textFirstElementName;
    }

    public WebElement getFirstElementTable(WebElement element){
        //To locate rows of table.
        List<WebElement> rows_table = element.findElements(By.className("n-snippet-card2"));
        return rows_table.get(0);
    }





}
