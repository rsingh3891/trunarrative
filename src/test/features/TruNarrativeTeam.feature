Feature: TruNarrative Team

  As a user
  I want to search the TruNarrative website
  So that I can find the leadership team

  Scenario: The TruNarrative team members are displayed when searching via Google
    Given I search for TruNarrative on Google
    And I click on the link for the TruNarrative website
    When I navigate to the TruNarrative leadership team page
    Then there are 8 people in the leadership team
    And the following names have the following roles:
      | John Lord      | Founder & CEO            |
      | David Eastaugh | Chief Technology Officer |
      | Nicola Janney  | Human Resources Manager  |