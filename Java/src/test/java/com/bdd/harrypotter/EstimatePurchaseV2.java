package com.bdd.harrypotter;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EstimatePurchaseV2 {
	
	Basket _basket;
	public EstimatePurchaseV2(Basket basket)
	{
		//Dependency Injection thanks to picoContainer
		_basket = basket;
	}
	
	@Given("^a basket$")
	public void a_basket() throws Throwable {
		//This will override the injected variable in the constructor
		//Use with precaution
		//_basket = new Basket();
	}

	@When("^I buy (\\d+) books$")
	public void I_buy_books(int nbOfBooks) throws Throwable {
        for (int i = 0; i < nbOfBooks; i++)
        {
        	Book book = new Book();
        	book.price = 8;
            _basket.AddBook(book);
        }
	}

	@Then("^the total is (\\d+\\.\\d+|\\d+) €$")
	public void the_total_is_€(double total) throws Throwable {
		double calc = _basket.EstimateBasket();
		Assert.assertEquals(total, calc, 0);
		
	}
	
	@When("^I buy (\\d+) book of volume (\\d+)$")
	public void I_buy_book_of_volume(int nbOfBooks, int volumeNumber) throws Throwable {
        for (int i = 0; i < nbOfBooks; i++)
        {
        	Book book = new Book();
        	book.price = 8;
        	book.volume = volumeNumber;
            _basket.AddBook(book);
        }
	}
}
