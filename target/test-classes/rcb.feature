Feature: Add to cart a product in amazon
Scenario: add the iphone into the add to cart in amazon

Given open the chrome browser and maximize the window
When pass the amazon url
And click the search icon
And enter iphone in the search text box and click search
And click the first product
And click add to cart icon
Then close the browser  
