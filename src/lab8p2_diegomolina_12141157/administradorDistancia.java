/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_diegomolina_12141157;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class administradorDistancia extends Thread {
    private JProgressBar progBar_d;
    private int distXseg;
    private boolean avanzar;
    private boolean vive;
    private ArrayList<Carro> carros = new ArrayList();
    private JTable t;

    public administradorDistancia() {
    }

    public administradorDistancia(JProgressBar progBar_d, ArrayList<Carro> c, JTable t) {
        this.progBar_d = progBar_d;
        this.avanzar = true;
        this.vive = true;
        this.carros = c;
        this.t = t;
    }
    
    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        boolean gano = false;
        while (vive) {
            if (avanzar) {
                if(gano==false){
                    for (Carro c : carros) {
                        c.setDistanciaR(c.getDistanciaR()+c.distXseg(c));
                    }
                    sort(carros);
                    DefaultTableModel modelo = (DefaultTableModel) t.getModel();
                    modelo.setRowCount(0);
                    for (Carro carro : carros) {
                        Object row[] = {carro.getNumID(), carro.getNomC(), carro.getDistanciaR()};
                        modelo.addRow(row);
                        t.setModel(modelo);
                    }
                    try{
                        
                    }catch(Exception e){
                        
                    }
                    
                    for (int i = 0; i < carros.size()-1; i++) {
                        if((int)t.getValueAt(i, 2)>=progBar_d.getMaximum()){
                            gano=true;
                        }
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "TERMINOOOO!!!");
                    break;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {

            }
        }

    }
    public void sort(ArrayList<Carro> c){
        Carro arrCarro[] = new Carro[c.size()];
        for (int i = 0; i < c.size(); i++) {
            arrCarro[i] = c.get(i);
        }
        for (int i = 0; i < arrCarro.length; i++) {
            for (int j = i+1; j < arrCarro.length; j++) {
                if(arrCarro[i].getDistanciaR()<arrCarro[j].getDistanciaR()){
                    Carro menor = arrCarro[i];
                    arrCarro[i] = arrCarro[j];
                    arrCarro[j] = menor;
                }
            }
        }
        c.clear();
        for (int i = 0; i < arrCarro.length; i++) {
            c.add(arrCarro[i]);
        }
    }
}
