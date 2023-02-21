/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicProgressBarUI;

/**
 *
 * @author HUY
 */
public class ExportMain extends javax.swing.JFrame implements ListSelectionListener {

    private ArrayList<Export>export;
    private DefaultListModel listExportModel;
    private int Gasoline1 = 1000; /////So luong xang tung loai
    private int Diesel1 = 1000;
    private int Lubrocant1 = 1000;
    private int Hydraulic1 = 1000;
    
    public ExportMain() {
        initComponents();
        export = new ArrayList<Export>(); ///// tao array list
        listExportModel = new DefaultListModel(); //// tao obj cho DefaultListModel
        jList1.setModel(listExportModel);
        JProgressBar[] ProgressBars = {jDiesel1,jGasoline1,jHydraulic1,jLubrocant1 };
         for (JProgressBar ProgressBar : ProgressBars) 
             {
                 ProgressBar.setUI(new BasicProgressBarUI());
                 
             }
    }
   
    public void addexport(){
         Export p = new Export(
                    txtName1.getText(),
                    txtDate1.getText(),
                    jComboBox1.getSelectedItem().toString(),     //NOTED FOR FIXING
                    txtAmount1.getText(),
                    txtPricePerLiter1.getText(),
                    txtTotalPrice1.getText()
                );
                export.add(p);
                refreshExportList();
    }
    public void refreshExportList(){
        listExportModel.removeAllElements();
        System.out.println("Remove");  
        for(Export p : export){
            System.out.println("Add:"+p.getName());
            System.out.println("Add:"+p.getDate());
            System.out.println("Add:"+p.getType());
            System.out.println("Add:"+p.getAmount());  
            System.out.println("Add:"+p.getPricePerLiter());
            System.out.println("Add:"+p.getTotalPrice());
            
            listExportModel.addElement("Name:"+p.getName());
            listExportModel.addElement("Date:"+p.getDate());
            listExportModel.addElement("Type:"+p.getType());
            listExportModel.addElement("Amount:"+p.getAmount());
            listExportModel.addElement("Price per Liter:"+p.getPricePerLiter());
            listExportModel.addElement("Total price:"+p.getTotalPrice());
            listExportModel.addElement("----------");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jDieselName1 = new javax.swing.JLabel();
        jDiesel1 = new javax.swing.JProgressBar();
        jLubrocantName1 = new javax.swing.JLabel();
        jLubrocant1 = new javax.swing.JProgressBar();
        jHydraulicName1 = new javax.swing.JLabel();
        jHydraulic1 = new javax.swing.JProgressBar();
        jGasolineName1 = new javax.swing.JLabel();
        jGasoline1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jName1 = new javax.swing.JLabel();
        jDate1 = new javax.swing.JLabel();
        jType1 = new javax.swing.JLabel();
        jAmount1 = new javax.swing.JLabel();
        jPricePerLiter1 = new javax.swing.JLabel();
        jTotalPrice1 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        txtDate1 = new javax.swing.JTextField();
        txtAmount1 = new javax.swing.JTextField();
        txtPricePerLiter1 = new javax.swing.JTextField();
        txtTotalPrice1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnCalculate1 = new javax.swing.JButton();
        btnProceed1 = new javax.swing.JButton();
        btnXuat1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(241, 242, 251));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(940, 410));

        jPanel1.setBackground(new java.awt.Color(241, 242, 251));

        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel3.setBackground(new java.awt.Color(241, 242, 251));

        jDieselName1.setText("Diesel:");

        jDiesel1.setBackground(new java.awt.Color(255, 255, 255));
        jDiesel1.setForeground(new java.awt.Color(0, 204, 51));
        jDiesel1.setMaximum(1000);
        jDiesel1.setValue(1000);
        jDiesel1.setString("1000");
        jDiesel1.setStringPainted(true);

        jLubrocantName1.setText("Lubrocant:");

        jLubrocant1.setBackground(new java.awt.Color(255, 255, 255));
        jLubrocant1.setForeground(new java.awt.Color(0, 204, 51));
        jLubrocant1.setMaximum(1000);
        jLubrocant1.setValue(1000);
        jLubrocant1.setString("1000");
        jLubrocant1.setStringPainted(true);

        jHydraulicName1.setText("Hydraulic:");

        jHydraulic1.setBackground(new java.awt.Color(255, 255, 255));
        jHydraulic1.setForeground(new java.awt.Color(0, 204, 51));
        jHydraulic1.setMaximum(1000);
        jHydraulic1.setValue(1000);
        jHydraulic1.setString("1000");
        jHydraulic1.setStringPainted(true);

        jGasolineName1.setText("Gasoline:");

