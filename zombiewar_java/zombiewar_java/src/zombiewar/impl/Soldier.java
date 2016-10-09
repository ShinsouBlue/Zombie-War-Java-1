package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Soldier extends Character implements ISurvivor {
        private static int iterator=0;
	Soldier(int health) {
		super(health,"Soldier "+iterator);
                iterator++;
	}

	public void attack(IZombie zombie) {
		zombie.decreaseHealth(10);
	}

}
