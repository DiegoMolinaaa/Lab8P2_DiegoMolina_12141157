/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_diegomolina_12141157;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author diego
 */
public class McQueen extends Carro {

    public McQueen() {
        super();
    }

    public McQueen(int numID, int distanciaR, String nomC, Color c) {
        super(numID, distanciaR, nomC, c);
    }

    @Override
    public String toString() {
        return super.getNumID()+"";
    }

    @Override
    public int distXseg(Carro c) {
        Random r = new Random();
        int x=0;
        if(c instanceof McQueen){
            x = 20+r.nextInt(180);
        }
        return x;
    }
    
    
}
