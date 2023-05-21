package by.itacademy.tatjana.balashevich;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BookingTest {
    BookingPage bookingPage = new BookingPage();
    ChromeOptions options = new ChromeOptions();

    @Test
    public void enterWithEmptyEmail() {
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.booking.com");

        WebElement btnSignIn = driver.findElement(By.xpath(bookingPage.btnSignInXPath));
        btnSignIn.click();

        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXPath));
        inputEmail.sendKeys("");

        WebElement btnContinueWithEmail = driver.findElement(By.xpath(bookingPage.btnContinueWithEmailXPath));
        btnContinueWithEmail.click();
        //toDo
        driver.quit();
    }

    @Test
    public void enterWithInvalidEmail() {
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.booking.com");
        WebElement btnSignIn = driver.findElement(By.xpath(bookingPage.btnSignInXPath));
        btnSignIn.click();

        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXPath));
        inputEmail.sendKeys("sodab92025dekaps.com");

        WebElement btnContinueWithEmail = driver.findElement(By.xpath(bookingPage.btnContinueWithEmailXPath));
        btnContinueWithEmail.click();
        //toDo
        driver.quit();
    }

    @Test
    public void enterWithValidEmail() {
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.booking.com");
        WebElement btnSignIn = driver.findElement(By.xpath(bookingPage.btnSignInXPath));
        btnSignIn.click();

        WebElement inputEmail = driver.findElement(By.xpath(bookingPage.inputEmailXPath));
        inputEmail.sendKeys("sodab92025@dekaps.com");

        WebElement btnContinueWithEmail = driver.findElement(By.xpath(bookingPage.btnContinueWithEmailXPath));
        btnContinueWithEmail.click();
        //toDo
        driver.quit();
    }

    @Test
    public void enterWithValidEmailAndEmptyPassword() {
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.booking.com");
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
        driver.quit();
    }

    @Test
    public void enterWithValidEmailAndInValidPassword() {
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.booking.com");
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
        driver.quit();
    }
}
