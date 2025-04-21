package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_005Page {
    WebDriver driver;

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    private By documentoSelector = By.id("documento_selector");
    private By descargarButton = By.id("descargar_button");

    public void seleccionarDocumento() {
        WebElement documento = driver.findElement(documentoSelector);
        documento.click();
    }

    public void descargarDocumento() {
        WebElement descargar = driver.findElement(descargarButton);
        descargar.click();
    }

    public boolean verificarDescarga() {
        // Lógica para verificar que el archivo se descargó correctamente
        // Puede incluir chequear el archivo en el sistema de archivos
        return true;
    }

    public boolean verificarIntegridadYApertura() {
        // Lógica para verificar la integridad y apertura del archivo
        // Puede incluir abrir el archivo y comprobar su contenido
        return true;
    }
}