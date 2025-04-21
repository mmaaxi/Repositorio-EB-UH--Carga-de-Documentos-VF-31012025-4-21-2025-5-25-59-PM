package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_007Page;

public class tc_007Steps {

    tc_007Page page = new tc_007Page();

    @Given("El usuario está en la página de carga de documentos")
    public void el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        page.navegarPaginaCargaDocumentos();
    }

    @When("Intenta cargar un archivo sin contenido o corrupto")
    public void intenta_cargar_un_archivo_sin_contenido_o_corrupto() {
        page.cargarArchivoVacioOCorrupto();
    }

    @Then("El sistema identifica la anomalía en el archivo")
    public void el_sistema_identifica_la_anomalia_en_el_archivo() {
        Assert.assertTrue(page.verificarAnomaliaArchivo());
    }

    @Then("Se muestra un mensaje de error que indica que el contenido del archivo es inválido o está dañado")
    public void se_muestra_un_mensaje_de_error_indicando_contenido_invalido_o_daniado() {
        Assert.assertEquals("El contenido del archivo es inválido o está dañado.", page.obtenerMensajeError());
    }
}