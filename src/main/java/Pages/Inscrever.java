package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Inscrever extends BasePage{

    public Inscrever(WebDriver driver) {

        super(driver);
        //WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Abre a página web
        driver.get("https://blogdoagi.com.br/");

        // Realiza o casting para JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Rola para baixo a página
        js.executeScript("window.scrollBy(0, 2000)");

        // Espera um pouco para você ver o resultado
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        }


    //Campos (Locators = XPath)

    public String nome = "//*[@class='uagb-forms-name-input uagb-forms-input']";
    public String email = "//*[@class='uagb-forms-email-input uagb-forms-input']";
    public String botaoenviar = "//*[@class='uagb-forms-main-submit-button wp-block-button__link']";




    //Metodos para executar uma ação em algum campo definido acima
    public void  fillOutTheInscrever() {

         driver.findElement(By.xpath(nome)).sendKeys("Rafaela");
        driver.findElement(By.xpath(email)).sendKeys("rafaelascalabrinioliveira@gmail.com");
        click(driver.findElement(By.xpath(botaoenviar)));
        String texto = driver.findElement(By.xpath(textoElemento)).getText();
        System.out.println(texto);


        return texto;
    }
}
