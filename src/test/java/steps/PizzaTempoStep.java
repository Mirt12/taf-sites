package steps;

import utils.LoadHelper;
import pages.PizzatempoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class PizzaTempoStep {
    WebDriver driver;
    public PizzaTempoStep(WebDriver driver){
        this.driver = driver;
    }
    public void fillLoginFormAndSubmit(String email, String password) {
        PizzatempoPage pizzatempoPage = new PizzatempoPage(driver);
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);

        pizzatempoPage.fillInputFieldEmail(wait, email);
        pizzatempoPage.fillInputFieldPassword(password);
        pizzatempoPage.clickSearchButton();
    }
}
