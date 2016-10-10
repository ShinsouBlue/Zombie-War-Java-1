
package zombiewar.impl;

import zombiewar.intf.ICharacter;
import zombiewar.intf.ICharacterFactory;
/**
 *
 * @author thaoc
 */
public class CharacterFactory implements ICharacterFactory{
  
  public static final ICharacterFactory instance = new CharacterFactory();
  
  private CharacterFactory(){
   
  }

  /**
   * Make the character.  To support more characters,
   * simply implement a type and then add a case statement
   * to this method.
   * 
   * @param type The type of character to make.
   * @return 
   */
  
  @Override
  public ICharacter make(String type) {
    switch(type){
      case "soldier"  : return new Soldier(100);
      case "tank"     : return new Tank(150);
      case "common"   : return new Common(30);
      case "teacher"  : return new Teacher(50);
      case "child"    : return new Child(20);
      case "survivalist" : return new Survivalist(90);
      case "runner"   : return new Runner(50);
      case "stalker"  : return new Stalker(60);
      case "hero"     : return new Hero(75);
      case "dog"	  : return new Dog(25);
      case "zombiedog" : return new ZombieDog(25);
    }
    return null;
  }
  
}
