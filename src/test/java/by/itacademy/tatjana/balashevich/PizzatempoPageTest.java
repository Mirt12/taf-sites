package by.itacademy.tatjana.balashevich;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;


public class PizzatempoPageTest {
    PizzatempoPage pizzatempoPage = new PizzatempoPage();
    ChromeOptions options = new ChromeOptions();
    WebDriver driver;

    @Before
    public void testSetUp() {
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.pizzatempo.by");
    }

    @After
    public void testToFinish() {
        driver.quit();
    }

    @Test
    public void enterWithEmptyEmailAndEmptyPassword() {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        pizzatempoPage.fillInputFieldEmail(wait, "");
        pizzatempoPage.fillInputFieldPassword(driver, "");
        pizzatempoPage.clickSearchButton(driver);
        //toDo
    }

    @Test
    public void enterWithInvalidEmail() {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        pizzatempoPage.fillInputFieldEmail(wait, "@@@@@@");
        pizzatempoPage.fillInputFieldPassword(driver, "");
        pizzatempoPage.clickSearchButton(driver);
        //toDo
    }

    @Test
    public void enterWithEmptyEmailAndAnyPassword() {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        pizzatempoPage.fillInputFieldEmail(wait, "");
        pizzatempoPage.fillInputFieldPassword(driver, "ZZZZZZ");
        pizzatempoPage.clickSearchButton(driver);
        //toDo
    }

    @Test
    public void enterWithValidEmailAndEmptyPassword() {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        pizzatempoPage.fillInputFieldEmail(wait, "Mirt12@yandex.ru");
        pizzatempoPage.fillInputFieldPassword(driver, "");
        pizzatempoPage.clickSearchButton(driver);
        //toDo
    }

    @Test
    public void enterWithValidEmailAndAnyPassword() {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        pizzatempoPage.fillInputFieldEmail(wait, "Mirt12@yandex.ru");
        pizzatempoPage.fillInputFieldPassword(driver, "ZZZZZZZZ");
        pizzatempoPage.clickSearchButton(driver);
        //toDo
    }
}
