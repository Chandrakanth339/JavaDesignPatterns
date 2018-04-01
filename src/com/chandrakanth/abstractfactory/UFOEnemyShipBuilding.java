package com.chandrakanth.abstractfactory;

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

	@Override
	protected EnemyShip makeEnemyShip(String typeOfShip) {
		EnemyShip enemyShip = null;
		EnemyShipFactory enemyShipFactory = null;
		if (typeOfShip.equals("UFO")) {
			enemyShipFactory = new UFOEnemyShipFactory();
			enemyShip = new UFOEnemyShip(enemyShipFactory);
			enemyShip.setName("UFO Grunt Ship");
			enemyShip.makeShip();
		} else if (typeOfShip.equals("UFO Boss")) {
			/*
			 * enemyShipFactory = new UFOBossEnemyShipFactory(); enemyShip = new
			 * UFOBossEnemyShip(enemyShipFactory); enemyShip.setName("UFO Grunt Ship");
			 */
		}
		return enemyShip;
	}

}
