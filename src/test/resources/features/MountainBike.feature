Feature: Mountain Bike

  @MountainBike
  Background:

    Given User is in demotelerik webpage
    When Refresh the link
    Then Click to login button

    Scenario Outline: Checking Size Filter

      Given User filtered the Moauntain Bikes
      When User click  "<size>"
      Then the product list should display correct results for size "<checking>"
      Examples:
        | name | size | checking |  |
        | 38   | 38   |          |  |
        | 40   | 40   |          |  |
        | 42   | 42   |          |  |
        | 44   | 44   |          |  |
        | 46   | 46   |          |  |
        | 48   | 48   |          |  |
        | 52   | 52   |          |  |
        |      |      |          |  |

