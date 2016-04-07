package com.bdd.harrypotter;
import java.util.HashMap;

public class DiscountCatalog {
	
    HashMap<Integer, Double> catalogue = new HashMap<Integer, Double>();
    
    DiscountCatalog()
    {
    	catalogue.put(1, 0.0);
    	catalogue.put(2, 0.05);
    	catalogue.put(3, 0.1);
    	catalogue.put(4, 0.15);
    	catalogue.put(5, 0.2);    	
    	
    }      
    
	public double GetDiscount(int size) {		
		return 1 - catalogue.get(size);
	}

}
