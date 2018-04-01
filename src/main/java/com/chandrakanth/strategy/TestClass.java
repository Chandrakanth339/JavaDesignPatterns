package com.chandrakanth.strategy;

public class TestClass {

	public static void main(String []argz) {
		
		Animal a = new Bird();
		Fly f1 = new BirdFly();
		a.bring(f1);
		System.out.println(f1.fly());
		
		Animal d = new Dog();
		Fly f2 = new DogFly();
		d.bring(f2);
		System.out.println(f2.fly());
	}
}
