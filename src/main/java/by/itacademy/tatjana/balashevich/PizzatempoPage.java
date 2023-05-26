package by.itacademy.tatjana.balashevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import java.util.function.Function;

public class PizzatempoPage {

    static final String inputEmailXPath = "//input[@name='astroauth_login']";
    static final String inputPasswordXPath = "//input[@name='astroauth_pass']";
    static final String btnSearchXPath = "//input[@name='astroauth_submit']";

    public void clickSearchButton(WebDriver driver) {
        WebElement btnSearch = driver.findElement(By.xpath(btnSearchXPath));
        btnSearch.click();
    }

    public void fillInputFieldEmail(Wait wait, String email) {
        WebElement inputEmail = (WebElement) wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath(inputEmailXPath));
            }
        });
        inputEmail.sendKeys(email);
    }

    public void fillInputFieldPassword(WebDriver driver, String password) {
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordXPath));
        inputPassword.sendKeys(password);
    }
}
