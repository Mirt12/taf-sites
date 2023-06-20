package by.itacademy.tatjana.balashevich.pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pathe {

    @Test
    public void openBrowserTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.pathe.nl");
        String homePageAcceptAllCookiesBtnLocator = "//*[@id='js-cookie-popup']/div/div/span[1]/button";
        WebElement submitCookiesBtn = driver.findElement(By.xpath(homePageAcceptAllCookiesBtnLocator));
        submitCookiesBtn.click();
    }
}
