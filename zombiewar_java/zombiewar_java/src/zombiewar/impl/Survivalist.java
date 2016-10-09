
package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Survivalist extends Character implements ISurvivor {
        private static int iterator=0;
	Survivalist(int health) {
		super(health,"Survivalist "+iterator);
                iterator++;
	}

	public void attack(IZombie zombie) {
		zombie.decreaseHealth(10);
	}
     
}

