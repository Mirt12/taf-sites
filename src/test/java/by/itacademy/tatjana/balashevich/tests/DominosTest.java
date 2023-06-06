package by.itacademy.tatjana.balashevich.tests;

import by.itacademy.tatjana.balashevich.pages.DominosPage;
import by.itacademy.tatjana.balashevich.steps.DominosStep;
import by.itacademy.tatjana.balashevich.utils.LoadHelper;
import by.itacademy.tatjana.balashevich.utils.Util;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;

public class DominosTest {
    WebDriver driver;
    DominosPage dominosPage = new DominosPage();
    ChromeOptions options = new ChromeOptions();
    DominosStep dominosStep = new DominosStep();

    @Before
    public void testSetUp() {
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://dominos.by");
    }

    @After
    public void testToFinish() {
        driver.quit();
    }

    @Test
    public void enterWithIncorrectEmailAndAnyPassword() throws InterruptedException {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        dominosStep.openLoginfillLoginFormAndSubmit("4444", Util.generatePWD());
        //toDo
//        WebElement actualMessage = driver.findElement(By.xpath("//div[@id='alert']//div[contains(text(),'Неверно указано имя пользователя или пароль.')]"));
//        String actualMessageText = actualMessage.getText();
//        String expectedMessageText = "Please include an '@'     ...\nOk";
//        Assertions.assertEquals(expectedMessageText, actualMessageText);
    }

    @Test
    public void enterWithCorrectEmail() throws InterruptedException {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        dominosStep.openLoginfillLoginFormAndSubmit(Util.generateEmail(), Util.generatePWD());
        //toDo
    }
}
