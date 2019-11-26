Feature: Login into Application

Scenario: Login OLX with Facebook account
Given Initialize the chrome browser
And Navigate to "https://olx.ro"
When User press on 'Contul meu' and "Continua cu contul Facebook"
Then User is sucessfully logged in OLX and Facebook account credentials are displayed



Scenario: Login OLX and search for a specific car model
Given Initialize the chrome browser
And Navigate to "https://olx.ro"
When User enter "BMW" car model in search bar and press on "CAUTA ACUM" button
Then Sales offers for specific car model are displayed

