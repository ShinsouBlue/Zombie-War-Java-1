package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Common extends Character implements IZombie {

	Common(int health) {
		super(health);
	}
	
	public void attack(ISurvivor survivor) {
		survivor.decreaseHealth(5);
	}

}
