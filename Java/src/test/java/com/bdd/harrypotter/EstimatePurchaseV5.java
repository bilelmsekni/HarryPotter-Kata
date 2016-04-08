package com.bdd.harrypotter;

import cucumber.api.java.en.When;

public class EstimatePurchaseV5 {

	Basket _basket;

	public EstimatePurchaseV5(Basket basket)
	{
		_basket = basket;
	}
	
	@When("^I bought (\\d+) books of volume (\\d+)$")
	public void I_bought_books_of_volume(int nbOfBooks, int volume) throws Throwable {
        for (int i = 0; i < nbOfBooks; i++)
        {
        	Book book = new Book();
        	book.price = 8;
        	book.volume = volume;
            _basket.AddBook(book);
        }
	}
}
