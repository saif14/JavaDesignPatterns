package FactoryPattern;

public class EnemyShipFactory {
	
	public EnemyShip makeEnemyShip(String neShipType) {
		EnemyShip newShip = null;
		
		if(neShipType.equals("U")) {
			return new UFOEnemyShip();
		} else {
			if(neShipType.equals("R")) return new RocketEnemyShip();
			else if(neShipType.equals("B")) return new BigUFOEnemyShip();
			else return null;
		}
	}

}
