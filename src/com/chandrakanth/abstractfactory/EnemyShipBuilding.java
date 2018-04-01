package com.chandrakanth.abstractfactory;

public abstract class EnemyShipBuilding {

	protected abstract EnemyShip makeEnemyShip(String typeOfShip);

	public EnemyShip orderTheShip(String typeOfShip) {
		final EnemyShip enemyShip = makeEnemyShip(typeOfShip);

		return enemyShip;
	}

}
