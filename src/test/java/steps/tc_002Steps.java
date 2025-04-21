package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_002Page;

import static org.junit.Assert.assertTrue;

public class tc_002Steps {
    tc_002Page uploadPage = new tc_002Page();

    @Given("I navigate to the upload page")
    public void navigateToUploadPage() {
        uploadPage.openUploadPage();
    }

    @When("I select a file with an unsupported format \".exe\"")
    public void selectInvalidFile() {
        uploadPage.selectFile("path/to/invalidFile.exe");
    }

    @When("I attempt to upload the file")
    public void attemptFileUpload() {
        uploadPage.clickUploadButton();
    }

    @Then("I should see an error message indicating the format is not supported")
    public void verifyErrorMessage() {
        assertTrue(uploadPage.isErrorMessageDisplayed());
    }
}