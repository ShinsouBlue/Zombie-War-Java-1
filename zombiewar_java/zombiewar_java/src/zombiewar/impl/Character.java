package zombiewar.impl;

import zombiewar.intf.ICharacter;

public abstract class Character implements ICharacter{
	
	public int health;
	public String name;
	Character(int health,String newName){
		this.health = health;
                setName(newName);
	}
	@Override
	public void decreaseHealth(int increment) {
		health-=increment;
	}
        
	@Override
	public boolean isAlive() {
		return (health > 0);
	}
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
	
	
}
