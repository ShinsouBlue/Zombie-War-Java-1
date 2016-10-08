package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Child extends Character implements ISurvivor{

	Child(int health) {
		super(health);
	}

	public void attack(IZombie zombie) {
		zombie.decreaseHealth(2);
		
	}

}
