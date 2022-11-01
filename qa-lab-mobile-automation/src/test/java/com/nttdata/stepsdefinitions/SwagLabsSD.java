package com.nttdata.stepsdefinitions;
import com.nttdata.steps.SwagLabsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class SwagLabsSD {

    @Steps
    SwagLabsSteps swagLabsSteps;

    //LOGIN

    @Given("estoy en la App movil SwagLabs")
    public void estoyEnLaAppMovilSwagLabs() {

    }

    @When("ingreso el nombre de usuario {string}")
    public void ingresoElNombreDeUsuario(String sUsername) {
        swagLabsSteps.typeUser(sUsername);
    }

    @And("ingreso la clave del usuario {string}")
    public void ingresoLaClaveDelUsuario(String sPassword) {
        swagLabsSteps.typeClave(sPassword);
    }

    @And("click en el boton login")
    public void clickEnElBotonLogin() {
        swagLabsSteps.clickIngresar();
    }

    //VALIDACION

    @Then("muestra en la pagina principal el texto {string}")
    public void muestraEnLaPaginaPrincipalElTexto(String sProducts) {
        Assert.assertEquals(swagLabsSteps.getResultText(), sProducts);
    }

    @And("muestra en la pagina principal por lo menos un item")
    public void muestraEnLaPaginaPrincipalPorLoMenosUnItem() {
        swagLabsSteps.getResultItem();

    }
}
