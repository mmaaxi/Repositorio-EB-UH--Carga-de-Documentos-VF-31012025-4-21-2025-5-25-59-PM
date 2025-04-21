Feature: Upload file with invalid format and error message

  Scenario: Attempt to upload a file with an unsupported format
    Given I navigate to the upload page
    When I select a file with an unsupported format ".exe"
    And I attempt to upload the file
    Then I should see an error message indicating the format is not supported