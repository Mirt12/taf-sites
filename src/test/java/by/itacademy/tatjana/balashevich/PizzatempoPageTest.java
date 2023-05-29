package by.itacademy.tatjana.balashevich;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;


public class PizzatempoPageTest {
    WebDriver driver;
    PizzatempoPage pizzatempoPage;
    PizzaTempoStep step = new PizzaTempoStep();

    @Before
    public void testSetUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        driver = new ChromeDriver(options);
        pizzatempoPage = new PizzatempoPage(driver);
        driver.manage().window().maximize();
        driver.get("https://www.pizzatempo.by");
    }

    @After
    public void testToFinish() {
        driver.quit();
    }

    @Test
    public void enterWithEmptyEmailAndEmptyPassword() {
//        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
//        pizzatempoPage.fillInputFieldEmail(wait, "");
//        pizzatempoPage.fillInputFieldPassword("");
//        pizzatempoPage.clickSearchButton();
          step.fillLoginFormAndSubmit("", "");
        //toDo
    }

    @Test
    public void enterWithInvalidEmail() {
//        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
//        pizzatempoPage.fillInputFieldEmail(wait, "@@@@@@");
//        pizzatempoPage.fillInputFieldPassword("");
//        pizzatempoPage.clickSearchButton();
        step.fillLoginFormAndSubmit("@@@@@@", "");
        //toDo
    }

    @Test
    public void enterWithEmptyEmailAndAnyPassword() {
//        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
//        pizzatempoPage.fillInputFieldEmail(wait, "");
//        pizzatempoPage.fillInputFieldPassword(Util.generatePWD());
//        pizzatempoPage.clickSearchButton();
        step.fillLoginFormAndSubmit("", Util.generatePWD());
        //toDo
    }

    @Test
    public void enterWithValidEmailAndEmptyPassword() {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
//        pizzatempoPage.fillInputFieldEmail(wait, Util.generateEmail());
//        pizzatempoPage.fillInputFieldPassword("");
//        pizzatempoPage.clickSearchButton();
        step.fillLoginFormAndSubmit(Util.generateEmail(), "");
        //toDo
    }

    @Test
    public void enterWithValidEmailAndAnyPassword() {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
//        pizzatempoPage.fillInputFieldEmail(wait, Util.generateEmail());
//        pizzatempoPage.fillInputFieldPassword(Util.generatePWD());
//        pizzatempoPage.clickSearchButton();
        step.fillLoginFormAndSubmit(Util.generateEmail(), Util.generatePWD());
        //toDo
    }
}
