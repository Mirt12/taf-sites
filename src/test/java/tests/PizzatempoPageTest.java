package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import steps.PizzaTempoStep;


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
    public void enterWithEmptyEmailAndEmptyPassword() {
        pizzaTempoStep.fillLoginFormAndSubmit("", "");
        //toDo
    }

    @Test
    public void enterWithInvalidEmail() {
        pizzaTempoStep.fillLoginFormAndSubmit("4444", Util.generatePWD());
        //toDo
        WebElement actualMessage = driver.findElement(By.xpath("//div[@id='alert']//div[contains(text(),'Неверно указано имя пользователя или пароль.')]"));
        String actualMessageText = actualMessage.getText();
        String expectedMessageText = "Неверно указано имя пользователя или пароль.\nOk";
        Assertions.assertEquals(expectedMessageText, actualMessageText);
    }

    @Test
    public void enterWithEmptyEmailAndAnyPassword() {
        pizzaTempoStep.fillLoginFormAndSubmit("", Util.generatePWD());
        //toDo
    }

    @Test
    public void enterWithValidEmailAndEmptyPassword() {
        pizzaTempoStep.fillLoginFormAndSubmit(Util.generateEmail(), "");
        //toDo
    }

    @Test
    public void enterWithValidEmailAndAnyPassword() {
        pizzaTempoStep.fillLoginFormAndSubmit(Util.generateEmail(), Util.generatePWD());
        //toDo
        WebElement actualMessage = driver.findElement(By.xpath("//div[@id='alert']//div[contains(text(),'Неверно указано имя пользователя или пароль.')]"));
        String actualMessageText = actualMessage.getText();
        String expectedMessageText = "Неверно указано имя пользователя или пароль.\nOk";
        Assertions.assertEquals(expectedMessageText, actualMessageText);
    }
}
