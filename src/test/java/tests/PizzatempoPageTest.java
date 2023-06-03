package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import utils.LoadHelper;
import utils.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import steps.PizzaTempoStep;

import java.io.UnsupportedEncodingException;
import java.time.Instant;


public class PizzatempoPageTest {
    WebDriver driver;
    PizzaTempoStep pizzaTempoStep;

    @Before
    public void testSetUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        driver = new ChromeDriver(options);

        pizzaTempoStep = new PizzaTempoStep(driver);
        driver.manage().window().maximize();
        driver.get("https://www.pizzatempo.by");
    }

    @After
    public void testToFinish() {
        //driver.quit();
    }

    @Test
    public void enterWithEmptyEmailAndEmptyPassword() throws UnsupportedEncodingException {
        pizzaTempoStep.fillLoginFormAndSubmit("", "");
        Wait wait = LoadHelper.wait30seconds(driver);
        Alert alert = (Alert) wait.until(ExpectedConditions.alertIsPresent());
        String actualText = alert.getText();
        String expectedMessageText = "Заполните форму";
        Assertions.assertEquals(expectedMessageText, actualText);
    }

    @Test
    public void enterWithInvalidEmail() {
        pizzaTempoStep.fillLoginFormAndSubmit("4444", Util.generatePWD());
        WebElement actualMessage = driver.findElement(By.xpath("//div[@id='alert']//div[contains(text(),'Неверно указано имя пользователя или пароль.')]"));
        String actualMessageText = actualMessage.getText();
        String expectedMessageText = "Неверно указано имя пользователя или пароль.\nOk";
        Assertions.assertEquals(expectedMessageText, actualMessageText);
    }

    @Test
    public void enterWithEmptyEmailAndAnyPassword() {
        pizzaTempoStep.fillLoginFormAndSubmit("", Util.generatePWD());
        Wait wait = LoadHelper.wait30seconds(driver);
        Alert alert = (Alert) wait.until(ExpectedConditions.alertIsPresent());
        String actualText = alert.getText();
        String expectedMessageText = "Заполните форму";
        Assertions.assertEquals(expectedMessageText, actualText);
    }

    @Test
    public void enterWithValidEmailAndEmptyPassword() {
        pizzaTempoStep.fillLoginFormAndSubmit(Util.generateEmail(), "");
        Wait wait = LoadHelper.wait30seconds(driver);
        Alert alert = (Alert) wait.until(ExpectedConditions.alertIsPresent());
        String actualText = alert.getText();
        String expectedMessageText = "Заполните форму";
        Assertions.assertEquals(expectedMessageText, actualText);
    }

    @Test
    public void enterWithValidEmailAndAnyPassword() {
        pizzaTempoStep.fillLoginFormAndSubmit(Util.generateEmail(), Util.generatePWD());
        WebElement actualMessage = driver.findElement(By.xpath("//div[@id='alert']//div[contains(text(),'Неверно указано имя пользователя или пароль.')]"));
        String actualMessageText = actualMessage.getText();
        String expectedMessageText = "Неверно указано имя пользователя или пароль.\nOk";
        Assertions.assertEquals(expectedMessageText, actualMessageText);
    }
}
