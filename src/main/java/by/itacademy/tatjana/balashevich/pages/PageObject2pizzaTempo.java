package by.itacademy.tatjana.balashevich.pages;

import by.itacademy.tatjana.balashevich.driver.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject2pizzaTempo {
    private WebDriver driver;
    private String buttonSubmitLocatorByName = "astroauth_submit";
    private String url = "https://www.pizzatempo.by";

    public PageObject2pizzaTempo() {
        this.driver = DriverSingleton.getDriver();
    }

    public PageObject2pizzaTempo getUrl(){
        driver.get(url);
        return this;
    }

    public PageObject2pizzaTempo clickBtnSubmit(){
        WebElement buttonSubmitElement = driver.findElement(By.name(buttonSubmitLocatorByName));
        buttonSubmitElement.click();
        return this;
    }
}
