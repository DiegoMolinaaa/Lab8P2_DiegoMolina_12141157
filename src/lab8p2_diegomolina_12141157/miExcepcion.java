/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_diegomolina_12141157;

/**
 *
 * @author diego
 */
public class miExcepcion extends Exception {

    public miExcepcion() {
    }

    public miExcepcion(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
    
}