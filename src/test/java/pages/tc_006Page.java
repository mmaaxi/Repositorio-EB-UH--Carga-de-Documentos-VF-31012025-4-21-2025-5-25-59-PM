package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {

    WebDriver driver;

    By botonCargaDocumento = By.id("uploadButton");
    By listadoDocumentos = By.id("documentList");
    By seccionDocumentacion = By.id("documentationSection");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaDeCarga() {
        driver.get("http://url_de_la_pagina_de_carga");
    }

    public void cargarDocumentoValido() {
        driver.findElement(botonCargaDocumento).sendKeys("/ruta/al/documento_valido");
        // Suponemos que existe algún botón o acción adicional para completar la carga, como un botón de "Submit"
        driver.findElement(By.id("submitUpload")).click();
    }

    public boolean verificarDocumentoEnListado() {
        // Verificar que el documento se mostró en el listado de documentos
        return driver.findElement(listadoDocumentos).getText().contains("documento_valido");
    }

    public void navegarASeccionDeDocumentacion() {
        driver.findElement(seccionDocumentacion).click();
    }

    public boolean verificarOrdenYFormatoDelDocumento() {
        // Verificar que el documento está en el orden y formato esperado
        // Detalles de implementación según la interfaz específica
        return true; // Esto debería tener lógica para comprobar el orden y formato
    }
}