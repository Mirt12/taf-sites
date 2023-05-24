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

public class BookingTest {
    BookingPage bookingPage = new BookingPage();
    ChromeOptions options = new ChromeOptions();
    WebDriver driver;

    @Before
    public void testSetUp() {
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.booking.com");
    }

    @After
    public void testToFinish() {
        driver.quit();
    }

    @Test
    public void enterWithEmptyEmail() {
        //fluent Wait- Set up:
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(5L))
                .ignoring(NoSuchElementException.class);
        //fluent Wait - Search element:
        WebElement btnSignIn = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(bookingPage.btnSignInXPath));
            }
        });
        btnSignIn.click();
        //fluent Wait - Search element:
        WebElement inputEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(bookingPage.inputEmailXPath));
            }
        });
        inputEmail.sendKeys("");
        //fluent Wait - Search element:
        WebElement btnContinueWithEmail = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(bookingPage.btnContinueWithEmailXPath));
            }
        });
        btnContinueWithEmail.click();
        //toDo
    }

    @Test
    public void enterWithInvalidEmail() {
        WebElement btnSignIn = driver.findElement(By.xpath(bookingPage.btnSignInXPath));
        btnSignIn.click();

        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXPath));
        inputEmail.sendKeys("sodab92025dekaps.com");

        WebElement btnContinueWithEmail = driver.findElement(By.xpath(bookingPage.btnContinueWithEmailXPath));
        btnContinueWithEmail.click();
        //toDo
    }

    @Test
    public void enterWithValidEmail() {
        WebElement btnSignIn = driver.findElement(By.xpath(bookingPage.btnSignInXPath));
        btnSignIn.click();

        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXPath));
        inputEmail.sendKeys("sodab92025@dekaps.com");

        WebElement btnContinueWithEmail = driver.findElement(By.xpath(bookingPage.btnContinueWithEmailXPath));
        btnContinueWithEmail.click();
        //toDo
    }

    @Test
    public void enterWithValidEmailAndEmptyPassword() {
        WebElement btnSignIn = driver.findElement(By.xpath(bookingPage.btnSignInXPath));
        btnSignIn.click();

        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXPath));
        inputEmail.sendKeys("Mirt12@yandex.ru");

        WebElement btnContinueWithEmail = driver.findElement(By.xpath(bookingPage.btnContinueWithEmailXPath));
        btnContinueWithEmail.click();

        WebElement inputPassword = driver.findElement(By.xpath(bookingPage.inputPasswordXPath));
        inputPassword.sendKeys("");

        WebElement btnSignInFinal = driver.findElement(By.xpath(bookingPage.btnSignInFinalXPath));
        btnSignInFinal.click();
        //toDo
    }

    @Test
    public void enterWithValidEmailAndInValidPassword() {
        WebElement btnSignIn = driver.findElement(By.xpath(bookingPage.btnSignInXPath));
        btnSignIn.click();

        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXPath));
        inputEmail.sendKeys("Mirt12@yandex.ru");

        WebElement btnContinueWithEmail = driver.findElement(By.xpath(bookingPage.btnContinueWithEmailXPath));
        btnContinueWithEmail.click();

        WebElement inputPassword = driver.findElement(By.xpath(bookingPage.inputPasswordXPath));
        inputPassword.sendKeys("BBB---");

        WebElement btnSignInFinal = driver.findElement(By.xpath(bookingPage.btnSignInFinalXPath));
        btnSignInFinal.click();
        //toDo
    }
}
