package ru.autotests.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import ru.autotests.scenario.yandex.ScenarioHooks;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BasePage {

    public WebDriver driver;

    public BasePage() {
        PageFactory.initElements(ScenarioHooks.getDriver(), this);
    }

    public BasePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public void selectComboBox(String value, WebElement element){
        Select select = new Select(element);
        select.selectByValue(value);
    }

    //метод для вввода данных в поле формата Date.
    // В связи с тем, что элемент не активен, имитируем, наведение мыши на элемент а затем делаем клик
    public WebElement fillFieldDate(WebElement dateWebElement, String value, WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(dateWebElement);
        actions.click();
        actions.sendKeys(value);
        actions.build().perform();
        return dateWebElement;
    }

    //Проверка наличия элемента
    protected boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickWebElement(WebElement element, WebDriver driver) {
        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", element);
        }
        element.click();
    }

    //Проверка сравнивает значение поля ввода со строковой переменной
    public void checkFillField(String value, WebElement element) {
        String valueElement = element.getAttribute("value");
        assertEquals(value, valueElement);
    }

    //Проверка сравнивает значение текста у элемента со строковой переменной
    public void checkElementText(String value, WebElement element) {
        String textElement = element.getText();
        assertEquals(value, textElement);
    }

    //Провека отметки элемента
    public void checkSelectedElement(boolean value, WebElement element) {
        assertEquals(value, element.isSelected());
    }

    //Проверка доступности элемента
    public void checkEnabledElement(boolean value, WebElement element) {
        assertEquals(value, element.isEnabled());
    }

    //Проверка отображения элемента
    public void checkDisplayedElement(boolean value, WebElement element) {
        assertEquals(value, element.isDisplayed());
    }

    //Указываем селениуму, на какую вкладку переключиться
    public void swichTab(int numberTab, WebDriver driver) {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(numberTab));
    }

    //закрываем диалоговое окно кнопкой ок
    public void acceptDialogAlert() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public WebElement getLinkByText(String product){
        WebElement element = driver.findElement(By.linkText(product));
        return element;
    }

    public void moveToElement(WebElement element, WebDriver driver){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }


}
