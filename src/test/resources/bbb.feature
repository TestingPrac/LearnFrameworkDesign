
# PN-26096_TC01 - Contribution file - Opt-out start date,Opt-out end date and NIP end date validation for Eligible jobholder

Feature: Validate Contribution File

  Scenario Outline: Validate Contribution File
    Given I login to SQL Server and run the Query and show the NIP details
    And I update to XML file value is schemeID and customer Number payReference niNo schemePayrlRef contribDueDate schemeEnrlType "<object>"
    When I hit the API and validate the Status code "200"
    And I am SCM user and login with UserName and Password "<Application>"
    And I click on Policy Admin from menu
    And I enter the Scheme reference Number SchemeID field
    And I click on View Contribution Load File from left menu
    And Check that Contribution File status should be Validated.
    And I logoff from SCM Application

    Examples:
      | object |Application|
      | 4      |           |



  @AfterPuttyValidation

  Scenario Outline:Create Scheme membership API After Putty Validation
    Given I am SCM user and login with UserName and Password "<Application>"
    When I click on Policy Admin from menu
    And I enter the scheme reference Number SchemeID field
    And I click on View Contribution Load File from left menu
    And I Check that Contribution File status should be PaymentProcessed
    And I click on search icon near contribution file number and plan Reference number displayed in member reference column
    And I click on search icon near the plan number under the member records and Plan details should displayed
    And I Click on the Scheme Membership link and Click the Magnifier icon uder the Membership Details
    Then I login to SQL Server and run the Query and show the NIP details

 Examples:
      | Application |
 #     |             |
