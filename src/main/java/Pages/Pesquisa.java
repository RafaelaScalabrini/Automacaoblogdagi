package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Pesquisa extends BasePage {

    private static final String URL_PRINCIPAL = "https://blogdoagi.com.br/";

        public Pesquisa(WebDriver driver) {

            super(driver);
        }


        //Campos (Locators = XPath)
        public String btnLupa = "//a[@class='slide-search astra-search-icon']";
        public String campobusca = "search-field";

        //Metodos para executar uma ação em algum campo definido acima
        public void Pesquisa() {

            click(driver.findElement(By.xpath(btnLupa)));
            driver.findElement(By.id(campobusca)).sendKeys("carreira");
            driver.findElement(By.id(campobusca)).sendKeys(Keys.ENTER);
        }}


