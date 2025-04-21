package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_004Page;

public class tc_004Steps {
    tc_004Page page = new tc_004Page();

    @Given("que el usuario ha cargado un documento válido en el sistema")
    public void cargarDocumentoValido() {
        page.cargarDocumento();
        Assert.assertTrue(page.verificarDocumentoEnListado());
    }

    @When("el usuario selecciona la opción 'Eliminar documento' para el archivo cargado")
    public void eliminarDocumento() {
        page.seleccionarEliminarDocumento();
        Assert.assertTrue(page.verificarSolicitudConfirmacion());
    }

    @When("el usuario confirma la eliminación")
    public void confirmarEliminacion() {
        page.confirmarEliminar();
    }

    @Then("el documento no aparece en la lista y no aparece en futuras consultas")
    public void verificarDocumentoNoExiste() {
        Assert.assertFalse(page.verificarDocumentoEnListado());
    }
}