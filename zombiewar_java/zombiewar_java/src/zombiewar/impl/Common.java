package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Common extends Character implements IZombie {
        private static int iterator=0;
	Common(int health) {
		super(health,"Common "+iterator);
                iterator++;
	}
	
	public void attack(ISurvivor survivor) {
		survivor.decreaseHealth(5);
	}

}
