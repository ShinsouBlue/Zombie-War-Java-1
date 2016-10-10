package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Dog extends Character implements ISurvivor {
        private static int iterator=0;
	Dog(int health) {
		super(health,"Dog "+iterator);
                iterator++;
	}

	public void attack(IZombie zombie) {
		zombie.decreaseHealth(10);
	}

}
