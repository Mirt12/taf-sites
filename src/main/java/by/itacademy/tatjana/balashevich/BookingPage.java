package by.itacademy.tatjana.balashevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

public class BookingPage {

    private String btnSignInXPath = "//span[contains(text(),'Sign in or register')]";
    private String inputEmailXPath = "//input[@id='username']";
    private String btnContinueWithEmailXPath = "//button[@type='submit']/span[contains(text(), 'Continue with email')]";
    private String inputPasswordXPath = "//input[@id='password']";
    private String btnSignInFinalXPath = "//button/span[contains(text(),'Sign in')]";

    public void clickBtnSignIn(Wait wait) {
        WebElement btnSignIn = LoadHelper.getElementByXpath(wait, btnSignInXPath);
        btnSignIn.click();
    }

    public void fillInputFieldEmail(Wait wait, String email) {
        WebElement inputEmail = LoadHelper.getElementByXpath(wait, inputEmailXPath);
        inputEmail.sendKeys(email);
    }

    public void clickBtnContinueWithEmail(Wait wait) {
        WebElement btnContinueWithEmail = LoadHelper.getElementByXpath(wait, btnContinueWithEmailXPath);
        btnContinueWithEmail.click();
    }

    public void fillInputFieldPwd(WebDriver driver, String password) {
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordXPath));
        inputPassword.sendKeys(password);
    }

    public void clickBtnSingInFinal(WebDriver driver) {
        WebElement btnSignInFinal = driver.findElement(By.xpath(btnSignInFinalXPath));
        btnSignInFinal.click();
    }
}
