package com.chandrakanth.abstractfactory;

public class UFOEnemyShip extends EnemyShip {

	EnemyShipFactory enemyShipFactory;

	public UFOEnemyShip(final EnemyShipFactory enemyShipFactory) {
		this.enemyShipFactory = enemyShipFactory;
	}

	@Override
	void makeShip() {
		System.out.println("Making enemyShip" + getName());
		esWeapon = enemyShipFactory.addESGun();
		esEngine = enemyShipFactory.addESEngine();
		super.toString();

	}

}
