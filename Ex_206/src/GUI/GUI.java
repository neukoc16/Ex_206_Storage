package GUI;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbtable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menman = new javax.swing.JMenu();
        miadd = new javax.swing.JMenuItem();
        mirem = new javax.swing.JMenuItem();
        miedit = new javax.swing.JMenuItem();
        menbs = new javax.swing.JMenu();
        mibuy = new javax.swing.JMenuItem();
        misell = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbtable);

        menman.setText("Management");

        miadd.setText("Add New Article");
        miadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miaddActionPerformed(evt);
            }
        });
        menman.add(miadd);

        mirem.setText("Remove Selected Article");
        mirem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miremActionPerformed(evt);
            }
        });
        menman.add(mirem);

        miedit.setText("Edit Selected Article");
        miedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mieditActionPerformed(evt);
            }
        });
        menman.add(miedit);

        jMenuBar1.add(menman);

        menbs.setText("Buy/Sell");

        mibuy.setText("Buy Slected Item");
        mibuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mibuyActionPerformed(evt);
            }
        });
        menbs.add(mibuy);

        misell.setText("Sell Selected Item");
        misell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                misellActionPerformed(evt);
            }
        });
        menbs.add(misell);

        jMenuBar1.add(menbs);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miaddActionPerformed

    private void miremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miremActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miremActionPerformed

    private void mieditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mieditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mieditActionPerformed

    private void mibuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mibuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mibuyActionPerformed

    private void misellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_misellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_misellActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menbs;
    private javax.swing.JMenu menman;
    private javax.swing.JMenuItem miadd;
    private javax.swing.JMenuItem mibuy;
    private javax.swing.JMenuItem miedit;
    private javax.swing.JMenuItem mirem;
    private javax.swing.JMenuItem misell;
    private javax.swing.JTable tbtable;
    // End of variables declaration//GEN-END:variables
}
