package by.itacademy.tatjana.balashevich.pages;

import by.itacademy.tatjana.balashevich.utils.LoadHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

public class DominosPage {

    private String btnVoityInHeaderXPath = "//button[@class='custom-button custom-button--primary custom-button--size-medium']";
    private String inputEmailXPath = "//input[@name='email']";
    private String inputPasswordXPath = "//input[@name='password']";
    private String btnVoityInModalXPath = "//button[@class='custom-button custom-button--secondary custom-button--full-width custom-button--size-medium']";

    public void clickBtnToCloseBanner(Wait wait) {
        WebElement btnToCloseBunner = LoadHelper.getElementByXpath(wait, "//button[@class='custom-button custom-button--primary custom-button--size-medium']");
        btnToCloseBunner.click();
    }

    public void clickBtnEnterHeader(WebDriver driver) {
        WebElement btnEnterHeader = driver.findElement(By.xpath(btnVoityInHeaderXPath));
        btnEnterHeader.click();
    }

    public void fillInputFieldEmail(Wait wait, String email) {
        WebElement inputEmail = LoadHelper.getElementByXpath(wait, inputEmailXPath);
        inputEmail.sendKeys(email);
    }

    public void fillInputFieldPwd(Wait wait, String password) {
        WebElement inputPassword = LoadHelper.getElementByXpath(wait, inputPasswordXPath);
        inputPassword.sendKeys(password);
    }

    public void clickBtnEnter(WebDriver driver) {
        WebElement btnEnter = driver.findElement(By.xpath(btnVoityInModalXPath));
        btnEnter.click();
    }
}
