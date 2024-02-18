package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pesquisa extends BasePage {

    private static final String URL_PRINCIPAL = "https://blogdoagi.com.br/";

        public Pesquisa(WebDriver driver) {
            super(driver);
        }


        //Campos (Locators = XPath)
        protected String BtnLupa = "//select[@id='ast-desktop-header']/div[1]/div/div/div/div[3]/div[2]/div/div/a/span[2]/svg";
        protected String SearchField = "//select[@id='search-field']";

        //Metodos para executar uma ação em algum campo definido acima
        public void Pesquisa () {

            click(driver.findElement(By.xpath(BtnLupa)));
            driver.findElement(By.xpath(SearchField)).sendKeys("Carreira");

        }
}
