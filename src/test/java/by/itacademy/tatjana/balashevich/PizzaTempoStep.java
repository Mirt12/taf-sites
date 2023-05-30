package by.itacademy.tatjana.balashevich;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class PizzaTempoStep {
    public void fillLoginFormAndSubmit(String email, String password) {
        PizzatempoPage pizzatempoPage;
        WebDriver driver = new ChromeDriver();
        pizzatempoPage = new PizzatempoPage(driver);
        Wait<WebDriver> wait = LoadHelper.wait30seconds(driver);

        pizzatempoPage.fillInputFieldEmail(wait, email);
        pizzatempoPage.fillInputFieldPassword(password);
        pizzatempoPage.clickSearchButton();
    }
}
