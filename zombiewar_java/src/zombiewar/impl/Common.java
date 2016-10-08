/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiewar.impl;

import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

/**
 *
 * @author Michael Kislenko
 */
public class Common extends Character implements IZombie{
    public Common(){
        super(30);
    }
    public void attack(ISurvivor survivor){
        survivor.decreaseHealth(5);
    }
}
