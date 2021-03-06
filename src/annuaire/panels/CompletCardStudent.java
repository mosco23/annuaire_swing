/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annuaire.panels;

import annuaire.personnes.Student;

/**
 *
 * @author mosco
 */
public class CompletCardStudent extends javax.swing.JPanel {

    Student student;

    /**
     * Creates new form Card
     * @param student
     */
    public CompletCardStudent(Student student) {
        initComponents();
        this.student = student;
        nce.setText(student.getNce());
        nom.setText(student.getNom());
        prenoms.setText(student.getPrenoms());
        date2naissance.setText(student.getDate2naissance());
        lieu2naissance.setText(student.getLieu2naissance());
        email.setText(student.getEmail());
        mobile.setText(student.getMobile());
        setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nom = new javax.swing.JLabel();
        date2naissance = new javax.swing.JLabel();
        prenoms = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nce = new javax.swing.JLabel();
        mobile = new javax.swing.JLabel();
        lieu2naissance = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        date2naissance1 = new javax.swing.JLabel();
        lieu2naissance1 = new javax.swing.JLabel();
        EXIT = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(java.awt.Color.darkGray);
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setForeground(java.awt.SystemColor.desktop);

        nom.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        nom.setForeground(java.awt.Color.white);
        nom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nom.setText("nom");
        nom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        date2naissance.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        date2naissance.setForeground(java.awt.Color.white);
        date2naissance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date2naissance.setText("date2naissance");

        prenoms.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        prenoms.setForeground(java.awt.Color.white);
        prenoms.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prenoms.setText("prenoms");

        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("nce");

        nce.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        nce.setForeground(java.awt.Color.white);
        nce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nce.setText("XXXXX");

        mobile.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        mobile.setForeground(java.awt.Color.white);
        mobile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mobile.setText("mobile");

        lieu2naissance.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        lieu2naissance.setForeground(java.awt.Color.white);
        lieu2naissance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lieu2naissance.setText("lieu2naissance");

        email.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        email.setForeground(java.awt.Color.white);
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText("email");

        jButton1.setBackground(java.awt.Color.red);
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setEnabled(false);
        jButton1.setFocusable(false);

        date2naissance1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        date2naissance1.setForeground(java.awt.Color.white);
        date2naissance1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date2naissance1.setText("N??(e) le");

        lieu2naissance1.setFont(new java.awt.Font("Ubuntu", 1, 17)); // NOI18N
        lieu2naissance1.setForeground(java.awt.Color.white);
        lieu2naissance1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lieu2naissance1.setText("??");

        EXIT.setBackground(java.awt.Color.red);
        EXIT.setForeground(java.awt.Color.white);
        EXIT.setText("x");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/annuaire/img/inconnu.png"))); // NOI18N
        jButton2.setEnabled(false);
        jButton2.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(prenoms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(date2naissance1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date2naissance, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lieu2naissance1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lieu2naissance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(nom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EXIT))
            .addComponent(mobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(EXIT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nce, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prenoms, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date2naissance, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date2naissance1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lieu2naissance, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lieu2naissance1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        Card.popup.hide();
    }//GEN-LAST:event_EXITActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JLabel date2naissance;
    private javax.swing.JLabel date2naissance1;
    private javax.swing.JLabel email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lieu2naissance;
    private javax.swing.JLabel lieu2naissance1;
    private javax.swing.JLabel mobile;
    private javax.swing.JLabel nce;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel prenoms;
    // End of variables declaration//GEN-END:variables
}
