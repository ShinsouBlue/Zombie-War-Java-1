package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Hero extends Character implements ISurvivor{
	
	private static int iterator = 0;
	public Hero(int health){
		super(health,"Hero "+iterator);
		iterator++;
	}
	
	public void attack(IZombie zombie){
		zombie.decreaseHealth(20);
	}
	
}
