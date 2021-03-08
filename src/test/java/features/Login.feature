Feature: Application login


Scenario: Home page default login
Given User is on netbanking landing page
When User login into application with username nad password
Then Home page is populated
And Cards are dispalyed