package com.tnsif.day5.multilevelinheritance;

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		
		City c = new City();
		c.setArea(23000.5f);
		c.setCapital("Delhi");
		c.setCityName("Pune");
		c.setCountryName("India");
		c.setLanguage("Marathi");
		c.setStateName("Maharashtra");
		
		System.out.println(c);
				
	}
}