package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Inscrever extends BasePage{

    public Inscrever(WebDriver driver) {

        super(driver);
    }

    //Campos (Locators = XPath)

    public String nameInputField = "//*[@id='post-4102']/div/div[10]/form/div[1]/input";
    public String emailInputField = "//*[@id='post-4102']/div/div[10]/form/div[2]/input";
    public String sendButton = "//*[@id='post-4102']/div/div[10]/form/div[5]/button/div";




    //Metodos para executar uma ação em algum campo definido acima
    public void  fillOutTheInscrever() {
        click(driver.findElement(By.id(nameInputField)));
        driver.findElement(By.xpath(nameInputField)).sendKeys("Rafaela Oliveira");
        click(driver.findElement(By.id(emailInputField)));
        driver.findElement(By.xpath(emailInputField)).sendKeys("rafaelascalabrinioliveira@gmail.com");
        click(driver.findElement(By.id(sendButton)));
    }
}
