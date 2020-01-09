Feature: my demo on tags
@smoke @regression
Scenario: Registration on amazon
Given Launch app
Then reg with valid data
@smoke
Scenario: Login on amazon
Given provide the valid data
@regression @uat
Scenario: Ordering on amazon
Given placed the order
@smoke
Scenario: Cancelling
Given cancelled the order