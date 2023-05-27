package by.itacademy.tatjana.balashevich;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;

public class TripadvisorTest {
    TripadvisorPage tripadvisorPage = new TripadvisorPage();
    ChromeOptions options = new ChromeOptions();
    WebDriver driver;

    @Before
    public void testSetUp() {
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.tripadvisor.com");
    }

    @After
    public void testToFinish() {
        driver.quit();
    }

    @Test
    public void enterWithEmptyEmailAndEmptyPassword() throws InterruptedException {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        tripadvisorPage.clickBtnCookies(wait);
        tripadvisorPage.clickBtnSignIn(driver);
        //go to iframe-element:
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
        tripadvisorPage.clickBtnContinueWithEmail(wait);
        tripadvisorPage.fillInputFieldEmail(wait, "");
        tripadvisorPage.fillInputFieldPwd(wait, "");
        tripadvisorPage.clickBtnSignInFrame(wait);
    }

    @Test
    public void enterWithInvalidEmail() throws InterruptedException {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        tripadvisorPage.clickBtnCookies(wait);
        tripadvisorPage.clickBtnSignIn(driver);
        //go to iframe-element:
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
        tripadvisorPage.clickBtnContinueWithEmail(wait);
        tripadvisorPage.fillInputFieldEmail(wait, "sodab92025dekaps.com");
        tripadvisorPage.fillInputFieldPwd(wait, "");
        tripadvisorPage.clickBtnSignInFrame(wait);
    }

    @Test
    public void enterValidEmailAndEmptyPassword() throws InterruptedException {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        tripadvisorPage.clickBtnCookies(wait);
        tripadvisorPage.clickBtnSignIn(driver);
        //go to iframe-element:
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
        tripadvisorPage.clickBtnContinueWithEmail(wait);
        tripadvisorPage.fillInputFieldEmail(wait, "sodab92025@dekaps.com");
        tripadvisorPage.fillInputFieldPwd(wait, "");
        tripadvisorPage.clickBtnSignInFrame(wait);
    }

    @Test
    public void enterValidEmailAndInvalidPassword() throws InterruptedException {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        tripadvisorPage.clickBtnCookies(wait);
        tripadvisorPage.clickBtnSignIn(driver);
        //go to iframe-element:
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
        tripadvisorPage.clickBtnContinueWithEmail(wait);
        tripadvisorPage.fillInputFieldEmail(wait, "sodab92025@dekaps.com");
        tripadvisorPage.fillInputFieldPwd(wait, "HHHHHHH");
        tripadvisorPage.clickBtnSignInFrame(wait);
    }
}