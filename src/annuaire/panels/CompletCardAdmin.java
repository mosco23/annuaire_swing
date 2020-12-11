/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annuaire.panels;

import annuaire.personnes.Admin;

/**
 *
 * @author mosco
 */
public class CompletCardAdmin extends javax.swing.JPanel {

    /**
     * Creates new form Card
     * @param admin
     */
    public CompletCardAdmin(Admin admin) {
        initComponents();
        nom.setText(admin.getNom());
        prenoms.setText(admin.getPrenoms());
        email.setText(admin.getEmail());
        mobile.setText(admin.getMobile());
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas = new java.awt.Canvas();
        mobile = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        modifier = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        prenoms = new javax.swing.JLabel();

        setBackground(java.awt.Color.darkGray);
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setForeground(java.awt.Color.white);
        setToolTipText("Administrateur");
        setMaximumSize(new java.awt.Dimension(200, 400));
        setMinimumSize(new java.awt.Dimension(200, 400));
        setPreferredSize(new java.awt.Dimension(200, 400));

        canvas.setBackground(java.awt.Color.white);

        mobile.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        mobile.setForeground(java.awt.Color.white);
        mobile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mobile.setText("mobile");

        nom.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        nom.setForeground(java.awt.Color.white);
        nom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nom.setText("nom");
        nom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        email.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        email.setForeground(java.awt.Color.white);
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText("email");

        modifier.setBackground(java.awt.SystemColor.desktop);
        modifier.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        modifier.setForeground(java.awt.Color.white);
        modifier.setText("Modifier");

        supprimer.setBackground(java.awt.Color.red);
        supprimer.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        supprimer.setForeground(java.awt.Color.white);
        supprimer.setText("supprimer");

        prenoms.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        prenoms.setForeground(java.awt.Color.white);
        prenoms.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prenoms.setText("prenoms");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(prenoms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(canvas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prenoms, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supprimer)
                    .addComponent(modifier))
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas;
    private javax.swing.JLabel email;
    private javax.swing.JLabel mobile;
    private javax.swing.JButton modifier;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel prenoms;
    private javax.swing.JButton supprimer;
    // End of variables declaration//GEN-END:variables
}
