package com.chandrakanth.abstractfactory;

public abstract class EnemyShip {

	private String name;
	ESWeapon esWeapon;
	ESEngine esEngine;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract void makeShip();

	@Override
	public String toString() {
		return "The " + name + "has a top speed of " + esEngine + " and can do an attack worth " + esWeapon;
	}

	void displayShip() {
	};

}
