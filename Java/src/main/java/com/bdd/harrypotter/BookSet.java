package com.bdd.harrypotter;

import java.util.ArrayList;

public class BookSet {
	
    private ArrayList<Book> _books = new ArrayList<Book>();
    private DiscountCatalog _discounts = new DiscountCatalog();

    public boolean Has(Book newBook)
    {
    	for(Book book:_books)
    	{
    		if (book.volume == newBook.volume)
    			return true;
    	}
        return false;
    }

    public void AddBook(Book book)
    {
        _books.add(book);
    }

    public double CalculatePrice()
    {
        double discount = _discounts.GetDiscount(_books.size());        
        return _books.size() * 8 * discount;
    }

}
