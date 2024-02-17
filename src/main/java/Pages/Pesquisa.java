package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pesquisa extends BasePage {

        public Pesquisa(WebDriver driver) {
            super(driver);
        }


        //Campos (Locators = XPath)
        protected String BtnLupa = "//select[@id='ast-desktop-header']";
        protected String SearchField = "//select[@id='search-field']";

        //Metodos para executar uma ação em algum campo definido acima
        public void Noticia () {

            click(driver.findElement(By.xpath(BtnLupa)));
            driver.findElement(By.xpath(SearchField)).sendKeys("Carreira");

        }
}
