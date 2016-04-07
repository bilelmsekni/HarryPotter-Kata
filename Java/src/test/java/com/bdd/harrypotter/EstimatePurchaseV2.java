package com.bdd.harrypotter;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EstimatePurchaseV2 {
	
	Basket _basket;
	EstimatePurchaseV2(Basket basket)
	{
		_basket = basket;
	}
	
	@Given("^a basket$")
	public void a_basket() throws Throwable {
		_basket = new Basket();
	}

	@When("^I buy (\\d+) books$")
	public void I_buy_books(int nbOfBooks) throws Throwable {
        for (int i = 0; i < nbOfBooks; i++)
        {
        	Book book = new Book();
        	book.Price = 8;
            _basket.AddBook(book);
        }
	}

	@Then("^the total is (\\d+\\.\\d+|\\d+) €$")
	public void the_total_is_€(double total) throws Throwable {
		
		Assert.assertEquals(total, _basket.EstimateBasket(), 0);
		
	}
	
	@When("^I buy (\\d+) book of volume (\\d+)$")
	public void I_buy_book_of_volume(int nbOfBooks, int volumeNumber) throws Throwable {
        for (int i = 0; i < nbOfBooks; i++)
        {
        	Book book = new Book();
        	book.Price = 8;
        	book.Volume = volumeNumber;
            _basket.AddBook(book);
        }
	}
}
