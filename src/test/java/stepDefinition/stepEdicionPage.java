/* stepDefinition;

import Utility.BrowserDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.edicionPage;


public class stepEdicionPage {

    private WebDriver driver;
    private edicionPage EdicionPage;
    public stepEdicionPage() {
        this.driver = BrowserDriver.getDriver();
        this.EdicionPage = new edicionPage(driver); // Inicializar HomePage con el driver
    }

    @Given("Estoy en cambios curriculares")
    public void estoy_en_cambios_curriculares() {

    }
    @When("Ingreso a la pantalla de edición de un curso")
    public void ingreso_a_la_pantalla_de_edición_de_un_curso() {
       EdicionPage.setBtnCreacionPlanes();
    }
    @Then("Debería guardar la edición")
    public void debería_guardar_la_edición() {

    }

}*/
