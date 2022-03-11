/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_diegomolina_12141157;

import java.awt.Color;

/**
 *
 * @author diego
 */
public abstract class Carro {
    private int numID;
    private int distanciaR;
    private String nomC;
    private Color c;

    public Carro() {
    }

    public Carro(int numID, int distanciaR, String nomC, Color c) {
        this.numID = numID;
        this.distanciaR = distanciaR;
        this.nomC = nomC;
        this.c = c;
    }

    public int getNumID() {
        return numID;
    }

    public void setNumID(int numID) {
        this.numID = numID;
    }

    public int getDistanciaR() {
        return distanciaR;
    }

    public void setDistanciaR(int distanciaR) {
        this.distanciaR = distanciaR;
    }

    public String getNomC() {
        return nomC;
    }

    public void setNomC(String nomC) {
        this.nomC = nomC;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return  numID+"";
    }
    public abstract int distXseg(Carro c);
}
