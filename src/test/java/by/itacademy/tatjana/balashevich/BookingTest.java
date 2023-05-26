package by.itacademy.tatjana.balashevich;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;

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
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        bookingPage.clickBtnSignIn(wait);
        bookingPage.fillInputFieldEmail(wait, "");
        bookingPage.clickBtnContinueWithEmail(wait);
        //toDo
    }

    @Test
    public void enterWithInvalidEmail() {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        bookingPage.clickBtnSignIn(wait);
        bookingPage.fillInputFieldEmail(wait, "sodab92025dekaps.com");
        bookingPage.clickBtnContinueWithEmail(wait);
        //toDo
    }

    @Test
    public void enterWithValidEmail() {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        bookingPage.clickBtnSignIn(wait);
        bookingPage.fillInputFieldEmail(wait, "sodab92025@dekaps.com");
        bookingPage.clickBtnContinueWithEmail(wait);
        //toDo
    }

    @Test
    public void enterWithValidEmailAndEmptyPassword() {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        bookingPage.clickBtnSignIn(wait);
        bookingPage.fillInputFieldEmail(wait, "Mirt12@yandex.ru");
        bookingPage.clickBtnContinueWithEmail(wait);
        bookingPage.fillInputFieldPwd(driver, "");
        bookingPage.clickBtnSingInFinal(driver);
        //toDo
    }

    @Test
    public void enterWithValidEmailAndInValidPassword() {
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);
        bookingPage.clickBtnSignIn(wait);
        bookingPage.fillInputFieldEmail(wait, "Mirt12@yandex.ru");
        bookingPage.clickBtnContinueWithEmail(wait);
        bookingPage.fillInputFieldPwd(driver, "BBB---");
        bookingPage.clickBtnSingInFinal(driver);
        //toDo
    }
}
