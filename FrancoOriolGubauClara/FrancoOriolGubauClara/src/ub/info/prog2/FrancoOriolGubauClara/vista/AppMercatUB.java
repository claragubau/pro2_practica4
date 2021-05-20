/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub.info.prog2.FrancoOriolGubauClara.vista;

import ub.info.prog2.FrancoOriolGubauClara.controlador.Controlador;
/**
 *
 * @author Oriol Franco i Clara Gubau
 */
public class AppMercatUB extends javax.swing.JFrame {
    Controlador controlador;
    /**
     * Creates new form AppMercatUB
     */
    public AppMercatUB() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        pnlMercatUB = new javax.swing.JPanel();
        btnGestioClients = new javax.swing.JButton();
        btnGestioClients1 = new javax.swing.JButton();
        btnGestioClients2 = new javax.swing.JButton();
        lblBenvinguda = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmnItemArxiuCarregar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMercatUB.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Mercat UB", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnGestioClients.setText("Gestionar Clients");
        btnGestioClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestioClientsActionPerformed(evt);
            }
        });

        btnGestioClients1.setText("Gestionar Articles");
        btnGestioClients1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestioClients1ActionPerformed(evt);
            }
        });

        btnGestioClients2.setText("Gestionar Comandes");
        btnGestioClients2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestioClients2ActionPerformed(evt);
            }
        });

        lblBenvinguda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBenvinguda.setText("Benvinguts a Mercat UB. Seleccioneu una opció:");

        javax.swing.GroupLayout pnlMercatUBLayout = new javax.swing.GroupLayout(pnlMercatUB);
        pnlMercatUB.setLayout(pnlMercatUBLayout);
        pnlMercatUBLayout.setHorizontalGroup(
            pnlMercatUBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMercatUBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBenvinguda, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMercatUBLayout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(pnlMercatUBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGestioClients, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestioClients2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGestioClients1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(193, 193, 193))
        );
        pnlMercatUBLayout.setVerticalGroup(
            pnlMercatUBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMercatUBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBenvinguda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGestioClients1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestioClients2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGestioClients)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(pnlMercatUB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(pnlMercatUB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(pnlMercatUB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jMenu1.setText("Arxius");

        itmnItemArxiuCarregar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        itmnItemArxiuCarregar.setText("Carregar Fitxer");
        itmnItemArxiuCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmnItemArxiuCarregarActionPerformed(evt);
            }
        });
        jMenu1.add(itmnItemArxiuCarregar);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Guardar Fitxer");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestioClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestioClientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestioClientsActionPerformed

    private void itmnItemArxiuCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmnItemArxiuCarregarActionPerformed
        
    }//GEN-LAST:event_itmnItemArxiuCarregarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnGestioClients1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestioClients1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestioClients1ActionPerformed

    private void btnGestioClients2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestioClients2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestioClients2ActionPerformed

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
            java.util.logging.Logger.getLogger(AppMercatUB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppMercatUB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppMercatUB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppMercatUB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppMercatUB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestioClients;
    private javax.swing.JButton btnGestioClients1;
    private javax.swing.JButton btnGestioClients2;
    private javax.swing.JMenuItem itmnItemArxiuCarregar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblBenvinguda;
    private javax.swing.JPanel pnlMercatUB;
    // End of variables declaration//GEN-END:variables
}
