Feature: Search fuctionality on LabCorp

Scenario: Search job

Given User opens Labcorp url 
When User clicks on Carrer Link
And User searches for job in search box and clicks on Search Icon
Then User should see the search results
Then Asserts for Job Tiltle Job Location and Job ID

