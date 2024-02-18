package BlogdaGi;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  io.cucumber.java.Before;


import Pages.*;

import java.util.concurrent.TimeUnit;

public class Steps {
    protected static WebDriver driver;
    private static final String URL_BASE = "https://blogdoagi.com.br/";
    private static final String CAMINHO_DRIVER = "src/test/resources/drivers/chrome/chromedriver.exe";

    @Before
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

//Colocar os steps aqui
public Steps() {
    @Dado("^que o usuário está na página inicial do aplicativo$", () -> {
        private void Dado(String s, Object o) {
        }
    });

    @Quando("^o usuário seleciona uma notícia específica no menu do Agibank$", () -> {
        private void Quando(String s, Object o) {
        }
    }
    });

    @Entao("^a notícia selecionada é exibida em tela cheia com detalhes$", () -> {
        private void Então(String s, Object o) {
        }
    });

    @Dado("^que o usuário está na página inicial do site do blog do Agi: https://blogdoagi\\.com\\.br/$", () -> {
        private void Dado(String s, Object o) {
        }
    });
    @Quando(("^o usuário realiza uma pesquisa por uma carreira$", () -> {
        private void Quando(String s, Object o) {
        }
    });
   @Entao("^uma lista de resultados relacionados à pesquisa é exibida$", () -> {
       private void Então(String s, Object o) {
       }
    });
    @Dado("^que o usuário está na página inicial do Blog do Agi$", () -> {
        private void Dado(String s, Object o) {
        }
    });
    @Quando("^o usuário insere seu endereço de e-mail na caixa de inscrição de newsletter e clica no botão \"([^\"]*)\"$", (String arg0) -> {
        private void Quando(String s, Object o) {
        }
    });
    @Então("^o usuário recebe uma mensagem de confirmação de inscrição e é adicionado à lista de assinantes da newsletter$", () -> {
        private void Então(String s, Object o) {
        }
    });


}

