package com.chandrakanth.abstractfactory;

public interface EnemyShipFactory {
	ESWeapon addESGun();

	ESEngine addESEngine();

	ESMissiles addMissiles();
}
