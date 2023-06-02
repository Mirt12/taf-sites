package steps;

import pages.DominosPage;
import utils.LoadHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class DominosStep {
    public void openLoginfillLoginFormAndSubmit(String email, String password) {
        DominosPage dominosPage;
        WebDriver driver = new ChromeDriver();
        dominosPage = new DominosPage();
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);

        dominosPage.clickBtnToCloseBanner(wait);
        dominosPage.clickBtnEnterHeader(driver);
        dominosPage.fillInputFieldEmail(wait, email);
        dominosPage.fillInputFieldPwd(wait, password);
        dominosPage.clickBtnEnter(driver);
    }
}
