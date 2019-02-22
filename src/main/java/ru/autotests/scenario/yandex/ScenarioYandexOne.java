package ru.autotests.scenario.yandex;

import cucumber.api.java.ru.Когда;
import ru.autotests.pages.yandex.*;
import ru.autotests.steps.BaseStepsMethods;
import ru.autotests.steps.yandex.YandexMarketSteps;

import java.awt.*;

public class ScenarioYandexOne {
    private BaseStepsMethods bsm = new BaseStepsMethods();
    private YandexMarketSteps yms = new YandexMarketSteps();
    private CatalogPage catalogPage = new CatalogPage();
    private ResultCatalogPage resultCatalogPage = new ResultCatalogPage();
    private YandexElectronicsPage yandexElectronicsPage = new YandexElectronicsPage();
    private YandexMarketPage yandexMarketPage = new YandexMarketPage();
    private YandexPage yandexPage = new YandexPage();
    private String nameModel;


    public ScenarioYandexOne() throws Exception {
    }

    @Когда("перешел в яндекс маркет")
    public void перешелВЯндексМаркет() {
        bsm.clickLink("", yandexPage.yandexMarket);
    }

    @Когда("закрыл диалоговое окно")
    public void закрылДиалоговоеОкно() throws AWTException {
            bsm.acceptDialogAlert();
    }

    @Когда("выбрал раздел электроника")
    public void выбралРазделЭлектроника() {
        bsm.clickButton("", yandexMarketPage.Electronics);
    }

    @Когда("выбрал раздел Телевизоры")
    public void выбралРазделТелевизоры() {
        bsm.clickLink("", yandexElectronicsPage.televisions);
    }

    @Когда("выбрал расширенный поиск")
    public void выбралРасширенныйПоиск() {
        bsm.clickButton("", catalogPage.allFilters);
    }

    @Когда("задал параметр поиска от")
    public void задалПараметрПоискаОт() {
        bsm.fillField("", "20000",  catalogPage.priceMin);
    }

    @Когда("выбрал производителей Samsung, LG")
    public void выбралПроизводителейSamsungLG() {
        bsm.clickLink("", catalogPage.labelLG);
        bsm.clickLink("", catalogPage.labelSamsung);
    }

    @Когда("выбрал кнопку применить")
    public void выбралКнопкуПрименить() {
        bsm.clickButton("", catalogPage.buttonResultFilter);
    }

    @Когда("указал количество элементов на странице")
    public void указалКоличествоЭлементовНаСтранице() {
        bsm.clickLink("", resultCatalogPage.directoryMapping);
        bsm.refreshElementsPage();
        bsm.clickButton("Количество элементов на странице", resultCatalogPage.resultCount);
        bsm.clickLink("Выбор количества элементов для отображения на странице", resultCatalogPage.chooseResultCount);
    }

    @Когда("проверил количество элементов на странице")
    public void проверилКоличествоЭлементовНаСтранице() {
        bsm.refreshElementsPage();
        nameModel = yms.getTableRowCount("", catalogPage.tableResultFilter);
    }

    @Когда("в поисковую строку ввел запомненное значение")
    public void вПоисковуюСтрокуВвелЗапомненноеЗначение() {
        bsm.fillField("", nameModel, resultCatalogPage.searchMarket);
        bsm.clickButton("", resultCatalogPage.searchButton);
    }

    @Когда("сравнил полученное с ожидаемым значение")
    public void сравнилПолученноеСОжидаемымЗначение() {
        bsm.checkElementText("", nameModel, resultCatalogPage.searchDevice);
    }
}
