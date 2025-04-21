Feature: Validate document size limit

  Scenario: Validate file size exceeds maximum limit
    Given I select a file that exceeds the maximum allowed size
    When I try to upload the file
    Then The system should detect the size excess and reject the file
    And An error message should be displayed informing about the size limit