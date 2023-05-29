package by.itacademy.tatjana.balashevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import java.util.function.Function;

public class PizzatempoPage {
    private WebDriver driver;
    private  String inputEmailXPath = "//input[@name='astroauth_login']";
    private  String inputPasswordXPath = "//input[@name='astroauth_pass']";
    private  String btnSearchXPath = "//input[@name='astroauth_submit']";
    //constructor for WebDriver:
    public PizzatempoPage(WebDriver newDriver){
        driver = newDriver;
    }

    public void clickSearchButton() {
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

    public void fillInputFieldPassword(String password) {
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordXPath));
        inputPassword.sendKeys(password);
    }
}
