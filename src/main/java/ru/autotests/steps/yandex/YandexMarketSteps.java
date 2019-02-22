package ru.autotests.steps.yandex;

import org.openqa.selenium.WebElement;
import ru.autotests.pages.yandex.ResultCatalogPage;
import ru.autotests.steps.BaseStepsMethods;
import ru.yandex.qatools.allure.annotations.Step;

public class YandexMarketSteps extends BaseStepsMethods {
    public YandexMarketSteps() throws Exception {
    }
    @Step("Считаем количество строк в таблице {0}")
    public String getTableRowCount(String field, WebElement element){
        return new ResultCatalogPage().getTableRowCount(element);
    }

    @Step("Первый элемент в таблице {0}")
    public WebElement getFirstElementTable(String field, WebElement element){
        return new ResultCatalogPage().getFirstElementTable(element);
    }
}
