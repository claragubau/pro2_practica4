/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub.info.prog2.FrancoOriolGubauClara.vista;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ub.info.prog2.FrancoOriolGubauClara.controlador.Controlador;

/**
 *
 * @author Oriol Franco i Clara Gubau
 */
public final class FrmGestioComandes extends javax.swing.JFrame {
    Controlador controlador;
    /**
     * Creates new form FrmGestioComandes
     */
    public FrmGestioComandes(Controlador controlador) {
        initComponents();
        this.setSize(650, 650);
        panAfegirComanda.setVisible(false);
        this.controlador = controlador;
        chkAfegirComandaUrgent.setSelected(false);
        btnEliminarComanda.setEnabled(false);
        omplirLlistaComandes();
        if(controlador.visualitzarArticles().size() <= 0){
            btnAfegirComanda.setEnabled(false);
            btnActualitzarLlista.setEnabled(false);
        }else{
            btnAfegirComanda.setEnabled(true);
            btnActualitzarLlista.setEnabled(false);
        }
    }
    
    public void omplirLlistaArticles(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.removeAllElements();
        for(String str : controlador.visualitzarArticles()){
            model.addElement(str);
        }
        cbxLlistaArticles.setModel(model); 
    }
    
    public void omplirLlistaClients(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        model.removeAllElements();
        for(String str : controlador.visualitzarClients()){
            model.addElement(str);
        }
        cbxLlistaClients.setModel(model); 
    }
    
    public void omplirLlistaComandes(){
        DefaultListModel model = new DefaultListModel();
        model.clear();
        for(String str : controlador.visualitzarComandes()){
            model.addElement(str);
        }
        lstLlistaComandes.setModel(model); 
    }
    
