package com.bdd.harrypotter;

import cucumber.runtime.java.picocontainer.PicoFactory;

public class CustomPicoFactory extends PicoFactory{
	public CustomPicoFactory() {
		addClass(Basket.class);
    }
}
