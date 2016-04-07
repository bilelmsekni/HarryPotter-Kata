package com.bdd.harrypotter;

import java.util.ArrayList;
import java.util.List;

public class Basket {

	ArrayList<BookSet> _bookSets = new ArrayList<BookSet>();
    public void AddBook(Book book)
    {   
    	boolean foundBookSet = false;
    	for(BookSet bookSet : _bookSets)
    	{
    		if (!bookSet.Has(book))
    		{
    			bookSet.AddBook(book);
    			foundBookSet = true;
    			break;
    		}
    	}
    	if (!foundBookSet)
    	{
    		BookSet newBookSet = new BookSet();
    		newBookSet.AddBook(book);
    		_bookSets.add(newBookSet);
    	}
    }

    double EstimateBasket()
    {
    	double total = 0;
    	for(BookSet bookSet : _bookSets)
    	{
    		total += bookSet.CalculatePrice();
    	}
    	return total;
    }
}
