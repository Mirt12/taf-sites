package by.itacademy.tatjana.balashevich.tests;

import by.itacademy.tatjana.balashevich.driver.DriverSingleton;
import by.itacademy.tatjana.balashevich.pages.PageObject2pizzaTempo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PizzaTempoTest2 {
    @Test
    public void testAlert(){
        PageObject2pizzaTempo po = new PageObject2pizzaTempo();
        WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(20));
        po.getUrl().clickBtnSubmit();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        alert.accept();
        Assertions.assertEquals("Заполните форму", text);
        //Assertions.assertEquals("Заполните форму", po.getAlertTest());
    }

}
