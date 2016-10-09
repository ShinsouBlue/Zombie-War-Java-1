package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Child extends Character implements ISurvivor{
        private static int iterator=0;
	Child(int health) {
		super(health,"Child "+iterator);
                iterator++;
	}

	public void attack(IZombie zombie) {
		zombie.decreaseHealth(2);
	}

}
