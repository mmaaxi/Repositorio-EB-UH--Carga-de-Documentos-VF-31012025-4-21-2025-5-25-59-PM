package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page page = new tc_009Page();

    @Given("^El usuario está autenticado en el sistema$")
    public void usuario_autenticado() {
        page.autenticarUsuario();
    }

    @When("^El usuario carga un documento válido$")
    public void carga_documento_valido() {
        page.cargarDocumentoValido();
    }

    @Then("^El documento se carga sin errores$")
    public void documento_se_carga_sin_errores() {
        assertTrue(page.verificarCargaExitosa());
    }

    @Then("^El usuario recibe una notificación de éxito$")
    public void usuario_recibe_notificacion_exito() {
        assertTrue(page.verificarNotificacionExito());
    }
}