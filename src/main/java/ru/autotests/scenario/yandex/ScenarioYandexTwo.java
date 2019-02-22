package ru.autotests.scenario.yandex;

import cucumber.api.java.ru.Когда;
import ru.autotests.pages.yandex.*;
import ru.autotests.steps.BaseStepsMethods;
import ru.autotests.steps.yandex.YandexMarketSteps;

public class ScenarioYandexTwo {
    private BaseStepsMethods bsm = new BaseStepsMethods();
    private YandexMarketSteps yms = new YandexMarketSteps();
    private CatalogPage catalogPage = new CatalogPage();
    private ResultCatalogPage resultCatalogPage = new ResultCatalogPage();
    private YandexElectronicsPage yandexElectronicsPage = new YandexElectronicsPage();
    private YandexMarketPage yandexMarketPage = new YandexMarketPage();
    private YandexPage yandexPage = new YandexPage();
    private String nameModel;


    public ScenarioYandexTwo() throws Exception {
    }

//    @Когда("перешел в яндекс маркет")
//    public void перешелВЯндексМаркет() {
//        bsm.clickLink("", yandexPage.yandexMarket);
//    }
//
//    @Когда("закрыл диалоговое окно")
//    public void закрылДиалоговоеОкно() throws AWTException {
//        bsm.acceptDialogAlert();
//    }
//
//    @Когда("выбрал раздел электроника")
//    public void выбралРазделЭлектроника() {
//        bsm.clickButton("", yandexMarketPage.Electronics);
//    }

    @Когда("выбрал раздел Наушники")
    public void выбралРазделНаушники() {
        bsm.clickLink("", yandexElectronicsPage.headPhones);
    }

//    @Когда("выбрал расширенный поиск")
//    public void выбралРасширенныйПоиск() {
//        bsm.clickButton("", catalogPage.allFilters);
//    }
//
    @Когда("задал параметр поиска наушников от")
    public void задалПараметрПоискаНаушниковОт() {
        bsm.fillField("", "5000",  catalogPage.priceMin);
    }

    @Когда("выбрал производителей Beats")
    public void выбралПроизводителейBeats() {
        bsm.clickLink("", catalogPage.labelBeats);
    }

//    @Когда("выбрал кнопку применить")
//    public void выбралКнопкуПрименить() {
//        bsm.clickButton("", catalogPage.buttonResultFilter);
//    }
//
    @Когда("указал вид отображения элементов на странице")
    public void указалКоличествоЭлементовНаСтранице() {
        bsm.clickLink("", resultCatalogPage.directoryMapping);
    }
//
//    @Когда("проверил количество элементов на странице")
//    public void проверилКоличествоЭлементовНаСтранице() {
//        nameModel = yms.getTableRowCount("", catalogPage.tableResultFilter);
//    }
//
//    @Когда("в поисковую строку ввел запомненное значение")
//    public void вПоисковуюСтрокуВвелЗапомненноеЗначение() {
//        bsm.fillField("", nameModel, resultCatalogPage.searchMarket);
//        bsm.clickButton("", resultCatalogPage.searchButton);
//    }
//
    @Когда("сравнил полученное с ожидаемым значение наушники")
    public void сравнилПолученноеСОжидаемымЗначениеНаушники() {
        bsm.checkElementText("", nameModel, yms.getFirstElementTable("",catalogPage.tableResultFilter));
    }
}
