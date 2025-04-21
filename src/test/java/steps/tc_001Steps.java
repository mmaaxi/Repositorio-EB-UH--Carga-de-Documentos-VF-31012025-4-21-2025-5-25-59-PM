import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import pages.tc_001Page;

public class tc_001Steps {

    private WebDriver driver;
    private tc_001Page page;

    public tc_001Steps() {
        this.driver = Hooks.getDriver();
        this.page = new tc_001Page(driver);
    }

    @Dado("el usuario selecciona un documento PDF válido")
    public void el_usuario_selecciona_un_documento_PDF_valido() {
        page.seleccionarDocumentoValido();
    }

    @Cuando("hace clic en {string}")
    public void hace_clic_en_cargar_documento(String boton) {
        page.hacerClicEnCargarDocumento();
    }

    @Entonces("el archivo debe comenzar a cargarse")
    public void el_archivo_debe_comenzar_a_cargarse() {
        page.verificarInicioCargaDocumento();
    }

    @Entonces("el archivo debería aparecer en la lista de documentos con sus metadatos")
    public void el_archivo_deberia_aparecer_en_la_lista_de_documentos_con_sus_metadatos() {
        page.verificarDocumentoEnLista();
    }
}