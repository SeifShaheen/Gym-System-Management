/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.FrontEnd;

import com.mycompany.BackEnd.TrainerRole;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author seifs
 */
public class AddClassPage extends javax.swing.JFrame {

    /**
     * Creates new form AddClassPage
     */
    public AddClassPage() {
        initComponents();
        setVisible(true);
        setSize(new Dimension(405, 366));
        setContentPane(addClassPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setTitle("Add Class");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addClassPanel = new javax.swing.JPanel();
        trainerIDLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        durationLabel = new javax.swing.JLabel();
        maxParticipantsLabel = new javax.swing.JLabel();
        classNameText = new javax.swing.JTextField();
        durationText = new javax.swing.JTextField();
        trainerIDText = new javax.swing.JTextField();
        classIDLabel = new javax.swing.JLabel();
        classIDText = new javax.swing.JTextField();
        classNameLabel = new javax.swing.JLabel();
        maxParticipantsText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        trainerIDLabel.setBackground(new java.awt.Color(0, 153, 51));
        trainerIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        trainerIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trainerIDLabel.setText("Trainer ID");
        trainerIDLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        trainerIDLabel.setName(""); // NOI18N
        trainerIDLabel.setOpaque(true);

        addButton.setBackground(new java.awt.Color(153, 153, 153));
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setBorder(null);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        durationLabel.setBackground(new java.awt.Color(0, 153, 51));
        durationLabel.setForeground(new java.awt.Color(255, 255, 255));
        durationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        durationLabel.setText("Duration");
        durationLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        durationLabel.setName(""); // NOI18N
        durationLabel.setOpaque(true);

        maxParticipantsLabel.setBackground(new java.awt.Color(0, 153, 51));
        maxParticipantsLabel.setForeground(new java.awt.Color(255, 255, 255));
        maxParticipantsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maxParticipantsLabel.setText("Max Participants");
        maxParticipantsLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        maxParticipantsLabel.setName(""); // NOI18N
        maxParticipantsLabel.setOpaque(true);

        classNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classNameTextActionPerformed(evt);
            }
        });

        durationText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationTextActionPerformed(evt);
            }
        });

        trainerIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainerIDTextActionPerformed(evt);
            }
        });

        classIDLabel.setBackground(new java.awt.Color(0, 153, 51));
        classIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        classIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classIDLabel.setText("Class ID");
        classIDLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        classIDLabel.setName(""); // NOI18N
        classIDLabel.setOpaque(true);

        classIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classIDTextActionPerformed(evt);
            }
        });

        classNameLabel.setBackground(new java.awt.Color(0, 153, 51));
        classNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        classNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classNameLabel.setText("Class Name");
        classNameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        classNameLabel.setName(""); // NOI18N
        classNameLabel.setOpaque(true);

        maxParticipantsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxParticipantsTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addClassPanelLayout = new javax.swing.GroupLayout(addClassPanel);
        addClassPanel.setLayout(addClassPanelLayout);
        addClassPanelLayout.setHorizontalGroup(
            addClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addClassPanelLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(addClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(maxParticipantsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(durationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(trainerIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classIDText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classNameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(durationText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainerIDText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxParticipantsText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(addClassPanelLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addClassPanelLayout.setVerticalGroup(
            addClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addClassPanelLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(addClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(classNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(trainerIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainerIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(durationText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(durationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addClassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxParticipantsText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxParticipantsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addClassPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addClassPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void classNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classNameTextActionPerformed

    private void durationTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationTextActionPerformed

    private void trainerIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainerIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trainerIDTextActionPerformed

    private void classIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classIDTextActionPerformed

    private void maxParticipantsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxParticipantsTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxParticipantsTextActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        String classID = classIDText.getText();
        String className = classNameText.getText();
        String trainerID = trainerIDText.getText();
        int duration = Integer.parseInt(durationText.getText());
        int maxParticipants = Integer.parseInt(maxParticipantsText.getText());
        if (classID.isEmpty() || className.isEmpty() || trainerID.isEmpty() || durationText.getText().isEmpty() || maxParticipantsText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields", "Message",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            TrainerRole trainerRoleForPage = TrainerRolePage.trainerRole;
            int sizeBefore = trainerRoleForPage.getListOfClasses().size();
            trainerRoleForPage.addClass(classID, className, trainerID, duration, maxParticipants);
            int sizeAfter = trainerRoleForPage.getListOfClasses().size();
            if (sizeBefore != sizeAfter) {
                trainerRoleForPage.logout();
                JOptionPane.showMessageDialog(null, "The Class with Id = " + classID + " has successfully added");
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "The Class with Id = " + classID + " Already Exists!", "Message", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddClassPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddClassPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddClassPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddClassPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddClassPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addClassPanel;
    private javax.swing.JLabel classIDLabel;
    private javax.swing.JTextField classIDText;
    private javax.swing.JLabel classNameLabel;
    private javax.swing.JTextField classNameText;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JTextField durationText;
    private javax.swing.JLabel maxParticipantsLabel;
    private javax.swing.JTextField maxParticipantsText;
    private javax.swing.JLabel trainerIDLabel;
    private javax.swing.JTextField trainerIDText;
    // End of variables declaration//GEN-END:variables
}