    public void omplirLlistaComandesUrgents(){
        DefaultListModel model = new DefaultListModel();
        model.clear();
        for(String str : controlador.visualitzarComandesUrgents()){
            model.addElement(str);
        }
        lstLlistaComandes.setModel(model); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panAfegirComanda = new javax.swing.JPanel();
        etArticle = new javax.swing.JLabel();
        cbxLlistaArticles = new javax.swing.JComboBox<>();
        etClient = new javax.swing.JLabel();
        etUnitats = new javax.swing.JLabel();
        chkAfegirComandaUrgent = new javax.swing.JCheckBox();
        etComandaUrgent = new javax.swing.JLabel();
        spnUnitats = new javax.swing.JSpinner();
        btnConfirmar = new javax.swing.JButton();
        btnCancellar = new javax.swing.JButton();
        cbxLlistaClients = new javax.swing.JComboBox<>();
        panVisualitzarComandes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstLlistaComandes = new javax.swing.JList<>();
        chkComandesUrgents = new javax.swing.JCheckBox();
        btnAfegirComanda = new javax.swing.JButton();
        btnEliminarComanda = new javax.swing.JButton();
        btnSortir = new javax.swing.JButton();
        btnActualitzarLlista = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panAfegirComanda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Afegir Comanda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        etArticle.setText("Article:");

        cbxLlistaArticles.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxLlistaArticlesItemStateChanged(evt);
            }
        });
        cbxLlistaArticles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLlistaArticlesActionPerformed(evt);
            }
        });

        etClient.setText("Client:");

        etUnitats.setText("Unitats:");

        etComandaUrgent.setText("Comanda Urgent:");

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancellar.setText("Cancel·lar");
        btnCancellar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancellarActionPerformed(evt);
            }
        });

        cbxLlistaClients.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxLlistaClientsItemStateChanged(evt);
            }
        });
        cbxLlistaClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLlistaClientsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAfegirComandaLayout = new javax.swing.GroupLayout(panAfegirComanda);
        panAfegirComanda.setLayout(panAfegirComandaLayout);
        panAfegirComandaLayout.setHorizontalGroup(
            panAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAfegirComandaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAfegirComandaLayout.createSequentialGroup()
                        .addGroup(panAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panAfegirComandaLayout.createSequentialGroup()
                                .addComponent(etArticle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbxLlistaArticles, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panAfegirComandaLayout.createSequentialGroup()
                                .addGroup(panAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panAfegirComandaLayout.createSequentialGroup()
                                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(btnCancellar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panAfegirComandaLayout.createSequentialGroup()
                                        .addComponent(etUnitats)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnUnitats, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(155, 155, 155)
                                        .addComponent(etComandaUrgent)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkAfegirComandaUrgent, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panAfegirComandaLayout.createSequentialGroup()
                        .addComponent(etClient, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxLlistaClients, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panAfegirComandaLayout.setVerticalGroup(
            panAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAfegirComandaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panAfegirComandaLayout.createSequentialGroup()
                        .addGroup(panAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxLlistaArticles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxLlistaClients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etClient, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etUnitats, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnUnitats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etComandaUrgent, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(chkAfegirComandaUrgent))
                .addGap(37, 37, 37)
                .addGroup(panAfegirComandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancellar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panVisualitzarComandes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Visualitzar Comandes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        panVisualitzarComandes.setMaximumSize(new java.awt.Dimension(700, 400));
        panVisualitzarComandes.setPreferredSize(new java.awt.Dimension(650, 300));

        lstLlistaComandes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstLlistaComandes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lstLlistaComandesMouseMoved(evt);
            }
        });
        lstLlistaComandes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstLlistaComandesValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstLlistaComandes);

        chkComandesUrgents.setText("Comandes Urgents");
        chkComandesUrgents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkComandesUrgentsActionPerformed(evt);
            }
        });

        btnAfegirComanda.setText("Afegir Comanda");
        btnAfegirComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfegirComandaActionPerformed(evt);
            }
        });

        btnEliminarComanda.setText("Eliminar Comanda");
        btnEliminarComanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarComandaActionPerformed(evt);
            }
        });

        btnSortir.setText("Sortir");
        btnSortir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortirActionPerformed(evt);
            }
        });

        btnActualitzarLlista.setText("Actualitzar Comandes");
        btnActualitzarLlista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualitzarLlistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panVisualitzarComandesLayout = new javax.swing.GroupLayout(panVisualitzarComandes);
        panVisualitzarComandes.setLayout(panVisualitzarComandesLayout);
        panVisualitzarComandesLayout.setHorizontalGroup(
            panVisualitzarComandesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVisualitzarComandesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panVisualitzarComandesLayout.createSequentialGroup()
                .addGroup(panVisualitzarComandesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panVisualitzarComandesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkComandesUrgents))
                    .addGroup(panVisualitzarComandesLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnAfegirComanda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarComanda)))
                .addGroup(panVisualitzarComandesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panVisualitzarComandesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnActualitzarLlista))
                    .addGroup(panVisualitzarComandesLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnSortir, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
        );
        panVisualitzarComandesLayout.setVerticalGroup(
            panVisualitzarComandesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVisualitzarComandesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panVisualitzarComandesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAfegirComanda)
                    .addComponent(btnEliminarComanda)
                    .addComponent(btnActualitzarLlista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panVisualitzarComandesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panVisualitzarComandesLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(chkComandesUrgents)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panVisualitzarComandesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSortir)
                        .addContainerGap())))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Gestió Comandes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panAfegirComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panVisualitzarComandes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panVisualitzarComandes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panAfegirComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancellarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancellarActionPerformed
        this.setSize(670, 420);
        panAfegirComanda.setVisible(false);
        btnAfegirComanda.setEnabled(true);
    }//GEN-LAST:event_btnCancellarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try{
            int articlePos = cbxLlistaArticles.getSelectedIndex() + 1;
            int clientPos = cbxLlistaClients.getSelectedIndex() + 1;
            int quantitat = (Integer) spnUnitats.getValue();
            boolean enviamentUrgentComanda = chkAfegirComandaUrgent.isSelected();
            controlador.afegirComanda(articlePos, clientPos, quantitat, enviamentUrgentComanda);
            visualitzarComandesNormalsOUrgents();
            this.setSize(670, 420);
            panAfegirComanda.setVisible(false);
            btnAfegirComanda.setEnabled(true);
            btnActualitzarLlista.setEnabled(true);
        }catch(MercatException e){
            JOptionPane.showMessageDialog(this, e.getMessage(),"", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void cbxLlistaArticlesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxLlistaArticlesItemStateChanged
        btnConfirmar.setEnabled(comprovarCampsPlens());
    }//GEN-LAST:event_cbxLlistaArticlesItemStateChanged

    private void cbxLlistaArticlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLlistaArticlesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLlistaArticlesActionPerformed

    private void cbxLlistaClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLlistaClientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLlistaClientsActionPerformed

    private void cbxLlistaClientsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxLlistaClientsItemStateChanged
        // TODO add your handling code here:
        btnConfirmar.setEnabled(comprovarCampsPlens());
    }//GEN-LAST:event_cbxLlistaClientsItemStateChanged

    private void btnActualitzarLlistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualitzarLlistaActionPerformed
        // TODO add your handling code here:
        visualitzarComandesNormalsOUrgents();
    }//GEN-LAST:event_btnActualitzarLlistaActionPerformed

    private void btnSortirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSortirActionPerformed

    private void btnEliminarComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarComandaActionPerformed
        try{
            controlador.esborrarComanda(lstLlistaComandes.getSelectedIndex() + 1);
            visualitzarComandesNormalsOUrgents();
        }catch(MercatException e){
            JOptionPane.showMessageDialog(this, e.getMessage(),"", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarComandaActionPerformed

    private void btnAfegirComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfegirComandaActionPerformed
        this.setSize(670, 650);
        panAfegirComanda.setVisible(true);
        btnAfegirComanda.setEnabled(false);
        btnConfirmar.setEnabled(false);
        chkAfegirComandaUrgent.setSelected(false);
        spnUnitats.setValue(0);
        omplirLlistaArticles();
        omplirLlistaClients();
        cbxLlistaArticles.setSelectedIndex(-1);
        cbxLlistaClients.setSelectedIndex(-1);
    }//GEN-LAST:event_btnAfegirComandaActionPerformed

    private void chkComandesUrgentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkComandesUrgentsActionPerformed
        visualitzarComandesNormalsOUrgents();
    }//GEN-LAST:event_chkComandesUrgentsActionPerformed

    private void lstLlistaComandesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstLlistaComandesValueChanged
        btnEliminarComanda.setEnabled(!lstLlistaComandes.isSelectionEmpty());
    }//GEN-LAST:event_lstLlistaComandesValueChanged

    private void lstLlistaComandesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstLlistaComandesMouseMoved
        // TODO add your handling code here:
        // visualitzarComandesNormalsOUrgents();
    }//GEN-LAST:event_lstLlistaComandesMouseMoved

    private boolean comprovarCampsPlens(){
        return (cbxLlistaClients.getSelectedIndex() != -1) && 
                (cbxLlistaArticles.getSelectedIndex() != -1) && 
                (!spnUnitats.getValue().equals(0)); 
    }
    
    private void visualitzarComandesNormalsOUrgents(){
        if(!chkComandesUrgents.isSelected()){
                omplirLlistaComandes();    
            }else{
                omplirLlistaComandesUrgents();
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualitzarLlista;
    private javax.swing.JButton btnAfegirComanda;
    private javax.swing.JButton btnCancellar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEliminarComanda;
    private javax.swing.JButton btnSortir;
    private javax.swing.JComboBox<String> cbxLlistaArticles;
    private javax.swing.JComboBox<String> cbxLlistaClients;
    private javax.swing.JCheckBox chkAfegirComandaUrgent;
    private javax.swing.JCheckBox chkComandesUrgents;
    private javax.swing.JLabel etArticle;
    private javax.swing.JLabel etClient;
    private javax.swing.JLabel etComandaUrgent;
    private javax.swing.JLabel etUnitats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstLlistaComandes;
    private javax.swing.JPanel panAfegirComanda;
    private javax.swing.JPanel panVisualitzarComandes;
    private javax.swing.JSpinner spnUnitats;
    // End of variables declaration//GEN-END:variables
}
