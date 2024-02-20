package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Noticia extends BasePage{
    public Noticia(WebDriver driver) {

        super(driver);
    }


    //Campos (Locators = XPath)
    protected String Agibank = "//li[@id='ast-hf-mobile-menu']/li[1]/a";
    protected String Noticia = "//li[@id='ast-hf-mobile-menu']/li[1]/ul/li[2]/a";

    //Metodos para executar uma ação em algum campo definido acima
    public void selectnoticia () {

        click(driver.findElement(By.xpath(Agibank)));
        click(driver.findElement(By.xpath(Noticia)));

    }

}
