/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.MyFrames;

import GUI.MyFrames.myPanels.ListPanel;

import GUI.MyFrames.myPanels.PermissionPanel;

import GUI.MyFrames.myPanels.symbolic_link;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


/**
 *
 * @author Amin
 */
public class Frame1 extends javax.swing.JInternalFrame {

    GridBagLayout layout = new GridBagLayout();
    ListPanel p1;
    PermissionPanel p2;
    symbolic_link p3;
    public Frame1() {
       
        initComponents();
         p1=new ListPanel();
        p2=new PermissionPanel();
        p3=new symbolic_link();
        
        DynamicPanel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p1,c);
        
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p2,c);
        
        c.gridx=0;
        c.gridy=0;
        DynamicPanel.add(p3,c); 
        
  
        
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelButton = new javax.swing.JPanel();
        btnPanel1 = new javax.swing.JButton();
        btnPanel2 = new javax.swing.JButton();
        btnPanel4 = new javax.swing.JButton();
        DynamicPanel = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Frame1");

        PanelButton.setBackground(new java.awt.Color(204, 204, 204));

        btnPanel1.setText("List files,dir");
        btnPanel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanel1ActionPerformed(evt);
            }
        });

        btnPanel2.setText("Permissions");
        btnPanel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanel2ActionPerformed(evt);
            }
        });

        btnPanel4.setText("Symbolic Link");
        btnPanel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPanel4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelButtonLayout = new javax.swing.GroupLayout(PanelButton);
        PanelButton.setLayout(PanelButtonLayout);
        PanelButtonLayout.setHorizontalGroup(
            PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonLayout.createSequentialGroup()
                .addGroup(PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        PanelButtonLayout.setVerticalGroup(
            PanelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPanel1)
                .addGap(68, 68, 68)
                .addComponent(btnPanel2)
                .addGap(61, 61, 61)
                .addComponent(btnPanel4)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        getContentPane().add(PanelButton, java.awt.BorderLayout.LINE_START);

        DynamicPanel.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );

        getContentPane().add(DynamicPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPanel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanel1ActionPerformed
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
     
    }//GEN-LAST:event_btnPanel1ActionPerformed

    private void btnPanel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanel2ActionPerformed
        p1.setVisible(false);
        p2.setVisible(true);
        p3.setVisible(false);
        
    }//GEN-LAST:event_btnPanel2ActionPerformed

    private void btnPanel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPanel4ActionPerformed
        p1.setVisible(false);
        p2.setVisible(false);
        p3.setVisible(true);
 
    }//GEN-LAST:event_btnPanel4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JPanel PanelButton;
    private javax.swing.JButton btnPanel1;
    private javax.swing.JButton btnPanel2;
    private javax.swing.JButton btnPanel4;
    // End of variables declaration//GEN-END:variables
}
