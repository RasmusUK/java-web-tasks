Feature: Add
  Sum numbers from string of numbers seperated with comma.

  Scenario: Give empty string
    Given an empty string
    When I call add
    Then I should get 0

  Scenario: Sum two numbers
    Given a text with two numbers seperated with comma "2,3"
    When I call add
    Then I should get 5

  Scenario: Sum multiple numbers
    Given a text with multiple numbers seperated with comma "2,3,5,8"
    When I call add
    Then I should get 18

  Scenario Outline: Sum numbers
    Given a text with numbers seperated with comma <numbers>
    When I call add
    Then I should get <results>

    Examples:
    | numbers   | results |
    | "2,3"     | 5       |
    |"2,3,5,8"  | 18      |
    |"1\n,2,3," | 6       |
    |"//;\n1;2" | 3       |

  Scenario: Negative numbers
    Given a text with negative numbers seperated with comma "-2,3"
    When I call add
    Then I should get an exception with "-2,3" as error message
