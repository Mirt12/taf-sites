package by.itacademy.tatjana.balashevich.pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BolComPage {
    @Test
    public void openBrowserTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.bol.com/nl/nl/");
        String homePageAcceptAllCookiesBtnLocator ="//button[@id='js-first-screen-accept-all-button']";
        WebElement submitCookiesBtn = driver.findElement(By.xpath(homePageAcceptAllCookiesBtnLocator));
        submitCookiesBtn.click();
        //to check GET response
        driver.quit();
    }
    @Test
    public void openLoginForm(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.bol.com/nl/nl/");
        String homePageAcceptAllCookiesBtnLocator ="//button[@id='js-first-screen-accept-all-button']";
        WebElement submitCookiesBtn = driver.findElement(By.xpath(homePageAcceptAllCookiesBtnLocator));
        submitCookiesBtn.click();
        //open LoginForm:
        String homePageInloggenLinkLocator = "//header//span[@class='u-show-block@screen-xl-up' and contains(text(),'Inloggen')]";
        WebElement loginFormLink = driver.findElement(By.xpath(homePageInloggenLinkLocator));
        loginFormLink.click();
        //to check GET response
        driver.quit();
    }

    @Test
    public void toFillLoginFormByValidData(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.bol.com/nl/nl/");
        String homePageAcceptAllCookiesBtnLocator ="//button[@id='js-first-screen-accept-all-button']";
        WebElement submitCookiesBtn = driver.findElement(By.xpath(homePageAcceptAllCookiesBtnLocator));
        submitCookiesBtn.click();
        String homePageInloggenLinkLocator = "//header//span[@class='u-show-block@screen-xl-up' and contains(text(),'Inloggen')]";
        WebElement loginFormLink = driver.findElement(By.xpath(homePageInloggenLinkLocator));
        loginFormLink.click();
        //to fill the form
        String loginFormInputEmailLocator = "//input[@id='login_email']";
        String loginFormInputPwdLocator = "//input[@id='login_password']";
        String loginFormInloggenButtonLocator = "//form[@id='existinguser']//button[@name='submit']";
        WebElement emailInputField = driver.findElement(By.xpath(loginFormInputEmailLocator));
        emailInputField.sendKeys("Mirt12@yandex.ru");
        WebElement pwdInputField = driver.findElement(By.xpath(loginFormInputPwdLocator));
        pwdInputField.sendKeys("cocosankA_9");
        WebElement inloggenButton = driver.findElement(By.xpath(loginFormInloggenButtonLocator));
        inloggenButton.click();
        //driver.quit();
    }




}
