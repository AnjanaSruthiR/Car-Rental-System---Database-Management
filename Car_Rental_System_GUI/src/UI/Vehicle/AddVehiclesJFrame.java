/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Vehicle;

import UI.DatabaseConnection;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author AnjanaSruthiR
 */
public class AddVehiclesJFrame extends javax.swing.JFrame {

    private final ManageVehiclesJFrame parent;

    /**
     * Creates new form AddVehiclesJFrame
     */
    public AddVehiclesJFrame(ManageVehiclesJFrame parent) {
        initComponents();
        this.parent = parent;
        loadBranchIDs();
    }

    private void loadBranchIDs() {
        try (Connection conn = DatabaseConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT BranchID FROM Branch")) {

            while (rs.next()) {
                CmbBranchID.addItem(String.valueOf(rs.getInt("BranchID")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading branches: " + e.getMessage());
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

        BtnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtBrand = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtModel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtLicensePlate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CmbVehicleType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        CmbDriveType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        TxtYOM = new javax.swing.JTextField();
        BtnSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        CmbFuelType = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        CmbBranchID = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnBack.setText("<- Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Vehicle");

        jLabel2.setText("Brand");

        jLabel3.setText("Model");

        jLabel4.setText("License Plate");

        jLabel5.setText("Vehicle Type");

        CmbVehicleType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select--", "SED", "SUV" }));

        jLabel6.setText("Drive type");

        CmbDriveType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select--", "2WD", "4WD", "AWD" }));

        jLabel7.setText("Year Of Manufacturing");

        BtnSave.setText("Save");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        jLabel8.setText("Fuel type");

        CmbFuelType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select--", "Petrol", "Diesel", "Electric", "Hybrid" }));

        jLabel9.setText("Branch ID");

        CmbBranchID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select--" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(BtnBack))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                    .addComponent(TxtModel)
                                    .addComponent(TxtLicensePlate))
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CmbVehicleType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CmbDriveType, 0, 144, Short.MAX_VALUE)
                                    .addComponent(CmbFuelType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CmbBranchID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(TxtYOM, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnSave)
                .addGap(388, 388, 388))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CmbDriveType, CmbVehicleType, TxtBrand, TxtLicensePlate, TxtModel, TxtYOM});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBack)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(CmbVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(CmbDriveType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(CmbFuelType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtYOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(CmbBranchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(BtnSave)
                .addGap(272, 272, 272))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        try (Connection conn = DatabaseConnection.getConnection()) {
            String brand = TxtBrand.getText();
            String model = TxtModel.getText();
            String licensePlate = TxtLicensePlate.getText();
            int year = Integer.parseInt(TxtYOM.getText());
            String fuelType = CmbFuelType.getSelectedItem().toString();
            String driveType = CmbDriveType.getSelectedItem().toString();
            String vehicleType = CmbVehicleType.getSelectedItem().toString();
            int branchID = Integer.parseInt(CmbBranchID.getSelectedItem().toString());

            if (brand.isEmpty() || model.isEmpty() || licensePlate.isEmpty() || fuelType.equals("Select--") || driveType.equals("Select--") || vehicleType.equals("Select--")) {
                JOptionPane.showMessageDialog(this, "Please fill all mandatory fields.");
                return;
            }

            String insertSQL = "INSERT INTO Vehicle (Vehicle_Type, Vehicle_Brand, Vehicle_Model, Year_of_Manufacturing, Licence_Plate, Fuel_Type, Drive_Type, BranchID) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(insertSQL)) {
                stmt.setString(1, vehicleType);
                stmt.setString(2, brand);
                stmt.setString(3, model);
                stmt.setInt(4, year);
                stmt.setString(5, licensePlate);
                stmt.setString(6, fuelType);
                stmt.setString(7, driveType);
                stmt.setInt(8, branchID);

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Vehicle added successfully.");
                parent.loadVehicleData();
                this.dispose();
                parent.setVisible(true);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error adding vehicle: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid year.");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        this.dispose();
        parent.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBackActionPerformed

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
            java.util.logging.Logger.getLogger(AddVehiclesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddVehiclesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddVehiclesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddVehiclesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddVehiclesJFrame(null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnSave;
    private javax.swing.JComboBox<String> CmbBranchID;
    private javax.swing.JComboBox<String> CmbDriveType;
    private javax.swing.JComboBox<String> CmbFuelType;
    private javax.swing.JComboBox<String> CmbVehicleType;
    private javax.swing.JTextField TxtBrand;
    private javax.swing.JTextField TxtLicensePlate;
    private javax.swing.JTextField TxtModel;
    private javax.swing.JTextField TxtYOM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}