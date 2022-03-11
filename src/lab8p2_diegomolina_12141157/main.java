/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_diegomolina_12141157;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        DefaultComboBoxModel dc = (DefaultComboBoxModel) cb_carros.getModel();
        dc.removeAllElements();
        administrarCarro aC = new administrarCarro("./Carros.cbm");
        for (Carro c : aC.getListaCarros()) {
            dc.addElement(c);
        }
        cb_carros.setModel(dc);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_comenzar = new javax.swing.JButton();
        bt_pausar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jl_nomPista = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jl_largoP = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_posiciones = new javax.swing.JTable();
        cb_carros = new javax.swing.JComboBox<>();
        bt_add = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tf_nomPista = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ftf_largoP = new javax.swing.JFormattedTextField();
        bt_setPista = new javax.swing.JButton();
        bt_restart = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ftf_numID = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_nomC = new javax.swing.JTextField();
        cb_tiposC = new javax.swing.JComboBox<>();
        bt_color = new javax.swing.JButton();
        bt_guardarCarro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_comenzar.setText("Comenzar");

        bt_pausar.setText("Pausar");

        jLabel1.setText("Pista");

        jl_nomPista.setText("____");

        jLabel3.setText("Largo");

        jl_largoP.setText("____");

        jt_posiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Corredor", "Distancia"
            }
        ));
        jScrollPane1.setViewportView(jt_posiciones);

        bt_add.setText("Agregar");

        jLabel2.setText("Nombre Pista");

        jLabel4.setText("Largo");

        ftf_largoP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        bt_setPista.setText("Usar Pista");
        bt_setPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_setPistaActionPerformed(evt);
            }
        });

        bt_restart.setText("Reiniciar");
        bt_restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_restartActionPerformed(evt);
            }
        });

        jLabel5.setText("Numero Identificador");

        ftf_numID.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel6.setText("Nombre Corredor");

        cb_tiposC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "McQueen", "Convertible", "Nascar" }));

        bt_color.setText("Color");
        bt_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_colorActionPerformed(evt);
            }
        });

        bt_guardarCarro.setText("Guardar");
        bt_guardarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarCarroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(bt_comenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_pausar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jl_nomPista)
                .addGap(126, 126, 126)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jl_largoP)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cb_tiposC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_setPista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_restart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(240, 240, 240))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cb_carros, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(bt_add))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ftf_numID)
                                            .addComponent(tf_nomC)
                                            .addComponent(bt_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(202, 202, 202)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ftf_largoP, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                        .addGap(189, 189, 189))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tf_nomPista, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap(29, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(bt_guardarCarro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_comenzar)
                    .addComponent(bt_pausar)
                    .addComponent(jLabel1)
                    .addComponent(jl_nomPista)
                    .addComponent(jLabel3)
                    .addComponent(jl_largoP))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_carros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_add)
                    .addComponent(jLabel2)
                    .addComponent(tf_nomPista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ftf_largoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(ftf_numID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_setPista)
                    .addComponent(jLabel6)
                    .addComponent(tf_nomC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_restart)
                    .addComponent(cb_tiposC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_color, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_guardarCarro)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_colorActionPerformed
        // TODO add your handling code here:
        bt_color.setBackground(
                JColorChooser.showDialog(
                        this, "Seleccione un color", 
                        Color.yellow)
        );
    }//GEN-LAST:event_bt_colorActionPerformed

    private void bt_guardarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarCarroActionPerformed
        // TODO add your handling code here:
        int numID;
        String nomC;
        Color color;
        String tipo = (String)cb_tiposC.getSelectedItem();
        Carro c;
        boolean repetido=false;
        numID = Integer.parseInt(ftf_numID.getText());
        administrarCarro aC = new administrarCarro("./Carros.cbm");
        if(!(aC.getListaCarros().isEmpty())){
            for (Carro car : aC.getListaCarros()) {
                if(numID==car.getNumID()){
                    System.out.println(numID);
                    System.out.println(car.getNumID());
                    repetido=true;
                }
            }
        }
        if(repetido==false){
            nomC = tf_nomC.getText();
            color = bt_color.getBackground();
            if(tipo=="McQueen"){
                c = new McQueen(numID, 0, nomC, color);
            }
            else if(tipo=="Convertible"){
                c = new Convertible(numID, 0, nomC, color);
            }
            else{
                c = new Nascar(numID, 0, nomC, color);
            }
            aC.cargarArchivo();
            aC.setCarro(c);
            aC.escribirArchivo();
            JOptionPane.showMessageDialog(this,
                    "Carro guardado exitosamente");
            ftf_numID.setText("");
            tf_nomC.setText("");
            DefaultComboBoxModel dc = (DefaultComboBoxModel) cb_carros.getModel();
            dc.removeAllElements();
            for (Carro carro : aC.getListaCarros()) {
                dc.addElement(carro);
            }
            cb_carros.setModel(dc);
        }
        else if(repetido == true){
            JOptionPane.showMessageDialog(null, "Debe de Ingresar un numero identificador diferente");
        }
        
    }//GEN-LAST:event_bt_guardarCarroActionPerformed

    private void bt_setPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_setPistaActionPerformed
        // TODO add your handling code here:
        nombreP = tf_nomPista.getText();
        largoP = Integer.parseInt(ftf_largoP.getText());
        JOptionPane.showMessageDialog(null, "Pista creada con exito");
        tf_nomPista.setText("");
        ftf_largoP.setText("");
        jl_nomPista.setText(nombreP);
        jl_largoP.setText(largoP+"");
    }//GEN-LAST:event_bt_setPistaActionPerformed

    private void bt_restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_restartActionPerformed
        // TODO add your handling code here:
        nombreP = "";
        largoP = 0;
        jl_nomPista.setText("____");
        jl_largoP.setText("_____");
        JOptionPane.showMessageDialog(null, "Favor Crear otra pista");
    }//GEN-LAST:event_bt_restartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add;
    private javax.swing.JButton bt_color;
    private javax.swing.JButton bt_comenzar;
    private javax.swing.JButton bt_guardarCarro;
    private javax.swing.JButton bt_pausar;
    private javax.swing.JButton bt_restart;
    private javax.swing.JButton bt_setPista;
    private javax.swing.JComboBox<String> cb_carros;
    private javax.swing.JComboBox<String> cb_tiposC;
    private javax.swing.JFormattedTextField ftf_largoP;
    private javax.swing.JFormattedTextField ftf_numID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_largoP;
    private javax.swing.JLabel jl_nomPista;
    private javax.swing.JTable jt_posiciones;
    private javax.swing.JTextField tf_nomC;
    private javax.swing.JTextField tf_nomPista;
    // End of variables declaration//GEN-END:variables
String nombreP;
int largoP;
}
