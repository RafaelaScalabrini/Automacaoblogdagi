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

public class MyStepdefs {
    protected static WebDriver driver;
    private static final String URL_BASE = "https://blogdoagi.com.br/";
    private static final String CAMINHO_DRIVER = "src/main/resources/drivers/chrome/chromedriver.exe";


    Inscrever inscrever = null;
    Noticia noticia = null;
    Pesquisa pesquisa = null;


    @Before
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--no-default-browser-check");
        options.addArguments("--disable-default-apps");

        driver = new ChromeDriver(options);

    }
    public MyStepdefs() {

    }
        @Dado("^que o usuário está na página inicial do aplicativo$")
            private void que_o_usuário_está_na_página_inicial_do_aplicativo(){

                noticia = new Noticia(driver);
            }



        @Quando("^o usuário seleciona uma notícia específica no menu do Agibank$")
            private void o_usuário_seleciona_uma_notícia_específica_no_menu_do_Agibank(){
                noticia.selectnoticia();

            }


                @Então("^a notícia selecionada é exibida em tela cheia com detalhes$")
                    private void a_notícia_selecionada_é_exibida_em_tela_cheia_com_detalhes(){
                        noticia.selectnoticia();

                    }

        @Dado("^que o usuário está na página inicial do site do blog do Agi: https://blogdoagi\\.com\\.br/$")
            private void que_o_usuário_está_na_página_inicial_do_site() {
                pesquisa = new Pesquisa(driver);
            }

        @Quando("^o usuário realiza uma pesquisa por uma carreira$")
            private void o_usuário_realiza_uma_pesquisa_por_uma_arreira() {
                pesquisa.Pesquisa();
            }
        @Então("^uma lista de resultados relacionados à pesquisa é exibida$")
            private void uma_lista_de_resultados_relacionados_à_pesquisa_é_exibida() {
                pesquisa.Pesquisa();
            }
        @Dado("^que o usuário está na página inicial do Blog do Agi$")
            private void que_o_usuário_está_na_página_inicial() {
            inscrever = new Inscrever(driver);
        }
        @Quando("^o usuário insere seu endereço de e-mail na caixa de inscrição de newsletter e clica no botão \"([^\"]*)\"$")
            private void o_usuário_insere_seu_endereço_de_e_mail() {
                inscrever.fillOutTheInscrever();
        }
       @Então("^o usuário recebe uma mensagem de confirmação de inscrição e é adicionado à lista de assinantes da newsletter$")
           private void o_usuário_recebeumamensagem() {
               inscrever.fillOutTheInscrever();
           }

           @After()
           public void closeBrowser() {
               driver.quit();
           }

           }
