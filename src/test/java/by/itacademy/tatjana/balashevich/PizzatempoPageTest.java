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
        //fluent Wait- Set up:
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        //fluent Wait - Search element:
        WebElement inputEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(pizzatempoPage.inputEmail));
            }
        });
        inputEmail.sendKeys("");
        WebElement inputPassword = driver.findElement(By.xpath(pizzatempoPage.inputPassword));
        inputPassword.sendKeys("");
        WebElement btnSearch = driver.findElement(By.xpath(pizzatempoPage.btnSearch));
        btnSearch.click();
        //toDo
    }

    @Test
    public void enterWithInvalidEmail() {
        //fluent Wait- Set up:
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        //fluent Wait - Search element:
        WebElement inputEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(pizzatempoPage.inputEmail));
            }
        });
        inputEmail.sendKeys("@@@@@@");
        WebElement inputPassword = driver.findElement(By.xpath(pizzatempoPage.inputPassword));
        inputPassword.sendKeys("");
        WebElement btnSearch = driver.findElement(By.xpath(pizzatempoPage.btnSearch));
        btnSearch.click();
        //toDo
    }

    @Test
    public void enterWithEmptyEmailAndAnyPassword() {
        //fluent Wait- Set up:
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        //fluent Wait - Search element:
        WebElement inputEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(pizzatempoPage.inputEmail));
            }
        });
        inputEmail.sendKeys("");
        WebElement inputPassword = driver.findElement(By.xpath(pizzatempoPage.inputPassword));
        inputPassword.sendKeys("ZZZZZZ");
        WebElement btnSearch = driver.findElement(By.xpath(pizzatempoPage.btnSearch));
        btnSearch.click();
        //toDo
    }

    @Test
    public void enterWithValidEmailAndEmptyPassword() {
        //fluent Wait- Set up:
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        //fluent Wait - Search element:
        WebElement inputEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(pizzatempoPage.inputEmail));
            }
        });
        inputEmail.sendKeys("Mirt12@yandex.ru");
        WebElement inputPassword = driver.findElement(By.xpath(pizzatempoPage.inputPassword));
        inputPassword.sendKeys("");
        WebElement btnSearch = driver.findElement(By.xpath(pizzatempoPage.btnSearch));
        btnSearch.click();
        //toDo
    }

    @Test
    public void enterWithValidEmailAndAnyPassword() {
        //fluent Wait- Set up:
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        //fluent Wait - Search element:
        WebElement inputEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(pizzatempoPage.inputEmail));
            }
        });
        inputEmail.sendKeys("Mirt12@yandex.ru");
        WebElement inputPassword = driver.findElement(By.xpath(pizzatempoPage.inputPassword));
        inputPassword.sendKeys("ZZZZZZZZ");
        WebElement btnSearch = driver.findElement(By.xpath(pizzatempoPage.btnSearch));
        btnSearch.click();
        //toDo
    }
}
