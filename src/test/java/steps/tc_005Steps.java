package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {
    tc_005Page page = new tc_005Page();

    @Given("el usuario ha seleccionado un documento previamente cargado")
    public void seleccionar_documento() {
        page.seleccionarDocumento();
    }

    @When("el usuario hace clic en la opción 'Descargar'")
    public void descargar_documento() {
        page.descargarDocumento();
    }

    @Then("el proceso de descarga se inicia y el archivo se guarda en la ubicación predeterminada del usuario")
    public void verificar_descarga() {
        Assert.assertTrue(page.verificarDescarga());
    }
    
    @Then("el documento se abre correctamente y sin pérdida de información")
    public void verificar_integridad_y_apertura() {
        Assert.assertTrue(page.verificarIntegridadYApertura());
    }
}