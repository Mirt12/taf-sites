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

public class PizzatempoPageTest {
    PizzatempoPage pizzatempoPage = new PizzatempoPage();
    ChromeOptions options = new ChromeOptions();

    @Test
    public void enterWithEmptyEmailAndEmptyPassword() {
        //open browser incognito and w/o cash:
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.pizzatempo.by");
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
        driver.quit();
    }

    @Test
    public void enterWithInvalidEmail() {
        //open browser incognito and w/o cash:
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.pizzatempo.by");
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
        driver.quit();
    }

    @Test
    public void enterWithEmptyEmailAndAnyPassword() {
        //open browser incognito and w/o cash:
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.pizzatempo.by");
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
        driver.quit();
    }

    @Test
    public void enterWithValidEmailAndEmptyPassword() {
        //open browser incognito and w/o cash:
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.pizzatempo.by");
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
        driver.quit();
    }

    @Test
    public void enterWithValidEmailAndAnyPassword() {
        //open browser incognito and w/o cash:
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.pizzatempo.by");
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
        driver.quit();
    }
}
