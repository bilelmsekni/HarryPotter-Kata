package com.bdd.harrypotter;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class EstimatePurchaseV1 {

	Book book;
	
	@Given("^A book$")
	public void A_book() throws Throwable {
		book = new Book();
		book.price = 8;
	}

	@Then("^its price is (\\d+) €$")
	public void its_price_is_€(double expectedPrice) throws Throwable {
		Assert.assertEquals(expectedPrice, book.price, 0);
	}	
}
