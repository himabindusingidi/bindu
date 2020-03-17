package com.testdefinition;

import org.openqa.selenium.WebDriver;

import com.pages.updatecart_page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class updatecart_test 
{
	WebDriver driver;
	updatecart_page b = new updatecart_page(driver);
	

@Given("^Open the url in browser$")
public void open_the_url_in_browser()  {
    // Write code here that turns the phrase above into concrete actions
    b.url();
}

@When("^the url is launched click on search and enter search content in search$")
public void the_url_is_launched_click_on_search_and_enter_search_content_in_search()  {
    // Write code here that turns the phrase above into concrete actions
   b.search();
}

@Then("^click on the search button$")
public void click_on_the_search_button()  {
    // Write code here that turns the phrase above into concrete actions
    b.searchbutton();
}

@Then("^click on the product id$")
public void click_on_the_product_id() {
    // Write code here that turns the phrase above into concrete actions
  b.productID();
}

@Then("^click on the Item ID$")
public void click_on_the_Item_ID()  {
    // Write code here that turns the phrase above into concrete actions
   b.ItemID();
}

@Then("^click on the addtocart$")
public void click_on_the_addtocart() {
    // Write code here that turns the phrase above into concrete actions
  b.addtocart();
}

@Then("^change the quantity$")
public void change_the_quantity()  {
    // Write code here that turns the phrase above into concrete actions
    b.quantity();
}

@Then("^click on the update cart$")
public void click_on_the_update_cart() {
    // Write code here that turns the phrase above into concrete actions
  b.updatecart();
}



}
