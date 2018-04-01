package com.chandrakanth.abstractfactory;

public class ESUFOEngine implements ESEngine {

	@Override
	public String toString() {
		final String str = "1000 KMPH";
		System.out.println(str);
		return str;
	}
}
