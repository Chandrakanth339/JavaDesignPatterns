package com.chandrakanth.abstractfactory;

public /*abstract*/ class UFOEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addESGun() {
		return new ESUFOWeapon();
	}

	@Override
	public ESEngine addESEngine() {
		return new ESUFOEngine();
	}

	@Override
	public ESMissiles addMissiles() {
		// TODO Auto-generated method stub
		return null;
	}

}
