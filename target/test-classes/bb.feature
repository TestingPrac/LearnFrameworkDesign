TC01
Scenario Outline:
Given I enter AuthUserName and Password and hit API and pick FCD Case
Given I am PEGA user and login with "ComplaintHandler" UserName and Password
When I Click on Workbasket and I select "<View queue for>" from dropdown and I click the FCD Case
And I Select the Levels of Assessment "<Raising Concern>" "<Type of customer>" "<Level1>" "<Level2>" "<Level3>" "<Level4>" and I select the "<Action>" Action Process and I click Submit
# And I enter question "<Question>" and select directed to "<DirectedTo>" after clicking on Add a row button
  And I click the Impact on complaint material as No
And I click on Submit
Examples:
| View queue for        | Raising Concern | Type of customer | Level1 | Level2        | Level3                   | Level4 | Action      | DirectedTo            | Question       | INV Status         | Answer To Question |
| Complaints_Assessment | Member          | Member           | Member | Communication | Annual Benefit Statement | Delay  | Investigate | Scheme Administration | Pension scheme | Resolved-Completed | Testing            |
PEGA_PN_10321_MemberOnlineInvestigateComplaintStepDefinitions
 # TC08 09 10
@
Scenario Outline:
Given I enter AuthUserName and Password and hit API and pick FCD Case
Given I am PEGA user and login with "ComplaintHandler" UserName and Password
When I Click on Workbasket and I select "<View queue for>" from dropdown and I click the FCD Case
And I Select the Levels of Assessment "<Raising Concern>" "<Type of customer>" "<Level1>" "<Level2>" "<Level3>" "<Level4>" and I select the "<Action>" Action Process and I click Submit
And I enter question "<Question>" and select directed to "<DirectedTo>" after clicking on Add a row button
And I click on Create this item
And I click on my INV Case id
And I click on call to complainant and Enter the "<OutboundCallNotes>" and click on Submit button
And I click on user Link and I Click on logout
Examples:
| View queue for        | Raising Concern | Type of customer | Level1 | Level2        | Level3                   | Level4 | Action      | DirectedTo            | Question       | INV Status         | Answer To Question |
| Complaints_Assessment | Member          | Member           | Member | Communication | Annual Benefit Statement | Delay  | Investigate | Scheme Administration | Pension scheme | Resolved-Completed | Testing            |

#TC11

Scenario Outline:
Given I enter AuthUserName and Password and hit API and pick FCD Case
Given I am PEGA user and login with "ComplaintHandler" UserName and Password
When I Click on Workbasket and I select "<View queue for>" from dropdown and I click the FCD Case
And I Select the Levels of Assessment "<Raising Concern>" "<Type of customer>" "<Level1>" "<Level2>" "<Level3>" "<Level4>" and I select the "<Action>" Action Process and I click Submit
And I enter question "<Question>" and select directed to "<DirectedTo>" after clicking on Add a row button
And I click on Create this item
And I click on my INV Case id
And I click on user Link and I Click on logout
And I am PEGA user and login with "FinanceSpecialistManager" UserName and Password
And I Click on Workbasket and I select "<View queue for 1>" from dropdown and I click on INV case id
And I as a Finance Specialist enter answer to question "<Answer To Question>" and click on Submit
And I click on user Link and I Click on logout
And I am PEGA user and login with "ComplaintHandler" UserName and Password
And Process, I click on My Work FCD Case
And I am able to see answer "<Answer To Question>" "<INV Status>" and click on submit
And I click the "<Impact>" on complaint material "<Member Or Employer>" And if I select Yes I Enter the rationale for the decision And I Select the Small "<Thank you gift>" from dropdown And I Enter D&I "<Compensation Amount>"
And I click on Submit
And I click on user Link and I Click on logout
Examples:
| View queue for        | Raising Concern | Type of customer | Level1 | Level2        | Level3                   | Level4 | Action      | DirectedTo            | Question       | INV Status         | Answer To Question |
| Complaints_Assessment | Member          | Member           | Member | Communication | Annual Benefit Statement | Delay  | Investigate | Scheme Administration | Pension scheme | Resolved-Completed | Testing            |

