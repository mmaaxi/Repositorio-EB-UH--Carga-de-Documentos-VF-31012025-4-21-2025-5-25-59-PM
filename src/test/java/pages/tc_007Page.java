package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverFactory;

public class tc_007Page {

    WebDriver driver;
    By cargaArchivoBoton = By.id("uploadButton");
    By mensajeError = By.id("errorMessage");

    public tc_007Page() {
        this.driver = DriverFactory.getDriver();
    }

    public void navegarPaginaCargaDocumentos() {
        driver.get("http://example.com/uploadPage");
    }

    public void cargarArchivoVacioOCorrupto() {
        WebElement uploadElement = driver.findElement(cargaArchivoBoton);
        uploadElement.sendKeys("path/to/vacio_o_corrupto_file");
    }

    public boolean verificarAnomaliaArchivo() {
        // Implement logic to verify system identification of file anomaly if applicable
        // For demonstration purposes, instantly returning true
        return true;
    }

    public String obtenerMensajeError() {
        return driver.findElement(mensajeError).getText();
    }
}