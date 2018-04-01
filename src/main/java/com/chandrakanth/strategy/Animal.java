package com.chandrakanth.strategy;

public  abstract  class Animal {

	public  /*abstract*/  String behave() {
		return "";
	};

	private Fly fly = null;
	
	public void bring(Fly fly) {
		this.setFly(fly);
	}

	public Fly getFly() {
		return fly;
	}

	public void setFly(Fly fly) {
		this.fly = fly;
	};
	
	
}
