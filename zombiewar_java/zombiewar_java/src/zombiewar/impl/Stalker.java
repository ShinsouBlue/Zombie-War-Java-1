package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Stalker extends Character implements IZombie{
	
	private static int iterator = 0;
	Stalker(int health){
		super(health,"Stalker "+iterator);
		iterator++;
	}
	
	public void attack(ISurvivor survivor){
		survivor.decreaseHealth(15);
	}
	
}
