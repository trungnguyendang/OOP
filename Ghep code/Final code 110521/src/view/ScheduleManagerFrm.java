/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.util.Date;
import javax.swing.JOptionPane;
import model.ScheduleManager;
import mainboard.MainBoardFrm;

/**
 *
 * @author judy
 */
public class ScheduleManagerFrm extends javax.swing.JDialog {

    /**
     * Creates new form ScheduleManagerFrm
     */
    
    private MainBoardFrm main;
    public ScheduleManagerFrm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        main = (MainBoardFrm) parent;
        this.setTitle("Input the schedule for manager");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        optID1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateSchedule = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        optManagerID1 = new javax.swing.JComboBox<>();
        btnAddManager = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        optManagerID2 = new javax.swing.JComboBox<>();

        jButton2.setText("Add");

        optID1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MA1", "MA2", "S1", "S2", "S3", "S4", "S5", "S6" }));
        optID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optID1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("INPUT THE MANAGER SCHEDULE");

        jLabel2.setText("Choose the Date:");

        jLabel4.setText("Morning - afternoon shift:");

        optManagerID1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MA1", "MA2" }));
        optManagerID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optManagerID1ActionPerformed(evt);
            }
        });

        btnAddManager.setText("Add");
        btnAddManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddManagerActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel6.setText("Evening - night shift:");

        optManagerID2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MA1", "MA2" }));
        optManagerID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optManagerID2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optManagerID1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(optManagerID2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnAddManager)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(optManagerID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optManagerID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddManager)
                    .addComponent(btnCancel))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void optManagerID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optManagerID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optManagerID1ActionPerformed

    private void btnAddManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddManagerActionPerformed
        // TODO add your handling code here:
        boolean isOK = true;
        Date date = null;
        date = dateSchedule.getDate();
        String managerId1 = optManagerID1.getSelectedItem().toString();
        String managerId2 = optManagerID2.getSelectedItem().toString();
        if (managerId1 == null ? managerId2 == null : managerId1.equals(managerId2)) {
            JOptionPane.showMessageDialog(rootPane, "Each manager should not work all day!");
            isOK = false;
        }
                
        if (isOK) {
            ScheduleManager scheduleManager = new ScheduleManager(date, managerId1, managerId2);
            main.addScheduleManagerFrm(scheduleManager);
            JOptionPane.showMessageDialog(rootPane, "Successfully added!");
        }
    }//GEN-LAST:event_btnAddManagerActionPerformed

    private void optID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optID1ActionPerformed

    private void optManagerID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optManagerID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optManagerID2ActionPerformed

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
            java.util.logging.Logger.getLogger(ScheduleManagerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScheduleManagerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScheduleManagerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScheduleManagerFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ScheduleManagerFrm dialog = new ScheduleManagerFrm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddManager;
    private javax.swing.JButton btnCancel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.toedter.calendar.JDateChooser dateSchedule;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> optID1;
    private javax.swing.JComboBox<String> optManagerID1;
    private javax.swing.JComboBox<String> optManagerID2;
    // End of variables declaration//GEN-END:variables
}