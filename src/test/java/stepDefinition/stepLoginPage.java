package stepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.loginPage;
import Utility.BrowserDriver;



public class stepLoginPage {

    private WebDriver driver;
    private loginPage LoginPage;
    public stepLoginPage() {
        this.driver = BrowserDriver.getDriver();
        this.LoginPage = new loginPage(driver); // Inicializar HomePage con el driver

    }



    @Given("ingreso a la web silbia")
    public void ingreso_a_la_web_silbia() {
        String titleLogin = "Sign in to Xpedition";
        Assert.assertEquals(titleLogin,driver.getTitle());
    }
    @When("completo mis accesos")
    public void completo_mis_accesos() throws InterruptedException {
        LoginPage.setUserLogin("usrsilbia5@utp.edu.pe");
        LoginPage.setUserPass("utp2024");
        LoginPage.setUserSesion();
        Thread.sleep(2000);
        LoginPage.setBtnCreacionPlanes();
    }
    @Then("Debería ingresar a la plataforma")
    public void debería_ingresar_a_la_plataforma() {
        String titleSesionOk = "Silbia Editor/Aprobador";
        Assert.assertEquals(titleSesionOk,driver.getTitle());

    }



}
