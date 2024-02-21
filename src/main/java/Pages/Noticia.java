package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Noticia extends BasePage{
    public Noticia(WebDriver driver) {

        super(driver);
    }


    //Campos (Locators = XPath)

    public String agibank =  "menu-item-3713";
    public String noticia = "menu-item-3718";


   protected String Agibank =  "//li[@id='menu-item-3713']";
    protected String Noticia = "//li[@id='menu-item-3718']";


    //Metodos para executar uma ação em algum campo definido acima
    public void selectnoticia () {

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id(agibank))).perform();
        click(driver.findElement(By.id(noticia)));

    }

}
