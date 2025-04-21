package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_004Page {
    private WebDriver driver;

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void cargarDocumento() {
        // Implementar la lógica para cargar un documento
        // Ejemplo: driver.findElement(By.id("cargarDocumento")).sendKeys("/ruta/al/documento");
    }

    public boolean verificarDocumentoEnListado() {
        // Lógica para verificar que el documento figura en el listado después de la carga
        // Ejemplo: return driver.findElement(By.xpath("//tr[contains(., 'nombreArchivo')]")).isDisplayed();
        return true;
    }

    public void seleccionarEliminarDocumento() {
        // Lógica para seleccionar la opción de 'Eliminar documento'
        // Ejemplo: driver.findElement(By.xpath("//tr[contains(., 'nombreArchivo')]/.//button[text()='Eliminar']")).click();
    }

    public boolean verificarSolicitudConfirmacion() {
        // Verificar la aparición de una solicitud de confirmación de eliminación
        // Ejemplo: return driver.findElement(By.id("confirmacionEliminacion")).isDisplayed();
        return true;
    }

    public void confirmarEliminar() {
        // Lógica para confirmar la eliminación del documento
        // Ejemplo: driver.findElement(By.xpath("//button[text()='Confirmar']")).click();
    }
}