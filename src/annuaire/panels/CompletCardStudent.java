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

    /**
     * Creates new form Card
     * @param student
     */
    public CompletCardStudent(Student student) {
        initComponents();
        
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
        canvas = new java.awt.Canvas();
        mobile = new javax.swing.JLabel();
        lieu2naissance = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(java.awt.Color.darkGray);
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setForeground(java.awt.SystemColor.desktop);
        setMaximumSize(new java.awt.Dimension(200, 440));
        setMinimumSize(new java.awt.Dimension(200, 440));
        setPreferredSize(new java.awt.Dimension(200, 440));

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

        canvas.setBackground(java.awt.Color.white);

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
        jButton1.setText("Supprimer");

        jButton2.setBackground(java.awt.SystemColor.activeCaption);
        jButton2.setForeground(java.awt.Color.white);
        jButton2.setText("Modifier");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addComponent(prenoms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(date2naissance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(canvas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mobile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lieu2naissance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(nce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prenoms, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date2naissance, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lieu2naissance, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas;
    private javax.swing.JLabel date2naissance;
    private javax.swing.JLabel email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lieu2naissance;
    private javax.swing.JLabel mobile;
    private javax.swing.JLabel nce;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel prenoms;
    // End of variables declaration//GEN-END:variables
}