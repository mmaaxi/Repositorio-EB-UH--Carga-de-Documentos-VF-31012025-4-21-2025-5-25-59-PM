import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {

    private WebDriver driver;

    private By inputSeleccionarDocumento = By.id("documentInput");
    private By botonCargarDocumento = By.id("uploadButton");
    private By indicadorProgreso = By.id("progressIndicator");
    private By listaDocumentos = By.id("documentList");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void seleccionarDocumentoValido() {
        WebElement inputElement = driver.findElement(inputSeleccionarDocumento);
        inputElement.sendKeys("ruta/al/documento/valido.pdf");
    }

    public void hacerClicEnCargarDocumento() {
        driver.findElement(botonCargarDocumento).click();
    }

    public void verificarInicioCargaDocumento() {
        WebElement progressElement = driver.findElement(indicadorProgreso);
        assert(progressElement.isDisplayed());
    }

    public void verificarDocumentoEnLista() {
        WebElement listaElement = driver.findElement(listaDocumentos);
        assert(listaElement.getText().contains("documento_valido.pdf"));
    }
}