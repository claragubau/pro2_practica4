/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub.info.prog2.FrancoOriolGubauClara.vista;


import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import ub.info.prog2.FrancoOriolGubauClara.controlador.Controlador;
/**
 *
 * @author Oriol Franco i Clara Gubau
 */
public class FrmAfegirArticle extends javax.swing.JDialog {
    Controlador controlador;
    /**
     * Creates new form FrmAfegirArticle
     */
    public FrmAfegirArticle(java.awt.Frame parent, boolean modal, Controlador controlador) {
        super(parent, modal);
        initComponents();
        this.controlador = controlador;
        chkEnviamentUrgent.setSelected(false);
        btnAcceptar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panAfegirArticle = new javax.swing.JPanel();
        etNomArticle = new javax.swing.JLabel();
        etIdArticle = new javax.swing.JLabel();
        etPreu = new javax.swing.JLabel();
        etTempsEnviament = new javax.swing.JLabel();
        etEnviamentUrgent = new javax.swing.JLabel();
        etMinuts = new javax.swing.JLabel();
        spnTempsEnviament = new javax.swing.JSpinner();
        txtNomArticle = new javax.swing.JTextField();
        txtPreu = new javax.swing.JTextField();
        txtIdArticle = new javax.swing.JTextField();
        chkEnviamentUrgent = new javax.swing.JCheckBox();
        btnCancellar = new javax.swing.JButton();
        btnAcceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panAfegirArticle.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Afegir Article", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        etNomArticle.setText("Nom de l'Article:");

        etIdArticle.setText("Id de l'Article:");

        etPreu.setText("Preu:");

        etTempsEnviament.setText("Temps Enviament:");

        etEnviamentUrgent.setText("Admet Enviaments Urgents: ");

        etMinuts.setText("(min)");

        spnTempsEnviament.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnTempsEnviamentStateChanged(evt);
            }
        });

        txtNomArticle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomArticleKeyReleased(evt);
            }
        });

        txtPreu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPreuKeyReleased(evt);
            }
        });

        txtIdArticle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdArticleKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panAfegirArticleLayout = new javax.swing.GroupLayout(panAfegirArticle);
        panAfegirArticle.setLayout(panAfegirArticleLayout);
        panAfegirArticleLayout.setHorizontalGroup(
            panAfegirArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAfegirArticleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAfegirArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAfegirArticleLayout.createSequentialGroup()
                        .addComponent(etEnviamentUrgent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkEnviamentUrgent)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panAfegirArticleLayout.createSequentialGroup()
                        .addGroup(panAfegirArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(etTempsEnviament, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etIdArticle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etNomArticle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etPreu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panAfegirArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panAfegirArticleLayout.createSequentialGroup()
                                .addComponent(spnTempsEnviament, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etMinuts))
                            .addComponent(txtNomArticle)
                            .addComponent(txtPreu)
                            .addComponent(txtIdArticle))))
                .addGap(19, 19, 19))
        );
        panAfegirArticleLayout.setVerticalGroup(
            panAfegirArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAfegirArticleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAfegirArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etNomArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAfegirArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etIdArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAfegirArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etPreu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panAfegirArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etTempsEnviament, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnTempsEnviament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etMinuts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(panAfegirArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etEnviamentUrgent, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkEnviamentUrgent))
                .addContainerGap())
        );

        btnCancellar.setText("Cancel·lar");
        btnCancellar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancellarActionPerformed(evt);
            }
        });

        btnAcceptar.setText("Acceptar");
        btnAcceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 154, Short.MAX_VALUE)
                        .addComponent(btnAcceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancellar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panAfegirArticle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panAfegirArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancellar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAcceptar))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancellarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancellarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancellarActionPerformed

    private void btnAcceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptarActionPerformed
        try{
            String nomArticle = txtNomArticle.getText();
            String idArticle = txtIdArticle.getText();
            float preuArticle = Float.valueOf(txtPreu.getText());
            int tempsArticle = (Integer) spnTempsEnviament.getValue();
            boolean enviamentUrgentArticle = chkEnviamentUrgent.isSelected();
            controlador.afegirArticle(idArticle, nomArticle, preuArticle,
                        tempsArticle, enviamentUrgentArticle);
            this.dispose();
        }catch(MercatException e){
            JOptionPane.showMessageDialog(this, e.getMessage(),"", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAcceptarActionPerformed

    private void txtNomArticleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomArticleKeyReleased
       btnAcceptar.setEnabled(comprovarTotsCampsPlens());
    }//GEN-LAST:event_txtNomArticleKeyReleased

    private void txtIdArticleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdArticleKeyReleased
        btnAcceptar.setEnabled(comprovarTotsCampsPlens());
    }//GEN-LAST:event_txtIdArticleKeyReleased

    private void txtPreuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPreuKeyReleased
        btnAcceptar.setEnabled(comprovarTotsCampsPlens());
    }//GEN-LAST:event_txtPreuKeyReleased

    private void spnTempsEnviamentStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnTempsEnviamentStateChanged
        btnAcceptar.setEnabled(comprovarTotsCampsPlens());
    }//GEN-LAST:event_spnTempsEnviamentStateChanged

    private boolean comprovarTextIntroduit(JTextField caixaDeText){
        return !caixaDeText.getText().equals("");
    }
    private boolean comprovarNumArticlePositiu(JSpinner spn){
        return !spn.getValue().equals(0);
    }
    private boolean comprovarTotsCampsPlens(){
        return comprovarTextIntroduit(txtNomArticle) && comprovarTextIntroduit(txtIdArticle) 
                && comprovarTextIntroduit(txtPreu) && comprovarNumArticlePositiu(spnTempsEnviament);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptar;
    private javax.swing.JButton btnCancellar;
    private javax.swing.JCheckBox chkEnviamentUrgent;
    private javax.swing.JLabel etEnviamentUrgent;
    private javax.swing.JLabel etIdArticle;
    private javax.swing.JLabel etMinuts;
    private javax.swing.JLabel etNomArticle;
    private javax.swing.JLabel etPreu;
    private javax.swing.JLabel etTempsEnviament;
    private javax.swing.JPanel panAfegirArticle;
    private javax.swing.JSpinner spnTempsEnviament;
    private javax.swing.JTextField txtIdArticle;
    private javax.swing.JTextField txtNomArticle;
    private javax.swing.JTextField txtPreu;
    // End of variables declaration//GEN-END:variables
}
