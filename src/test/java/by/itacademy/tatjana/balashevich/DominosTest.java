package by.itacademy.tatjana.balashevich;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class DominosTest {
    DominosPage dominosPage = new DominosPage();
    ChromeOptions options = new ChromeOptions();

    @Test
    public void enterWithIncorrectEmailAndAnyPassword() throws InterruptedException {
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://dominos.by");

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        WebElement btnToCloseBunner = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//button[@class='custom-button custom-button--primary custom-button--size-medium']"));
            }
        });
        btnToCloseBunner.click();

        WebElement btnEnterHeader = driver.findElement(By.xpath(dominosPage.btnVoityInHeader));
        btnEnterHeader.click();

        WebElement inputEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(dominosPage.inputEmail));
            }
        });
        inputEmail.sendKeys("@@@@@@@@");
        WebElement inputPassword = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(dominosPage.inputPassword));
            }
        });
        inputPassword.sendKeys("ZZZZZZ");
        WebElement btnEnter = driver.findElement(By.xpath(dominosPage.btnVoityInModal));
        btnEnter.click();
        driver.quit();
    }

    @Test
    public void enterWithCorrectEmail() throws InterruptedException {
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://dominos.by");

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        WebElement btnToCloseBunner = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("//button[@class='custom-button custom-button--primary custom-button--size-medium']"));
            }
        });
        btnToCloseBunner.click();

        WebElement btnEnterHeader = driver.findElement(By.xpath(dominosPage.btnVoityInHeader));
        btnEnterHeader.click();

        WebElement inputEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(dominosPage.inputEmail));
            }
        });
        inputEmail.sendKeys("Maya33@gmail.com");
        WebElement inputPassword = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(dominosPage.inputPassword));
            }
        });
        inputPassword.sendKeys("ZZZZZZ");
        WebElement btnEnter = driver.findElement(By.xpath(dominosPage.btnVoityInModal));
        btnEnter.click();
        driver.quit();
    }
     /*
        public void inputEmail(String email){
            webDriver.findElement(By.xpath(inputEmailXPath)).sendKeys(email);
        }
         */
}
