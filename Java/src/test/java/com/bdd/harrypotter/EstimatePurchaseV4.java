package com.bdd.harrypotter;

import java.util.List;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class EstimatePurchaseV4 {

	Basket _basket;
	public EstimatePurchaseV4(Basket basket)
	{
		_basket = basket;
	}
	
	@When("^I buy books$")
	public void I_buy_books(DataTable arg1) throws Throwable {	
		List<Book> books = arg1.asList(Book.class);		
		for(Book book:books)
		{
			_basket.AddBook(book);
		}
	}

}
