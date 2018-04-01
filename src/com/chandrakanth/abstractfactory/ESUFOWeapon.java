package com.chandrakanth.abstractfactory;

public class ESUFOWeapon implements ESWeapon {

	@Override
	public String toString() {
		final String str = "20 Damages";
		System.out.println(str);
		return str;
	}

}
