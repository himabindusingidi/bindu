@JPetStore_Feature
Feature: JPetStore website

@tc01_jpetstorelogin
Scenario:
Login in to JPetStore application

Given the user launched the chromebrowser
When the user open the JPetStore website
Then user clicks on login button
Then the user enters the username and password clicks on login button



@tc02_addtocart
Scenario: Add to Cart in the JPet Store application.

Given open the url in browser 
When the url is launched click on search and enter search content
Then click on search button
And click on product id
And click on Item ID
And click on addtocart

@tc03_updatecart
Scenario: update cart in the JPet Store application.
Given Open the url in browser 
When the url is launched click on search and enter search content in search
Then click on the search button
And click on the product id
And click on the Item ID
And click on the addtocart
And change the quantity 
And click on the update cart

@tc04_removefromcart
Scenario: remove item from the cart in the JPet Store application.

Given open the given url in the browser
When the url is launched then click on search and enter search content
Then click on the Search button
And click on product ID
And click on Item id
And click on AddToCart
And click on RemoveFromCart

@tc05_signout
Scenario: Sign out from the JPet Store application.

Given the user has launched the chromebrowser
When the user opens the JPetStore website
Then user clicking on login button
And the user enterS the username and password clicks on login button
And after login sign out from the apllication





