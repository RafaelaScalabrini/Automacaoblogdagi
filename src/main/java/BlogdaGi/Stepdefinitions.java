package BlogdaGi;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Stepdefinitions {
    protected static WebDriver driver;
    private static final String URL_BASE = "https://blogdoagi.com.br/";
    private static final String CAMINHO_DRIVER = "src\\main\\resources\\DriverChrome\\chromedriver.exe";

    Inscrever inscrever = null;
    Noticia noticia = null;
    Pesquisa pesquisa = null;


    @Before
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    public Stepdefinitions() {
        Given("^that the user is on the application's home page$", () -> {
            public void Noticia () {
               driver.get("https://blogdoagi.com.br/");
        });
        When("^the user selects a specific news item from the Agibank menu$", () -> {
            public void iEnterTheEnterVehicleData() {
                vehicleDataPage = new VehicleDataPage(driver);
        }
        });
        Then("^the selected news is displayed in full screen with details$", () -> {
            public void iEnterTheEnterVehicleData() {
                vehicleDataPage = new VehicleDataPage(driver);
        }
        });
        Given("^that the user is on the home page of the Agi blog website: https://blogdoagi\\.com\\.br/$", () -> {
            public void iEnterTheEnterVehicleData() {
                vehicleDataPage = new VehicleDataPage(driver);
        }
        });
        When("^the user searches for a career$", () -> {
            public void iEnterTheEnterVehicleData() {
                vehicleDataPage = new VehicleDataPage(driver);
        }
        });
        Then("^a list of results related to the search is displayed$", () -> {
            public void iEnterTheEnterVehicleData() {
                vehicleDataPage = new VehicleDataPage(driver);
        }
        });
        Given("^that the user is on the Agi Blog home page$", () -> {
            public void iEnterTheEnterVehicleData() {
                vehicleDataPage = new VehicleDataPage(driver);
        }
        });
        When("^the user enters their email address in the newsletter subscription box and clicks the \"([^\"]*)\" button$", (String arg0) -> {
            public void iEnterTheEnterVehicleData() {
                vehicleDataPage = new VehicleDataPage(driver); });
        Then("^user then receives a subscription confirmation message and is added to the newsletter subscriber list$", () -> {
            public void iEnterTheEnterVehicleData() {
                vehicleDataPage = new VehicleDataPage(driver);
        });

        @After()
        public void closeBrowser () {
            driver.quit();
        }

    }
}
