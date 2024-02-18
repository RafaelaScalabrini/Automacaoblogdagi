package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inscrever extends BasePage{

    public Inscrever(WebDriver driver) {

        super(driver);
    }

    //Campos (Locators = XPath)
    protected String NameInputField = "//input[@id='post-4102']/div/div[10]/form/div[1]/input]";
    protected String EmailInputField = "//input[@id='post-4102']/div/div[10]/form/div[2]/input]";
    protected String SendButton = "//button[@id='post-4102']/div/div[10]/form/div[5]/button/div]";

    //Metodos para executar uma ação em algum campo definido acima
    public void  fillOutTheInscrever() {
        driver.findElement(By.xpath(NameInputField)).sendKeys("Rafaela Oliveira");
        driver.findElement(By.xpath(EmailInputField)).sendKeys("rafaelascalabrinioliveira@gmail.com");
        click(driver.findElement(By.xpath(SendButton)));
    }
}
