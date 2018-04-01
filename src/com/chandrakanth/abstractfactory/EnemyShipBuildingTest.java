package com.chandrakanth.abstractfactory;

import java.util.Scanner;

public class EnemyShipBuildingTest {

	public static void main(String[] argz) {
		EnemyShipBuilding enemyShipBuilding = new UFOEnemyShipBuilding();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Enemy Ship Type(UFO/UFO Boss)");
		String inputString = null;
		while ((inputString == null || inputString.equals(""))
				|| !((inputString.equals("UFO") || inputString.equals("UFO BOSS")))) {
			inputString = getInput(s, inputString);
		}
		if (inputString.equals("UFO") || inputString.equals("UFO BOSS")) {
			enemyShipBuilding.orderTheShip(inputString);
		} else {
			System.out.println("UFO/UFO Boss");

		}
	}

	private static String getInput(Scanner sc, String inputString) {
		inputString = sc.nextLine();
		if (!(inputString.equals("UFO") || inputString.equals("UFO BOSS"))) {
			System.out.println("Please enter either UFO or UFO BOSS");
		} else if (inputString.equals("")) {
			System.out.println("Input must not be empty");
		}
		return inputString;
	}

}
