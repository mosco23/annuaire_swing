/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annuaire.menus;

import annuaire.Main;
import annuaire.panels.PanelAdmin;
import annuaire.panels.PanelConnexion;
import javax.swing.JMenuItem;

/**
 *
 * @author mosco
 */
public class TypeOne extends javax.swing.JMenu {

    JMenuItem itemOne;
    JMenuItem itemTwo;
    /**
     * Creates new form TypeOne
     */
    public TypeOne() {
        initComponents();
        
        setText("Menu");
        initJMenuItems();
        
        
    }
    
    //private void 
    
    private void initJMenuItems(){
        itemOne = new JMenuItem("Créer un compte");
        itemTwo = new JMenuItem("Se Connecter");
        add(itemOne);
        add(itemTwo);
        
        itemOne.addActionListener(this::itemOneActionPerformed);
        itemTwo.addActionListener(this::itemTwoActionPerformed);
    }
    
    private void itemOneActionPerformed(java.awt.event.ActionEvent evt){
        Main.addToPaneG(new PanelAdmin());
    }
    
    private void itemTwoActionPerformed(java.awt.event.ActionEvent evt){
        Main.addToPaneG(new PanelConnexion());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
