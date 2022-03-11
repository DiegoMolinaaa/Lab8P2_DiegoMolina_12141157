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
public class Carro {
    private int numID;
    private int distanciaR;
    private int distXseg;
    private String nomC;
    private Color c;

    public Carro() {
    }

    public Carro(int numID, int distanciaR, int distXseg, String nomC, Color c) {
        this.numID = numID;
        this.distanciaR = distanciaR;
        this.distXseg = distXseg;
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

    public int getDistXseg() {
        return distXseg;
    }

    public void setDistXseg(int distXseg) {
        this.distXseg = distXseg;
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
    
}
