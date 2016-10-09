package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Tank extends Character implements IZombie {
        private static int iterator=0;
	Tank(int health) {
		super(health,"Tank "+iterator);
                iterator++;
	}
	
	public void attack(ISurvivor survivor) {
		survivor.decreaseHealth(20);	
	}

}
