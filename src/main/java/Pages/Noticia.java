package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Noticia extends BasePage{
    public Noticia(WebDriver driver) {

        super(driver);
    }


    //Campos (Locators = XPath)
   protected String Agibank =  "//li[@id='menu-item-3713']";
    protected String Noticia = "//li[@id='menu-item-3718']";

    //Metodos para executar uma ação em algum campo definido acima
    public void selectnoticia () {

        click(driver.findElement(By.xpath(Agibank)));
        click(driver.findElement(By.xpath(Noticia)));

    }

}
