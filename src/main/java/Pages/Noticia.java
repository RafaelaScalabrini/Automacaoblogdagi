package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Noticia extends BasePage{
    public Noticia(WebDriver driver) {
        super(driver);
    }


    //Campos (Locators = XPath)
    protected String Agibank = "//select[@id='menu-item-3713']";
    protected String Noticia = "//select[@id='ast-hf-mobile-menu']";

    //Metodos para executar uma ação em algum campo definido acima
    public void Noticia () {

        click(driver.findElement(By.xpath(Agibank)));
        selectOption(driver.findElement(By.xpath(Noticia)),"Noticia");

    }

}