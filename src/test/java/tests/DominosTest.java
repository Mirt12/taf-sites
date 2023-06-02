package tests;

import pages.DominosPage;
import steps.DominosStep;
import utils.LoadHelper;
import utils.Util;
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
        dominosStep.openLoginfillLoginFormAndSubmit("@@@@@@@@", Util.generatePWD());
    }

    @Test
    public void enterWithCorrectEmail() throws InterruptedException {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        dominosStep.openLoginfillLoginFormAndSubmit(Util.generateEmail(), Util.generatePWD());
    }
}
