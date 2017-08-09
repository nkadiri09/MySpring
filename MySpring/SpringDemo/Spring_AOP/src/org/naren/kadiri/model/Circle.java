package org.naren.kadiri.model;

public class Circle {
	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		System.out.println("Circle setter called");
		Name = name;
		// throw(new RuntimeException());
	}

	public String setNameArguments(String name) {
		System.out.println("Circle setter called");
		Name = name;
		return "Naren Custom Message";
	}
}