        jGasoline1.setBackground(new java.awt.Color(255, 255, 255));
        jGasoline1.setForeground(new java.awt.Color(0, 204, 51));
        jGasoline1.setMaximum(1000);
        jGasoline1.setValue(1000);
        jGasoline1.setString("1000");
        jGasoline1.setStringPainted(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLubrocantName1)
                    .addComponent(jLubrocant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDiesel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDieselName1)
                    .addComponent(jGasoline1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jGasolineName1)
                    .addComponent(jHydraulicName1)
                    .addComponent(jHydraulic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jGasolineName1)
                .addGap(18, 18, 18)
                .addComponent(jGasoline1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jDieselName1)
                .addGap(18, 18, 18)
                .addComponent(jDiesel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLubrocantName1)
                .addGap(18, 18, 18)
                .addComponent(jLubrocant1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jHydraulicName1)
                .addGap(18, 18, 18)
                .addComponent(jHydraulic1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        jPanel2.setBackground(new java.awt.Color(241, 242, 251));

        jName1.setFont(new java.awt.Font("Morn-Regular", 1, 12)); // NOI18N
        jName1.setText("Name :");

        jDate1.setFont(new java.awt.Font("Morn-Regular", 1, 12)); // NOI18N
        jDate1.setText("Date :");

        jType1.setFont(new java.awt.Font("Morn-Regular", 1, 12)); // NOI18N
        jType1.setText("Type :");

        jAmount1.setFont(new java.awt.Font("Morn-Regular", 1, 12)); // NOI18N
        jAmount1.setText("Amount :");

        jPricePerLiter1.setFont(new java.awt.Font("Morn-Regular", 1, 12)); // NOI18N
        jPricePerLiter1.setText("Price per liter :");

        jTotalPrice1.setFont(new java.awt.Font("Morn-Regular", 1, 12)); // NOI18N
        jTotalPrice1.setText("Total price :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasoline", "Diesel", "Lubrocant", "Hydraulic" }));

        btnCalculate1.setText("Calculate");
        btnCalculate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculate1ActionPerformed(evt);
            }
        });

        btnProceed1.setText("Proceed");
        btnProceed1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceed1ActionPerformed(evt);
            }
        });

        btnXuat1.setText("Xuat");
        btnXuat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuat1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnXuat1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(btnProceed1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAmount1)
                            .addComponent(jDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jType1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTotalPrice1)
                            .addComponent(jPricePerLiter1)
                            .addComponent(jName1))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTotalPrice1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(txtPricePerLiter1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDate1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAmount1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnCalculate1)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jName1)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDate1)
                    .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jType1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAmount1)
                    .addComponent(txtAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPricePerLiter1)
                    .addComponent(txtPricePerLiter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculate1))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTotalPrice1)
                    .addComponent(txtTotalPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProceed1)
                    .addComponent(btnXuat1))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProceed1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceed1ActionPerformed
      
       
                
        if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Gasoline")){
            if(Gasoline1 > 0 && Gasoline1 - Integer.valueOf(txtAmount1.getText()) > 0)
            {   Gasoline1  = Gasoline1  -  Integer.valueOf(txtAmount1.getText());
                jGasoline1.setValue(Gasoline1);
                jGasoline1.setString(Integer.toString(Gasoline1));
                addexport();
            }  
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Insufficient gas ");
            }
        }
        else if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Diesel")){
            if(Diesel1 > 0 && Diesel1 - Integer.valueOf(txtAmount1.getText()) > 0)
            {   Diesel1  = Diesel1  -  Integer.valueOf(txtAmount1.getText());
                jDiesel1.setValue(Diesel1);
                jDiesel1.setString(Integer.toString(Diesel1));
             addexport();
            }  
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Insufficient gas ");
            }
        }
        else if(jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Lubrocant")){
            if(Lubrocant1 > 0 && Lubrocant1 - Integer.valueOf(txtAmount1.getText()) > 0)
            {   Lubrocant1  = Lubrocant1  -  Integer.valueOf(txtAmount1.getText());
                jLubrocant1.setValue(Lubrocant1);
                jLubrocant1.setString(Integer.toString(Lubrocant1));
             addexport();
            }  
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Insufficient gas ");
            }
        }
        else{
            if(Hydraulic1 > 0 && Hydraulic1 - Integer.valueOf(txtAmount1.getText()) > 0)
            {   Hydraulic1  = Hydraulic1  -  Integer.valueOf(txtAmount1.getText());
                jHydraulic1.setValue(Hydraulic1);
                jHydraulic1.setString(Integer.toString(Hydraulic1));
             addexport();
            }  
            else
            {
                JOptionPane.showMessageDialog(rootPane,"Insufficient gas ");
            } 
        }
    }//GEN-LAST:event_btnProceed1ActionPerformed

    private void btnCalculate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculate1ActionPerformed
        int amount = Integer.parseInt(txtAmount1.getText());
        int pricePerLiter = Integer.parseInt(txtPricePerLiter1.getText());
        
        String totalPrice = String.valueOf(amount*pricePerLiter);
        txtTotalPrice1.setText(totalPrice);
    }//GEN-LAST:event_btnCalculate1ActionPerformed

    private void btnXuat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXuat1ActionPerformed

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
            java.util.logging.Logger.getLogger(ExportMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExportMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExportMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExportMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExportMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate1;
    private javax.swing.JButton btnProceed1;
    private javax.swing.JButton btnXuat1;
    private javax.swing.JLabel jAmount1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jDate1;
    private javax.swing.JProgressBar jDiesel1;
    private javax.swing.JLabel jDieselName1;
    private javax.swing.JProgressBar jGasoline1;
    private javax.swing.JLabel jGasolineName1;
    private javax.swing.JProgressBar jHydraulic1;
    private javax.swing.JLabel jHydraulicName1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JProgressBar jLubrocant1;
    private javax.swing.JLabel jLubrocantName1;
    private javax.swing.JLabel jName1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jPricePerLiter1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jTotalPrice1;
    private javax.swing.JLabel jType1;
    private javax.swing.JTextField txtAmount1;
    private javax.swing.JTextField txtDate1;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtPricePerLiter1;
    private javax.swing.JTextField txtTotalPrice1;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        int item = jList1.getSelectedIndex();
        if(item >= 0){
            Export p = export.get(item);
                    txtName1.setText(p.getName());
                    txtDate1.setText(p.getDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                    txtAmount1.setText(p.getAmount());
                    txtPricePerLiter1.setText(p.getPricePerLiter());
                    txtTotalPrice1.setText(p.getTotalPrice());
                    
        }           
    }
}