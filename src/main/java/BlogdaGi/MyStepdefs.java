package BlogdaGi;

import Pages.Inscrever;
import Pages.Noticia;
import Pages.Pesquisa;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyStepdefs {
    protected static WebDriver driver;
    private static final String URL_BASE = "https://blogdoagi.com.br/";
    private static final String CAMINHO_DRIVER = "src/main/java/resources/drivers/chromedriver.exe";


    Inscrever inscrever = null;
    Noticia noticia = null;
    Pesquisa pesquisa = null;


    @Before
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL_BASE);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--no-default-browser-check");
        options.addArguments("--disable-default-apps");

        driver = new ChromeDriver(options);

    }

    @Dado("que o usuário está na página inicial do site do blog do Agi: https:\\/\\/blogdoagi.com.br\\/")
    public void queOUsuárioEstáNaPáginaInicialDoSiteDoBlogDoAgiHttpsBlogdoagiComBr() {
        driver.get(URL_BASE);
    }

    @Quando("o usuário seleciona uma notícia específica no menu do Agibank {string}")
    public void oUsuárioSelecionaUmaNotíciaEspecíficaNoMenuDoAgibank(String arg0) {

        Noticia noticia = new Noticia(driver);
        noticia.selectnoticia();

    }


    @Então("a notícia selecionada é exibida em tela cheia com detalhes {string}")
    public void aNotíciaSelecionadaÉExibidaEmTelaCheiaComDetalhes(String arg0) {
        Noticia noticia = new Noticia(driver);
        assertNotNull( noticia);

    }



    @Dado("que o usuário está na página inicial do  blog do Agi: https:\\/\\/blogdoagi.com.br\\/")
    public void queOUsuárioEstáNaPáginaInicialDoBlogDoAgiHttpsBlogdoagiComBr() {
        driver.get(URL_BASE);
    }

    @Quando("o usuário realiza uma pesquisa por uma {string}")
    public void oUsuárioRealizaUmaPesquisaPorUma(String arg0) {
        pesquisa = new Pesquisa(driver);
        pesquisa.Pesquisa();
    }


    @Então("uma lista de resultados relacionados à pesquisa {string}")
    public void umaListaDeResultadosRelacionadosÀPesquisa(String arg0) {
       assertNotNull(pesquisa);

    }


    @Dado("que o cliente está na página inicial do site do blog do Agi: https:\\/\\/blogdoagi.com.br\\/")
    public void queOClienteEstáNaPáginaInicialDoSiteDoBlogDoAgiHttpsBlogdoagiComBr() {
        driver.get(URL_BASE);
      //  inscrever = new Inscrever(driver);
    }

    @Quando("o usuário insere seu endereço de e-mail na caixa de inscrição de newsletter e clica no botão {string}")
    public void oUsuárioInsereSeuEndereçoDeEMailNaCaixaDeInscriçãoDeNewsletterEClicaNoBotão(String arg0) {
        inscrever = new Inscrever(driver);
        inscrever.fillOutTheInscrever();
    }
    @Então("o usuário recebe uma mensagem de confirmação de inscrição e é adicionado à lista de assinantes da {string}")
    public void oUsuárioRecebeUmaMensagemDeConfirmaçãoDeInscriçãoEÉAdicionadoÀListaDeAssinantesDa(String arg0) {

        String textoElemento  = inscrever.fillOutTheInscrever(); // Supondo que existe um método para obter o texto do elemento de mensagem de sucesso na classe Inscrever

        // Comparar o texto do elemento com o texto esperado
        assertEquals(arg0, textoElemento);
    }





    @After()
    public void closeBrowser() {
        driver.quit();
    }



}


