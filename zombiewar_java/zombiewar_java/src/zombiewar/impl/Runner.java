package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Runner extends Character implements IZombie {
        private static int iterator=0;
	Runner(int health) {
		super(health,"Runner "+iterator);
                iterator++;
	}
	
	public void attack(ISurvivor survivor) {
		survivor.decreaseHealth(10);
	}

}