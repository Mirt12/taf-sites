package by.itacademy.tatjana.balashevich.pages;

import by.itacademy.tatjana.balashevich.utils.LoadHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

public class TripadvisorPage {

    private String btnCookiesXPath = "//*[@id='onetrust-accept-btn-handler']";
    private String btnSignInXPath = "//span[contains(text(),'Sign in')]";
    private String btnContinueWithEmailXPath = "//span[contains(text(),'Continue with email')]";
    private String inputEmailXPath = "//input[@id='regSignIn.email']";
    private String inputPasswordXPath = "//input[@id='regSignIn.password']";
    private String btnSingInFrameXPath = "//div[@id='regBody']//button[@type='submit' and contains(text(),'Sign in')]";

    public void clickBtnCookies(Wait wait) {
        WebElement btnCookies = LoadHelper.getElementByXpath(wait, btnCookiesXPath);
        btnCookies.click();
    }

    public void clickBtnSignIn(WebDriver driver) {
        WebElement btnSignIn = driver.findElement(By.xpath(btnSignInXPath));
        btnSignIn.click();
    }

    public void clickBtnContinueWithEmail(Wait wait) {
        WebElement btnContinueWithEmail = LoadHelper.getElementByXpath(wait, btnContinueWithEmailXPath);
        btnContinueWithEmail.click();
    }

    public void fillInputFieldEmail(Wait wait, String email) {
        WebElement inputEmail = LoadHelper.getElementByXpath(wait, inputEmailXPath);
        inputEmail.sendKeys(email);
    }

    public void fillInputFieldPwd(Wait wait, String password) {
        WebElement inputPassword = LoadHelper.getElementByXpath(wait, inputPasswordXPath);
        inputPassword.sendKeys(password);
    }

    public void clickBtnSignInFrame(Wait wait) {
        WebElement btnSignInFrame = LoadHelper.getElementByXpath(wait, btnSingInFrameXPath);
        btnSignInFrame.click();
    }
}
