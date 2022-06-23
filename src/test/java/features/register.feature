@reg
  Feature: registration
  @reg
    Scenario: User should register successfully when enters all required fields.

      Given user is on registration page
      When user enter all required fields
      And click on Register Button
      Then user should be able to see success message


  @tag4 @cat
    Scenario: 4 and cat

      Given
      When
      And
      Then


    @tag3 @tag4
    Scenario: 3 and 4

      Given
      When
      And
      Then

@tag3 @tag5
    Scenario: 3 nad 5

    Given
    When
    And
      Then