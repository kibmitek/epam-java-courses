package lesson150924;

import java.util.Random;

public class Monster implements Cloneable{

	private static Random random = new Random();
	
	private static class Dragon extends Monster{ 
		
	}
	
	private static class GiantBear extends Monster{
		
	}

	private static class Gopnik extends Monster{
		
	}
	
	static private Monster[] monsters = {new Dragon(),new GiantBear(), new Gopnik()};
	
	static public Monster createMonster(){//factory
		int monsterIndex = random.nextInt(monsters.length);//from 0 to 2
		Monster randomMonster = monsters[monsterIndex];		
		try {
			Monster concreteMonster = (Monster)randomMonster.clone();
			return concreteMonster;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
