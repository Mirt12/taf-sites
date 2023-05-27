package by.itacademy.tatjana.balashevich;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;

public class DominosTest {
    DominosPage dominosPage = new DominosPage();
    ChromeOptions options = new ChromeOptions();
    WebDriver driver;

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
        dominosPage.clickBtnToCloseBanner(wait);
        dominosPage.clickBtnEnterHeader(driver);
        dominosPage.fillInputFieldEmail(wait, "@@@@@@@@");
        dominosPage.fillInputFieldPwd(wait, "ZZZZZZ");
        dominosPage.clickBtnEnter(driver);
    }

    @Test
    public void enterWithCorrectEmail() throws InterruptedException {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        dominosPage.clickBtnToCloseBanner(wait);
        dominosPage.clickBtnEnterHeader(driver);
        dominosPage.fillInputFieldEmail(wait, "Maya33@gmail.com");
        dominosPage.fillInputFieldPwd(wait, "ZZZZZZ");
        dominosPage.clickBtnEnter(driver);
    }
}
