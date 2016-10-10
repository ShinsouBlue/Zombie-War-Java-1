package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class ZombieDog extends Character implements IZombie {
        private static int iterator=0;
	ZombieDog(int health) {
		super(health,"Zombie Dog "+iterator);
                iterator++;
	}
	
	public void attack(ISurvivor survivor) {
		survivor.decreaseHealth(10);
	}

}
