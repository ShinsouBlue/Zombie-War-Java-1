package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Tank extends Character implements IZombie {

	Tank(int health) {
		super(health);
	}
	
	public void attack(ISurvivor survivor) {
		survivor.decreaseHealth(20);	
	}

}
