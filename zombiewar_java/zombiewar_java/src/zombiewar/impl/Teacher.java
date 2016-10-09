package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Teacher extends Character implements ISurvivor{
        private static int iterator=0;
	Teacher(int health) {
		super(health,"Teacher "+iterator);
                iterator++;
	}

	public void attack(IZombie zombie) {
		zombie.decreaseHealth(5);	
	}

}
