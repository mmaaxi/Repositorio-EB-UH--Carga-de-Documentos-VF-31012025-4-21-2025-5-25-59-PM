Feature: Document Persistence Between Sessions

  Scenario: Validate document persistence across sessions and system reboots
    Given I load a valid document into the system
    Then the document should appear in the list
    When I close the session or restart the application
    Then the document should still be present in the system after restart
    When I log back into the system
    Then I verify that the previously uploaded document is still listed