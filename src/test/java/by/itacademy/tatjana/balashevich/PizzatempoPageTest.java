package by.itacademy.tatjana.balashevich;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class PizzatempoPageTest {
    WebDriver driver;
    PizzatempoPage pizzatempoPage;
    PizzaTempoStep pizzaTempoStep = new PizzaTempoStep();

    @Before
    public void testSetUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-cache");
        driver = new ChromeDriver(options);
        pizzatempoPage = new PizzatempoPage(driver);
        driver.manage().window().maximize();
        driver.get("https://www.pizzatempo.by");
    }

    @After
    public void testToFinish() {
        driver.quit();
    }

    @Test
    public void enterWithEmptyEmailAndEmptyPassword() {
        pizzaTempoStep.fillLoginFormAndSubmit("", "");
        //toDo
    }

    @Test
    public void enterWithInvalidEmail() {
        pizzaTempoStep.fillLoginFormAndSubmit("@@@@@@", "");
        //toDo
    }

    @Test
    public void enterWithEmptyEmailAndAnyPassword() {
        pizzaTempoStep.fillLoginFormAndSubmit("", Util.generatePWD());
        //toDo
    }

    @Test
    public void enterWithValidEmailAndEmptyPassword() {
        pizzaTempoStep.fillLoginFormAndSubmit(Util.generateEmail(), "");
        //toDo
    }

    @Test
    public void enterWithValidEmailAndAnyPassword() {
        pizzaTempoStep.fillLoginFormAndSubmit(Util.generateEmail(), Util.generatePWD());
        //toDo
    }
}
