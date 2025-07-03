package com.tnsif.day5.association.hasA;

public class Executor {

	public static void main(String[] args) {
		
		
		Address address = new Address("5903 Laxminagar", "Pune", "Maharashtra", "412105");
		
		Person p = new Person("Datta",address);
		p.displayInfo();
		System.out.println(p);
	}

}