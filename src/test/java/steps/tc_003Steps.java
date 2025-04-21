package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_003Page;

public class tc_003Steps {

    tc_003Page page = new tc_003Page();

    @Given("^I select a file that exceeds the maximum allowed size$")
    public void i_select_a_file_that_exceeds_the_maximum_allowed_size() {
        page.selectOversizedFile();
    }

    @When("^I try to upload the file$")
    public void i_try_to_upload_the_file() {
        page.uploadFile();
    }

    @Then("^The system should detect the size excess and reject the file$")
    public void the_system_should_detect_the_size_excess_and_reject_the_file() {
        Assert.assertTrue(page.isFileRejected());
    }

    @Then("^An error message should be displayed informing about the size limit$")
    public void an_error_message_should_be_displayed_informing_about_the_size_limit() {
        Assert.assertEquals("File size exceeds the maximum limit.", page.getErrorMessage());
    }
}