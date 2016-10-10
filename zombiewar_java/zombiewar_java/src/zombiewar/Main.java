package zombiewar;

import zombiewar.impl.CharacterFactory;
import zombiewar.impl.Child;
import zombiewar.intf.ICharacter;
import zombiewar.intf.ICharacterFactory;
import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Main {
  
  private static final ICharacterFactory factory = CharacterFactory.instance;
  
  public static IZombie[] randomZombies() {
    int numZombies = (int) (Math.random() * 10);
    IZombie[] zombies = new IZombie[numZombies];
    for (int i = 0; i < zombies.length; i++) {
      int zombieType = (int) (Math.random() * 4);
      switch(zombieType){
        case 0: zombies[i] = (IZombie) factory.make("common"); break;
        case 1: zombies[i] = (IZombie) factory.make("tank"); break;
        case 2: zombies[i] = (IZombie) factory.make("runner");break;
        case 3: zombies[i] = (IZombie) factory.make("stalker");break;
      }
    }
    return zombies;
  }

  public static ISurvivor[] randomSurvivors() {
    int numZombies = (int) (Math.random() * 20);
    ISurvivor[] survivors = new ISurvivor[numZombies];
    for (int i = 0; i < survivors.length; i++) {
      int type = (int) (Math.random() * 5);
      switch(type){
        case 0: survivors[i] = (ISurvivor) factory.make("soldier"); break;
        case 1: survivors[i] = (ISurvivor) factory.make("teacher"); break;
        case 2: survivors[i] = (ISurvivor) factory.make("child"); break;
        case 3: survivors[i] = (ISurvivor) factory.make("survivalist");break;
        case 4: survivors[i] = (ISurvivor) factory.make("hero");break;
      }
    }
    return survivors;
  }

  public static boolean allDead(ICharacter[] characters){
    boolean allDead = true;
    for(int i=0; i<characters.length; i++){
      allDead &= !characters[i].isAlive();
    }
    return allDead;
  }
  
   public static void attackAllZombies(ISurvivor s, IZombie[] zombies){
	  for (int i=0;i<zombies.length;i++){
                  boolean attacked=false;
		  IZombie z = zombies[i];
		  if (z.isAlive()){
                      s.attack(z);
                      attacked=true;
                  }
                  if(!z.isAlive() && attacked){
                      System.out.println(s.getName()+" killed "+ z.getName());
                  }
	  }
  }
  
  public static void attackAllSurvivors(IZombie z, ISurvivor[] survivors){
	  for (int i=0;i<survivors.length;i++){
                  boolean attacked=false;
		  ISurvivor s = survivors[i];
		  if (s.isAlive()){
                      z.attack(s);
                      attacked=true;
                  }
                  if(!s.isAlive() && attacked){
                      System.out.println(z.getName() + " killed "+s.getName());
                  }
	  }
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    IZombie[] zombies = randomZombies();
    ISurvivor[] survivors = randomSurvivors();
    
    int commonZombieCount = 0;
    int tankZombieCount = 0;
    int runnerZombieCount=0;
    int stalkerZombieCount=0;
    for(int i = 0; i < zombies.length; i++){
        if(zombies[i].getClass().getName().toLowerCase().contains("common")) commonZombieCount++;
        if(zombies[i].getClass().getName().toLowerCase().contains("tank")) tankZombieCount++;
        if(zombies[i].getClass().getName().toLowerCase().contains("runner")) runnerZombieCount++;
        if(zombies[i].getClass().getName().toLowerCase().contains("stalker")) stalkerZombieCount++;
    }
    int childCharacterCount = 0;
    int soldierCharacterCount = 0;
    int teacherCharacterCount = 0;
    int survivalistCharacterCount = 0;
    int heroCharacterCount=0;
    for(int i = 0; i < survivors.length; i++){
        if(survivors[i].getClass().getName().toLowerCase().contains("child")) childCharacterCount++;
        if(survivors[i].getClass().getName().toLowerCase().contains("soldier")) soldierCharacterCount++;
        if(survivors[i].getClass().getName().toLowerCase().contains("teacher")) teacherCharacterCount++;
        if(survivors[i].getClass().getName().toLowerCase().contains("survivalist")) survivalistCharacterCount++;
        if(survivors[i].getClass().getName().toLowerCase().contains("hero")) heroCharacterCount++;
    }
    for(int i=0;i<survivors.length;i++){
        if(survivors[i].getClass().getName().toLowerCase().contains("child")){
            
        }
    }
    

    System.out.println("We have " + survivors.length + " survivors trying to make it to safety. (" + childCharacterCount + " Children, " + soldierCharacterCount + " Soldiers, " + teacherCharacterCount + " Teachers," + survivalistCharacterCount+" Survivalists, "+ heroCharacterCount + " Heroes)");
    System.out.println("But there are " + zombies.length + " zombies waiting for them.(" + commonZombieCount + " Common Infected, " + tankZombieCount + " Tanks, " + runnerZombieCount + " Runners, "+stalkerZombieCount+ " Stalkers)");
    
    //TODO: the survivors attack first.  One characte attack each zombie.
    //      When all the survivors have done attacking, it's the zombies' 
    //      turn to attack.  For each zombie that is still alive, attack
    //      each suvivor that is still alive.  Repeat this cycle until
    //      all the zombies are all dead or all the survivors are all dead.
    boolean battle=true;
    while (battle=true){
    	if (allDead(survivors) || allDead(zombies)){
    		battle=false;
    		break;
    	}
    	 
    	for (int i=0;i<survivors.length;i++){
    	    	ISurvivor s = (ISurvivor) survivors[i];
    	    	if (s.isAlive()){
    	    		attackAllZombies(s,zombies);
    	    	}
    	}
    	
    	for (int i=0;i<zombies.length;i++){
	    	IZombie z = (IZombie) zombies[i];
	    	if (z.isAlive()){
	    		attackAllSurvivors(z,survivors);
	    	}
	}
    }

    

    if (allDead(survivors)) {
      System.out.println("None of the survivors made it.");
    } else {
      int count = 0;
      for(int i=0; i<survivors.length; i++) {
        if (survivors[i].isAlive()) count++;
      }
      System.out.println("It seems " + count + " have made it to safety.");
    }
  }

}
