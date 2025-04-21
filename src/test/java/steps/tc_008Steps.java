package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import pages.tc_008Page;

public class tc_008Steps {
    tc_008Page page = new tc_008Page();

    @Given("que el usuario está en la página de carga de documentos")
    public void usuarioEnPaginaCargaDocumentos() {
        page.navigateToDocumentUploadPage();
    }

    @When("el usuario selecciona múltiples archivos de diferentes formatos y tamaños")
    public void usuarioSeleccionaMultiplesArchivos() {
        page.selectMultipleFiles();
    }

    @Then("el sistema acepta múltiples archivos simultáneamente sin bloqueo")
    public void sistemaAceptaArchivos() {
        assertTrue(page.systemAcceptsMultipleFiles());
    }

    @When("el usuario inicia la carga de todos los documentos a la vez")
    public void usuarioIniciaCargaDocumentos() {
        page.startUploadingFiles();
    }

    @Then("cada documento se procesa de manera individual y se muestra el estado de carga")
    public void cadaDocumentoSeProcesa() {
        assertTrue(page.checkProcessingStatusForEachFile());
    }

    @When("el usuario verifica que todos los documentos se carguen correctamente")
    public void usuarioVerificaCargaCorrecta() {
        page.verifyAllFilesUploaded();
    }

    @Then("todos los archivos se muestran listados con sus respectivas validaciones de formato y tamaño")
    public void archivosSeMuestranListados() {
        assertTrue(page.allFilesListedWithValidations());
    }
}