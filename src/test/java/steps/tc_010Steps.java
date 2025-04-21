package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_010Page;
import static org.junit.Assert.assertTrue;

public class tc_010Steps {

    WebDriver driver;
    tc_010Page page = new tc_010Page(driver);

    @Given("I load a valid document into the system")
    public void i_load_a_valid_document_into_the_system() {
        page.navigateToUploadPage();
        page.uploadDocument("path/to/document.pdf");
    }

    @Then("the document should appear in the list")
    public void the_document_should_appear_in_the_list() {
        assertTrue(page.isDocumentListed("document.pdf"));
    }

    @When("I close the session or restart the application")
    public void i_close_the_session_or_restart_the_application() {
        page.logoutAndRestart();
    }

    @Then("the document should still be present in the system after restart")
    public void the_document_should_still_be_present_in_the_system_after_restart() {
        page.login();
        assertTrue(page.isDocumentListed("document.pdf"));
    }

    @When("I log back into the system")
    public void i_log_back_into_the_system() {
        page.login();
    }

    @Then("I verify that the previously uploaded document is still listed")
    public void i_verify_that_the_previously_uploaded_document_is_still_listed() {
        assertTrue(page.isDocumentListed("document.pdf"));
    }
}