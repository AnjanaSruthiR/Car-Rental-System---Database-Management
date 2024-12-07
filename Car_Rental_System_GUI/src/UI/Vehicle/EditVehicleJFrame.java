/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Vehicle;

import UI.Customer.ManageCustomersJFrame;
import UI.DatabaseConnection;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author AnjanaSruthiR
 */
public class EditVehicleJFrame extends javax.swing.JFrame {

    private final ManageVehiclesJFrame parent;
    private final String licensePlate;

    /**
     * Creates new form EditVehicleJFrame
     */
    public EditVehicleJFrame(ManageVehiclesJFrame parent, String vehicleType, String vehicleBrand, String vehicleModel, int year, String licensePlate, String fuelType, String driveType, int branchID) {
        initComponents();
        this.parent = parent;
        this.licensePlate = licensePlate;

        populateBranchComboBox();

        // Set fields with provided data
        CmbVehicleType.setSelectedItem(vehicleType);
        TxtBrand.setText(vehicleBrand);
        TxtModel.setText(vehicleModel);
        TxtYOM.setText(String.valueOf(year));
        TxtLicensePlate.setText(licensePlate);
        CmbFuelType.setSelectedItem(fuelType);
        CmbDriveType.setSelectedItem(driveType);
        CmbBranchID.setSelectedItem(String.valueOf(branchID));
    }

    private void populateBranchComboBox() {
        CmbBranchID.removeAllItems();
        CmbBranchID.addItem("Select--"); // Default option
        String query = "SELECT BranchID FROM Branch";

        try (Connection conn = DatabaseConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                CmbBranchID.addItem(String.valueOf(rs.getInt("BranchID")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading branch IDs: " + e.getMessage());
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
        BtnUpdate = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtBrand = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtModel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtLicensePlate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtYOM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CmbVehicleType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        CmbDriveType = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        CmbFuelType = new javax.swing.JComboBox<>();
        CmbBranchID = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnBack.setText("<- Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edit Vehicle Details");

        BtnUpdate.setText("Update");
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        BtnCancel.setText("Cancel");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

        jLabel2.setText("Brand");

        jLabel3.setText("Model");

        jLabel4.setText("License Plate");

        jLabel7.setText("Year Of Manufacturing");

        jLabel5.setText("Vehicle Type");

        CmbVehicleType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select--", "SED", "SUV" }));

        jLabel6.setText("Drive type");

        CmbDriveType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select--", "2WD", "4WD", "AWD" }));

        jLabel8.setText("Fuel type");

        CmbFuelType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select--", "Petrol", "Diesel", "Electric", "Hybrid" }));

        CmbBranchID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select--" }));
        CmbBranchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbBranchIDActionPerformed(evt);
            }
        });

        jLabel9.setText("Branch ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtBrand)
                            .addComponent(TxtModel)
                            .addComponent(TxtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(TxtYOM, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CmbVehicleType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CmbDriveType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CmbFuelType, 0, 144, Short.MAX_VALUE)
                    .addComponent(CmbBranchID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnBack)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnUpdate)
                        .addGap(60, 60, 60)
                        .addComponent(BtnCancel)
                        .addGap(322, 322, 322))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBack)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(TxtYOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(CmbBranchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUpdate)
                    .addComponent(BtnCancel))
                .addContainerGap(277, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        this.dispose();
        parent.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBackActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        try (Connection conn = DatabaseConnection.getConnection()) {
            String brand = TxtBrand.getText().trim();
            String model = TxtModel.getText().trim();
            String yearText = TxtYOM.getText().trim();
            String fuelType = (String) CmbFuelType.getSelectedItem();
            String driveType = (String) CmbDriveType.getSelectedItem();
            String vehicleType = (String) CmbVehicleType.getSelectedItem();
            String branchIDText = (String) CmbBranchID.getSelectedItem();

            // Validate inputs
            if (brand.isEmpty() || model.isEmpty() || yearText.isEmpty()
                    || fuelType.equals("Select--") || driveType.equals("Select--")
                    || vehicleType.equals("Select--") || branchIDText.equals("Select--")) {
                JOptionPane.showMessageDialog(this, "Please fill all fields and select valid options.");
                return;
            }

            int year;
            int branchID;

            try {
                year = Integer.parseInt(yearText);
                branchID = Integer.parseInt(branchIDText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid numeric input. Ensure Year and Branch ID are valid numbers.");
                return;
            }

            // Update query
            String updateSQL = "UPDATE Vehicle SET Vehicle_Type = ?, Vehicle_Brand = ?, Vehicle_Model = ?, Year_of_Manufacturing = ?, Fuel_Type = ?, Drive_Type = ?, BranchID = ? WHERE Licence_Plate = ?";
            try (PreparedStatement stmt = conn.prepareStatement(updateSQL)) {
                stmt.setString(1, vehicleType);
                stmt.setString(2, brand);
                stmt.setString(3, model);
                stmt.setInt(4, year);
                stmt.setString(5, fuelType);
                stmt.setString(6, driveType);
                stmt.setInt(7, branchID);
                stmt.setString(8, licensePlate);

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Vehicle updated successfully.");
                parent.loadVehicleData();
                this.dispose();
                parent.setVisible(true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error updating vehicle: " + e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void CmbBranchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbBranchIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbBranchIDActionPerformed

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
            java.util.logging.Logger.getLogger(EditVehicleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditVehicleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditVehicleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditVehicleJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            ManageVehiclesJFrame manageVehiclesFrame = new ManageVehiclesJFrame(null);
            new EditVehicleJFrame(
                    manageVehiclesFrame,
                    "Sedan", // Vehicle Type
                    "Toyota", // Brand
                    "Camry", // Model
                    2018, // Year of Manufacturing
                    "ABC123", // License Plate
                    "Petrol", // Fuel Type
                    "2WD", // Drive Type
                    1 // Branch ID
            ).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnUpdate;
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
