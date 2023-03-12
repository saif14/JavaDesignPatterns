package FactoryPattern;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {

		/**
		 * Below is the example of dynamic but but but it is not good because u need
		 * modification
		 */

//		EnemyShip enemy = null;
//		
//		Scanner userInput = new Scanner(System.in);
//		
//		
//		
//		String enemyShipOption = "";
//		System.out.println("What type of ship? U/R ");
//		
//		if(userInput.hasNextLine()) {
//			enemyShipOption = userInput.nextLine();
//		}
//		
//		if(enemyShipOption.equals("U")) {
//			enemy = new UFOEnemyShip();
//		}
//		else {
//			enemy = new RocketEnemyShip();
//		}

		/**
		 * Finishing above section
		 */

		// Doing it with Factory
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip enemy = null;
		Scanner userInput = new Scanner(System.in);
		System.out.println("What type of ship? U/R/B ");

		if (userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine();
			enemy = shipFactory.makeEnemyShip(typeOfShip);
		}

		if(enemy != null) {
			doStuffEnemy(enemy);
		}

	}

	private static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();

	}

}
