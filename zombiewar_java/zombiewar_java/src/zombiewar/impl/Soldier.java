package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Soldier extends Character implements ISurvivor {

	Soldier(int health) {
		super(health);
	}

	public void attack(IZombie zombie) {
		zombie.decreaseHealth(10);
	}

}