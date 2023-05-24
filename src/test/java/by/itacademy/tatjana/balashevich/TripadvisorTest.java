package by.itacademy.tatjana.balashevich;

import org.junit.After;
import org.junit.Before;
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
        //fluent Wait- Set up:
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        //fluent Wait - Search element:
        WebElement btnCookies = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.btnCookiesXPath));
            }
        });
        btnCookies.click();
        WebElement btnSignIn = driver.findElement(By.xpath(tripadvisorPage.btnSignInXPath));
        btnSignIn.click();
        //go to iframe-element:
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
        //fluent Wait - Search element:
        WebElement btnContinueWithEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.btnContinueWithEmailXPath));
            }
        });
        btnContinueWithEmail.click();
        //fluent Wait - Search element:
        WebElement inputEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.inputEmailXPath));
            }
        });
        inputEmail.sendKeys("");
        //fluent Wait - Search element:
        WebElement inputPassword = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.inputPasswordXPath));
            }
        });
        inputPassword.sendKeys("");
        //fluent Wait - Search element:
        WebElement btnSignInFrame = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.btnSingInFrameXPath));
            }
        });
        btnSignInFrame.click();
    }

    @Test
    public void enterWithInvalidEmail() throws InterruptedException {
        //fluent Wait- Set up:
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        //fluent Wait - Search element:
        WebElement btnCookies = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.btnCookiesXPath));
            }
        });
        btnCookies.click();
        WebElement btnSignIn = driver.findElement(By.xpath(tripadvisorPage.btnSignInXPath));
        btnSignIn.click();
        //go to iframe-element:
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
        //fluent Wait - Search element:
        WebElement btnContinueWithEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.btnContinueWithEmailXPath));
            }
        });
        btnContinueWithEmail.click();
        //fluent Wait - Search element:
        WebElement inputEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.inputEmailXPath));
            }
        });
        inputEmail.sendKeys("sodab92025dekaps.com");
        //fluent Wait - Search element:
        WebElement inputPassword = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.inputPasswordXPath));
            }
        });
        inputPassword.sendKeys("");
        //fluent Wait - Search element:
        WebElement btnSignInFrame = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.btnSingInFrameXPath));
            }
        });
        btnSignInFrame.click();
    }

    @Test
    public void enterValidEmailAndEmptyPassword() throws InterruptedException {
        //fluent Wait- Set up:
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        //fluent Wait - Search element:
        WebElement btnCookies = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.btnCookiesXPath));
            }
        });
        btnCookies.click();
        WebElement btnSignIn = driver.findElement(By.xpath(tripadvisorPage.btnSignInXPath));
        btnSignIn.click();
        //go to iframe-element:
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
        //fluent Wait - Search element:
        WebElement btnContinueWithEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.btnContinueWithEmailXPath));
            }
        });
        btnContinueWithEmail.click();
        //fluent Wait - Search element:
        WebElement inputEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.inputEmailXPath));
            }
        });
        inputEmail.sendKeys("sodab92025@dekaps.com");
        //fluent Wait - Search element:
        WebElement inputPassword = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.inputPasswordXPath));
            }
        });
        inputPassword.sendKeys("");
        //fluent Wait - Search element:
        WebElement btnSignInFrame = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.btnSingInFrameXPath));
            }
        });
        btnSignInFrame.click();
    }

    @Test
    public void enterValidEmailAndInvalidPassword() throws InterruptedException {
        //fluent Wait- Set up:
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        //fluent Wait - Search element:
        WebElement btnCookies = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.btnCookiesXPath));
            }
        });
        btnCookies.click();
        WebElement btnSignIn = driver.findElement(By.xpath(tripadvisorPage.btnSignInXPath));
        btnSignIn.click();
        //go to iframe-element:
        Thread.sleep(2000);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='regcontroller']")));
        //fluent Wait - Search element:
        WebElement btnContinueWithEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.btnContinueWithEmailXPath));
            }
        });
        btnContinueWithEmail.click();
        //fluent Wait - Search element:
        WebElement inputEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.inputEmailXPath));
            }
        });
        inputEmail.sendKeys("sodab92025@dekaps.com");
        //fluent Wait - Search element:
        WebElement inputPassword = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.inputPasswordXPath));
            }
        });
        inputPassword.sendKeys("HHHHHHH");
        //fluent Wait - Search element:
        WebElement btnSignInFrame = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(tripadvisorPage.btnSingInFrameXPath));
            }
        });
        btnSignInFrame.click();
    }
}