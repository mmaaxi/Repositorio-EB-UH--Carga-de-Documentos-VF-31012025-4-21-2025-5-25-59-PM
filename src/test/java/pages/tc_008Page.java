package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc_008Page {
    WebDriver driver;

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToDocumentUploadPage() {
        driver.get("url_de_la_pagina_de_carga");
    }

    public void selectMultipleFiles() {
        WebElement uploadElement = driver.findElement(By.id("fileUpload"));
        uploadElement.sendKeys("ruta_del_primero_archivo\nruta_del_segundo_archivo");
    }

    public boolean systemAcceptsMultipleFiles() {
        // Lógica para verificar que el sistema ha aceptado múltiples archivos sin bloqueo.
    }

    public void startUploadingFiles() {
        WebElement uploadButton = driver.findElement(By.id("uploadButton"));
        uploadButton.click();
    }

    public boolean checkProcessingStatusForEachFile() {
        // Lógica para verificar el estado de carga de cada archivo.
    }

    public void verifyAllFilesUploaded() {
        // Lógica para verificar que todos los archivos se han cargado correctamente.
    }

    public boolean allFilesListedWithValidations() {
        // Lógica para verificar que todos los archivos se listan correctamente con validaciones.
    }
}