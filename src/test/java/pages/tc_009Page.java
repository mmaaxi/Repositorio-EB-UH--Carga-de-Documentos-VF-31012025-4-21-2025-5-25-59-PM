package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_009Page {

    WebDriver driver;

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void autenticarUsuario() {
        // Lógica para autenticar al usuario
        driver.get("http://example.com/login");
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        username.sendKeys("usuario");
        password.sendKeys("password");
        driver.findElement(By.id("loginButton")).click();
    }

    public void cargarDocumentoValido() {
        // Lógica para cargar un documento válido
        driver.get("http://example.com/upload");
        WebElement uploadElement = driver.findElement(By.id("upload"));
        uploadElement.sendKeys("C:/path/to/valid/document.pdf");
        driver.findElement(By.id("submit")).click();
    }

    public boolean verificarCargaExitosa() {
        // Verificar que el documento se cargó con éxito
        WebElement successMessage = driver.findElement(By.id("successMessage"));
        return successMessage.isDisplayed();
    }

    public boolean verificarNotificacionExito() {
        // Verificar que el usuario recibe una notificación de éxito
        WebElement successNotification = driver.findElement(By.id("notification"));
        return successNotification.isDisplayed();
    }
}