Feature: Nivar Cyclone Wind and Pressure reading details
	Capture the current reading details and forecasted details

Scenario: Launch Google search Engine
Given Type cyclone nivar
And Choose nivar tracking live link
When Choose ZoomEarth Link found
Then Land On the Page
And Print Highlighted Pressure
Then Forecasted land hitting time
And Print the estimated wind speed