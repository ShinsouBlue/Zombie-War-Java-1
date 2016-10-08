/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiewar.impl;

import zombiewar.intf.IZombie;
import zombiewar.intf.ISurvivor;
/**
 *
 * @author Michael Kislenko
 */
public class Tank extends Character implements IZombie{
    public Tank(){
        super(150);
    }
    public void attack (ISurvivor survivor){
        survivor.decreaseHealth(2);
    }
}
