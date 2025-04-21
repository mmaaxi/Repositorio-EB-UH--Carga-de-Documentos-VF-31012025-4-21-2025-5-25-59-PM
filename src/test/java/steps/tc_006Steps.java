package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_006Page;

public class tc_006Steps {

    WebDriver driver;
    tc_006Page page = new tc_006Page(driver);

    @Given("El usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        page.navegarAPaginaDeCarga();
    }

    @When("El usuario carga un documento válido")
    public void elUsuarioCargaUnDocumentoValido() {
        page.cargarDocumentoValido();
    }

    @Then("El documento se carga y se visualiza en el listado de documentos")
    public void elDocumentoSeCargaYSeVisualizaEnElListadoDeDocumentos() {
        Assert.assertTrue(page.verificarDocumentoEnListado());
    }

    @When("El usuario navega a la sección de documentación")
    public void elUsuarioNavegaALaSeccionDeDocumentacion() {
        page.navegarASeccionDeDocumentacion();
    }

    @Then("El documento se muestra en el orden y formato esperado según la interfaz")
    public void elDocumentoSeMuestraEnElOrdenYFormatoEsperadoSegunLaInterfaz() {
        Assert.assertTrue(page.verificarOrdenYFormatoDelDocumento());
    }
}