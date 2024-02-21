package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inscrever extends BasePage{

    public Inscrever(WebDriver driver) {

        super(driver);
    }

    //Campos (Locators = XPath)
     protected String NameInputField = "//input[@type='text']";
    protected String EmailInputField = "//input[@name='author']";
    protected String SendButton = "//input[@autocomplete='email']";

    //Metodos para executar uma ação em algum campo definido acima
    public void  fillOutTheInscrever() {
        driver.findElement(By.xpath(NameInputField)).sendKeys("Rafaela Oliveira");
        driver.findElement(By.xpath(EmailInputField)).sendKeys("rafaelascalabrinioliveira@gmail.com");
        click(driver.findElement(By.xpath(SendButton)));
    }
}
