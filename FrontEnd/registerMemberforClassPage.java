package com.mycompany.FrontEnd;

import com.mycompany.BackEnd.TrainerRole;
import java.awt.Dimension;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

public class registerMemberforClassPage extends javax.swing.JFrame {

    /**
     * Creates new form registerMemberforClassPage
     */
    public registerMemberforClassPage() {
        initComponents();
        setVisible(true);
        setSize(new Dimension(436, 250));
        setContentPane(regirsterPanel);
        setTitle("Register Member");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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

        regirsterPanel = new javax.swing.JPanel();
        ClassIDText = new javax.swing.JTextField();
        memberIDLabel = new javax.swing.JLabel();
        IDText = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        ClassIDLabel = new javax.swing.JLabel();
        registrationDateLabel = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ClassIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassIDTextActionPerformed(evt);
            }
        });

        memberIDLabel.setBackground(new java.awt.Color(0, 153, 51));
        memberIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        memberIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberIDLabel.setText("Member ID");
        memberIDLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        memberIDLabel.setName(""); // NOI18N
        memberIDLabel.setOpaque(true);

        IDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTextActionPerformed(evt);
            }
        });

        registerButton.setBackground(new java.awt.Color(153, 153, 153));
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.setBorder(null);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        ClassIDLabel.setBackground(new java.awt.Color(0, 153, 51));
        ClassIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        ClassIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClassIDLabel.setText("Class ID");
        ClassIDLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ClassIDLabel.setName(""); // NOI18N
        ClassIDLabel.setOpaque(true);

        registrationDateLabel.setBackground(new java.awt.Color(0, 153, 51));
        registrationDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        registrationDateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrationDateLabel.setText("Registration Date");
        registrationDateLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        registrationDateLabel.setName(""); // NOI18N
        registrationDateLabel.setOpaque(true);

        javax.swing.GroupLayout regirsterPanelLayout = new javax.swing.GroupLayout(regirsterPanel);
        regirsterPanel.setLayout(regirsterPanelLayout);
        regirsterPanelLayout.setHorizontalGroup(
            regirsterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regirsterPanelLayout.createSequentialGroup()
                .addGroup(regirsterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(regirsterPanelLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 141, Short.MAX_VALUE))
                    .addGroup(regirsterPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(regirsterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(memberIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(ClassIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(registrationDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(regirsterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IDText, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(ClassIDText, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );
        regirsterPanelLayout.setVerticalGroup(
            regirsterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regirsterPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(regirsterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regirsterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClassIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClassIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regirsterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registrationDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(DateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regirsterPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regirsterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClassIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClassIDTextActionPerformed

    private void IDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTextActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        TrainerRole trainerRoleForPage = TrainerRolePage.trainerRole;
        String memberId = IDText.getText();
        String classId = ClassIDText.getText();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        LocalDate localDate = null;
        try {
            date = f.parse(f.format(DateChooser.getDate()));
            localDate = LocalDate.ofInstant(
                    date.toInstant(), ZoneId.systemDefault());
        } catch (ParseException ex) {
            localDate = LocalDate.now();
        }
        if (memberId.isEmpty() || classId.isEmpty() || date == null) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields", "Message",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            if (trainerRoleForPage.registerMemberForClass(memberId, classId, localDate)) {
                trainerRoleForPage.logout();
                setVisible(false);
                JOptionPane.showMessageDialog(null,
                        "The Member with Id = " + memberId + " has successfully registerd to class " + classId);
            } else {
                JOptionPane.showMessageDialog(null, "The Class has no available seats",
                        "Message",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_registerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(registerMemberforClassPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerMemberforClassPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerMemberforClassPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerMemberforClassPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerMemberforClassPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ClassIDLabel;
    private javax.swing.JTextField ClassIDText;
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JTextField IDText;
    private javax.swing.JLabel memberIDLabel;
    private javax.swing.JPanel regirsterPanel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registrationDateLabel;
    // End of variables declaration//GEN-END:variables
}